package Level3.Stacks;
import java.util.Stack;

/**
 * Created by buamod on 2017-06-11.
 */

/*
Simple RPN Calculator (non-graded activity)
The Reverse Polish Notation (RPN) is a mathematical notation in which every operator follows all of its operands.
It does not need parenthesis as long as all the operators have a fixed number of operands.
In this exercise you should implement using a stack, a simple RPN calculator (with only the operations of addition,
subtraction, multiplication and division).
For do this, you should follow this algorithm:

Check if the next item on the array is an operator.
If not, push the item into the array.
Otherwise, pop 2 numbers from the array, perform the operation and push the result.
The final result is the item contained in the stack at the end of the algorithm.
 */
public class RPNcalculator{

    /*
     * Implement a simple RPN calculator
     * with an Stack
     * this is a possible solution, others are
     * also possible
     */
    public static int calculate(String ops[]){
        int result = 0;
        int x,y;
        String operators = new String("+-/*");
        // Define a Stack

        for (String op: ops){
            // Implement here your algorithm
        }

        // if the stack is not empty, result= stack.pop()
        // else result = 0
        return result;
    }
    public static void main(String args[]){
        /*
	     * The main program should print
	        5 3 + =8
            5 3 - = 2
            2 1 12 3 / - + = -1
            3 2 * 11 - = -5
	    */

        String[] argu= new String[]{"5","3","+"};
        int result = calculate(argu);
        System.out.println("5"+" 3"+" +"+" ="+ result);
        result = calculate(new String[]{"5","3","-"});
        System.out.println("5"+" 3"+" -"+" = "+ result);
        result = calculate(new String[]{"2","1","12","3","/", "-", "+"});
        System.out.println("2"+" 1"+" 12"+" 3"+" /"+ " -"+ " +"+" = "+ result);
        result = calculate(new String[]{"3", "2", "*", "11", "-"});
        System.out.println("3"+" 2"+" *"+" 11"+" -"+" = "+ result);

    }
}
