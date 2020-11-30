package se.lexicon.Example.Final;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        arrayExample();

        manipulateObject();
    }



    public static void arrayExample() {
        int[] array = {10, 20, 30, 40, 50};

        Calculator object = new Calculator(array);

        System.out.println(Arrays.toString(array));

        object.updateElementOfIndex(2, 90000);

        System.out.println(Arrays.toString(array));

    }

    public static void manipulateObject() {

        Calculator object = new Calculator();
        System.out.println("object.mammal.getName() = " + object.mammal.getName());

        object.mammal.setName("Plutten");

        System.out.println("object.mammal.getName() = " + object.mammal.getName());

        // Can't
        //object.mammal = null;
    }

}

/* Can't
class String2 extends String{}
*/
