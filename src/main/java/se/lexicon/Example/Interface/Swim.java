package se.lexicon.Example.Interface;

public abstract interface Swim {

    public static final String MESSAGE = "Continue Swimming!";


   public default int getSwimSpeed() {
        return 2;
    }

}
