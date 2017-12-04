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

/**
 *
 * 
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addPlayerName method, of class Player.
     */
    @Test
    public void testAddPlayerName() {
        System.out.println("addPlayerName");
        String name = "Alonzo";
        ArrayList<Card> hand = new ArrayList<Card>();
        Player p = new Player(hand,0);
        p.addPlayerName(name);
        String expResult = p.getPlayerName();
        assertEquals(expResult, "Alonzo");
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPlayerName method, of class Player.
     */
    @Test
    public void testGetPlayerName() {
        System.out.println("getPlayerName");
        String name = "Alonzo";
        ArrayList<Card> hand = new ArrayList<Card>();
        Player p = new Player(hand,0);
        p.addPlayerName(name);
        String expResult = p.getPlayerName();
        assertEquals(expResult, "Alonzo");
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCardName method, of class Player.
     */
    @Test
    public void testGetCardName() {
        System.out.println("getCardName");
        Card c1 = new Card(0,0);
        ArrayList<Card> hand = new ArrayList<Card>();
        Player p = new Player(hand,0);
        p.drawCard(c1);
        String expResult = "RedZero copy.png";
        String result = p.getCardName(0);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sortHand method, of class Player.
     */
    @Test
    public void testSortHand() {
        System.out.println("sortHand");
        ArrayList<Card> hand = new ArrayList<Card>();
        Player p = new Player(hand,0);
        ArrayList<Card> hand2 = new ArrayList<Card>();
        Player p2 = new Player(hand,0);
        int x=0;
        for (int i=0; i<7; i++){
            Card c = new Card(0,i);
            p.drawCard(c);
            p2.drawCard(c);
        }
        p.sortHand();
        for (int i=0; i<hand.size(); i++){
            if(p.getCardName(i).compareTo(p2.getCardName(i)) != 0);
                x++;
        }
        assertNotEquals(x,1);    
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getHandSize method, of class Player.
     */
    @Test
    public void testGetHandSize() {
        System.out.println("getHandSize");
        ArrayList<Card> hand = new ArrayList<Card>();
        Player p = new Player(hand,0);
        for (int i=0; i<7; i++){
            Card c = new Card(0,i);
            p.drawCard(c);
        int expResult = 1;
        int result = p.size();
        assertEquals(expResult, result);
        }
    }

    /**
     * Test of drawCard method, of class Player.
     */
    @Test
    public void testDrawCard() {
        System.out.println("drawCard");
        Card c = null;
        Player instance = null;
        instance.drawCard(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class Player.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Player instance = null;
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of discard method, of class Player.
     */
    @Test
    public void testDiscard() {
        System.out.println("discard");
        int whichCard = 0;
        Player instance = null;
        Card expResult = null;
        Card result = instance.discard(whichCard);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
