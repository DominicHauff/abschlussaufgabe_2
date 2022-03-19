package game.entities.enemies.level_1;

import game.entities.Enemy;
import game.entities.EnemyClass;

public class Gorgon extends Enemy {
    private static final String NAME = "Gorgon";

    public Gorgon() {
        super(EnemyClass.FIRE, NAME);
        this.hp = 13;
    }
}
