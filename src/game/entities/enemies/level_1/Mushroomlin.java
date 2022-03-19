package game.entities.enemies.level_1;

import game.entities.Enemy;
import game.material.cards.abilities.enemyAbilities.Deflect;
import game.material.cards.abilities.enemyAbilities.Scratch;

public class Mushroomlin extends Enemy {

    public Mushroomlin() {
        super(null, 20);
        this.setAbilities(
                new Deflect(),
                new Scratch()
        );
        this.setName("Mushroomlin");
    }
}
