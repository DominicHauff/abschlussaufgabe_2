package game;

public class Application {
    public static void main(String[] args) {
        Session runasStrive = new Session();
        runasStrive.initialize(2, 4);
        runasStrive.runGame();
    }
}
