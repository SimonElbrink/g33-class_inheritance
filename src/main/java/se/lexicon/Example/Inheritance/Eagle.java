package se.lexicon.Example.Inheritance;

import se.lexicon.Example.Interface.Flying;

public class Eagle extends Bird implements Flying {


    @Override
    public int getFlightSpeed() {
        return 0;
    }
}
