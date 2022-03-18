package game;

import game.material.cards.abilities.AbilityCard;
import game.material.cards.abilities.MagicPlayerCard;

import java.util.HashMap;
import java.util.Map;

public class Player extends Entity {
    private final CharacterClass characterClass;
    private Map<String, AbilityCard> abilities;

    public Player(CharacterClass characterClass, String name) {
        this.hp = 50;
        this.focusPoints = 1;
        this.isAlive = true;
        this.name = name;
        this.characterClass = characterClass;
        this.abilities = new HashMap<>();
        this.characterClass.getCards().forEach(card -> this.abilities.put(card.getName(), card));
    }
}
