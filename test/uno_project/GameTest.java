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
 * @author matth
 */
public class GameTest {
    
    public GameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getTopCard method, of class Game.
     */
    @Test
    public void testGetTopCard() {
        System.out.println("getTopCard");
        Game instance = new Game();
        String expResult = instance.d.getCard(0).toString();
        String result = instance.getTopCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of initializeGame method, of class Game.
     */
    @Test
    public void testInitializeGame() {
        System.out.println("initializeGame");
        int pNum = 2;
        Game instance = new Game();
        instance.initializeGame(pNum);
        assertEquals(instance.numberOfPlayers, 2);
        
    }

    /**
     * Test of genPlayers method, of class Game.
     */
    @Test
    public void testGenPlayers() {
        System.out.println("genPlayers");
        Game instance = new Game();
        instance.numberOfPlayers=1;
        instance.genPlayers();
        // TODO review the generated test code and remove the default call to fail.
        assertNotNull(instance.playerGroup.get(0).hand);
    }

    /**
     * Test of getPlayerCardName method, of class Game.
     */
    @Test
    public void testGetPlayerCardName() {
        System.out.println("getPlayerCardName");
        int playerIndex = 0;
        int cardIndex = 0;
        Game instance = new Game();
        instance.playerGroup.get(0).drawCard(new Card(0,0));
        String expResult = "RedZero";
        String result = instance.getPlayerCardName(playerIndex, cardIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of playerHand method, of class Game.
     */
    @Test
    public void testPlayerHand() {
        System.out.println("playerHand");
        Game instance = new Game();
        instance.initializeGame(0);
        Player p = instance.playerGroup.get(0);
        ArrayList expResult = instance.playerGroup.get(0).hand;
        ArrayList result = instance.playerHand(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPlayerHandSize method, of class Game.
     */
    @Test
    public void testGetPlayerHandSize() {
        System.out.println("getPlayerHandSize");
        int index = 0;
        Game instance = new Game();
        instance.initializeGame(0);
        int expResult = 7;
        int result = instance.getPlayerHandSize(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setHumanName method, of class Game.
     */
    @Test
    public void testSetHumanName() {
        System.out.println("setHumanName");
        String hPlayerName = "Matthew";
        Game instance = new Game();
        instance.setHumanName(hPlayerName);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(instance.playerGroup.get(0).playerName, hPlayerName);
    }

    //****************************************************************************
    //these methods are still a work in progress
    //****************************************************************************
    /**
     * Test of nextPlayer method, of class Game.
     */
//    
//    @Test
//    public void testNextPlayer() {
//        System.out.println("nextPlayer");
//        Game instance = new Game();
//        instance.nextPlayer();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of aiPlayer method, of class Game.
//     */
//    @Test
//    public void testAiPlayer() {
//        System.out.println("aiPlayer");
//        Game instance = new Game();
//        instance.aiPlayer();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of playHand method, of class Game.
//     */
//    @Test
//    public void testPlayHand() {
//        System.out.println("playHand");
//        Card c = null;
//        Game instance = new Game();
//        instance.playHand(c);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of CheckIntendedDiscard method, of class Game.
//     */
//    @Test
//    public void testCheckIntendedDiscard() {
//        System.out.println("CheckIntendedDiscard");
//        Card c = null;
//        Game instance = new Game();
//        Boolean expResult = null;
//        Boolean result = instance.CheckIntendedDiscard(c);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of draw method, of class Game.
//     */
//    @Test
//    public void testDraw() {
//        System.out.println("draw");
//        Game instance = new Game();
//        instance.draw();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of draw2 method, of class Game.
//     */
//    @Test
//    public void testDraw2() {
//        System.out.println("draw2");
//        Game instance = new Game();
//        instance.draw2();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of draw4 method, of class Game.
//     */
//    @Test
//    public void testDraw4() {
//        System.out.println("draw4");
//        Game instance = new Game();
//        instance.draw4();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of discard method, of class Game.
//     */
//    @Test
//    public void testDiscard() {
//        System.out.println("discard");
//        Card c = null;
//        Game instance = new Game();
//        instance.discard(c);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of remove method, of class Game.
//     */
//    @Test
//    public void testRemove() {
//        System.out.println("remove");
//        int i = 0;
//        int j = 0;
//        Game instance = new Game();
//        instance.remove(i, j);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
    
}
