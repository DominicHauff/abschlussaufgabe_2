package game.io;

import game.entities.entityClasses.CharacterClass;

import java.util.Scanner;

public class ShuffleSequence extends Sequence {
    public static int[] run() {
        System.out.println(Messages.SEED_PROMPT);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("quit")) return null;

        int[] seeds = new int[2];

        try {
            String[] chosenSeeds = input.split(",");
            int firstSeed = Integer.parseInt(chosenSeeds[0]);
            int secondSeed = Integer.parseInt(chosenSeeds[1]);

            seeds[0] = firstSeed;
            seeds[1] = secondSeed;
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            return run();
        }
        return seeds;
    }
}
