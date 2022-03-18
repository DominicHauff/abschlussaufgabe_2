package game.material;

import game.material.cards.abilities.AbilityCard;
import game.material.cards.abilities.enemyAbilities.*;

import java.util.List;

public class EnemyCardSupplier {
    private final Bite bite = new Bite();
    private final Block block = new Block();
    private final Claw claw = new Claw();
    private final Deflect deflect = new Deflect();
    private final Scratch scratch = new Scratch();
    private final Smash smash = new Smash();

    public List<AbilityCard> getAbilities() {
        return List.of(
                bite,
                block,
                claw,
                deflect,
                scratch,
                smash
        );
    }
}
