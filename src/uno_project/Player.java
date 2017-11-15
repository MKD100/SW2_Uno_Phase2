/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno_project;

import java.util.ArrayList;

/**
 *
 * @author matth
 */
public class Player {

    ArrayList<Card> hand = new ArrayList<Card>();
    //player id to identify multiple players
    int pID = 0;
    String playerName;
    Boolean atUno = false;

    public Player(ArrayList inHand, int playerNum) {
        this.hand.addAll(inHand);
        this.pID = playerNum;
    }

    public void addPlayerName(String name){
        this.playerName=name;
    }
    
    public String getPlayerName(){
        return this.playerName;
    }
    public int getPID() {
        return this.pID;
    }

    public void drawCard(Card c) {
        this.hand.add(c);
    }

    public Card discard(int whichCard) {
        Card dCard = hand.get(whichCard);
        if (this.hand.size() == 1) {
            this.atUno = true;
        }
        return dCard;
    }

}
