package se.lexicon.Example.Final;

import se.lexicon.Example.Inheritance.Mammal;

public class Calculator {

    private final int[] intArray;

    private final int FINAL_INT;

    final Mammal mammal;


    public Calculator(int[] intArray) {
        this.intArray = intArray;
        this.FINAL_INT = 1;
        this.mammal = new Mammal("Boris", 900);
    }

    public Calculator() {
        this.intArray = new int[]{};
        this.FINAL_INT = 1159845;
        this.mammal = new Mammal("Boris", 900);
    }

    /*    Could Not set
    public void setIntArray(int[] intArray){
        this.intArray = intArray;
    }
    */

/*        Could Not set
    public void setIntArray( final int FINAL_INT){
        this.FINAL_INT = FINAL_INT;
    }
*/

    public boolean updateElementOfIndex(int index, int value) {
        intArray[index] = value;
        return true;
    }

    /**
     * FINAL METHOD - Can not be overridden.
     * This Method is adding numbers to get a sum.
     *
     * @param number1
     * @param number2
     * @return
     */
    public final int getSum(int number1, int number2) {
        return number1 + number2;
    }
}
