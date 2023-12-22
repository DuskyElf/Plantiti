package Plantiti.Options;
import Plantiti.Game;

public class Inventory extends Option {
    public void runOption(Game game) {
        if (game.getPlants().isEmpty()) {
            System.out.println("You don't have plants at the moment. Type 'Shop' to buy a plant.");
        } else {
            System.out.println("Your Plants:");
            game.listPlants();
        }
        
        if (game.getBoughtItems().isEmpty()) {
            System.out.println("You don't have items at the moment. Type 'Shop' to buy an item.");
        } else {
            System.out.println("Your Items:");
            game.listItems();
        }
    }
}
