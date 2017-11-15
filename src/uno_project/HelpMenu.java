/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno_project;

/**
 *
 * @author belih
 */
public class HelpMenu extends javax.swing.JPanel {

    /**
     * Creates new form HelpMenu
     */
    public HelpMenu() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(240, 0, 0));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Setup: The game is for 2-10 players, ages 7 and over. Every player starts with seven cards, and they are dealt face down. The rest of the cards are placed in a Draw Pile face down. Next to the pile a space should be designated for a Discard Pile. The top card should be placed in the Discard Pile, and the game begins!\n\nGame Play: The first player is normally the player to the left of the dealer (you can also choose the youngest player) and gameplay usually follows a clockwise direction. Every player views his/her cards and tries to match the card in the Discard Pile.\n\nYou have to match either by the number, color, or the symbol/Action. For instance, if the Discard Pile has a red card that is an 8 you have to place either a red card or a card with an 8 on it. You can also play a Wild card (which can alter current color in play).\n\nIf the player has no matches or they choose not to play any of their cards even though they might have a match, they must draw a card from the Draw pile. If that card can be played, play it. Otherwise, the game moves on to the next person in turn. You can also play a Wild card, or a Wild Draw Four card on your turn.\n\nNote: If the first card turned up from the Draw Pile (to form the Discard Pile) is an Action card, the Action from that card applies and must be carried out. The exceptions are if the Wild or Wild Draw Four cards are turned up, in which case – Return them to the Draw Pile, shuffle them, and turn over a new card. At any time, if the Draw Pile becomes depleted and no one has yet won the round, take the Discard Pile, shuffle it, and turn it over to regenerate a new Draw Pile.\n\nThere are two different ways to play regarding drawing new cards. The Official Uno Rules states that after a card is drawn the player can discard it if it is a match, or if not, play passes on to the next player. The other type is where players continue to draw cards until they have a match, even if it is 10 times.\n\nThe game continues until a player has one card left. The moment a player has just one card they must yell “UNO!”. If they are caught not saying “Uno” by another player before any card has been played by other players, the player must draw two new cards. Assuming that the player is unable to play/discard their last card and needs to draw, but after drawing, is then able to play/discard that penultimate card, the player has to repeat the action of calling out “Uno”. The bottom line is – Announcing “Uno” needs to be repeated every time you are left with one card.\n\nOnce a player has no cards remaining, the game round is over, points are scored, and the game begins over again. Normally, everyone tries to be the first one to achieve 500 points, but you can also choose whatever points number to win the game, as long as everyone agrees to it.\n\nAction Cards: Besides the number cards, there are several other cards that help mix up the game. These are called Action or Symbol cards.\n\nuno action cards\n\n    Reverse – If going clockwise, switch to counterclockwise or vice versa.\n    Skip – When a player places this card, the next player has to skip their turn. If turned up at the beginning, the first player loses his/her turn.\n    Draw Two – When a person places this card, the next player will have to pick up two cards and forfeit his/her turn.\n    Wild – This card represents all four colors, and can be placed on any card. The player has to state which color it will represent for the next player. It can be played regardless of whether another card is available.\n    Wild Draw Four – This acts just like the wild card except that the next player also has to draw four cards as well as forfeit his/her turn. With this card, you must have no other alternative cards to play that matches the color of the card previously played. If you play this card illegally, you may be challenged by the other player to show your hand. If guilty, you need to draw 4 cards. If not, the challenger needs to draw 6 cards instead.\n\nScoring: When a player no longer has any cards and the game ends, he/she receives points. All opponents’ cards are given to the winner and points are counted. All number cards are the same value as the number on the card (e.g. a 9 is 9 points). “Draw Two\" – 20 Points, “Reverse\" – 20 Points, “Skip\" – 20 Points, “Wild\" – 50 Points, and “Wild Draw Four\" – 50 Points. The first player to attain 500 points wins the game.\n\nAlternative Gameplay:\n\nThis is the alternative Uno gameplay proposed by Mattel. This is done by keeping a running tally of the total points left in each player’s hand at the end of each round. Players reaching 500 points (or any designated amount) are slowly eliminated until only two are left. The final two players then challenge each other (under Two Player rules) until someone reaches 500 points and loses.\n\nTwo Player & Four Player Rules\n\nFor two players, there is a slight change of rules:\n\n    Reverse works like Skip\n    Play Skip, and you may immediately play another card\n    If you play a Draw Two or Wild Draw Four card, your opponent has to draw the number of cards required, and then play immediately resumes back on your turn.\n\nFor four players (two-partner teams), players sit opposite their partners, and play until one of either partner goes out with one Uno card left. Scoring for the winning team is done by adding up all the points from opposing partner’s hands.");
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("CLOSE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(249, 249, 249))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(0, 21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
