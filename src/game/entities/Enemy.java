package game.entities;

import game.material.cards.abilities.AbilityCard;

import java.util.HashMap;
import java.util.Map;

public abstract class Enemy extends Entity {
    private final EnemyClass enemyClass;
    private Map<String, AbilityCard> abilities;

    public Enemy(EnemyClass enemyClass, String name) {
        this.focusPoints = 0;
        this.isAlive = true;
        this.name = name;
        this.enemyClass = enemyClass;
        this.abilities = new HashMap<>();
    }

    public EnemyClass getEnemyClass() {
        return this.enemyClass;
    }
}
