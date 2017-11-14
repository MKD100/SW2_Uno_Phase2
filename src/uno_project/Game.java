/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno_project;

import java.util.ArrayList;

/**
 *this class is for the came play Mechanics
 * player order 
 * check if cars are valid 
 * etc
 * @author matth
 */

public class Game {
    Deck d;
    Deck discard;
    Card topCard;
    int cardColor;//"Red", "Yellow", "Blue", "Green", "Wild"
    int numberOfPlayers;
    int currentPlayer = 0;
    ArrayList<Player> playerGroup = new ArrayList<Player>();
    Player p; 
    Boolean canDiscard = true;
    Boolean reversed = false;
    Boolean skipNext = false;
    public Game(int pNum){
        Deck d = new Deck();
        d.shuffle();
        //this creates the number of players and gives each of them a hand
        genPlayer(pNum);
        topCard=d.getCard();
    }
    public void genPlayer(int numPlayers){
        this.numberOfPlayers = numPlayers;
        if(numPlayers>1 || numPlayers<11){
            for(int i=0; i<=numPlayers; i++){
                p = new Player(d.makeHand(), i); //player numbers start at 0, player 0 is always human
                playerGroup.add(p);
            }
        }else{
            System.out.println("too many or too few players");
        }
        
    }
    
    public void nextPlayer(int currentPlayer){
        int nextPlayerPID;
        
        if (!reversed && !skipNext) {
            nextPlayerPID = currentPlayer + 1;
        } else if (reversed && !skipNext) {
            if (currentPlayer == 1) {
                nextPlayerPID = numberOfPlayers;
            } else {
                nextPlayerPID = currentPlayer - 1;
            }
        } else if (!reversed && skipNext) {
            nextPlayerPID = currentPlayer + 2;
        } else if (reversed && skipNext) {
            if (currentPlayer == 2) {
                nextPlayerPID = numberOfPlayers;
            } else {
                nextPlayerPID = currentPlayer - 2;
            }
        }else{
            nextPlayerPID = 0;
        }
        
        this.currentPlayer=nextPlayerPID;
    }
    //this will control how a player plays their card, if the player is non-human
    //this controls the AI
    public void playHand(Card c){
        //check if top card allows player to play
        CheckIntendedDiscard(c);;
        
        if(currentPlayer==0){//human
            if(this.canDiscard==true){
               //discard the selected card
            }else{
                
            }
                
        }else{//not human
            
        }
    }
    public void CheckIntendedDiscard(Card c){
        if(topCard.getValue()==12||topCard.getValue()==14){
            if(c.getValue()!=12||c.getValue()!=14){
                this.canDiscard=false;
            }
        }
    }
    //this is what determines if a discard is valid and what actions should be taken
    public void draw2(){
        for (int i = 0; i < 3; i++) {
                            playerGroup.get(currentPlayer).drawCard(d.getCard());
                        }
    }
    public void draw4(){
        for (int i = 0; i < 5; i++) {
                            playerGroup.get(currentPlayer).drawCard(d.getCard());
                        }
    }
    public void discard(Card c){
        if(topCard.getColor()==c.getColor() || topCard.getValue()==c.getValue()){
            topCard=c;
            if(topCard.getValue()==12 || topCard.getValue()==14){//current top card is a draw 2 or draw4 Wild card
                //card the current player is putting down is NOT a draw 2 or draw4 Wild card
                //Player draws cards and cannot discard
                if (c.getValue() == 12 || c.getValue() == 14) {
                    nextPlayer(currentPlayer);
                    if (c.getValue() == 12) {//draw 2
                        
                    }
                    if (c.getValue() == 14) {//draw 4
                        
                    }
                }else{
                    if(c.getValue()==12){//draw 2
                        
                    }
                    if(c.getValue()==14){//draw 4 color change
                        
                    }
                }
            }
        }
    }
    
    
    
    
}