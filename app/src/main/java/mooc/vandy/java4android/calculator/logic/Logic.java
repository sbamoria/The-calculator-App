package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        if(operation==1){
            Add obj = new Add();
            int result = obj.addition(argumentOne,argumentTwo);
            String str = ""+result;
            mOut.print(str);
        }
        if(operation==2){
            Subtract obj = new Subtract();
            int result = obj.subtraction(argumentOne,argumentTwo);
            String str = ""+result;
            mOut.print(str);
        }
        if(operation==3){
            Multiply obj = new Multiply();
            int result = obj.multiplication(argumentOne,argumentTwo);
            String str = ""+result;
            mOut.print(str);
        }
        try {
            if (operation == 4) {
                Divide obj = new Divide();
                String str = obj.division(argumentOne, argumentTwo);
                mOut.print(str);
            }
        }
        catch(ArithmeticException e){
            mOut.print("Cannot divide by zero");
        }


    }
}
