package game;

import java.util.List;

public abstract class Level {
    private final int LEVEL;
    private final List<Stage> STAGES;

    public Level(int level) {
        this.LEVEL = level;
    }
}
