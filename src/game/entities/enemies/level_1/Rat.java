package game.entities.enemies.level_1;

import game.entities.Enemy;
import game.material.cards.abilities.enemyAbilities.Block;
import game.material.cards.abilities.enemyAbilities.Claw;

public class Rat extends Enemy {
    public Rat() {
        super(null, 14);
        this.setAbilities(
                new Block(),
                new Claw()
        );
        this.setName("Rat");
    }
}
