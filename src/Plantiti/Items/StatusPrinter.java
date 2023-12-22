package Plantiti.Items;
import Plantiti.Game;
import Plantiti.Plants.Plant;

public class StatusPrinter extends BuiltinItem {
    public String getName() {
        return "StatusPrinter";
    }

    public void useItem(Game game, Plant plant) {
        System.out.println("Displaying Plant Status!");

        int waterlvl = plant.getWaterLevel();
        System.out.println(plant.getName() + "Water Level: " +  waterlvl);

        int sunlightlvl = plant.getSunlightLevel();
        System.out.println(plant.getName() + "Sunligh Level: " +  sunlightlvl);

    }
}