package Options;

public abstract class Option {
    public static Option getOption(String option) {

        switch (option.toLowerCase()) {
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
        System.out.println("-Water\n-Window\n-Shop\n-Inventory\n-NextDay\n");
    }

    public abstract void runOption();
}
