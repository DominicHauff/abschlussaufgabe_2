package game.entities.enemies.level_1;

import game.entities.Enemy;

public class Rat extends Enemy {
    private static final String NAME = "Rat";

    public Rat() {
        super(null, NAME);
        this.hp = 14;
    }
}
