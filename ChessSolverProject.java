package com.mycompany.chesssolverproject;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author alexs
 * “I certify that the codes/answers of this assignment are entirely my own work.”
 */
public class ChessSolverProject {

    public static void main(String[] args) {
        Chessboard board = new Chessboard();
        int size = 700;
        JFrame f = new JFrame("Chess");
        f.add(board.getGUI());
        f.setSize(size, size);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setLocationByPlatform(true);
        f.setResizable(false);
        //f.pack();
        f.setMinimumSize(f.getSize());
        f.setVisible(true);
        
    }
}
