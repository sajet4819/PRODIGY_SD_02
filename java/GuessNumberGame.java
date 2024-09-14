import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int randomNumber = rand.nextInt(100) + 1; // generates a random number between 1 and 100
        int guess = 0;
        int attempts = 0;
        
        System.out.println("Guess a number between 1 and 100:");
        
        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < randomNumber) {
                System.out.println("Too low!");
            } else if (guess > randomNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
            }
        }
        
        scanner.close();
    }
}
