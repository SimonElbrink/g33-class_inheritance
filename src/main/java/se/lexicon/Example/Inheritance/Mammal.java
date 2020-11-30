package se.lexicon.Example.Inheritance;

public class Mammal extends Animal{

    public Mammal() {
    }

    public Mammal(String name, double weight) {
        super(name, weight);
    }

    //Behaviors
    public void makeASound() {
        System.out.println("This Mammal makes no Sound");
    }

    //Returns a Mammal
    protected Mammal foo(Mammal boo) {
         return null;
    }
}
