package game;

import game.material.cards.abilities.PlayerAbilityCard;

import java.util.HashMap;
import java.util.Map;

public class Player {
    private int hp;
    private int focusPoints;
    private boolean isAlive;
    private final CharacterClass characterClass;
    private Map<String, PlayerAbilityCard> abilities;

    public Player(CharacterClass characterClass) {
        this.hp = 50;
        this.focusPoints = 1;
        this.isAlive = true;
        this.characterClass = characterClass;
        this.abilities = new HashMap<>();
        this.characterClass.getCards().forEach(card -> this.abilities.put(card.getName(), card));
    }

    public boolean checkLife() {
        return this.isAlive;
    }
}
