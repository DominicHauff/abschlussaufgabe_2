package game.entities.enemies.level_1;

import game.entities.Enemy;
import game.entities.EnemyClass;

public class Ghost extends Enemy {
    private static final String NAME = "Ghost";

    public Ghost() {
        super(EnemyClass.ICE, NAME);
        this.hp = 15;
    }
}
