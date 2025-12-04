package Moves.PhysicalMoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class PinMissile extends PhysicalMove {
    public PinMissile() {
        super(Type.BUG, 25, 95, 0, (int) (((5 - 2) + 1) * Math.random()) + 2);
    }

    @Override
    protected String describe() {
        return "использует способность Pin Missile";
    }
}
