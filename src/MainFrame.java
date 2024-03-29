import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.*;
import java.util.Map;

public class MainFrame extends JFrame {
    private static final int DEFAULT_WINDOW_HEIGHT = 500;
    private static final int DEFAULT_WINDOW_WIDTH = 800;

    private final JTextArea jTextAreaCodeEditor;

    private final JTextArea jTextAreaProgramOutput;

    private final DefaultTableModel modelEnvironment;

    public MainFrame(){
        super("Mocha");

        JPanel jPanelMainPanel = new JPanel();
        jPanelMainPanel.setLayout(new GridBagLayout());

        JMenuBar menuBar  = new JMenuBar();
        JMenu menuFile = new JMenu("Menu");

        JMenuItem menuItemLoad = new JMenuItem("Load");
        menuItemLoad.addActionListener(e -> loadFile());

        menuFile.add(menuItemLoad);
        menuBar.add(menuFile);
        setJMenuBar(menuBar);

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0; c.gridy = 0; c.gridwidth = 2; c.weightx = 1; c.weighty = 5;
        c.insets = new Insets(2,5,2,5);

        jTextAreaCodeEditor = new JTextArea();
        jTextAreaCodeEditor.setTabSize(1);
        jTextAreaCodeEditor.setLineWrap(true);
        jPanelMainPanel.add(new JScrollPane(jTextAreaCodeEditor), c);

        jTextAreaProgramOutput = new JTextArea();
        jTextAreaProgramOutput.setLineWrap(true);

        c.gridx = 0; c.gridy = 2; c.gridwidth = 1; c.weightx = 5; c.weighty = 4;
        jPanelMainPanel.add(new JScrollPane(jTextAreaProgramOutput), c);

        modelEnvironment = new DefaultTableModel(new String[] { "Variable", "Type", "Value" }, 0);
        JTable jTableEnvironment = new JTable(modelEnvironment);

        c.gridx = 1; c.gridy = 2; c.gridwidth = 1; c.weightx = 3; c.weighty = 4;
        jPanelMainPanel.add(new JScrollPane(jTableEnvironment), c);

        JButton jButtonRun = new JButton("Run");
        jButtonRun.setHorizontalAlignment(JButton.CENTER);
        jButtonRun.addActionListener(e -> run());

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0; c.gridy = 1; c.gridwidth = 2; c.weighty = 0;
        jPanelMainPanel.add(jButtonRun, c);

        add(jPanelMainPanel);
    }

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setSize(DEFAULT_WINDOW_WIDTH, DEFAULT_WINDOW_HEIGHT);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void run() {
        jTextAreaProgramOutput.setText("");
        modelEnvironment.setRowCount(0);

        PrintStream programOutputPrintStream = new PrintStream(new TextAreaOutputStream(jTextAreaProgramOutput));

        MochaLexer mochaLexer = new MochaLexer(CharStreams.fromString(jTextAreaCodeEditor.getText()));
        CommonTokenStream commonTokenStream = new CommonTokenStream(mochaLexer);
        MochaParser mochaParser = new MochaParser(commonTokenStream);
        MyMochaErrorListener myMochaErrorListener = new MyMochaErrorListener(programOutputPrintStream);
        mochaParser.removeErrorListeners();
        mochaParser.addErrorListener(myMochaErrorListener);

        ParseTree parseTree = mochaParser.program();
        if (myMochaErrorListener.parseResult()) {
            jTextAreaProgramOutput.append("Parse Tree:\n" + parseTree.toStringTree(mochaParser) + "\n\n");

            MyMochaVisitor myMochaVisitor = new MyMochaVisitor(programOutputPrintStream);
            myMochaVisitor.visit(parseTree);

            myMochaVisitor.evaluationResult();
            for (Map.Entry<String, Variable> variableEntry : myMochaVisitor.getVariableMap().entrySet()) {
                Variable variable = variableEntry.getValue();
                modelEnvironment.addRow(new Object[] { variableEntry.getKey(), variable.getType(), variable.getValue() });
            }
        }
    }

    private void loadFile() {
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileFilter(new FileNameExtensionFilter("Mocha Files | *.mocha; Text Files | *.txt", "txt", "mocha"));

        if (jFileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            jTextAreaCodeEditor.setText("");
            String filePath = jFileChooser.getSelectedFile().getAbsolutePath();
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = bufferedReader.readLine()) != null)
                    jTextAreaCodeEditor.append(line + "\n");
            }
            catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Failed to load file !");
            }
        }
    }
}
