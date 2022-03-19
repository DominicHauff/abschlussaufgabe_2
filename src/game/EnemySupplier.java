package game;

import game.entities.Enemy;
import game.entities.enemies.level_1.*;

import java.util.List;

public class EnemySupplier {
    //bosses
    private final Enemy firstLevelBoss = new SpiderKing();

    //level 1
    private final Enemy frog = new Frog();
    private final Enemy ghost = new Ghost();
    private final Enemy goblin = new Goblin();
    private final Enemy gorgon = new Gorgon();
    private final Enemy mushroomlin = new Mushroomlin();
    private final Enemy rat = new Rat();
    private final Enemy skeleton = new Skeleton();
    private final Enemy spider = new Spider();

    //boss bundle
    private final List<Enemy> bossBundle = List.of(
            firstLevelBoss
    );

    //enemy bundles
    private final List<Enemy> firstLevelBundle = List.of(
            frog,
            ghost,
            goblin,
            gorgon,
            mushroomlin,
            rat,
            skeleton,
            spider
    );
}
