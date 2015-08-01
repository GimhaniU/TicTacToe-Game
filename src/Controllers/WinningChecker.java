/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import javax.swing.JButton;

/**
 *
 * @author Gimhani
 */
public class WinningChecker {

    private static int[][] winset = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8},
    {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
    {0, 4, 8}, {2, 4, 6}
    };
    private String[] matrix = new String[9];
    private JButton[] buttonset = new JButton[9];
    /*
     0,1,2
     3,4,5
     6,7,8
     */

    public WinningChecker() {
    }

    public WinningChecker(JButton[] matrix) {
        this.buttonset = matrix;
    }

    public static void checkWin(JButton[] matrix) {
        for (int[] winset1 : winset) {
            if (matrix[winset1[0]].getText() == "O" && matrix[winset1[1]].getText() == "O" && matrix[winset1[2]].getText() == "O") {
            
            }
        }
    }

    
    
}
