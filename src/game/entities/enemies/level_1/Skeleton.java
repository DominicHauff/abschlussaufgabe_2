package game.entities.enemies.level_1;

import game.entities.Enemy;
import game.entities.EnemyClass;
import game.material.cards.abilities.shared.Focus;
import game.material.cards.abilities.shared.Lightning;

public class Skeleton extends Enemy {
    public Skeleton() {
        super(EnemyClass.LIGHTNING, 14);
        this.setAbilities(
                new Focus(),
                new Lightning()
        );
        this.setName("Skeleton");
    }
}
