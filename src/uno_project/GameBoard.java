/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno_project;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JToggleButton;

/**
 *
 * @author belih
 */
public class GameBoard extends javax.swing.JFrame {

    /**
     * Creates new form GameBoard
     */
    

    
    Game g = new Game();
    String name;
    int numPlay;
    Boolean gameStarted = false;
    public GameBoard() {
        initComponents();
  

    }
    
    public void setName(String inName){
        this.name=inName;
    }
    
    public void setNumPlayer(int num){
        this.numPlay=num;
    }
    
    private void initGameBoard(){
        if(numPlay==2){
            //TWO PLAYER
            for(int i = 0; i<g.getPlayerHandSize(0);i++){          
                JLabel tempLableIcon = new JLabel();
                tempLableIcon.setIcon(new ImageIcon(getClass().getResource("/uno_project/images/card_Images/"+g.playerHand(g.playerGroup.get(0)).get(i).toString()+" copy.png")));
                tempLableIcon.setVisible(true);
                //tempLableIcon.setHorizontalAlignment(i+100);
                userLP1.add(tempLableIcon,i,0);
            }
            for(int i = 0; i<g.getPlayerHandSize(1);i++){          
                JLabel tempLableIcon = new JLabel();
                tempLableIcon.setIcon(new ImageIcon(getClass().getResource("/uno_project/images/card_Images/"+g.playerHand(g.playerGroup.get(1)).get(i).toString()+" copy.png")));
                tempLableIcon.setVisible(true);
                //tempLableIcon.setHorizontalAlignment(i+100);
                LP2.add(tempLableIcon,i,0);
            }
            p2Name_Lable.setText("Player 2: Matt");
            p3Name_Lable.setText("");
            p4Name_Lable.setText("");
        }else if(numPlay==3){
            //THREE PLAYER
            for(int i = 0; i<g.getPlayerHandSize(0);i++){          
                JLabel tempLableIcon = new JLabel();
                tempLableIcon.setIcon(new ImageIcon(getClass().getResource("/uno_project/images/card_Images/"+g.playerHand(g.playerGroup.get(0)).get(i).toString()+" copy.png")));
                tempLableIcon.setVisible(true);
                //tempLableIcon.setHorizontalAlignment(i+100);
                userLP1.add(tempLableIcon,i,0);
            }
            for(int i = 0; i<g.getPlayerHandSize(1);i++){          
                JLabel tempLableIcon = new JLabel();
                tempLableIcon.setIcon(new ImageIcon(getClass().getResource("/uno_project/images/card_Images/BackOfCardRight copy.png")));
                tempLableIcon.setVisible(true);
                //tempLableIcon.setHorizontalAlignment(i+100);
                LP2.add(tempLableIcon,i,0);
            }                        
            for(int i = 0; i<g.getPlayerHandSize(2);i++){          
                JLabel tempLableIcon = new JLabel();
                tempLableIcon.setIcon(new ImageIcon(getClass().getResource("/uno_project/images/card_Images/BackOfCard copy.png")));
                tempLableIcon.setVisible(true);
                //tempLableIcon.setHorizontalAlignment(i+100);
                LP3.add(tempLableIcon,i,0);
            }
            p2Name_Lable.setText("Player 2: Matt");
            p3Name_Lable.setText("Player 3: Jeff");
            p4Name_Lable.setText("");            
        }else{
            //FOUR PLAYER 
            for(int i = 0; i<g.getPlayerHandSize(0);i++){
                JLabel tempLableIcon = new JLabel();
                tempLableIcon.setIcon(new ImageIcon(getClass().getResource("/uno_project/images/card_Images/"+g.playerHand(g.playerGroup.get(0)).get(i).toString()+" copy.png")));
                tempLableIcon.setVisible(true);
                //tempLableIcon.addMouseListener(l);
                userLP1.add(tempLableIcon,i,0);
            }
            for(int i = 0; i<g.getPlayerHandSize(1);i++){          
                JLabel tempLableIcon = new JLabel();
                tempLableIcon.setIcon(new ImageIcon(getClass().getResource("/uno_project/images/card_Images/BackOfCardRight copy.png")));
                tempLableIcon.setVisible(true);
                LP2.add(tempLableIcon,i,0);
            }                        
            for(int i = 0; i<g.getPlayerHandSize(2);i++){          
                JLabel tempLableIcon = new JLabel();
                tempLableIcon.setIcon(new ImageIcon(getClass().getResource("/uno_project/images/card_Images/BackOfCard copy.png")));
                tempLableIcon.setVisible(true);
                LP3.add(tempLableIcon,i,0);
            }
            for(int i = 0; i<g.getPlayerHandSize(3);i++){          
                JLabel tempLableIcon = new JLabel();
                tempLableIcon.setIcon(new ImageIcon(getClass().getResource("/uno_project/images/card_Images/BackOfCardLeft copy.png")));
                tempLableIcon.setVisible(true);
                LP4.add(tempLableIcon,i,0);
            }  
            p2Name_Lable.setText("Player 2: Matt");
            p3Name_Lable.setText("Player 3: Jeff");
            p4Name_Lable.setText("Player 4: Alonzo");                       
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

        choice = new javax.swing.ButtonGroup();
        rootPanel = new javax.swing.JPanel();
        helpButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        unoButton = new javax.swing.JButton();
        discardCard = new javax.swing.JLabel();
        selectButton = new javax.swing.JButton();
        LP3 = new javax.swing.JLayeredPane();
        userLP1 = new javax.swing.JLayeredPane();
        LP2 = new javax.swing.JLayeredPane();
        LP4 = new javax.swing.JLayeredPane();
        playerNameLable = new javax.swing.JLabel();
        p2Name_Lable = new javax.swing.JLabel();
        p3Name_Lable = new javax.swing.JLabel();
        p4Name_Lable = new javax.swing.JLabel();
        deck = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rootPanel.setBackground(new java.awt.Color(190, 0, 0));

        helpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno_project/information.png"))); // NOI18N
        helpButton.setToolTipText("");
        helpButton.setBorderPainted(false);
        helpButton.setContentAreaFilled(false);

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno_project/exit.png"))); // NOI18N
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        unoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno_project/unoaids.PNG"))); // NOI18N
        unoButton.setBorderPainted(false);
        unoButton.setContentAreaFilled(false);
        unoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoButtonActionPerformed(evt);
            }
        });

        discardCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno_project/images/card_Images/BackOfCard copy.png"))); // NOI18N

        selectButton.setText("Deal");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        LP3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LP3.setPreferredSize(new java.awt.Dimension(650, 110));
        LP3.setLayout(new java.awt.GridLayout());

        userLP1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userLP1.setPreferredSize(new java.awt.Dimension(650, 110));
        userLP1.setLayout(new java.awt.GridLayout());

        LP2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LP2.setPreferredSize(new java.awt.Dimension(650, 110));
        LP2.setLayout(new java.awt.GridLayout(0, 1));

        LP4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LP4.setPreferredSize(new java.awt.Dimension(650, 110));
        LP4.setLayout(new java.awt.GridLayout(0, 1));

        playerNameLable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        playerNameLable.setForeground(new java.awt.Color(255, 255, 255));
        playerNameLable.setText("Player 1: ");

        p4Name_Lable.setText("jLabel3");

        deck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno_project/images/card_Images/BackOfCard copy.png"))); // NOI18N
        deck.setToolTipText("");
        deck.setBorderPainted(false);
        deck.setContentAreaFilled(false);
        deck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addGap(718, 718, 718)
                        .addComponent(unoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton))
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rootPanelLayout.createSequentialGroup()
                                .addGap(750, 750, 750)
                                .addComponent(selectButton))
                            .addGroup(rootPanelLayout.createSequentialGroup()
                                .addGap(425, 425, 425)
                                .addComponent(userLP1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(playerNameLable)
                        .addGap(639, 639, 639))
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(LP2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rootPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(p2Name_Lable)
                                .addGap(371, 371, 371)
                                .addComponent(deck)
                                .addGap(149, 149, 149)
                                .addComponent(discardCard)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(p4Name_Lable))
                            .addGroup(rootPanelLayout.createSequentialGroup()
                                .addGap(581, 581, 581)
                                .addComponent(p3Name_Lable)))
                        .addGap(18, 18, 18))
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(helpButton)
                        .addGap(307, 307, 307)
                        .addComponent(LP3, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)))
                .addComponent(LP4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPanelLayout.createSequentialGroup()
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exitButton)
                            .addComponent(unoButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(helpButton)))
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LP2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(LP4, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(rootPanelLayout.createSequentialGroup()
                                .addComponent(p2Name_Lable)
                                .addGap(222, 222, 222))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, rootPanelLayout.createSequentialGroup()
                                .addComponent(p3Name_Lable)
                                .addGap(236, 236, 236)
                                .addComponent(p4Name_Lable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(playerNameLable))
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deck)
                            .addComponent(discardCard))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(userLP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectButton)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);        
        // Kills app        
    }//GEN-LAST:event_exitButtonActionPerformed

    private void unoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoButtonActionPerformed
        // Run a timer when card conditions are met for player for 2.5 seconds, if CPU meets conditions 2 second timer is set automatically. If player does not press,
        // 2 cards will be automatically drawn
        //if button clicked go to end game screen for player win
        //if button not clicked in time to stop cpu, go to end screen for cpu win
    }//GEN-LAST:event_unoButtonActionPerformed

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        // TODO add your handling code here:
        if(!gameStarted){
        g.initializeGame(numPlay);
        discardCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno_project/images/card_Images/" + g.getTopCard() + " copy.png")));
        initGameBoard();
        playerNameLable.setText("Player 1: "+ this.name);
        gameStarted=true;
        }else{
            selectButton.setText("Select");

        }
    }//GEN-LAST:event_selectButtonActionPerformed

    private void deckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deckActionPerformed
        // TODO add your handling code here:
        g.draw();
        userLP1.removeAll();
        initGameBoard();
    }//GEN-LAST:event_deckActionPerformed

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
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane LP2;
    private javax.swing.JLayeredPane LP3;
    private javax.swing.JLayeredPane LP4;
    private javax.swing.ButtonGroup choice;
    private javax.swing.JButton deck;
    private javax.swing.JLabel discardCard;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton helpButton;
    private javax.swing.JLabel p2Name_Lable;
    private javax.swing.JLabel p3Name_Lable;
    private javax.swing.JLabel p4Name_Lable;
    private javax.swing.JLabel playerNameLable;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JButton selectButton;
    private javax.swing.JButton unoButton;
    private javax.swing.JLayeredPane userLP1;
    // End of variables declaration//GEN-END:variables
}
