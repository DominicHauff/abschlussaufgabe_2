package game;

import game.entities.Player;

import java.util.Stack;

public class Session {
    private final Player runa;
    private final Stack<Level> levels;

    public Session() {
        this.levels = new Stack<>();
    }

    public void runGame() {
        while (runa.checkLife() && !levels.isEmpty()) {
            this.levels.pop();
        }
    }
}
