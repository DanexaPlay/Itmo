package Pokemons;

import Moves.PhysicalMoves.PinMissile;
import Moves.PhysicalMoves.PoisonSting;
import Moves.StatusMoves.Psychic;
import Moves.StatusMoves.SwordsDance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Ariados extends Pokemon {
    public Ariados(String name, int level) {
        super(name, level);
        this.setStats(70, 90, 70, 60, 70, 40);
        this.setType(Type.BUG, Type.POISON);
        setMove(new Psychic(), new PinMissile(), new PoisonSting(), new SwordsDance());
    }
}
