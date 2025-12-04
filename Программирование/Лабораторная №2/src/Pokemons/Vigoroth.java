package Pokemons;

import Moves.PhysicalMoves.Slash;
import Moves.SpecialMoves.Blizzard;
import Moves.StatusMoves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Vigoroth extends Pokemon {
    public Vigoroth(String name, int level) {
        super(name, level);
        this.setStats(80, 80, 80, 55, 55, 90);
        this.setType(Type.NORMAL);
        setMove(new Blizzard(), new Swagger(), new Slash());
    }
}
