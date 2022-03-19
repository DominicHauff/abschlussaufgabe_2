package game.entities.enemies.level_1;

import game.entities.Enemy;
import game.entities.EnemyClass;
import game.material.cards.abilities.shared.Focus;
import game.material.cards.abilities.shared.Water;


public class Frog extends Enemy {
    public Frog() {
        super(EnemyClass.WATER, 16);
        this.setAbilities(
                new Focus(),
                new Water()
        );
        this.setName("Frog");
    }
}
