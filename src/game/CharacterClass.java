package game;

import game.material.cards.abilities.AbilityCard;
import game.material.cards.abilities.shared.Focus;
import game.material.cards.abilities.shared.Water;

import java.util.List;

public enum CharacterClass {
    MAGE (new Focus(), new Water()),
    WARRIOR (new Focus(), new Water()),
    PALADIN (new Focus(), new Water());

    private final AbilityCard first;
    private final AbilityCard second;

    CharacterClass(AbilityCard first, AbilityCard second) {
        this.first = first;
        this.second = second;
    }

    public List<AbilityCard> getCards() {
        return List.of(this.first, this.second);
    }
}
