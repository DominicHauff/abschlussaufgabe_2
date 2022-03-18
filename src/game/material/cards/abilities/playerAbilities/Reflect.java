package game.material.cards.abilities.playerAbilities;

import game.material.cards.abilities.AbilityCard;

public class Reflect extends AbilityCard {
    private static final String NAME = "Reflect";

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
