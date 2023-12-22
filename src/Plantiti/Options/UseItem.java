package Plantiti.Options;
import java.util.Scanner;

import Plantiti.Game;
import Plantiti.Items.BuiltinItem;
import Plantiti.Items.BuyableItem;

public class UseItem extends Option {
    public void runOption(Game game) {
        if (game.retrieveSelectedPlant() == null) {
            System.out.println("You haven't selected a plant yet. Select a plant with 'SelectPlant'");
            return;
        }

        System.out.println("You can use these items:");
        BuiltinItem.printItems();
        game.listBoughtItems();

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        BuiltinItem builtinItem = BuiltinItem.getItem(userInput);
        if (builtinItem != null) {
            builtinItem.useItem(game, game.retrieveSelectedPlant());
            return;
        }

        BuyableItem boughtItem = BuyableItem.getItem(userInput);
        if (boughtItem != null) {
            if (game.useBoughtItem(boughtItem)) {
                boughtItem.useItem(game, game.retrieveSelectedPlant());
            } else {
                System.out.println("Item '" + userInput + "' is not available, you can buy items from the shop");
            }
            return;
        }

        System.out.println("No Item named '" + userInput + "'. Try again");
    }
    
}
