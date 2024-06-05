// Imports
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option = 0;
        Scanner scan = new Scanner(System.in);
        // This is how the game will start out
        System.out.println("Welcome to the Magical Forest Adventure!");
        System.out.println("These are very mythical lands and here, you can find great rewards that help you long term.");
        System.out.print("Please enter your name: ");
        String name = scan.nextLine();
        System.out.println("Alright " + name + " You'll be exploring many different realms and areas around here.");
        System.out.println("We will start you off with this location. Sound good?");
        scan.nextLine();
        System.out.println("Alright. Any time the code pauses is when you have to enter an input so the output doesn't get cluttered with text.");
        scan.nextLine();
        // This code block is where the player will explore.
        Location locations = new Location(1);
        locations.entrance();
        locations.exit();
        // The player has the option to stay or quit.
        while (option != 2) {
            locations.options();
            System.out.println("1. Stay in the game.");
            System.out.println("2. Quit the game.");
            option = scan.nextInt();
            locations.entrance();
            locations.exit();
        }
        System.out.println("Bye Bye!");
    }
}