package Plantiti.Options;

import Plantiti.Game;

public abstract class Option {
    public static Option getOption(String option) {
        switch (option.toLowerCase()) {
            case "selectplant":
                return new SelectPlant();
            case "water":
                return new Water();
            case "window":
                return new Window();
            case "shop":
                return new Shop();
            case "inventory":
                return new Inventory();
            case "nextday":
                return new NextDay();
            default:
                return new InvalidOption();
        }
    }

    public static void printOptions() {
        System.out.println("- SelectPlant");
        System.out.println("- Water");
        System.out.println("- Window");
        System.out.println("- Shop");
        System.out.println("- Inventory");
        System.out.println("- NextDay");
    }

    public abstract void runOption(Game game);
}
