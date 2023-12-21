package Plantiti.Options;

import Plantiti.Game;
import Plantiti.Items.Item;
import Plantiti.Plants.Plant;
import java.util.Scanner;

public class Shop extends Option {
    public void runOption(Game game) {
        System.out.println("Shop: You could buy plants / items here:");
        System.out.println("Available Items are: ");
        Item.printItems();
        System.out.println("Available Plants are: ");
        Plant.printPlants();

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        Item userItem = Item.getItem(userInput);
        if (userItem != null) {
            if (userItem.cost() > game.getMoney()) {
                System.out.println("Not enought money; you poor guy, ;P"); // XD
                return;
            }
            game.setMoney(game.getMoney() - userItem.cost());
            game.addItem(userItem);
            return;
        }

        Plant userPlant = Plant.getPlant(userInput);
        if (userPlant != null) {
            if (userPlant.cost() > game.getMoney()) {
                System.out.println("Not enought money; you poor guy, ;P"); // XD
                return;
            }
            game.setMoney(game.getMoney() - userPlant.cost());
            game.addPlant(userPlant);
            return;
        }

        System.out.println("No item / plant named " + userInput + ". Try again");
    }
}
