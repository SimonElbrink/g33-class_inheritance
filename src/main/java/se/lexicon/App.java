package se.lexicon;

public class App {
    public static void main( String[] args )
    {
/*        A object = new A();
        object.foo();

        B objectB = new B();
        objectB.foo();
*/
        Lion lionName = new Lion();
        lionName.makeASound();

    }
}



//Super-class of B
class A {

    public void foo(){
        System.out.println("Im in A");
    }

}

//Sub-class of A & Super-class of C
class B extends A{

    public void foo(){
        System.out.println("Im in B");
    }
}

// Sub-class of B
class C extends B{}

//Dont actually need to extends Object, it's already there.
class Mammal extends Object{}


class Animal extends Mammal{

    private String name;
    private double weight;

    //Constructors
    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Animal() {
    }

    //Behavior
    public void makeASound(){
        System.out.println("This animal makes no Sound");
    }

    protected Animal foo(){
        return null;
    }

    //Getters and setters
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
}

//"CATS"
class Feline extends Animal{

}

class Tiger extends Feline{}

class Lion extends Feline{

    public void makeASound(){
        System.out.println("This is a Lion it Roars!");
    }

    @Override
    public Lion foo(){
        return null;
    }

}


//"DOGS"

class Canine extends Animal{
    private int legs;
    private int tail;
    private int teeth;
}

class Dog extends Canine{}

class Wolf extends Canine{}


