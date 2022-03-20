package game;

import game.material.LevelCardSupplier;

public class Application {
    public static void main(String[] args) {
        Session runasStrive = new Session();
        runasStrive.initialize(2, 4);
        runasStrive.runGame();
    }
}
