package game.material.cards.abilities.shared;

import game.material.cards.abilities.AbilityCard;
import game.material.cards.abilities.MagicEnemyCard;
import game.material.cards.abilities.MagicPlayerCard;

public class Fire extends AbilityCard implements MagicEnemyCard, MagicPlayerCard {
    private static final String NAME = "Fire";
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
