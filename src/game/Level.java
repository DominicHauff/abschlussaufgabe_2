package game;

import java.util.Stack;
import java.util.stream.IntStream;

public class Level {
    private final int levelNumber;
    private Stack<Stage> stages;

    public Level(int levelNumber, int numOfStages) {
        this.levelNumber = levelNumber;
        this.stages = new Stack<>();
        IntStream.range(1, numOfStages).forEach(i -> stages.add(new Stage()));
    }
}
