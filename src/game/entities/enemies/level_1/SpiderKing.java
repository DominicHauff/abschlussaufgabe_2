package game.entities.enemies.level_1;

import game.entities.Enemy;
import game.entities.EnemyClass;

public class SpiderKing extends Enemy {
    private static final String NAME = "Spider King";

    public SpiderKing() {
        super(EnemyClass.LIGHTNING, NAME);
        this.hp = 50;
    }
}
