package game;

import java.util.Stack;

public class Session {
    private final Stack<Level> levels;

    public Session() {
        this.levels = new Stack<>();
    }

    public void runGame() {
        while (!levels.isEmpty()) {
            this.levels.pop();
        }
    }
}
