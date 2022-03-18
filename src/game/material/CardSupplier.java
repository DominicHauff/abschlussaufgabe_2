package game.material;

import game.material.cards.abilities.PlayerAbilityCard;
import game.material.cards.abilities.playerCards.Focus;

import java.util.List;

public class CardSupplier {
    private final PlayerAbilityCard focus = new Focus();
    private final PlayerAbilityCard parry = new Focus();
    private final PlayerAbilityCard reflect = new Focus();
    private final PlayerAbilityCard slash = new Focus();
    private final PlayerAbilityCard thrust = new Focus();
    private final PlayerAbilityCard water = new Focus();

    public List<PlayerAbilityCard> getAbilities() {
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
