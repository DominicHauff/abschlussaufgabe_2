package game.material.cards;

import game.material.interfaces.Drawable;

public abstract class Card implements Drawable {
    protected int abilityLevel;
    protected String name;

    public String getName() {
        return name;
    }

    public int getAbilityLevel() {
        return abilityLevel;
    }
}
