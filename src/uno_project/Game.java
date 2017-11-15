/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno_project;

import java.util.ArrayList;

/**
 * this class is for the came play Mechanics player order check if cars are
 * valid etc
 *
 * @author matth
 */
public class Game {

    Deck d = new Deck();
    Deck discard;
    Card topCard;
    int cardColor;//"Red", "Yellow", "Blue", "Green", "Wild"
    int numberOfPlayers=0;
    int currentPlayer = 0;
    ArrayList<Player> playerGroup = new ArrayList<Player>();
    Player p;
    Boolean canDiscard = true;
    Boolean reversed = false;
    Boolean skipNext = false;
    
    //CONSTANTS
    int MAX_NUM_PLAYERS =4;
    int MIN_NUM_PLAYERS =2;
    
    public Game(){
        
    }
    public String getTopCard(){
        return this.topCard.toString();
    }
    public void initializeGame(int pNum) {
        
        this.d.makeDeck();
        this.d.shuffle();
        //this creates the number of players and gives each of them a hand
        genPlayers(pNum);
        this.topCard = this.d.getCard();
    }

    public void genPlayers(int numPlayers) {
        this.numberOfPlayers = numPlayers;
        if (numPlayers >= MIN_NUM_PLAYERS || numPlayers <= MAX_NUM_PLAYERS) {
            for (int i = 0; i < numPlayers; i++) {
                ArrayList<Card> tempHand = new ArrayList<Card>();
                tempHand.addAll(d.makeHand());
                p = new Player(tempHand, i); //player numbers start at 0, player 0 is always human
                playerGroup.add(p);
            }
        } else {
            System.out.println("too many or too few players");
        }
    }

    public ArrayList playerHand(Player p){
        return p.handCardNames();
    }
    public int getPlayerHandSize(int index){
        return this.playerGroup.get(index).getHandSize();
    }
    public void setHumanName(String hPlayerName){
        this.playerGroup.get(0).addPlayerName(hPlayerName);
    }
    
    public void nextPlayer() {
        int nextPlayerPID;

        if (!reversed && !skipNext) {
            nextPlayerPID = this.currentPlayer + 1;
        } else if (reversed && !skipNext) {
            if (this.currentPlayer == 1) {
                nextPlayerPID = this.numberOfPlayers;
            } else {
                nextPlayerPID = this.currentPlayer - 1;
            }
        } else if (!reversed && skipNext) {
            nextPlayerPID = currentPlayer + 2;
        } else if (reversed && skipNext) {
            if (this.currentPlayer == 2) {
                nextPlayerPID = this.numberOfPlayers;
            } else {
                nextPlayerPID = this.currentPlayer - 2;
            }
        } else {
            nextPlayerPID = 0;
        }

        this.currentPlayer = nextPlayerPID;

    }

    //this will control how a player plays their card, if the player is non-human
    //this controls the AI
    public void playHand(Card c) {
        //check if top card allows player to play
        CheckIntendedDiscard(c);

        if (currentPlayer == 0) {//human
            if(c.getValue()==12){
                
            }
            if (this.canDiscard == true) {
                discard.addCard(c);
                this.playerGroup.get(this.currentPlayer).hand.remove(c);
                this.canDiscard = false;
                nextPlayer();
            } else {
                //To Do 
                //add what to do if the card cannot be discarded
            }

        } else {//not human
            //Add the AI code for the computer to play its hand
        }
    }

    public Boolean CheckIntendedDiscard(Card c) {
        if (this.topCard.getColor() == c.getColor() || this.topCard.getColor() == c.getColor()) {
            this.canDiscard=true;
        }
        return canDiscard;
    }

    //this is what determines if a discard is valid and what actions should be taken

    public void draw() {
        
            playerGroup.get(currentPlayer).drawCard(d.getCard());
        
    }
    
    public void draw2() {
        for (int i = 0; i < 3; i++) {
            playerGroup.get(currentPlayer).drawCard(d.getCard());
        }
    }

    public void draw4() {
        for (int i = 0; i < 5; i++) {
            playerGroup.get(currentPlayer).drawCard(d.getCard());
        }
    }

    public void discard(Card c) {
        if (topCard.getColor() == c.getColor() || topCard.getValue() == c.getValue()) {
            topCard = c;
            if (topCard.getValue() == 12 || topCard.getValue() == 14) {//current top card is a draw 2 or draw4 Wild card
                //card the current player is putting down is NOT a draw 2 or draw4 Wild card
                //Player draws cards and cannot discard
                if (c.getValue() == 12 || c.getValue() == 14) {
                    nextPlayer();
                    if (c.getValue() == 12) {//draw 2

                    }
                    if (c.getValue() == 14) {//draw 4

                    }
                } else {
                    if (c.getValue() == 12) {//draw 2

                    }
                    if (c.getValue() == 14) {//draw 4 color change

                    }
                }
            }
        }
        if(d.isEmpty()){
            for(int i =0; i<discard.getSize();i++){
                d.addCard(discard.getCard());
            }
        }
    }
}
