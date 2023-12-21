package Plantiti;

import Plantiti.Options.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Game game = new Game(300);
        Scanner scanner = new Scanner(System.in);

        while (!game.isGameOver()) {
            System.out.println("MENU");
            Option.printOptions();

            String choice = scanner.nextLine();

            Option choiceOption = Option.getOption(choice);
            choiceOption.runOption(game);
        }

        scanner.close();
    }
}
