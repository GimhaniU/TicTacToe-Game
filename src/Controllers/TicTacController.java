/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author DinsuG
 */
public class TicTacController {

    private boolean turn;

    /**
     * @return the turn
     */
    public boolean getTurn() {
        return turn;
    }

    /**
     * @param turn the turn to set
     */
    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    public void buttunController(Component component,JLabel label,JButton []buttonset) {
        
        JButton button = (JButton) component;
        if(button.isFocusable()){
        if (turn == true) {

            button.setIcon(new ImageIcon("E:\\Education\\Semester 03\\Programming challenge I\\Mini Project\\Tic Tac Toe\\src\\Pictures\\1.png"));
            button.setText("1");
        } else {

            button.setIcon(new ImageIcon("E:\\Education\\Semester 03\\Programming challenge I\\Mini Project\\Tic Tac Toe\\src\\Pictures\\2.png"));
            button.setText("2");
        }
        button.setFocusable(false);
       // button.setEnabled(false);
        turn = !turn;
        checkWin(buttonset);
        labelController(label);
        }
    }
    
    public void labelController(JLabel label){
       if (!turn){
           label.setText("Chance for A");
       }else{
           label.setText("chance for B");
       }
        
    }
    
    public static void playSound(File Sound){
        try {
            Clip clip=AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();
            
            Thread.sleep(clip.getMicrosecondLength()/1000);
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException | InterruptedException ex) {
            Logger.getLogger(TicTacController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void checkWin(JButton []buttonset){
        
        if((buttonset[0].getText()==buttonset[1].getText())&&(buttonset[2].getText()==buttonset[1].getText())){
            JOptionPane.showMessageDialog(null,"win");
            
        }
    }
}
