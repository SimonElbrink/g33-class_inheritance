package se.lexicon;

public class Mammal extends Animal{

    private String name;
    private double weight;

    public Mammal() {
    }

    public Mammal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    //Behaviors
    public void makeASound() {
        System.out.println("This Mammal makes no Sound");
    }

    //Returns a Mammal
    protected Mammal foo() {
         return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
