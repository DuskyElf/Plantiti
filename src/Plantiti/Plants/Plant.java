package Plantiti.Plants;

import java.util.Map;
import static java.util.Map.entry;

public abstract class Plant {
    private static Map<String, Plant> plants = Map.ofEntries(
        entry("cactus", new Cactus())
    );

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
    
    //NEW ADDITION
    public int getWaterLevel() {
        return waterLevel;
    }
    public int getSunlightLevel() {
        return sunlighLevel;
    }
    public int getHealthLevel() {
        return healthLevel;
    }

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
        return plants.get(plant.toLowerCase());
    }

    public static void printPlants() {
        for (String plant : plants.keySet()) {
            System.out.println("- " + plant);
        }
    }
}
