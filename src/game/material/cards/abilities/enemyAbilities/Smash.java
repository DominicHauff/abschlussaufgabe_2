package game.material.cards.abilities.enemyAbilities;

import game.material.cards.abilities.AbilityCard;

public class Smash extends AbilityCard {
    private static final String NAME = "Smash";

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
