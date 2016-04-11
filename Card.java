/*
 * Card.java
 *
 * Created on November 24, 2014, 9:07 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Tony
 */
public class Card 
{
    private String face;
    private String suit;
    
    //two-argument constructor initializes card's face and suit
    public Card( String cardFace,  String cardSuit)
    {
        face = cardFace;//initialize face of card
        suit = cardSuit;//initializes suit of card
        
    }//end card constructor
    
    //return String Representation of card
    public String toString()
    {
        return face + "of" + suit;
    }//end method toString
}//end class card
