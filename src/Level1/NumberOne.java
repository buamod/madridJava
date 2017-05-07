package Level1;

/**
 * Created by buamod on 2017-04-14.
 */
public class NumberOne {

    public static void main (String args []){

        int score = 88;
        String grade = null;
        for (int i=3; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
