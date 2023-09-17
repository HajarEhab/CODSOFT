import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        Random randomNumber = new Random();
	        int minRange = 1;
	        int maxRange = 200;
	        int maxAttempts = 8;
	        int score = 0;

	        System.out.println("Welcome in Guessing Number Game ;) "+"\n");

	        boolean tryAgain = true;
	        while (tryAgain) {
	            int chosenNumber = randomNumber.nextInt(maxRange - minRange + 1) + minRange;
	            boolean guessedCorrectly = false;

	            System.out.println("I have chosen a number between " + minRange + " and " + maxRange + ".");
	            System.out.println("You have " + maxAttempts + " Try to guess the number.");

	            for (int attempts =1;attempts <= maxAttempts;attempts++) {
	                System.out.print("Please Enter your guess: ");
	                int playerGuess = scan.nextInt();

	                if (playerGuess == chosenNumber) {
	                    System.out.println("Congratulations My Friend ! You guessed the number correctly in " + attempts + " attempts.");
	                    score++;
	                    guessedCorrectly = true;
	                    break;
	                } else if (playerGuess < chosenNumber) {
	                    System.out.println("Your Guess Is Too low! Try again.");
	                } else {
	                    System.out.println("Your Guess Is Too high! Try again.");
	                }
	            }

	            if (!guessedCorrectly) {
	                System.out.println("Sorry My Friend, you didn't guess the number correctly. The correct number was: " + chosenNumber);
	            }

	            System.out.println("Your score: " + score);
	            System.out.print("Do you want to play again? (yes/no): ");
	            String playAgain = scan.next().toLowerCase();
	        if (playAgain.equals("no")) {
	            tryAgain = false;
	        }
	        }

	        System.out.println("Thank you for playing the Number Guessing Game!");
	    }

	}


