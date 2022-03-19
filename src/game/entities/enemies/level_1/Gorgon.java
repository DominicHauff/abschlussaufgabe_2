package game.entities.enemies.level_1;

import game.entities.Enemy;
import game.entities.EnemyClass;
import game.material.cards.abilities.shared.Fire;
import game.material.cards.abilities.shared.Focus;

public class Gorgon extends Enemy {
    public Gorgon() {
        super(EnemyClass.FIRE, 13);
        this.setAbilities(
                new Focus(),
                new Fire()
        );
        this.setName("Gorgon");
    }
}
