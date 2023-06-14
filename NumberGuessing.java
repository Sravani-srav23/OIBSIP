import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int min = 1;
        int max = 100;
        int attempts = 5;
        int round = 1;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (round <= 3) {
            System.out.println("\nRound " + round + ":");
            int numberToGuess = rand.nextInt(max - min + 1) + min;
            int guess;

            for (int i = 1; i <= attempts; i++) {
                System.out.print("Guess a number between " + min + " and " + max + " (" + (attempts - i + 1) + " attempts left): ");
                guess = input.nextInt();

                if (guess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number in " + i + " attempts.");
                    score += (attempts - i + 1) * 10;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("The number is higher.");
                } else {
                    System.out.println("The number is lower.");
                }

                if (i == attempts) {
                    System.out.println("Sorry, you ran out of attempts. The number was " + numberToGuess + ".");
                }
            }

            round++;
        }

        System.out.println("\nGame over! Your final score is " + score + " points.");
        input.close();
    }
}
