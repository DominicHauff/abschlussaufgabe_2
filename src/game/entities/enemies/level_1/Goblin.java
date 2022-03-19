package game.entities.enemies.level_1;

import game.entities.Enemy;

public class Goblin extends Enemy {
    private static final String NAME = "Goblin";

    public Goblin() {
        super(null, NAME);
        this.hp = 12;
    }
}
