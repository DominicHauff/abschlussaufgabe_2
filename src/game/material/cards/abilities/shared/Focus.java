package game.material.cards.abilities.shared;

import game.material.cards.abilities.AbilityCard;

public class Focus extends AbilityCard {
    private static final String NAME = "Focus";

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
