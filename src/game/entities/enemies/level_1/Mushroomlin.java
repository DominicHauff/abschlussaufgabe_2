package game.entities.enemies.level_1;

import game.entities.Enemy;

public class Mushroomlin extends Enemy {
    private static final String NAME = "Mushroomlin";

    public Mushroomlin() {
        super(null, NAME);
        this.hp = 20;
    }
}
