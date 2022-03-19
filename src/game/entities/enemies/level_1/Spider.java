package game.entities.enemies.level_1;

import game.entities.Enemy;

public class Spider extends Enemy {
    private static final String NAME = "Spider";

    public Spider() {
        super(null, NAME);
        this.hp = 15;
    }
}
