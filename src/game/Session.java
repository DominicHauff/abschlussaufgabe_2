package game;

import game.io.InitSequence;
import game.io.Messages;
import game.material.CardSupplier;
import game.material.cards.abilities.PlayerAbilityCard;

import java.util.Stack;
import java.util.stream.IntStream;

public class Session {
    private Player runa;
    private final Stack<Level> levels;
    private final Stack<PlayerAbilityCard> cards;
    private final CardSupplier cardSupplier;

    public Session() {
        this.levels = new Stack<>();
        this.cards = new Stack<>();
        this.cardSupplier = new CardSupplier();
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

        this.runa = new Player(characterClass);
        IntStream.range(1, numOfLevels).forEach(i -> this.levels.add(new Level(i, numOfStages)));
        this.cardSupplier.getAbilities().stream()
                .filter(card -> characterClass.getCards().stream()
                        .anyMatch(owned -> owned.getName().equals(card.getName()))).forEach(this.cards::add);
    }
}
