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
import java.util.*;

public class Deck {

    ArrayList<Card> a = new ArrayList<Card>();
    private Card card = new Card();

    /*public String printAllCard(){
        for (int i=0; i<4; i++)
            
    }*/
    public Deck() {
        
    }

    public void makeDeck() {
        //Add the 4 Zero Cards
        for (int i = 0; i < 4; i++) {
            Card c1 = new Card();
            c1.setColor(i);
            c1.setValue(0);
            a.add(c1);
        }
        //Add the 4 Wild Change color cards
        for (int i = 0; i < 4; i++) {
            Card c1 = new Card();
            c1.setColor(4);
            c1.setValue(13);
            a.add(c1);
        }
        //Add the 4 Wild Change color/Draw 4 cards
        for (int i = 0; i < 4; i++) {
            Card c1 = new Card();
            c1.setColor(4);
            c1.setValue(14);
            a.add(c1);
        }
        /*Populate the rest of the deck with
          2 of every card 1-9, skip, reverse, and addtwo*/
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 13; j++) {
                Card c1 = new Card();
                c1.setColor(i);
                c1.setValue(j);
                a.add(c1);
            }
        }
    }
    
    public ArrayList makeHand(){
        ArrayList<Card> hand = new ArrayList<Card>();
        
        for(int i=0; i<7;i++){
            hand.add(a.get(0));
            a.remove(0);
        }
        return hand;
    }
    
    public void addCard(Card c){
        a.add(c);
    }
    
    public void shuffle() {
        Collections.shuffle(this.a);
    }

    public Card getCard(int i ) {
        Card c1 = new Card();
        c1 = a.get(i);
//        a.remove(0);
        //shuffle();
        return c1;
    }
    public void removeTopCard(){
        a.remove(0);
    }

    public void printAllCards() {
        for (int i = 0; i < a.size(); i++) {
            Card a = new Card();
            a = this.a.get(i);
            System.out.println(a.toString());
        }
    }

    public void sort() {
        Collections.sort(this.a);
    }
    public Boolean isEmpty(){
        if(a.size() <1){
            return true;
        }else{
            return false;
        }
    }
    public int getSize(){
        
        return a.size();
    }
}
