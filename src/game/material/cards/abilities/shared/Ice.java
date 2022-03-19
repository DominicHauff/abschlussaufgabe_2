package game.material.cards.abilities.shared;

import game.material.cards.abilities.AbilityCard;
import game.material.cards.abilities.EnemyCard;
import game.material.cards.abilities.MagicPlayerCard;

public class Ice extends AbilityCard implements EnemyCard, MagicPlayerCard {
    private static final String NAME = "Ice";
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
        return COST * this.getAbilityLevel();
    }

    @Override
    public int getCost() {
        return COST;
    }
}