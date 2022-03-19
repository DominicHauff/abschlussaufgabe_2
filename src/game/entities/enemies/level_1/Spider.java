package game.entities.enemies.level_1;

import game.entities.Enemy;
import game.material.cards.abilities.enemyAbilities.Bite;
import game.material.cards.abilities.enemyAbilities.Block;

public class Spider extends Enemy {
    public Spider() {
        super(null, 15);
        this.setAbilities(
                new Bite(),
                new Block()
        );
        this.setName("Spider");
    }
}
