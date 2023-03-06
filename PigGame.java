/**
 * @author Alyana Soriano
 */
import java.util.*;

public class PigGame {
  public static void main(String[] args) {

      int playerScores = 0;
      int playerTotal = 0;
      int computerScores = 0;
      int computerTotal = 0;
      int dice;
      boolean gameOver = false;
      boolean turnOver = false;
      char repeat = (0);
      String input;   
      Scanner keyboard  = new Scanner(System.in);
       
      Random rand = new Random();
    
    System.out.println("Hello! Wellcome to pig game!");

      while (gameOver == false)
      {    
         do
         {
            while (true){
            System.out.println("keep going? (Y/N)");
            input = keyboard.nextLine();
            repeat = input.charAt(0);
            if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N")){
              System.out.println();
              System.out.println("-----YOUR TURN-----");
                break;
            }
        }

          dice = rand.nextInt(6) + 1;
          System.out.println("The dice rolled a " + dice);
           if (dice == 1)
            {
               playerScores = 0;
               System.out.print("Turn ended. ");
               System.out.println("You earned " + playerTotal + (" points");
               turnOver = true;}
               else
            {
             playerScores += dice;
              
               while (true){
                System.out.println("Keep going? (Y/N)");
                input = keyboard.nextLine();
                repeat = input.charAt(0);
                if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N")){
                    break;
                }

            }
        
               if (repeat == 'N')
                System.out.println("Turn ended. You earned " + playerScores + " points");
                  break;                               
        }}
            while(playerTotal <= 100);
            
  }
}}
