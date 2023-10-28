import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    JPanel masterPanel = new JPanel();
    JPanel gameBoard = new JPanel();
    JPanel westPanel = new JPanel();
    JPanel eastPanel = new JPanel();
    JPanel northPanel = new JPanel();
    JPanel southPanel = new JPanel();

    JButton shuffle = new JButton("Shuffle");
    JButton b0 = new JButton("1");
    JButton b1 = new JButton("2");
    JButton b2 = new JButton("3");
    JButton b3 = new JButton("4");
    JButton b4 = new JButton("5");
    JButton b5 = new JButton("6");
    JButton b6 = new JButton("7");
    JButton b7 = new JButton("8");
    JButton b8 = new JButton("9");
    JButton b9 = new JButton("10");
    JButton b10 = new JButton("11");
    JButton b11 = new JButton("12");
    JButton b12 = new JButton("13");
    JButton b13 = new JButton("14");
    JButton b14 = new JButton("15");
    JButton b15 = new JButton();

    JLabel gameStatus = new JLabel();

    public Main() {

        b15.setVisible(false);

        this.add(masterPanel);
        masterPanel.setLayout(new BorderLayout());

        b0.setActionCommand("0"); b1.setActionCommand("1");
        b2.setActionCommand("2"); b3.setActionCommand("3");
        b4.setActionCommand("4"); b5.setActionCommand("5");
        b6.setActionCommand("6"); b7.setActionCommand("7");
        b8.setActionCommand("8"); b9.setActionCommand("9");
        b10.setActionCommand("10"); b11.setActionCommand("11");
        b12.setActionCommand("12"); b13.setActionCommand("13");
        b14.setActionCommand("14"); b15.setActionCommand("15");

        gameBoard.setLayout(new GridLayout(4,4));
        gameBoard.add(b0); gameBoard.add(b1); gameBoard.add(b2); gameBoard.add(b3);
        gameBoard.add(b4); gameBoard.add(b5); gameBoard.add(b6); gameBoard.add(b7);
        gameBoard.add(b8); gameBoard.add(b9); gameBoard.add(b10); gameBoard.add(b11);
        gameBoard.add(b12); gameBoard.add(b13); gameBoard.add(b14); gameBoard.add(b15);

        westPanel.setPreferredSize(new Dimension(100, 100));
        eastPanel.setPreferredSize(new Dimension(100, 100));
        northPanel.setPreferredSize(new Dimension(100, 100));
        southPanel.setPreferredSize(new Dimension(100, 100));

        northPanel.add(shuffle);

        masterPanel.add(gameBoard, BorderLayout.CENTER);
        masterPanel.add(westPanel, BorderLayout.WEST);
        masterPanel.add(eastPanel, BorderLayout.EAST);
        masterPanel.add(northPanel, BorderLayout.NORTH);
        masterPanel.add(southPanel, BorderLayout.SOUTH);

        b0.addActionListener(this); b1.addActionListener(this);
        b2.addActionListener(this); b3.addActionListener(this);
        b4.addActionListener(this); b5.addActionListener(this);
        b6.addActionListener(this); b7.addActionListener(this);
        b8.addActionListener(this); b9.addActionListener(this);
        b10.addActionListener(this); b11.addActionListener(this);
        b12.addActionListener(this); b13.addActionListener(this);
        b14.addActionListener(this); b15.addActionListener(this);

        setSize(600, 600);
        //pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        ae.getActionCommand();
        }

    public static void main(String[] args) {
        Main main = new Main();
    }
}