package Pokemons;

import Moves.PhysicalMoves.AerialAce;
import Moves.PhysicalMoves.Slash;
import Moves.SpecialMoves.Blizzard;
import Moves.StatusMoves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Slaking extends Pokemon {
    public Slaking(String name, int level) {
        super(name, level);
        this.setStats(150, 160, 100, 95, 65, 100);
        this.setType(Type.NORMAL);
        setMove(new Blizzard(), new Swagger(), new Slash(), new AerialAce());
    }
}
