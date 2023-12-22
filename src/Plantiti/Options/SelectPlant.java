package Plantiti.Options;

import Plantiti.Game;
import java.util.Scanner;

public class SelectPlant extends Option {
    public void runOption(Game game) {

        //CONDITION NEW ADDITION
        if (game.getPlants().isEmpty()){
            System.out.println("You don't have plants at the moment. Type 'Shop' to buy a plant.");
            return;
        } else {
            System.out.println("Your plants are:");
            game.listPlants();
            System.out.println("Enter the Slot# of plant to select");
            
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            
            boolean success = game.selectPlant(userInput);
            if (!success) {
                System.out.println("Invalid Index: Try again ;P");
                return;
            }
            
            System.out.println("You selected your " + game.getPlant(userInput).getName());
        }

    }
}

