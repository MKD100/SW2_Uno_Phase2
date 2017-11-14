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
    private String[] cardColor = {"Red", "Yellow", "Blue", "Green", "Wild"};
    private String[] cardValue = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
                                   "Eight", "Nine", "Skip", "Reverse", "DrawTwo", 
                                   "SetColor", "SetColorDrawFour"};
                                    /*
                                    10=Skip , 11=Reverse , 12=DrawTwo , 
                                    13=WildChangeColor , 14=WildChangeColorDrawFour
                                    */
    public Card(){
    }
    public Card(int cColor, int cValue){
        color = cColor;
        value = cValue;
        String test;
    }
    public String toString(){
        String cardInfo = cardColor[color]+cardValue[value];
        return cardInfo;
    }
    public int getColor(){
        return this.color;
    }
    public int getValue(){
        return this.value;
    }
    public void setColor(int colorx){
            this.color = colorx;
    }
    public void setValue(int valuex){
        this.value = valuex;
    }
    public String getImage(){
        return ("/images"+"/"+Integer.toString(this.color)+".png");
    }
    @Override
    public int compareTo(Card compareCard) {
        
        int compareColor = ((Card)compareCard).getColor();
        int compareValue=((Card)compareCard).getValue();
        if(this.color == compareColor)
        {
            /* For Ascending order of values */
            return this.value-compareValue;
         }
        /* For Ascending order of suits */
        else return this.color - compareColor; 
     }

}
