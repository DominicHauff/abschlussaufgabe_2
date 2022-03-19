package game.material;

import game.material.cards.abilities.AbilityCard;
import game.material.cards.abilities.playerAbilities.Parry;
import game.material.cards.abilities.playerAbilities.Reflect;
import game.material.cards.abilities.playerAbilities.Slash;
import game.material.cards.abilities.playerAbilities.Thrust;
import game.material.cards.abilities.shared.Focus;
import game.material.cards.abilities.shared.Water;

import java.util.List;

public class PlayerAbilityCardSupplier {
    private final AbilityCard focus = new Focus();
    private final AbilityCard parry = new Parry();
    private final AbilityCard reflect = new Reflect();
    private final AbilityCard slash = new Slash();
    private final AbilityCard thrust = new Thrust();
    private final AbilityCard water = new Water();

    public final List<AbilityCard> getAbilities() {
        return List.of(
                focus,
                parry,
                reflect,
                thrust,
                slash,
                water
        );
    }
}
