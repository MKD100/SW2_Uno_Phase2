/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno_project;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @
 */
public class CardTest {
    
    public CardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Deck d = new Deck();
        d.makeDeck();
        d.sort();
        Card c1 = new Card();
        c1 = d.getCard(0);
        String expResult = "RedZero";
        String result = c1.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getColor method, of class Card.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Deck d = new Deck();
        d.makeDeck();
        d.sort();
        Card c1 = new Card();
        c1 = d.getCard(0);
        int expResult = 0;
        int result = c1.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class Card.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Deck d = new Deck();
        d.makeDeck();
        d.sort();
        Card c1 = new Card();
        c1 = d.getCard(0);
        int expResult = 0;
        int result = c1.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setColor method, of class Card.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        Deck d = new Deck();
        d.makeDeck();
        d.sort();
        int colorx = 0;
        Card c1 = new Card();
        c1 = d.getCard(0);
        c1.setColor(colorx);
        int expResult = 0;
        int result = c1.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setValue method, of class Card.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        Deck d = new Deck();
        d.makeDeck();
        d.sort();
        int valuex = 0;
        Card c1 = new Card();
        c1 = d.getCard(0);
        c1.setValue(valuex);
        int expResult = 0;
        int result = c1.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getImage method, of class Card.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        Deck d = new Deck();
        d.makeDeck();
        d.sort();
        Card c1 = new Card();
        c1 = d.getCard(0);
        String expResult = "RedZero copy.png";
        String result = c1.getImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of compareTo method, of class Card.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Deck d = new Deck();
        d.makeDeck();
        Card c1 = d.getCard(0);
        Card c2 = d.getCard(40);
        int result = c1.compareTo(c2);
        assertNotEquals(0, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}