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
    ArrayList <Card> a = new ArrayList<Card>();
    private Card card = new Card();
    /*public String printAllCard(){
        for (int i=0; i<4; i++)
            
    }*/
    public Deck(){
        this.makeDeck();
    }
    public void makeDeck(){
        String b;
        for (int i=0; i<4; i++){
            Card c1 = new Card();
            
        }
        for (int i=0; i<4; i++){
            for (int j=0; j<13; j++){
                Card c1 = new Card();
                c1.setSuit(i);
                c1.setValue(j);
                a.add(c1);
                
            }
        }
    }
    public void shuffle(){
        Collections.shuffle(this.a);
    }
    
    public Card getCard(){
        Card c1 = new Card();
        c1 = a.get(0);
        a.remove(0);
        shuffle();
        return c1;
    }  
    public void printAllCards(){
        for(int i=0; i<a.size(); i++){
            Card a = new Card();
            a = this.a.get(i);
            System.out.println(a.toString());
        }
    }
    public void sort(){
        Collections.sort(this.a);
    }
}

