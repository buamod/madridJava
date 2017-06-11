package Level3.Stacks;

/**
 * Created by buamod on 2017-06-11.
 */
public class MatchingCountSimpleParenthesis{

    /*
     * Implement this function without using Stacks
     * Assume that you only the parenthesis ( and )
     * are present
     * If the number of parenthesis is out of balance,
     * throw an exception
     * If it is balanced, return the max depth
     */

    /*
    Counting and Matching Simple Parenthesis
    In this exercise you should implement an algorithm that checks if a sequence of parenthesis of only one kind is correctly built.
    If not, your code should throw an exception. If it is correctly built, your method should return its depth, that is,
    the number of nested parenthesis. You can use an stack, but it is not necessary.
    If needed, you can use the method public char charAt(int index) from the String class to
    obtain the char at position index of an object from the class String.
    Hint (of a possible solution): use the variable count to count the number of active parenthesis,
    incrementing it when a ( is found and decrementing it when a ) is found.
    Use the variable max to store the maximum value of count (it will be the depth of the parenthesis).
     */
    public static int depthSimple(String mystring) throws Exception{
        char c;
        int count = 0;
        int max = 0;

        // Implement this method

        return max;
    }

    public static void main(String args[]){
	/*
	 * This main program should print:
	 * (((2+3)/6)-4)*5) has no balanced parenthesis
	 * Depth = 3
	 * ((2+3)/6)-4)*5 has no balanced parenthesis
	 */
        try{
            System.out.println("Depth = "+depthSimple("(((2+3)/6)-4)*5)"));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println("Depth = "+depthSimple("(((2+3)/6)-4)*5"));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println("Depth = "+depthSimple("((2+3)/6)-4)*5"));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

