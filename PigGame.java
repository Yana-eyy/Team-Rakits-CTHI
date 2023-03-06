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
      char repeat;
      String input;   
      Scanner keyboard  = new Scanner(System.in);
       
      Random rand = new Random();
    
    System.out.println("Hello! Wellcome to pig game!");

      while (gameOver == false)
      {    
         do
         {
          dice = rand.nextInt(6) + 1;
          System.out.println("You rolled: " + dice);
  }
}
