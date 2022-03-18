package game;

import game.material.cards.abilities.PlayerAbilityCard;
import game.material.cards.abilities.playerCards.Focus;
import game.material.cards.abilities.playerCards.offense.magic.Water;

import java.util.List;

public enum CharacterClass {
    MAGE (new Focus(), new Water()),
    WARRIOR (new Focus(), new Water()),
    PALADIN (new Focus(), new Water());

    private final PlayerAbilityCard first;
    private final PlayerAbilityCard second;

    CharacterClass(PlayerAbilityCard first, PlayerAbilityCard second) {
        this.first = first;
        this.second = second;
    }

    public List<PlayerAbilityCard> getCards() {
        return List.of(this.first, this.second);
    }
}
