/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno_project;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author matth
 */
public class Player {

    ArrayList<Card> hand = new ArrayList<Card>();
    //player id to identify multiple players
    int pID = 0;
    int numCards=0;
    String playerName;
    Boolean atUno = false;

    public Player(ArrayList inHand, int playerNum) {
        this.hand.addAll(inHand);
        this.numCards= 7;
        this.pID = playerNum;
    }

    public void addPlayerName(String name){
        this.playerName=name;
    }
    
    public String getPlayerName(){
        return this.playerName;
    }

    public String getCardName ( int cardIndex){
        String tempCard = hand.get(cardIndex).getImage();
        return tempCard;
    }
    
    public ArrayList handCardNames(){
            ArrayList<String> cardNames = new ArrayList<String>();
        for(int i=0; i< this.getHandSize(); i++){
            cardNames.add(this.hand.get(i).toString());
        }
        return cardNames;
        
    }
    public void sortHand(){
        Collections.sort(hand);
    }
    public int getHandSize(){
        return this.hand.size();
    }
    
    public void drawCard(Card c) {
        this.hand.add(c);
        this.numCards++;
    }

    public Card discard(int whichCard) {
        Card dCard = hand.get(whichCard);
        hand.remove(whichCard);
        if (this.hand.size() == 1) {
            this.atUno = true;
        }
        return dCard;
    }

}
