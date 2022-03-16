package game.entities;

import game.GameClass;

public class Player {
    private int hp;
    private int focusPoints;
    private boolean isAlive;
    private final GameClass gameClass;

    public Player(GameClass gameClass) {
        this.gameClass = gameClass;
    }

    public boolean checkLife() {
        return this.isAlive;
    }
}
