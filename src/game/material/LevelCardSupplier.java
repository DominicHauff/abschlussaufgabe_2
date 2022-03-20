package game.material;

import game.entities.Enemy;
import game.entities.enemies.level_1.*;
import game.material.cards.abilities.AbilityCard;
import game.material.cards.abilities.playerAbilities.Parry;
import game.material.cards.abilities.playerAbilities.Reflect;
import game.material.cards.abilities.playerAbilities.Slash;
import game.material.cards.abilities.playerAbilities.Thrust;
import game.material.cards.abilities.shared.Focus;
import game.material.cards.abilities.shared.Water;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LevelCardSupplier {
    //player ability cards
    private final AbilityCard focus = new Focus();
    private final AbilityCard parry = new Parry();
    private final AbilityCard reflect = new Reflect();
    private final AbilityCard slash = new Slash();
    private final AbilityCard thrust = new Thrust();
    private final AbilityCard water = new Water();

    //bosses
    private final Enemy firstLevelBoss = new SpiderKing();

    //level 1
    private final Enemy frog = new Frog();
    private final Enemy ghost = new Ghost();
    private final Enemy goblin = new Goblin();
    private final Enemy gorgon = new Gorgon();
    private final Enemy mushroomlin = new Mushroomlin();
    private final Enemy rat = new Rat();
    private final Enemy skeleton = new Skeleton();
    private final Enemy spider = new Spider();

    //boss bundle
    private final List<Enemy> bossBundle = List.of(
            firstLevelBoss
    );

    //enemy bundles
    private final List<Enemy> firstLevelBundle = List.of(
            frog,
            ghost,
            goblin,
            gorgon,
            mushroomlin,
            rat,
            skeleton,
            spider
    );

    public List<AbilityCard> getAbilities() {
        return new ArrayList<>(List.of(
                focus,
                parry,
                reflect,
                thrust,
                slash,
                water
        ));
    }

    public List<AbilityCard> getShuffledAbilities(long seed) {
        List<AbilityCard> abilities = this.getAbilities();
        Collections.shuffle(abilities, new Random(seed));
        return abilities;
    }
}
