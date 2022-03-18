package game.material.cards.abilities.playerCards.offense.magic;

import game.material.cards.abilities.PlayerAbilityCard;

public class Ice extends PlayerAbilityCard {
    private static final String NAME = "ice";
    private static final int COST = 1;
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
