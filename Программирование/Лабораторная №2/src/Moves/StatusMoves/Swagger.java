package Moves.StatusMoves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }
    @Override
    protected void applyOppEffects (Pokemon p) {
        p.setMod(Stat.ATTACK, 2);
        p.confuse();
    }
    @Override
    protected String describe() {
        return "использует способность Swagger";
    }
}
