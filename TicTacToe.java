package tictactoe;

import javax.swing.*;

public class TicTacToe extends JFrame {

    public TicTacToe() {
        super("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 450);
        setLocationRelativeTo(null);
        setResizable(false);
        add(new Board());
        setVisible(true);
    }
}

