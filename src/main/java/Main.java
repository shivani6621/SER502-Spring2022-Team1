import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private static final int DEFAULT_WINDOW_HEIGHT = 500;
    private static final int DEFAULT_WINDOW_WIDTH = 800;

    public Main(){
        super("Mocha");
        JPanel Mocha = new JPanel();
        JTextArea editor = new JTextArea();
        JButton Run = new JButton("run");
        Run.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lexer(editor.getText());
            }
        });
        Mocha.add(editor);
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

    public void lexer(String MochaContent){
        MochaLexer mochaLexer = new MochaLexer(CharStreams.fromString(MochaContent));
        CommonTokenStream tokens = new CommonTokenStream(mochaLexer);
        MochaParser parser = new MochaParser(tokens);
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
    }
}