/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno_project;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class DeckTest {
    
    public DeckTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of makeDeck method, of class Deck.
     */
    @Test
    public void testMakeDeck() {
        System.out.println("makeDeck");
        Deck d = new Deck();
        d.makeDeck();
        assertEquals(d.getSize(), 108);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of makeHand method, of class Deck.
     */
    @Test
    public void testMakeHand() {
        System.out.println("makeHand");
        Deck d = new Deck();
        d.makeDeck();
        int handSize = 7;
        int newDeckSize = 101;
        ArrayList hand = d.makeHand();
        assertEquals(handSize, hand.size());
        assertEquals(newDeckSize, d.getSize());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addCard method, of class Deck.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Deck d = new Deck();
        d.makeDeck();
        int newHandSize = 8;
        ArrayList hand = d.makeHand();
        Card c1 = new Card();
        c1 = d.getCard(0);
        d.removeTopCard();
        hand.add(c1);
        assertEquals(newHandSize, hand.size());
        assertEquals(d.getSize(),100);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of shuffle method, of class Deck.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        Deck d = new Deck();
        d.makeDeck();
        d.shuffle();
        Deck d2 = new Deck();
        d2.makeDeck();
        int x = 0;
        int expResult = 10;
        for (int i=0; i<d.getSize(); i++){
            if(d.getCard(i)==d2.getCard(i))
                x++;
            else
                x = x+0;
        }
        if(x<10)
            expResult = 0;
        else
            expResult = x;
        assertEquals(expResult,0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCard method, of class Deck.
     */
    @Test
    public void testGetCard() {
        System.out.println("getCard");
        int i = 0;
        Deck d = new Deck();
        d.makeDeck();
        Card expResult = new Card();
        expResult.setColor(0);
        expResult.setValue(0);
        Card c1 = d.getCard(i);
        assertEquals(expResult.toString(), c1.toString());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of removeTopCard method, of class Deck.
     */
    @Test
    public void testRemoveTopCard() {
        System.out.println("removeTopCard");
        Deck d = new Deck();
        d.makeDeck();
        d.removeTopCard();
        assertEquals(d.getSize(),107);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sort method, of class Deck.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        Deck d = new Deck();
        d.makeDeck();
        d.sort();
        Deck d2 = new Deck();
        d2.makeDeck();
        int x = 0;
        int expResult = 10;
        for (int i=0; i<d.getSize(); i++){
            if(d.getCard(i)==d2.getCard(i))
                x++;
            else
                x = x+0;
        }
        if(x<10)
            expResult = 0;
        else
            expResult = x;
        assertEquals(expResult,0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isEmpty method, of class Deck.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Deck d = new Deck();
        d.makeDeck();
        for(int i=0; i<108; i++){
            d.removeTopCard();
        }
        Boolean expResult = true;
        Boolean result = d.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getSize method, of class Deck.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Deck d = new Deck();
        d.makeDeck();
        int expResult = 108;
        int result = d.getSize();
        assertEquals(108, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
