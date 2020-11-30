package se.lexicon.Example.Inheritance;

import se.lexicon.Example.Interface.Flying;
import se.lexicon.Example.Interface.Swim;
import se.lexicon.Example.Interface.Walk;

public class Bird extends Animal implements Walk, Swim, Flying {

    @Override
    public int getFlightSpeed() {
        return 10;
    }

    @Override
    public int getSwimSpeed() {
        return 3;
    }

    @Override
    public int getWalkSpeed() {
        return 1;
    }
}
