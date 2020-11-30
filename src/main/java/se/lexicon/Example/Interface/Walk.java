package se.lexicon.Example.Interface;

public interface Walk {

    String MESSAGE = "Continue Walking!";

    default int getWalkSpeed() {

        foo();

        return 5;
    }

    //Static
    static void foo(){
        //getWalkSpeed(); // Does not compile
    }

}
