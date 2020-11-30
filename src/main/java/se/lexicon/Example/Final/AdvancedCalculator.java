package se.lexicon.Example.Final;


public final class AdvancedCalculator extends App {

    //Does not work since this signature is final.
    /*@Override
    public int getSum(int number1, int number2){
        return number1 + number2;
    }*/

    public double getSum(double number1, double number2){
        return number1 + number2;
    }
}

// Can't because AdvancedCalculator is final
// class SuperCalculator extends AdvancedCalculator{}