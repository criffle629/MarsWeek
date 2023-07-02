import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class FindingsList {
    public FindingsList(Scanner input) throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Welcome back!!!");
        ArrayList<String> rocks = new ArrayList<>();
        System.out.println("Rock data downloaded.");

        rocks.add("rock");
        rocks.add("weird rock");
        rocks.add("smooth rock");
        rocks.add("not rock");

        System.out.println(rocks);
        System.out.println("That's not a rock");

        rocks.remove("not rock");
        System.out.println(rocks);

        Thread.sleep(1000);

        HashMap<String, String> fossils = new HashMap<String, String>();

        System.out.println("Fossil data downloaded");

        fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossils.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println(
                "Which of the fossils would you like to learn more about (Spelling and Spacing is important)?");


        String fossilChoice = input.next();

        if (fossilChoice.equalsIgnoreCase("Bird")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossils.get(fossilChoice + " Fossil"));
        } else if (fossilChoice.equalsIgnoreCase("Fish")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossils.get(fossilChoice + " Fossil"));
        } else if (fossilChoice.equalsIgnoreCase("Tooth")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossils.get(fossilChoice + " Fossil"));
        }
        
        Thread.sleep(700);

        HashSet<String> supplies = new HashSet<String>();

        supplies.add("Toilet Paper");
        supplies.add("Plunger");
        supplies.add("Magazine");

        supplies.remove("Plunger");

        Iterator itr = supplies.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

     }
}