package se.lexicon.Example.AbstractClass;

public abstract class Vehicle {

    private String model;
    private String RegNumber;
    private String Color;


    public abstract void driveForward();
    public abstract void driveBackward();
    public abstract void changeGear(int gear);

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegNumber() {
        return RegNumber;
    }

    public void setRegNumber(String regNumber) {
        RegNumber = regNumber;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
