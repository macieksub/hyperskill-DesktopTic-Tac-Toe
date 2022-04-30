package tictactoe;

import javax.swing.*;
import java.awt.*;

public class Cell extends JButton {

    public Cell(String text) {
        super(text);
        this.setName("Button" + text);
        this.setFont(new Font("Arial", Font.BOLD, 40));
    }
}
