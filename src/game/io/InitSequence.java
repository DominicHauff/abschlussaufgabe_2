package game.io;

import game.entities.CharacterClass;

import java.util.Scanner;

public class InitSequence extends Sequence {
    public static CharacterClass run() {
        System.out.println(Messages.generateChoicePrompt(1, 3));
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("quit")) return null;

        try {
            int choice = Integer.parseInt(input);
            switch (choice) {
                case (1): return CharacterClass.MAGE;
                case (2) : return CharacterClass.WARRIOR;
                case (3) : return CharacterClass.PALADIN;
                default: run();
            }
        } catch (NumberFormatException e) {
            run();
        }
        return null;
    }
}
