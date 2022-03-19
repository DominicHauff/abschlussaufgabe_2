package game;

import game.entities.Player;
import game.io.ShuffleSequence;

import java.util.Stack;

public class Level {
    private final int levelNumber;
    private final EnemySupplier enemySupplier;
    private final Stack<Stage> stages;

    public Level(int levelNumber, int numOfStages) {
        this.levelNumber = levelNumber;
        this.enemySupplier = new EnemySupplier();
        this.stages = new Stack<>();
        for (int i = 1; i <= numOfStages; i++) {
            this.stages.push(new Stage(levelNumber, i, enemySupplier));
        }
    }

    public boolean play(Player player) {
        //Todo give them seeds to the enemySupplier
        ShuffleSequence.run();
        while (!this.stages.isEmpty()) {
            Stage currentStage = stages.pop();
            if (!currentStage.play(player)) return false;
        }
        return true;
    }
}
