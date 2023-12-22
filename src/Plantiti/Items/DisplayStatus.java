package Plantiti.Items;
import Plantiti.Game;
import Plantiti.Options.Option;
import Plantiti.Plants.Plant;

public class DisplayStatus extends Item {
    public int cost() {
        return 0;
    }
    public String getName() {
        return "DisplayStatus";
    }
    public void useItem(Game game, Plant plant) {

        System.out.println("Displaying Plant Status!");
        if (plant == null) {
            System.out.println("You have not selected a plant. Type 'SelectPlant' to select the plant.");
            return;
        }

        int waterlvl = plant.getWaterLevel();
        System.out.println(plant.getName() + "Water Level: " +  waterlvl);

        int sunlightlvl = plant.getSunlightLevel();
        System.out.println(plant.getName() + "Water Level: " +  sunlightlvl);

    }
}