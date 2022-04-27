import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private static final int DEFAULT_WINDOW_HEIGHT = 500;
    private static final int DEFAULT_WINDOW_WIDTH = 800;

    private final JTextArea jTextAreaCodeEditor;
    private final JTextArea jTextAreaProgramOutput;

    public MainFrame(){
        super("Mocha");

        JPanel jPanelMainPanel = new JPanel();
        jPanelMainPanel.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0; c.gridy = 0; c.fill = GridBagConstraints.BOTH; c.weightx = 1; c.weighty = 5;
        c.insets = new Insets(2,5,2,5);

        jTextAreaCodeEditor = new JTextArea();
        jTextAreaCodeEditor.setTabSize(1);
        jTextAreaCodeEditor.setLineWrap(true);
        jPanelMainPanel.add(new JScrollPane(jTextAreaCodeEditor), c);

        jTextAreaProgramOutput = new JTextArea();
        jTextAreaProgramOutput.setLineWrap(true);

        c.gridx = 0; c.gridy = 2; c.weighty = 2;
        jPanelMainPanel.add(new JScrollPane(jTextAreaProgramOutput), c);

        JButton jButtonRun = new JButton("Run");
        jButtonRun.setHorizontalAlignment(JButton.CENTER);
        jButtonRun.addActionListener(e -> run());

        c.gridx = 0; c.gridy = 1; c.fill = GridBagConstraints.HORIZONTAL; c.weighty = 0;
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
        jTextAreaProgramOutput.setText(parseTree.toStringTree(mochaParser));

        MyMochaVisitor myMochaVisitor = new MyMochaVisitor();
        myMochaVisitor.visit(parseTree);

        // ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
    }
}
