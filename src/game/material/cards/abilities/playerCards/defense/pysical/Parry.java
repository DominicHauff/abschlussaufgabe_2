package game.material.cards.abilities.playerCards.defense.pysical;

import game.material.cards.abilities.PlayerAbilityCard;

public class Parry extends PlayerAbilityCard {
    private static final String NAME = "parry";
    private static final int COST = 0;
    private int abilityLevel;

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
    public int getCost() {
        return COST;
    }
}
