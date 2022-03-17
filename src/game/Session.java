package game;

import game.entities.Player;
import game.io.InitSequence;
import game.io.Messages;

import java.util.Stack;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Session {
    private Player runa;
    private final Stack<Level> levels;

    public Session() {
        this.levels = new Stack<>();
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
        this.runa = new Player(characterClass);
        IntStream.range(1, numOfLevels).forEach(i -> this.levels.add(new Level(i, numOfStages)));
    }
}
