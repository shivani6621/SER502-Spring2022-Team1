import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Main extends JFrame {
    private static final int DEFAULT_WINDOW_HEIGHT = 500;
    private static final int DEFAULT_WINDOW_WIDTH = 800;
    JTextArea input;
    JTextArea output;
    public Main(){
        super("Mocha");
        JPanel Mocha = new JPanel();
        input = new JTextArea(20,65);
        JScrollPane inputPane = new JScrollPane(input);
        output = new JTextArea(5,50);
        JScrollPane outputPane = new JScrollPane(output);
        input.setLineWrap(true);
        output.setLineWrap(true);
        JButton Run = new JButton("run");
        Run.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lexer(input.getText());
            }
        });
        Mocha.add(inputPane);
        Mocha.add(outputPane);
        Mocha.add(Run);
        add(Mocha);
    }
    public static void main(String[] args) {
        Main mainWindow = new Main();
        mainWindow.setSize(DEFAULT_WINDOW_WIDTH, DEFAULT_WINDOW_HEIGHT);
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setVisible(true);
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void lexer(String mochaContent){
        MochaLexer mochaLexer = new MochaLexer(CharStreams.fromString(mochaContent));
        CommonTokenStream tokens = new CommonTokenStream(mochaLexer);
        MochaParser parser = new MochaParser(tokens);
        ParseTree tree = parser.program();
        output.setText(tree.toStringTree(parser));
        ParseTreeWalker walker = new ParseTreeWalker();
    }
}