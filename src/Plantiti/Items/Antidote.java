package Plantiti.Items;

import Plantiti.Game;
import Plantiti.Plants.Plant;

public class Antidote extends Item {
    public String getName() {
        return "Antidote";
    }

    public int cost() {
        return 150;
    }

    public void useItem(Game game, Plant plant) {
        plant.setIsBugPresent(false);

        boolean didPlantDied = plant.damagePlant(30);
        if (didPlantDied) {
            game.gameOver(plant);
        }
    }
}
