package se.lexicon.Example.Interface;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Human simon = new Human("Simon Elbrink", LocalDate.parse("1900-01-01"));


        //Accessing a instance methods in human from interface Walk/Swim.
        simon.getSwimSpeed();
        simon.getWalkSpeed();

        //Accessing a static method in interface Walk.
        Walk.foo();

        //Accessing a static fields in interface Walk.
        System.out.println(Swim.MESSAGE);
        System.out.println(Walk.MESSAGE);

    }
}
