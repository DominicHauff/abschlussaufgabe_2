package game.material.cards;

import game.entities.entityClasses.EnemyClass;
import game.entities.Entity;
import game.material.cards.abilities.DamageType;

import java.util.List;

public class Effect {
    private int damage;
    private EnemyClass affectedClass = null;
    private DamageType damageType = null;
    private boolean breaksFocus = false;
    private boolean shields = false;
    private boolean affectsClass = false;

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    public void setBreaksFocus(boolean breaksFocus) {
        this.breaksFocus = breaksFocus;
    }

    public void setShields(boolean shields) {
        this.shields = shields;
    }

    public void setAffectsClass(EnemyClass affectedClass) {
        this.affectsClass = true;
        this.affectedClass = affectedClass;
    }

    public void execute(Entity target) {

    }

    public void execute(List<Entity> targets) {

    }
}