package se.lexicon.Example.Interface;

import java.time.LocalDate;

public class Human implements Swim, Walk, Drive {

    private String fullName;
    private LocalDate birthDate;

    public Human(String fullName, LocalDate birthDate) {
        this.fullName = fullName;
        this.birthDate = birthDate;
    }

    public int age(){
        return 0;
    }

    @Override
    public int getSwimSpeed() {
        return 2;
    }

    @Override
    public int getWalkSpeed() {
        return 5;
    }

    @Override
    public int getDrivingSpeed() {
        return 90;
    }
}
