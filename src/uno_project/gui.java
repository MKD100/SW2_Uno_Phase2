/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno_project;

/**
 *
 * @author matth
 */
public class gui extends javax.swing.JFrame {

    /**
     * Creates new form gui
     */
    
    Game gGui = new Game();
    
    int numOfPlayers = 0;
    int difficulty;
    String playerName;
    public gui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        numPlayersLable = new javax.swing.JLabel();
        difficultyLevelLable = new javax.swing.JLabel();
        numPlayersComboBox = new javax.swing.JComboBox<>();
        difficultyComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        infoIcon = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        exitButtonMainMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(190, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno_project/images/uno-online.png"))); // NOI18N
        jLabel1.setAlignmentY(0.75F);

        numPlayersLable.setForeground(new java.awt.Color(255, 255, 255));
        numPlayersLable.setText("Select Number of Players:");

        difficultyLevelLable.setForeground(new java.awt.Color(255, 255, 255));
        difficultyLevelLable.setText("Select Difficulty Level: ");

        numPlayersComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 Player", "3 Player", "4 Player" }));
        numPlayersComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numPlayersComboBoxActionPerformed(evt);
            }
        });

        difficultyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Easy ", "Intermediate", "Hard" }));
        difficultyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficultyComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Your Name Here: ");

        infoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno_project/images/button_Images/information.png"))); // NOI18N
        infoIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoIconMouseClicked(evt);
            }
        });

        startButton.setText("Start Game!");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        exitButtonMainMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno_project/images/button_Images/exit.png"))); // NOI18N
        exitButtonMainMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMainMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 287, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(difficultyLevelLable)
                                            .addComponent(numPlayersLable))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(difficultyComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(numPlayersComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(26, 26, 26)
                                        .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(30, 30, 30)))
                                .addGap(286, 286, 286))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(startButton)
                                .addGap(356, 356, 356))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(infoIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButtonMainMenu)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(infoIcon)
                    .addComponent(exitButtonMainMenu))
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numPlayersComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numPlayersLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(difficultyLevelLable)
                    .addComponent(difficultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(startButton)
                .addGap(194, 194, 194))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
                
        numOfPlayers=numPlayersComboBox.getSelectedIndex();
        this.numOfPlayers= numOfPlayers+2;
        //g.initializeGame(numOfPlayers);
        playerName= nameInput.getText();
        if(playerName.isEmpty()){
            playerName="Mr. No Name";
        }
        GameBoard gb = new GameBoard(difficulty, numOfPlayers, playerName);
        //gb.setVisible(true);
//        gb.setNumPlayer(this.numOfPlayers);
//        gb.setName(this.playerName);
//        
        gb.setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_startButtonActionPerformed

    private void numPlayersComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numPlayersComboBoxActionPerformed
        // TODO add your handling code here:
        numOfPlayers = numPlayersComboBox.getSelectedIndex()+2;
  
    }//GEN-LAST:event_numPlayersComboBoxActionPerformed

    private void difficultyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difficultyComboBoxActionPerformed
        // TODO add your handling code here:
        difficulty = difficultyComboBox.getSelectedIndex()+1;
    }//GEN-LAST:event_difficultyComboBoxActionPerformed

    private void infoIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoIconMouseClicked
        // TODO add your handling code here:
        new Help().setVisible(true);
    }//GEN-LAST:event_infoIconMouseClicked

    private void exitButtonMainMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMainMenuMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonMainMenuMouseClicked

    public int getDifficulty(){
        return difficulty;
    }
    public int getNumPlayers(){
        return numOfPlayers;
    }
    
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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> difficultyComboBox;
    private javax.swing.JLabel difficultyLevelLable;
    private javax.swing.JLabel exitButtonMainMenu;
    private javax.swing.JLabel infoIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameInput;
    private javax.swing.JComboBox<String> numPlayersComboBox;
    private javax.swing.JLabel numPlayersLable;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}
