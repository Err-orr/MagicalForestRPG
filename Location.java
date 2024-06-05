import java.util.Scanner;

public class Location {
    // This is initialized to grab items.
    private Collectables item = new Collectables();
    // This scanner is initialized to pause the text so the user can read.
    private Scanner scan = new Scanner(System.in);
    // Default constructor stuff smh
    private int locationID;
    // This is available for the user to choose their next location.
    private int option;
    // Default constructor
    public Location() {
        locationID = 0;
    }
    // Parameter Constructor
    public Location(int locationID) {
        this.locationID = locationID;
    }
    public void entrance() {
        // The items have been set here
        item.setCollectables();
        // All of these are locations and are dependent on the location ID parameter of the location constructor.
        if (locationID == 1) {
            System.out.println("--- Atlantis ---");
            System.out.println("You find yourself in an underwater citadel. The setting is underwater.");
            scan.nextLine();
            System.out.println("There's a lot of fish everywhere, and a lot of blue...");
            System.out.println("No sunlight however. But there are some unique structures down here.");
            scan.nextLine();
            System.out.println("As you move forward, you stumble upon an item!");
            // You get a random item after you finish exploring the area before you move onto the next.
            System.out.println("You picked up the item (" + item.getCollectable() + ")");
        } else if (locationID == 2) {
            System.out.println("--- Candyland ---");
            System.out.println("You find yourself in an area full of sweets! The setting is sweets.");
            scan.nextLine();
            System.out.println("Literally everything is made out of sweets. From cake to donuts, everything looked eye appealing.");
            System.out.println("Even the portal you came out of has turned into a donut afterwards.");
            scan.nextLine();
            System.out.println("As you move forward, you stumble upon an item!");
            System.out.println("You picked up the item (" + item.getCollectable() + ")");
        } else if (locationID == 3) {
            System.out.println("--- Castle Grounds ---");
            System.out.println("You find yourself in a fantasy-like area. The setting is ruins.");
            scan.nextLine();
            System.out.println("This place seems to look like there used to be a castle here.");
            System.out.println("Now there's nothing but ruins, debris, and trees everywhere.");
            scan.nextLine();
            System.out.println("As you move forward, you stumble upon an item!");
            System.out.println("You picked up the item (" + item.getCollectable() + ")");
        } else if (locationID == 4) {
            System.out.println("--- Cherry Valley ---");
            System.out.println("You find yourself in an area with lots of valleys. The setting is structural.");
            scan.nextLine();
            System.out.println("This place has lots of buildings and all of them have a theme applied to them.");
            System.out.println("There's also a lot of pink cherry blossom trees, and each building has one.");
            scan.nextLine();
            System.out.println("As you move forward, you stumble upon an item!");
            System.out.println("You picked up the item (" + item.getCollectable() + ")");
        } else if (locationID == 5) {
            System.out.println("--- City ---");
            System.out.println("You find yourself in well... a city! The setting is skyscrapers.");
            scan.nextLine();
            System.out.println("This place has very tall buildings, and it's very lively too.");
            System.out.println("There's also a nearby park where there are kids, parents, and dogs.");
            scan.nextLine();
            System.out.println("As you move forward, you stumble upon an item!");
            System.out.println("You picked up the item (" + item.getCollectable() + ")");
        } else if (locationID == 6) {
            System.out.println("--- Deserted Island ---");
            System.out.println("You find yourself in a very hot place with lots of sand. The setting is Desert.");
            scan.nextLine();
            System.out.println("Quite literally, there's nothing here besides a few cacti and some figs.");
            System.out.println("Yep. Nothing. Let's move on shall we?");
            scan.nextLine();
            System.out.println("As you move forward, you stumble upon an item!");
            System.out.println("You picked up the item (" + item.getCollectable() + ")");
        } else if (locationID == 7) {
            System.out.println("--- Military Base ---");
            System.out.println("You find yourself in what looks to be a secured area. The setting is Base.");
            scan.nextLine();
            System.out.println("There's a lot of fences everywhere with first aid kits inside of buildings.");
            System.out.println("There's also tanks and watch towers");
            scan.nextLine();
            System.out.println("As you move forward, you stumble upon an item!");
            System.out.println("You picked up the item (" + item.getCollectable() + ")");
        }
    }
    // Dialogue when you're about to leave to a different location.
    public void exit(){
        scan.nextLine();
        System.out.println("Mysterious portals happen to appear after you picked up the item.");
        System.out.println("These portals happen to take you to random locations.");
        System.out.println("Where would you like to go?");
    }
    // Here's all the available locations.
    public void options() {
        System.out.println("1. Atlantis");
        System.out.println("2. Candyland");
        System.out.println("3. Castle Grounds");
        System.out.println("4. Cherry Valley");
        System.out.println("5. City");
        option = scan.nextInt();
        locationID = option;
    }
}