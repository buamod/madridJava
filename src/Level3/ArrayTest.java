package Level3;

import java.util.Arrays;

/**
 * Created by buamod on 2017-05-06.
 */
public class ArrayTest {

    private static void printWithNoArrayLib(String name, int a[]){
    System.out.print(name +" = [");
    for (int i=0; i < a.length-1; i++){
        System.out.print(a[i]+", ");
    }
    System.out.println(a[a.length-1]+"]");
    }


    private static int indexMin(int[] array) {
        int var = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[var]) {
                var = i;
            }
        }
        return var;
    }

    private static int min(int[] array) {
            int var = 0;
        for (int elem : array) {
            if (elem < array[0]) {
                var = elem;
            }
        }
        return var;
    }

    public static void main(String args[]){
        int[] arrayA = new int[]{0,1,2,3,4,5};
        int[] arrayB = new int[10];

        for (int i = 0; i<10; i++){
            arrayB[i] = (int) (Math.random()*100);
        }

        printWithNoArrayLib("A", arrayA);
        System.out.println("A = "+ Arrays.toString(arrayA));  // this method will replace the method printWithNoArrayLib

        // Complete this sentence. It should behave exactly the same as the previous method call
        //System.out.println("A = "+??????????);
        printWithNoArrayLib("B", arrayB);
        //System.out.println("B = "+?????????);

        System.out.println("min(A) = "+ min(arrayA));
        System.out.println("indexMin(A) = "+ indexMin(arrayA));

        System.out.println("min(B) = "+ min(arrayB));
        System.out.println("indexMin(B) = "+ indexMin(arrayB));
    }



}
