/**
 * @author: Winona Una Gamba, Alyana Soriano, Cameron Jay Carpo and Julian Mark Labo
 * Section: ICT - DECISIVE (CTHI)
 * March 7, 2023
 */

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Baboy {
    private static String input = "";
    private static Scanner pog = new Scanner(System.in);
    private static Random ran = new Random();
    private static int dice;
    private static int playerTotal = 0;
    private static int playerScores = 0;
    private static int CompTotal = 0;
    private static int CompScores = 0;
    private static String ComputerMove = "";

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello! Welcome to the Pig Game!");
        NewGame();
        GamePlay();
    }

    private static void NewGame() throws InterruptedException {
        System.out.println("Do you want to start a new game? (Y/N)");
        input = pog.nextLine();
        resetGamePlayer();
        resetGameComp();
        if (input.equalsIgnoreCase("Y")) {
            GamePlay();
        } else {
            System.exit(0);
        }

    }

    public static void GamePlay() throws InterruptedException {
        PlayerTurn();
    }

    public static void PlayerTurn() throws InterruptedException {
        while (true) {

            System.out.println("-----YOUR TURN-----");
            do {
                dice = ran.nextInt(6) + 1;
                System.out.println("The die rolled: " + dice);
                if (dice == 1) {
                    resetGamePlayer();
                    System.out.println("Turn ended. You earned " + playerTotal + " points.");
                    CompTurn();
                    break;
                }
                System.out.println("Keep going? (Y/N)");
                input = pog.nextLine();
                if (input.equalsIgnoreCase("Y")) {
                    playerTotal = playerScores += dice;
                    if (playerTotal >= 100) {
                    	System.out.println("Turn ended. You earned " + playerTotal + " points.");
                        System.out.println("You won!");
                        NewGame();
                        break;
                    }
                } else if (input.equalsIgnoreCase("N")) {
                    playerTotal = playerScores += dice;
                    System.out.println("Turn ended. You earned " + playerTotal + " points.");
                    if (playerTotal >= 100) {
                    	System.out.println("Turn ended. You earned " + playerTotal + " points.");
                        System.out.println("You won!");
                        NewGame();
                        break;
                    } else {
                        CompTurn();
                        break;
                    }

                } else {
                    System.out.println("You have entered the wrong input, please try again.");
                }
            } while (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N"));

            if (input.equalsIgnoreCase("N")) {
                System.out.println("Turn ended. You earned " + playerTotal + " points.");
                if (playerTotal >= 100) {
                	System.out.println("Turn ended. You earned " + playerTotal + " points.");
                    System.out.println("You won!");
                    NewGame();
                    break;
                } else {
                    CompTurn();
                    break;
                }

            } else {
                System.out.println("You have entered the wrong input, please try again.");
            }
        }
    }

    public static void resetGamePlayer() {
        playerTotal = 0;
        playerScores = 0;
    }

    public static void resetGameComp() {
        CompTotal = 0;
        CompScores = 0;
    }

    private static void CompTurn() throws InterruptedException {
        String[] yesno = { "Y", "N" };
        ComputerMove = yesno[new Random().nextInt(yesno.length)];
        System.out.println("-----COMPUTER'S TURN-----");

        do {
            TimeUnit.SECONDS.sleep(2);
            dice = ran.nextInt(6) + 1;
            System.out.println("The die rolled: " + dice);
            if (dice == 1) {
                resetGameComp();
                System.out.println("Turn ended. Computer earned " + CompTotal + " points.");
                PlayerTurn();
                break;
            }

            System.out.println("Keep going? (Y/N)");
            System.out.println(ComputerMove);
            if (ComputerMove.equalsIgnoreCase("Y")) {
                CompTotal = CompScores += dice;
                if (CompTotal >= 100) {
                	System.out.println("Turn ended. Computer earned " + CompTotal + " points.");
                    System.out.println("Computer won!");
                    NewGame();
                    break;
                }
            } else if (ComputerMove.equalsIgnoreCase("N")) {
                CompTotal = CompScores += dice;
                System.out.println("Turn ended. Computer earned " + CompTotal + " points.");
                if (CompTotal >= 100) {
                	System.out.println("Turn ended. Computer earned " + CompTotal + " points.");
                    System.out.println("Computer won!");
                    NewGame();
                    break;
                }
                PlayerTurn();
                break;
            }
            if (CompTotal >= 100) {
            	System.out.println("Turn ended. Computer earned " + CompTotal + " points.");
                System.out.println("Computer won!");
                break;
            }
        } while (ComputerMove.equalsIgnoreCase("Y"));

    }

}
