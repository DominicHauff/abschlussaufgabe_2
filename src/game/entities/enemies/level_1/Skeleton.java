package game.entities.enemies.level_1;

import game.entities.Enemy;
import game.entities.EnemyClass;

public class Skeleton extends Enemy {
    private static final String NAME = "Skeleton";

    public Skeleton() {
        super(EnemyClass.LIGHTNING, NAME);
        this.hp = 14;
    }
}
