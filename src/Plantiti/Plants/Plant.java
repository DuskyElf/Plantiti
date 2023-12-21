package Plantiti.Plants;

public abstract class Plant {
    private int healthLevel;
    private int waterLevel;
    private int sunlighLevel;
    private boolean isBugPresent;

    public Plant() {
        this.healthLevel = 100;
        this.waterLevel = 100;
        this.sunlighLevel = 100;
        this.isBugPresent = false;
    }

    public abstract int cost();
    public abstract String getName();

    // returns true if the plant dies
    public boolean damagePlant(int damage) {
        healthLevel -= damage;
        if (healthLevel <= 0) {
            return true;
        }
        return false;
    }

    public boolean getIsBugPresent() {
        return isBugPresent;
    }

    public void setIsBugPresent(boolean value) {
        isBugPresent = value;
    }

    // Safety: Could return null
    public static Plant getPlant(String plant) {
        switch (plant.toLowerCase()) {
            case "cactus":
                return new Cactus();
            default:
                return null;
        }
    }

    public static void printPlants() {
        System.out.println("- Cactus");
    }
}
