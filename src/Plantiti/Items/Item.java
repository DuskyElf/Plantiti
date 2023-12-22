package Plantiti.Items;

import Plantiti.Game;
import Plantiti.Plants.Plant;

public abstract class Item {
    public abstract String getName();
    public abstract void useItem(Game game, Plant plant);
}
