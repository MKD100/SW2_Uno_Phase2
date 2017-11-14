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
public class Uno_Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Deck d = new Deck(); 
        //d.shuffle();
        d.printAllCards();
        System.out.println("-----------------------------------");
        //d.sort();
        //d.printAllCards();
    }
    
}
