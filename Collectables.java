import java.util.ArrayList;
import java.util.Arrays;

public class Collectables {
    // This variable is used in the getter method to get the name.
    private String collectableName;
    // This array holds all of the collectable items.
    private static ArrayList<String> collectablesList = new ArrayList<String>();
    private int collectableID;
    // Stupid default constructor
    public Collectables() {
        collectableName = "";
        collectableID = 0;
    }
    // This sets the collectables. It's our setter.
    public void setCollectables() {
        if (collectablesList.size() == 12) {
            System.out.println("Collectables have already been set.");
        } else {
            collectablesList.addAll(Arrays.asList("Jar of Acid", "Dodgeball", "Laser Gun", "Snowball", "Barrel", "Beehive", "Bomb", "Mask", "Cactus", "Cake", "Caterpillar", "Coil"));
            System.out.println(collectablesList);
        }
    }
    // This gives you a random item from the array. It's our getter.
    public String getCollectable() {
        collectableName = collectablesList.get((int) (Math.random() * collectablesList.size() + 1));
        return collectableName;
    }
}
