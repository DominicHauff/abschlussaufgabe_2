package game.material.cards.abilities.enemyAbilities;

import game.material.cards.abilities.AbilityCard;

public class Claw extends AbilityCard {
    private static final String NAME = "Claw";

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
