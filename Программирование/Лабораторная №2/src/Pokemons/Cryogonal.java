package Pokemons;

import Moves.PhysicalMoves.Recover;
import Moves.SpecialMoves.FlashCannon;
import Moves.StatusMoves.ConfuseRay;
import Moves.StatusMoves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cryogonal extends Pokemon {
    public Cryogonal(java.lang.String name, int level) {
        super(name, level);
        setStats(80, 50, 50, 95, 135, 105);
        setType(Type.ICE);
        setMove(new FlashCannon(), new Recover(), new Swagger(), new ConfuseRay());
    }
}
