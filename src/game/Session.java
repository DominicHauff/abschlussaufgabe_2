package game;

import game.entities.CharacterClass;
import game.entities.Player;
import game.io.InitSequence;
import game.io.Messages;
import game.material.PlayerAbilityCardSupplier;
import game.material.cards.Card;
import game.material.cards.abilities.AbilityCard;

import java.util.Stack;
import java.util.function.BiPredicate;
import java.util.stream.IntStream;

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
        while (runa.checkLife() && !levels.isEmpty()) {
            Level currentLevel = this.levels.pop();
        }
    }

    public void initialize(int numOfLevels, int numOfStages) {
        System.out.print(Messages.GREETING_PROMPT);
        CharacterClass characterClass = InitSequence.run();

        if (characterClass == null) return;

        this.runa = new Player(characterClass, "Runa");
        IntStream.range(1, numOfLevels).forEach(i -> this.levels.add(new Level(i, numOfStages)));
        this.cardSupplier.getAbilities().stream()
                .filter(card -> filterCards.test(card, characterClass)).forEach(this.cardsToChoose::add);
    }
}
