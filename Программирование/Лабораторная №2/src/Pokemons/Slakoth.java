package Pokemons;

import Moves.SpecialMoves.Blizzard;
import Moves.StatusMoves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Slakoth extends Pokemon {
    public Slakoth(String name, int level) {
        super(name, level);
        this.setStats(60, 60, 60, 35, 35, 30);
        this.setType(Type.NORMAL);
        setMove(new Blizzard(), new Swagger());
    }
}
