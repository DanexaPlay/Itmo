package Pokemons;

import Moves.PhysicalMoves.PinMissile;
import Moves.PhysicalMoves.PoisonSting;
import Moves.StatusMoves.Psychic;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Spinarak extends Pokemon {
    public Spinarak(String name, int level) {
        super(name, level);
        this.setStats(40, 60, 40, 40, 40, 30);
        this.setType(Type.BUG, Type.POISON);
        setMove(new Psychic(), new PinMissile(), new PoisonSting());
    }
}
