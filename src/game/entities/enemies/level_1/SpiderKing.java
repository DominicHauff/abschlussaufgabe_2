package game.entities.enemies.level_1;

import game.entities.Enemy;
import game.entities.entityClasses.EnemyClass;
import game.material.cards.abilities.enemyAbilities.Bite;
import game.material.cards.abilities.enemyAbilities.Block;
import game.material.cards.abilities.shared.Focus;
import game.material.cards.abilities.shared.Lightning;

public class SpiderKing extends Enemy {
    public SpiderKing() {
        super(EnemyClass.LIGHTNING, 50);
        this.setAbilities(
                new Bite(),
                new Block(),
                new Focus(),
                new Lightning()
        );
        this.setName("Spider King");
    }
}
