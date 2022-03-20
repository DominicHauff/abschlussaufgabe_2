package game.io;

public abstract class Messages {
    public static final String GREETING_PROMPT = """
            Welcome to Runa's Strive
             Select Runa's character class
            1) Warrior
            2) Mage
            3) Paladin
            """;
    public static final String SEED_PROMPT = """
            To shuffle ability cards and monsters, enter two seeds
            Enter seeds [1--2147483647] separated by comma:
            """;

    public static String generateChoicePrompt(int first, int second) {
        return String.format("Enter number [%d--%d]:", first, second);
    }
}
