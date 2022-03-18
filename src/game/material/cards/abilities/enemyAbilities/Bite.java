package game.material.cards.abilities.enemyAbilities;

import game.material.cards.abilities.AbilityCard;

public class Bite extends AbilityCard {
    private static final String NAME = "Bite";

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
}
