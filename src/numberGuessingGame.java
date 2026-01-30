import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100;
        int attempts = 0;
        int randomNumber = random.nextInt(min, max + 1);
        int guess;

        System.out.println("NUMBER GUESSING GAME");
        System.out.println("Guess a number between 1-10");

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess < randomNumber){
                System.out.println("Too low!");
            }
            else if (guess > randomNumber) {
                System.out.println("Too high!");
            }
            else {
                System.out.println("You have guessed the number in " +attempts + " attemps, it was "+randomNumber);
            }


        }while(guess != randomNumber);

        scanner.close();
    }
}
