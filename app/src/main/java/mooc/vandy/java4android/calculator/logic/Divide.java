package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {

        public String division ( int a, int b){
        String s;
        s = a / b + " R: " + a % b;
        return s;
        }

}
