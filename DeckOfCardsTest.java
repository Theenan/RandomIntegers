/*
 * DeckOfCardsTest.java
 *
 * Created on November 24, 2014, 9:35 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Tony
 */
public class DeckOfCardsTest 
{
    //execute application
    public static void main( String args[] )
    {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();//place cards in random order
        
        //print all 52 cards in the order in which they are dealt
        for( int i = 0; i < 13; i++ )
        {
            //deal and print 4 cards
            System.out.printf( "%-20s%-20s%-20s%-20s\n", 
                    myDeckOfCards.dealCard(), myDeckOfCards.dealCard(),
                    myDeckOfCards.dealCard(), myDeckOfCards.dealCard()); 
        }//end for
    }//end main
}//end class
