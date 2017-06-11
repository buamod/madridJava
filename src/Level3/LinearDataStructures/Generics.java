package Level3.LinearDataStructures;

import java.util.ArrayList;

/**
 * Created by buamod on 2017-05-07.
 */
public class Generics {
     // generics : Provide a mechanism to check the compatibility of objects of several types at compile time
    public static void main (String args[]){
        ArrayList<Object> list = new ArrayList<Object>();
        list.add("a");
        list.add(1);
        list.add(4.0);
        Object value = list.get(1);
        System.out.println(value);

    }
}
