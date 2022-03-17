package game;

import game.material.Deck;

import java.util.Stack;
import java.util.stream.IntStream;

public class Level {
    private final int levelNumber;
    private Deck cards;
    private Stack<Stage> stages;

    public Level(int levelNumber, int numOfStages) {
        this.levelNumber = levelNumber;
        this.cards = new Deck();
        this.stages = new Stack<>();
        IntStream.range(1, numOfStages).forEach(i -> stages.add(new Stage()));
    }
}
