package game.entities;

import game.entities.entityClasses.EnemyClass;
import game.material.cards.abilities.AbilityCard;

import java.util.Stack;

public abstract class Enemy extends Entity {
    private final EnemyClass enemyClass;
    protected Stack<AbilityCard> abilities;

    public Enemy(EnemyClass enemyClass, int hp) {
        this.focusPoints = 0;
        this.isAlive = true;
        this.enemyClass = enemyClass;
        this.abilities = new Stack<>();
        this.hp = hp;
        this.setName(name);
    }

    public EnemyClass getEnemyClass() {
        return this.enemyClass;
    }

    protected void setAbilities(AbilityCard... abilityCards) {
        for (AbilityCard abilityCard : abilityCards) {
            this.abilities.push(abilityCard);
        }
    }
}
