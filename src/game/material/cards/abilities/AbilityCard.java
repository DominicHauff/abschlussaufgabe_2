package game.material.cards.abilities;

import game.material.cards.Card;
import game.material.cards.Effect;

public abstract class AbilityCard extends Card {
    protected Effect effect;
    protected int abilityLevel;

    /**public AbilityCard() {

     }*/
    public AbilityCard(int abilityLevel) {
        this.abilityLevel = abilityLevel;
    }

    public abstract int getAbilityLevel();

    public abstract void setAbilityLevel(int abilityLevel);
}
