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
public class Card implements Comparable<Card>{
    private int color, value;
    private String[] cardColor = {"Red", "Yellow", "Blue", "Green"};
    private String[] cardValue = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
                                   "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen"};
                                    /*
                                    10=Skip , 11=Reverse , 12=DrawTwo , 
                                    13=WildChangeColor , 14=WildChangeColorDrawFour
                                    */
    public Card(){
    }
    public Card(int cColor, int cValue){
        color = cColor;
        value = cValue;
    }
    public String toString(){
        String cardInfo = cardValue[value]+cardColor[color];
        return cardInfo;
    }
    public int getSuit(){
        return this.color;
    }
    public int getValue(){
        return this.value;
    }
    public void setSuit(int suitx){
            this.color = suitx;
    }
    public void setValue(int valuex){
        this.value = valuex;
    }
    public String getImage(){
        return ("/images"+"/"+Integer.toString(this.color)+".png");
    }
    @Override
    public int compareTo(Card compareCard) {
        
        int compareSuit = ((Card)compareCard).getSuit();
        int compareValue=((Card)compareCard).getValue();
        if(this.color == compareSuit)
        {
            /* For Ascending order of values */
            return this.value-compareValue;
         }
        /* For Ascending order of suits */
        else return this.color - compareSuit; 
     }

}
