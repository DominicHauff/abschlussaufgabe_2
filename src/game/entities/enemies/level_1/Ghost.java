package game.entities.enemies.level_1;

import game.entities.Enemy;
import game.entities.entityClasses.EnemyClass;
import game.material.cards.abilities.shared.Focus;
import game.material.cards.abilities.shared.Ice;

public class Ghost extends Enemy {
    public Ghost() {
        super(EnemyClass.ICE, 15);
        this.setAbilities(
                new Focus(),
                new Ice()
        );
        this.setName("Ghost");
    }
}
