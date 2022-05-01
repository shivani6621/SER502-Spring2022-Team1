import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.PrintStream;
import java.util.Map;

public class MainFrame extends JFrame {
    private static final int DEFAULT_WINDOW_HEIGHT = 500;
    private static final int DEFAULT_WINDOW_WIDTH = 800;

    private final JTextArea jTextAreaCodeEditor;

    private final JTextArea jTextAreaProgramOutput;

    private final DefaultTableModel modelEnvironment;
    private final JTable jTableEnvironment;

    public MainFrame(){
        super("Mocha");

        JPanel jPanelMainPanel = new JPanel();
        jPanelMainPanel.setLayout(new GridBagLayout());

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
        jTableEnvironment = new JTable(modelEnvironment);

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
        MochaLexer mochaLexer = new MochaLexer(CharStreams.fromString(jTextAreaCodeEditor.getText()));
        CommonTokenStream commonTokenStream = new CommonTokenStream(mochaLexer);
        MochaParser mochaParser = new MochaParser(commonTokenStream);
        ParseTree parseTree = mochaParser.program();
        jTextAreaProgramOutput.setText("Parse Tree:\n" + parseTree.toStringTree(mochaParser) + "\n\nProgram Output:\n");

        PrintStream programOutputPrintStream = new PrintStream(new TextAreaOutputStream(jTextAreaProgramOutput));
        MyMochaVisitor myMochaVisitor = new MyMochaVisitor(programOutputPrintStream);
        myMochaVisitor.visit(parseTree);

        myMochaVisitor.printResults();
        for (Map.Entry<String, Variable> variableEntry : myMochaVisitor.getVariableMap().entrySet()) {
            Variable variable = variableEntry.getValue();
            modelEnvironment.addRow(new Object[] { variableEntry.getKey(), variable.getType(), variable.getValue() });
        }

        // ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
    }
}
