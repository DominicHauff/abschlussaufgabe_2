package game.entities;

public abstract class Entity {
    protected int hp;
    protected int focusPoints;
    protected boolean isAlive;
    protected String name;

    public int getHp() {
        return hp;
    }

    public int getFocusPoints() {
        return this.focusPoints;
    }

    public boolean checkLife() {
        return this.isAlive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
