import java.util.InputMismatchException;
import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition(Scanner input) throws InterruptedException {

        System.out.print("Booting");
        Thread.sleep(500);

        for (int i = 0; i < 10; i++) {
            System.out.print(".");
            Thread.sleep(500);
        }

        System.out.println("\nReady...");
        
        System.out.print("\nWhat is your name? ");
        String name = input.next();

        System.out.print("\nHi, " + name
                + " — Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N :");
        String response = input.next();

        if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes"))
            System.out.println("I knew you would say that. You are team leader for a reason.");
        else
            System.out.println("Too bad you are team leader. You have to go.");

        System.out.print("How many people would you like on your team: ");
        int teamSize = 0;
        try {
            teamSize = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("That's not an integer, so you get 2");
        }

        if (teamSize > 2)
            System.out.println("That's way to many people. We can only send 2 more members.");
        else if (teamSize < 2)
            System.out.println("That's not enough people.");
        else if (teamSize == 2)
            System.out.println("Perfect");

        teamSize = 2;

        System.out.print("You are allowed to bring one snack with you. What do you bring?");
        String snack = input.next();
        System.out.println("/nNice choice, you will be bringing a " + snack + " with you");

        System.out.println("Choose Your Vehicle" +
                "\nA: The Tadis" +
                "\nB: The Enterprise" +
                "\nC: The Millennium Falcon");

        String vehicleChoice = input.next();

        if (vehicleChoice.equalsIgnoreCase("A")) {
            vehicleChoice = "The Tardis";
        } else if (vehicleChoice.equalsIgnoreCase("B")) {
            vehicleChoice = "The Enterprise";
        } else if (vehicleChoice.equalsIgnoreCase("C")) {
            vehicleChoice = "The Millennium Falcon";
        } else {
            vehicleChoice = "You get nothing";
        }

        System.out.println("Your expedition team is now ready" +
                "\nLed by " + name + " with " + teamSize + " teammates." +
                "\nTo explore the surface of Mars using " + vehicleChoice +
                " while eating " + snack + ". " +
                "\nExploration team heads out in");

        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("\nGO GO GO!");
    }
}
