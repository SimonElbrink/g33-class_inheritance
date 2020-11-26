package se.lexicon;

public class AnimalsExample {

    public static void main(String[] args) {

        Mammal mammal = new Mammal();
        mammal.makeASound();

        Lion lionName = new Lion();
        lionName.makeASound();

        Mammal anotherMammal = new Lion();
        anotherMammal.makeASound();


        // Cast Experiment is the value Saved?
        Mammal newMammal = new Dog("Fido", 15, 25, "Fido is the name! Owned by Simon. Call 123456789");
        Dog newDog = (Dog) newMammal;
        System.out.println("newDog.getNameCollar() = " + newDog.getNameCollar());


        //Casting works (Upgrading class, but may contain empty fields.)
        lionName.foo((Mammal) new Animal());


        //Parameter is Mammal lion IS a Mammal.
        lionName.foo(new Lion());
    }

}


//"CATS"
class Feline extends Mammal {

}


class Tiger extends Feline {
}


class Lion extends Feline {

    @Override
    public void makeASound() {
        System.out.println("ROAR!");

    }


    // Overrides correctly because:
    // the name is same,
    // parameter type are the same,
    // Return type is a covariant of Mammal,
    // and is access modifier is the same or wider (More accessible) then OG method.
    @Override //If Method does not Override a Compile Error will be thrown.
    public Lion foo(Mammal boo) {
        return null;
    }

}


//"DOGS"

class Canine extends Mammal {

    private int teeth;

    public Canine(String name, double weight, int teeth) {
        super(name, weight);
        this.teeth = teeth;
    }
}


class Dog extends Canine {

    private String nameCollar;

    public Dog(String name, double weight, int teeth, String nameCollar) {
        super(name, weight, teeth);
        this.nameCollar = nameCollar;
    }

    @Override
    public void makeASound() {
        System.out.println("WOOF!");
    }

    public String getNameCollar() {
        return nameCollar;
    }
}


class Wolf extends Canine {

    public Wolf(String name, double weight, int teeth) {
        super(name, weight, teeth);
    }
}


