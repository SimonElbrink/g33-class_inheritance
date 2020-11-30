package se.lexicon.Example.AbstractClass;

public class Car extends Vehicle{

    @Override
    public void driveForward() {
        System.out.println("Car drives forward!");
    }

    @Override
    public void driveBackward() {
        System.out.println("Car drives backwards!");
    }

    @Override
    public void changeGear(int gear) {

        System.out.println("Changed Gear to : ");
    }
}
