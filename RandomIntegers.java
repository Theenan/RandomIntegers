/*
 * RandomIntegers.java
 *
 * Created on November 22, 2014, 5:43 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author Tony
 */
public class RandomIntegers 
{
    //creates random number generator
    private Random randomNumbers = new Random();
    
    //enumeration with constrants that represent the game status
    private enum Status{ CONTINUE, WON, LOST };
    
    //constants that represent common rolls of the dice
    private final static int SNAKE_EYES = 2;
    private final static int TREY = 3;
    private final static int SEVEN = 7;
    private final static int YO_LEVEN = 11;
    private final static int BOX_CARS = 12;
    
    //plays one game of craps
    public void play()
    {
        int myPoint = 0;//point if no win or loss on first roll
        Status gameStatus;//can contain CONTINUE, WON, LOST
        
        int sumOfDice = rollDice();
        
        //determins stats of game and points based on first roll
        switch( sumOfDice )
        {
            case SEVEN://win with 7 on first roll
            case YO_LEVEN://win with 11 on first roll
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES://lose with 2 on the first roll
            case TREY://lose with 3 on first roll
            case BOX_CARS://lose with 11 on first roll
                gameStatus = Status.LOST;
                break;
            default://did not win or lose so remember point
                gameStatus = Status.CONTINUE;//game is not over
                myPoint = sumOfDice;//remember the point
                System.out.printf( "Point is %d\n", myPoint );
                break;//optional at end of switch
          }//end of switch      
        while( gameStatus == Status.CONTINUE )//not won or lost
        {
            sumOfDice = rollDice();//roll dice again
            
            //determin gameStatus
            if( sumOfDice == myPoint )
                gameStatus = Status.WON;
            else
                if( sumOfDice == SEVEN )
                    gameStatus = Status.LOST;
            }//end while
        
        //display won or lost
        if( gameStatus == Status.WON)
            System.out.println("Player Wins");
        else
            System.out.println("Player Lost");
    }//end method play
    
    public int rollDice()
    {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        
        int sum = die1 + die2;
        
        //display results of this roll
        System.out.printf( "Player rolled %d + %d = %d\n", 
                die1, die2, sum);
        
        return sum;
    }//end rollDice
    
}//end class
