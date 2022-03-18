package game.material.cards.abilities.shared;

import game.EnemyClass;
import game.material.cards.Effect;
import game.material.cards.abilities.AbilityCard;
import game.material.cards.abilities.DamageType;
import game.material.cards.abilities.MagicEnemyCard;
import game.material.cards.abilities.MagicPlayerCard;

public class Water extends AbilityCard implements MagicEnemyCard, MagicPlayerCard {
    private static final String NAME = "Water";
    private static final int COST = 1;
    private static final Effect EFFECT = new Effect();

    public Water() {
        this.setAbilityLevel(1);
        EFFECT.setAffectsClass(EnemyClass.LIGHTNING);
        EFFECT.setDamageType(DamageType.MAGIC);
    }

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
    public int getCost(int level) {
        return COST * this.getAbilityLevel();
    }

    @Override
    public int getCost() {
        return COST;
    }
}
