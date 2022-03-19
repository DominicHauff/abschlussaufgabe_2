package game;

import game.entities.Enemy;
import game.entities.Player;
import game.io.FightSequence;

import java.util.ArrayList;
import java.util.List;

public class Stage {
    private final int levelNumber;
    private final int stageNumber;
    private final FightSequence fightSequence;
    private final List<Enemy> enemies;
    private final EnemySupplier enemySupplier;

    public Stage(int levelNumber, int stageNumber, EnemySupplier enemySupplier) {
        this.levelNumber = levelNumber;
        this.stageNumber = stageNumber;
        this.fightSequence = new FightSequence();
        this.enemies = new ArrayList<>();
        this.enemySupplier = enemySupplier;
    }

    private void initializeStage() {
        //this.enemies = this.enemySupplier.getEnemies(levelNumber, stageNumber);
    }

    public boolean play(Player player) {
        return false;
    }
}
