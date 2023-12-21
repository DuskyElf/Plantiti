package Plantiti.Options;
import Plantiti.Game;

public class InvalidOption extends Option {
    public void runOption(Game game) {
        System.out.println("Invalid Option, Try again!");
    }
}
