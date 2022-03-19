package game.entities;

import game.entities.entityClasses.CharacterClass;
import game.material.cards.abilities.AbilityCard;

import java.util.HashMap;
import java.util.Map;

public class Player extends Entity {
    private final CharacterClass characterClass;
    private Map<String, AbilityCard> abilities;

    public Player(CharacterClass characterClass, String name) {
        this.hp = 50;
        this.focusPoints = 1;
        this.isAlive = true;
        this.characterClass = characterClass;
        this.abilities = new HashMap<>();
        this.characterClass.getCards().forEach(card -> this.abilities.put(card.getName(), card));
        this.setName(name);
    }
}
