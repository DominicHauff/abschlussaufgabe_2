package game.entities.enemies.level_1;

import game.entities.Enemy;
import game.entities.EnemyClass;

public class Frog extends Enemy {
    private static final String NAME = "Frog";

    public Frog() {
        super(EnemyClass.WATER, NAME);
        this.hp = 16;
    }
}
