/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Models.Player;
import javax.swing.Icon;

/**
 *
 * @author DinsuG
 */
public class PlayerNameForm extends javax.swing.JFrame {

    int playermode;
    int imagePlayer2;
    int imagePlayer1;

    /**
     * Creates new form PlayerNameForm
     */
    public PlayerNameForm() {
        initComponents();
        playermode = 0;
        this.setLocationRelativeTo(null);
        imagePlayer2 = 1; //to be used to send the 2 images for x and o
        imagePlayer1 = 4;
        goldx_redo_toggle.setSelected(true);
        easyToggleButton.setSelected(true);
        player1moveRadio.setSelected(true);

    }

    public PlayerNameForm(int playermode) { //if player =1, 2 freinds else if player=0, with computer, 2=network
        this();
        this.playermode = playermode;

        if (playermode == 0) {
            player2NameText.setText("Computer");
            player2NameText.setEnabled(false);
        }else {
            levelPanel.setVisible(false);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameLevelGroup = new javax.swing.ButtonGroup();
        firstMoveGroup = new javax.swing.ButtonGroup();
        piecesSetGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        playButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        levelPanel = new javax.swing.JPanel();
        easyToggleButton = new javax.swing.JToggleButton();
        mediumToggleButton = new javax.swing.JToggleButton();
        hardToggleButton = new javax.swing.JToggleButton();
        jPanel5 = new javax.swing.JPanel();
        player2Label = new javax.swing.JLabel();
        player2NameText = new javax.swing.JTextField();
        player2moveRadio = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        player1Label = new javax.swing.JLabel();
        player1NameText = new javax.swing.JTextField();
        player1moveRadio = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        goldx_redo_toggle = new javax.swing.JToggleButton();
        goldx_glodo_toggle = new javax.swing.JToggleButton();
        redx_glodo_toggle = new javax.swing.JToggleButton();
        redx_redo_toggle = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(153, 0, 153));
        titleLabel.setText("Enter player names");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 98, Short.MAX_VALUE)
                    .addComponent(titleLabel)
                    .addGap(0, 99, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 11, Short.MAX_VALUE)
                    .addComponent(titleLabel)
                    .addGap(0, 12, Short.MAX_VALUE)))
        );

        playButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        playButton.setText("Play");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(playButton)
                .addGap(18, 18, 18)
                .addComponent(backButton)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playButton)
                    .addComponent(backButton)))
        );

        levelPanel.setBackground(new java.awt.Color(204, 204, 255));
        levelPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Level", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 1, 24))); // NOI18N

        gameLevelGroup.add(easyToggleButton);
        easyToggleButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        easyToggleButton.setForeground(new java.awt.Color(0, 153, 51));
        easyToggleButton.setText("EASY");
        easyToggleButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        gameLevelGroup.add(mediumToggleButton);
        mediumToggleButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        mediumToggleButton.setForeground(new java.awt.Color(51, 0, 255));
        mediumToggleButton.setText("MEDIUM");
        mediumToggleButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mediumToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumToggleButtonActionPerformed(evt);
            }
        });

        gameLevelGroup.add(hardToggleButton);
        hardToggleButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        hardToggleButton.setForeground(new java.awt.Color(255, 0, 51));
        hardToggleButton.setText("HARD");
        hardToggleButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout levelPanelLayout = new javax.swing.GroupLayout(levelPanel);
        levelPanel.setLayout(levelPanelLayout);
        levelPanelLayout.setHorizontalGroup(
            levelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(levelPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(easyToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mediumToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hardToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        levelPanelLayout.setVerticalGroup(
            levelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, levelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(levelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hardToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mediumToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(easyToggleButton)))
        );

        jPanel5.setBackground(new java.awt.Color(153, 255, 153));

        player2Label.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        player2Label.setForeground(new java.awt.Color(51, 0, 204));
        player2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player2Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/red_o_small.png"))); // NOI18N
        player2Label.setText("Player 2:");

        player2NameText.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N

        firstMoveGroup.add(player2moveRadio);
        player2moveRadio.setFont(new java.awt.Font("Tempus Sans ITC", 2, 14)); // NOI18N
        player2moveRadio.setText("First move");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(player2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(player2NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(player2moveRadio)
                .addGap(105, 105, 105))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player2Label)
                    .addComponent(player2NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player2moveRadio))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(102, 255, 204));

        player1Label.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        player1Label.setForeground(new java.awt.Color(51, 0, 204));
        player1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player1Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/gold_x_small.png"))); // NOI18N
        player1Label.setText("Player 1:");

        player1NameText.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N

        firstMoveGroup.add(player1moveRadio);
        player1moveRadio.setFont(new java.awt.Font("Tempus Sans ITC", 2, 14)); // NOI18N
        player1moveRadio.setText("First move");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(player1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(player1NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(player1moveRadio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player1Label)
                    .addComponent(player1NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player1moveRadio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select pieces set", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 1, 18))); // NOI18N

        piecesSetGroup.add(goldx_redo_toggle);
        goldx_redo_toggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/gold_x _red_o.jpg"))); // NOI18N
        goldx_redo_toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goldx_redo_toggleActionPerformed(evt);
            }
        });

        piecesSetGroup.add(goldx_glodo_toggle);
        goldx_glodo_toggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/gold_x_gold_o.jpg"))); // NOI18N
        goldx_glodo_toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goldx_glodo_toggleActionPerformed(evt);
            }
        });

        piecesSetGroup.add(redx_glodo_toggle);
        redx_glodo_toggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/red_x_gold_o.png"))); // NOI18N
        redx_glodo_toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redx_glodo_toggleActionPerformed(evt);
            }
        });

        piecesSetGroup.add(redx_redo_toggle);
        redx_redo_toggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/red_x_red_o.jpg"))); // NOI18N
        redx_redo_toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redx_redo_toggleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(goldx_redo_toggle)
                .addGap(18, 18, 18)
                .addComponent(goldx_glodo_toggle)
                .addGap(18, 18, 18)
                .addComponent(redx_glodo_toggle)
                .addGap(18, 18, 18)
                .addComponent(redx_redo_toggle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(goldx_glodo_toggle)
            .addComponent(goldx_redo_toggle)
            .addComponent(redx_glodo_toggle)
            .addComponent(redx_redo_toggle)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(levelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(levelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new HomePage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        int player1turn = 0;
        int player2turn = 0;
        int playing_type = 1;
        if (firstMoveGroup.isSelected(player1moveRadio.getModel())) {
            player1turn = 1;
            player2turn = 2;
        } else {
            player1turn = 2;
            player2turn = 1;
        }
        Player player1 = new Player(player1NameText.getText(), 1, imagePlayer1, player1turn);
        Player player2 = new Player(player2NameText.getText(), 2, imagePlayer2, player2turn);

        if (mediumToggleButton.isSelected()) {
            playing_type = 2;
            player1.setPlayerType("Medium");
            player2.setPlayerType("Medium");
        } else if (hardToggleButton.isSelected()) {
            playing_type = 3;
            player1.setPlayerType("Hard");
            player2.setPlayerType("Hard");
        }else{
            player1.setPlayerType("Easy");
            player2.setPlayerType("Easy");
        
        
        }
        
        new MainFrame(playermode, playing_type, player1, player2).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_playButtonActionPerformed

    private void goldx_redo_toggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goldx_redo_toggleActionPerformed
        player1Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/gold_x_small.png")));
        player2Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/red_o_small.png")));
        imagePlayer2 = 1;
        imagePlayer1 = 4;
    }//GEN-LAST:event_goldx_redo_toggleActionPerformed

    private void goldx_glodo_toggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goldx_glodo_toggleActionPerformed
        player1Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/gold_x_small.png")));
        player2Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/gold_o_small.png")));
        imagePlayer2 = 1;
        imagePlayer1 = 2;
    }//GEN-LAST:event_goldx_glodo_toggleActionPerformed

    private void redx_glodo_toggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redx_glodo_toggleActionPerformed
        player1Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/red_x_small.png")));
        player2Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/gold_o_small.png")));
        imagePlayer2 = 3;
        imagePlayer1 = 2;
    }//GEN-LAST:event_redx_glodo_toggleActionPerformed

    private void redx_redo_toggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redx_redo_toggleActionPerformed
        player1Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/red_x_small.png")));
        player2Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/red_o_small.png")));
        imagePlayer2 = 3;
        imagePlayer1 = 4;
    }//GEN-LAST:event_redx_redo_toggleActionPerformed

    private void mediumToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mediumToggleButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlayerNameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerNameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerNameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerNameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayerNameForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JToggleButton easyToggleButton;
    private javax.swing.ButtonGroup firstMoveGroup;
    private javax.swing.ButtonGroup gameLevelGroup;
    private javax.swing.JToggleButton goldx_glodo_toggle;
    private javax.swing.JToggleButton goldx_redo_toggle;
    private javax.swing.JToggleButton hardToggleButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel levelPanel;
    private javax.swing.JToggleButton mediumToggleButton;
    private javax.swing.ButtonGroup piecesSetGroup;
    private javax.swing.JButton playButton;
    private javax.swing.JLabel player1Label;
    private javax.swing.JTextField player1NameText;
    private javax.swing.JRadioButton player1moveRadio;
    private javax.swing.JLabel player2Label;
    private javax.swing.JTextField player2NameText;
    private javax.swing.JRadioButton player2moveRadio;
    private javax.swing.JToggleButton redx_glodo_toggle;
    private javax.swing.JToggleButton redx_redo_toggle;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
