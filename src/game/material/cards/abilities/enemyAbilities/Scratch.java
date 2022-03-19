package game.material.cards.abilities.enemyAbilities;

import game.material.cards.abilities.AbilityCard;
import game.material.cards.abilities.EnemyCard;

public class Scratch extends AbilityCard implements EnemyCard {
    private static final String NAME = "Scratch";
    private static final int COST = 1;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int getAbilityLevel() {
        return this.abilityLevel;
    }

    @Override
    public void setAbilityLevel(int abilityLevel) {
        this.abilityLevel = abilityLevel;
    }

    @Override
    public int getCost(int level) {
        return COST * level;
    }
}
