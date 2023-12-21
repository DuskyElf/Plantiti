package Plantiti;

import Plantiti.Items.Item;
import Plantiti.Plants.Plant;
import java.util.ArrayList;

public class Game {
    private boolean isGameOver;
    private int money;
    private ArrayList<Item> items;
    private ArrayList<Plant> plants;
    private ArrayList<Integer> selectedPlants;

    public Game(int initialMoney) {
        this.isGameOver = false;
        this.money = initialMoney;
        this.items = new ArrayList<>();
        this.plants = new ArrayList<>();
        this.selectedPlants = new ArrayList<>();
    }

    public void gameOver(Plant plant) {
        isGameOver = true;
        System.out.println("Game Over: " + plant.getName() + " died");
    }

    public boolean selectPlant(int index) {
        if (index < 0 || index >= plants.size()) return false;

        selectedPlants.add(index);
        return true;
    }

    public Plant getPlant(int index) {
        return plants.get(index);
    }

    public void listItems() {
        for (Item item : items) {
            System.out.println(item.getName());
        }
    }

    public void listPlants() {
        for (Plant plant : plants) {
            System.out.println(plant.getName());
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

    public void addItem(Item item) {
        items.add(item);
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }
}
