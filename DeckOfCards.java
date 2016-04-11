/*
 * DeckOfCards.java
 *
 * Created on November 24, 2014, 9:11 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author Tony
 */
public class DeckOfCards 
{
    private Card deck[];//array of card objects
    private int currentCard;//index of next card to be dealt
    private final int NUMBER_OF_CARDS = 52;//Constant number of cards
    private Random randomNumbers;//random number generator
    
    //constructor fills deck of cards
    public DeckOfCards()
    {
        String faces[] = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
             "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"};
        
        deck = new Card[ NUMBER_OF_CARDS ];//creates array of Card objects
        currentCard = 0;//set currentCard so first card delt in deck [0]
        randomNumbers = new Random();//creates random number generator
        
        ///populate deck with Card objects
        for( int count = 0; count < deck.length; count++)
            deck[ count ] =
                    new Card( faces[ count % 13], suits[ count / 13] );
    }//end DeckOfCards constructor
    
    //shuffle deck of Cards with one-pass algorithm
    public void shuffle()
    {
        //after shuffling dealing should start at deck[ 0 ] again
        currentCard = 0;
        
        //for each card pick another random card and swap them
        for( int first = 0; first < deck.length; first++)
        {
            //select a random number between 0 and 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            
            //swap current Card with randomly selected card
            Card temp = deck[ first ];
            deck[ first ] = deck[ second ];
            deck[ second ] = temp;
        }//end for
    }//end shuffle
    
    //deal one card
    public Card dealCard()
    {
        //determine whether cards remain to be dealt
        if( currentCard < deck.length )
            return deck[ currentCard++ ];//return current card in array
        else 
            return null;//return null to indicate that all cards were dealt
        
    }//end dealCard method
      
}//end class
