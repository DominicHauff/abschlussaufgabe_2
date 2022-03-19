package game;

import game.entities.Enemy;
import game.entities.entityClasses.CharacterClass;
import game.entities.Player;
import game.io.InitSequence;
import game.io.Messages;
import game.io.TransitionSequence;
import game.material.PlayerAbilityCardSupplier;
import game.material.cards.Card;
import game.material.cards.abilities.AbilityCard;

import java.util.Stack;
import java.util.function.BiPredicate;

public class Session {
    private Player runa;
    private final Stack<Level> levels;
    private final Stack<AbilityCard> cardsToChoose;
    private final PlayerAbilityCardSupplier cardSupplier;
    private final BiPredicate<Card, CharacterClass> filterCards = (card, characterClass) ->
            characterClass.getCards().stream().anyMatch(owned -> owned.getName().equals(card.getName()));

    public Session() {
        this.levels = new Stack<>();
        this.cardsToChoose = new Stack<>();
        this.cardSupplier = new PlayerAbilityCardSupplier();
    }

    public void runGame() {
        if (this.runa == null) return;
        while (!levels.isEmpty()) {
            Level currentLevel = this.levels.pop();
            if (!currentLevel.play(runa)) return;
            TransitionSequence.run();
        }
    }

    public void initialize(int numOfLevels, int numOfStages) {
        System.out.print(Messages.GREETING_PROMPT);
        CharacterClass characterClass = InitSequence.run();

        if (characterClass == null) return;

        this.runa = new Player(characterClass, "Runa");
        this.cardSupplier.getAbilities().stream()
                .filter(card -> filterCards.test(card, characterClass)).forEach(this.cardsToChoose::add);

        for (int i = 1; i <= numOfLevels; i++) {
            this.levels.push(new Level(i, numOfStages));
        }
    }
}
