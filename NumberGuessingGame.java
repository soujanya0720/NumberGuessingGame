
import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100!");

        while (true) {
            System.out.print("Enter your guess: ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid integer!");
                sc.next();
                continue;
            }

            guess = sc.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("Enter a number between 1 and 100.");
            } else if (guess < number) {
                System.out.println("Too low! Try a higher number.");
            } else if (guess > number) {
                System.out.println("Too high! Try a lower number.");
            } else {
                System.out.println("Congratulations! You guessed correctly.");
                System.out.println("Number of attempts: " + attempts);
                break;
            }
        }

        sc.close();
    }
}
