package Plantiti.Options;

import Plantiti.Game;
import java.util.Map;
import static java.util.Map.entry;

public abstract class Option {
    private static Map<String, Option> options = Map.ofEntries(
        entry("selectplant", new SelectPlant()),
        entry("shop", new Shop()),
        entry("inventory", new Inventory()),
        entry("nextday", new NextDay()),
        entry("useitem", new UseItem())
    );

    public static Option getOption(String value) {
        Option option = options.get(value.toLowerCase());
        if (option == null) {
            return new InvalidOption();
        }
        return option;
    }

    public static void printOptions() {
        for (String option : options.keySet()) {
            System.out.println("- " + option);
        }
    }

    public abstract void runOption(Game game);
}
