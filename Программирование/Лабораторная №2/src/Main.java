import ru.ifmo.se.pokemon.*;
import Pokemons.*;

void main() {
    Battle b = new Battle();
    Pokemon p1 = new Cryogonal("Cryogonal", 1);
    Pokemon p2 = new Spinarak("Spinarak", 1);
    Pokemon p3 = new Ariados("Ariados", 1);
    Pokemon p4 = new Slakoth("Slakoth", 1);
    Pokemon p5 = new Vigoroth("Vigoroth", 1);
    Pokemon p6 = new Slaking("Slaking", 1);
    b.addAlly(p1);
    b.addAlly(p2);
    b.addAlly(p3);
    b.addFoe(p4);
    b.addFoe(p5);
    b.addFoe(p6);
    b.go();
}
