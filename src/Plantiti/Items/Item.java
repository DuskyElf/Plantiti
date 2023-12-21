package Plantiti.Items;

import Plantiti.Game;
import Plantiti.Plants.Plant;

public abstract class Item {
    public abstract int cost();
    public abstract String getName();
    public abstract void useItem(Game game, Plant plant);

    // Safety: Could return null
    public static Item getItem(String item) {
        switch (item.toLowerCase()) {
            case "antidote":
                return new Antidote();
            default:
                return null;
        }
    }

    public static void printItems() {
        System.out.println("- Antidote");
    }
}
