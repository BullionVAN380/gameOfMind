import java.util.Random;
import java.util.Scanner;
public class RandomuN {
    public static void main(String[]args){
        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1; // Generate a random number between 1 and 10
        int attempts = 5; // Number of attempts allowed

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have generated a random number between 1 and 10.");
        System.out.println("You have 3 attempts to guess the correct number.");
        while (attempts > 0) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }

            attempts--;
            if (attempts > 0) {
                System.out.println("Attempts remaining: " + attempts);
            } else {
                System.out.println("Out of attempts. The correct number was " + randomNumber + ".");
            }
        }

        System.out.println("Thank you for playing the Guessing Game!");
        scanner.close();
    }
}
