package se.lexicon;

public class App 
{
    public static void main( String[] args )
    {
        A object = new A();
        object.foo();

        B objectB = new B();
        objectB.foo();


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

// Sub-class
class C extends B{}