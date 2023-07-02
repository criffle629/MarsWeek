import java.util.Scanner;

public class Mars{
    public static void main (String args[]) throws InterruptedException {

        String colonyName = "Lost";
        int shipPopulations = 300;
        double meals = 4000.00;
        Boolean landing = landingCheck(5);

        meals -= (shipPopulations * 0.75) * 2;
        System.out.println(meals);
        meals += meals * 0.5;
        shipPopulations += 5;

        String landingLocation = "The Plains";

        if (landingLocation == "The Plains")
            System.out.println("Bbzzz Landing on the Plain");
        else
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");

               
        Scanner input = new Scanner(System.in);

        GuessingGame guessingGame = new GuessingGame(input);
        MarsExpedition marsExpedition = new MarsExpedition(input);
        FindingsList findingsList = new FindingsList(input);

    }

    public static Boolean landingCheck(int minutesLeft) throws InterruptedException {

        for (int minutes = 0; minutes < minutesLeft; minutes++){
            if (minutes % 2 == 0 && minutes % 3 == 0)
                System.out.println("Keep Center");
            else
            if (minutes % 2 == 0)
                System.out.println("Right");
            else
            if (minutes % 3 == 0)
                System.out.println("Left");
            else
                System.out.println("Calculating");

            Thread.sleep(250);
        }

        System.out.println("Landed");

        return false;
    }
}