package game;

import game.material.cards.Card;
import game.material.cards.Focus;
import game.material.cards.Water;

import java.util.List;

public enum CharacterClass {
    MAGE (new Focus(), new Water()),
    WARRIOR (new Focus(), new Water()),
    PALADIN (new Focus(), new Water());

    private final Card first;
    private final Card second;

    CharacterClass(Card first, Card second) {
        this.first = first;
        this.second = second;
    }

    public List<Card> getCards() {
        return List.of(this.first, this.second);
    }
}
