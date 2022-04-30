package tictactoe;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    public Board() {
        add(new Cell("A3"));
        add(new Cell("B3"));
        add(new Cell("C3"));
        add(new Cell("A2"));
        add(new Cell("B2"));
        add(new Cell("C2"));
        add(new Cell("A1"));
        add(new Cell("B1"));
        add(new Cell("C1"));
        setLayout(new GridLayout(3, 3));
        setVisible(true);
    }
}
