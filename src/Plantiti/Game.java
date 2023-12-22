package Plantiti;

import Plantiti.Items.BuiltinItem;
import Plantiti.Items.BuyableItem;
import Plantiti.Plants.Plant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Game {
    private boolean isGameOver;
    private int money;
    private Map<BuyableItem, Integer> boughtItems;
    private ArrayList<Plant> plants;
    private Plant selectedPlant;

    public Game(int initialMoney) {
        this.isGameOver = false;
        this.money = initialMoney;
        this.boughtItems = new HashMap<>();
        this.plants = new ArrayList<>();
        this.selectedPlant = null;
    }

    public void gameOver(Plant plant) {
        isGameOver = true;
        System.out.println("Game Over: " + plant.getName() + " died");
    }

    public boolean selectPlant(int index) {
        if (index < 0 || index >= plants.size()) return false;
        selectedPlant = plants.get(index);
        return true;
    }

    public Plant retrieveSelectedPlant() {
        return selectedPlant;
    }

    public Plant getPlant(int index) {
        return plants.get(index);
    }

    public void listItems() {
        System.out.println("Builtin Items:");
        BuiltinItem.printItems();
        System.out.println("Items you bought:");
        listBoughtItems();
    }

    public void listBoughtItems() {
        for (BuyableItem item : boughtItems.keySet()) {
            System.out.println("- " + item.getName() + " x" + boughtItems.get(item));
        }
    }

    // returns false if item is not available
    public boolean useBoughtItem(BuyableItem itemUsed) {
        for (BuyableItem item : boughtItems.keySet()) {
            if (item == itemUsed) {
                int itemsLeft = boughtItems.get(item);
                if (itemsLeft <= 1) {
                    boughtItems.remove(item);
                } else {
                    boughtItems.put(item, boughtItems.get(item) - 1);
                }

                return true;
            }
        }

        return false;
    }

    public void listPlants() {
        for (int i = 0; i < plants.size(); i++) {
            Plant plant = plants.get(i);
            System.out.println("Slot #" + i + ": " + plant.getName());
        }
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public int getMoney() {
        return money;
    }
    
    public void setMoney(int value) {
        money = value;
    }

    public void addItem(BuyableItem item) {
        if (boughtItems.containsKey(item)) {
            boughtItems.put(item, boughtItems.get(item) + 1);
        }
        else {
            boughtItems.put(item, 1);
        }
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public ArrayList<Plant> getPlants() {
        return plants;
    }

    public Map<BuyableItem, Integer> getBoughtItems() {
        return boughtItems;
    }

}
