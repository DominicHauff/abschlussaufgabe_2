package game.io;

public abstract class Messages {
    public static final String GREETING_PROMPT = """
            Welcome to Runa's Strive\s
             Select Runa's character class\s
            1) Warrior\s
            2) Mage\s
            3) Paladin\s
            """;

    public static String generateChoicePrompt(int first, int second) {
        return String.format("Enter number [%d--%d]:", first, second);
    }
}
