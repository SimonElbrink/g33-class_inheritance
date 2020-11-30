package se.lexicon.Example.Inheritance;

public class ABCExtendsExample {

    public static void main(String[] args) {
        A objectA = new A();
        objectA.message(); //Result: Im in A

        B objectB = new B();
        objectB.message(); //Result: Im in B

        C objectC = new C();
        objectC.message(); //Result: Im in B, because class B is the closest implementation of message method.
    }
}

//Super-class of class B & Sub-class of Java.Lang.Object
class A {
    public void message(){
        System.out.println("Im in A");
    }
}

//Sub-class of class A & Super-class of class C
class B extends A{
    public void message(){
        System.out.println("Im in B");
    }
}

// Sub-class of class B
class C extends B{}
