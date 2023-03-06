/**
 * @author Alyana Soriano
 */
import java.util.*;

public class PigGame { 
    
    private static int playerScores = 0;
    private static int playerTotal = 0;
    private static int computerScores = 0;
    private static int computerTotal = 0;
    private static int dice;
    private static boolean gameOver = false;
    private static boolean turnOver = false;
    private static char repeat = (0);
    private static String input;   
    private static Scanner keyboard  = new Scanner(System.in);
       
    private static Random rand = new Random();
  public static void main(String[] args) {

    System.out.println("Hello! Wellcome to pig game!");
    PlayerChoice();

    public static void PlayerChoice();{

      while (gameOver == false)
      {    
         do
         {
            //
            while (true){
            System.out.println("Do you want to play? (Y/N)");
            input = keyboard.nextLine();
            repeat = input.charAt(0);
            if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N")){
                break;
            }
        }   
            System.out.println("Let's play!");

          dice = rand.nextInt(6) + 1;
          System.out.println("You rolled: " + dice);
           if (dice == 1)
            {
               playerScores = 0;
               System.out.print("You lose your turn! ");
               System.out.println("Your total is " + playerTotal);
               turnOver = true;}
               else
            {
             playerScores += dice;
               System.out.print("Your turn score is " + playerScores);
               System.out.println(" If you hold you will have " + playerScores + " points.");
               while (true){
                System.out.println("Do you want to play? (Y/N)");
                input = keyboard.nextLine();
                repeat = input.charAt(0);
                if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N")){
                    
                }
                else if (repeat == 'N')
                System.out.println("Turn ended. You earned " + playerScores + " points");
                  break; 
            }
        
                                             
        }}
            while(playerTotal <= 100);
            
  }}
}
private static void PlayerChoice() {
}}