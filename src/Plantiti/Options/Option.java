package Plantiti.Options;

import Plantiti.Game;

public abstract class Option {
    public static Option getOption(String option) {
        switch (option.toLowerCase()) {
            case "selectplant":
                return new SelectPlant();
            case "shop":
                return new Shop();
            case "inventory":
                return new Inventory();
            case "nextday":
                return new NextDay();
            case "useitem":
                return new UseItem();
            default:
                return new InvalidOption();
        }
    }

    public static void printOptions() {
        System.out.println("- SelectPlant");
        System.out.println("- Shop");
        System.out.println("- Inventory");
        System.out.println("- NextDay");
        System.out.println("- UseItem");
    }

    public abstract void runOption(Game game);
}
