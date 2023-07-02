import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class GuessingGame{
    public GuessingGame(Scanner input) throws InterruptedException{

        Random rand = new Random();

        System.out.print("What is your name? ");

        String name = input.nextLine();
        int number = rand.nextInt(100);
        int tries = 0;

        System.out.println("Guess a number between 1 and 100");

        while (true){
            int guess   ;

             try {
                guess = input.nextInt();
            } catch (InputMismatchException e) {
                String bad_input = input.next();
                System.out.println("That's not an integer, try again");
                continue;
            }

            if (guess < 1 || guess > 100) {
                System.out.println(guess + " is not a valid number, try again");
                continue;
            }

            tries++;

            if (number < guess)
                System.out.println("Guess is too high");
            else
            if (number > guess)
                System.out.println("Guess is too low");
            else{
                System.out.println("You got it in " + tries + " tries!!!");
                break;
            }
        }        
    }
}