package Plantiti.Options;
import Plantiti.Game;

public class Inventory extends Option {
    public void runOption(Game game) {
        System.out.println("Your Plants:");
        game.listPlants();
        System.out.println("Your Items:");
        game.listItems();
    }
}
