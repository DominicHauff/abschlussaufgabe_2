package game;

import game.material.Deck;

import java.util.Stack;

public abstract class Level {
    private final int levelNumber;
    private final Deck cards;
    private final Stack<Stage> stages;

    public Level(int levelNumber, int numOfStages) {
        this.levelNumber = levelNumber;
        setStages(numOfStages);
    }

    private void setStages(int numOfStages) {
        for (int i = 0; i < numOfStages; i++) {
            this.stages.add(new Stage());
        }
    }
}
