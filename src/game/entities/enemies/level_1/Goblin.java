package game.entities.enemies.level_1;

import game.entities.Enemy;
import game.material.cards.abilities.enemyAbilities.Deflect;
import game.material.cards.abilities.enemyAbilities.Smash;

public class Goblin extends Enemy {
    public Goblin() {
        super(null, 12);
        this.setAbilities(
                new Smash(),
                new Deflect()
        );
        this.setName("Goblin");
    }
}
