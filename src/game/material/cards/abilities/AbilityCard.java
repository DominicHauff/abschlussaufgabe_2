package game.material.cards.abilities;

import game.material.cards.Card;

public abstract class AbilityCard extends Card {
    public abstract int getAbilityLevel();

    public abstract void setAbilityLevel(int abilityLevel);
}
