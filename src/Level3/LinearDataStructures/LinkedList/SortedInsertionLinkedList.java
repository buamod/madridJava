package Level3.LinearDataStructures.LinkedList;

/**
 * Created by buamod on 2017-05-14.
 * Exercise for inserting in a sorted way (lowest to highest)
 * elements within a linked list
 *
 * Inserting Elements in a Linked List in a Sorted Way (non-graded activity)
 * Read carefully the provided code (all the classes). Change the code of the method insert(E info)
 * to insert elements in a sorted fashion (from lowest to highest). You will need to use the method
 * compareTo() to sort the elements. This method is implemented by all the classes that implement
 * the interface Comparable. Check its API. You are not supposed to implement compareTo(),
 * only to use it in your method. The method compareTo() has the following signature:
 *
 * int compareTo(T o)
 *
 * where o is the object of data type T to be compared with this object.
 * This methods returns a negative integer, zero, or a positive integer,
 * if this object is less than, equal to, or greater than the specified object o.
 *
 * For example in the case of Integer:
 *
 * Integer i1 = -3;
 * Integer i2 = 3;
 * Integer i3 = 0;
 * i1.compareTo(0); // Returns a negative integer
 * i2.compareTo(0); // Returns a positive integer
 * i3.compareTo(0); // Returns zero
 *
 * For example in the case of String: (alphabetical order)
 *
 * String s1 = "cat";
 * String s2 = "mouse";
 * String s3 = "dog;
 * s1.compareTo("dog"); // Returns a negative integer
 * s2.compareTo("dog"); // Returns a positive integer
 * s3.compareTo("dog"); // Returns zero
 *
 * The solution will be published at the end of the week. Meanwhile, you can discuss at the forum your solution and what changes
 * would be needed to sort the list from highest to lowest.
 */
public class SortedInsertionLinkedList{

    public static void main(String args[]){
        // Create a linked list using MyLinkedList<Integer>
        MyLinkedList<Integer> mine = new MyLinkedList<Integer>();
        // Insert 10 ints
        for (int i=0; i< 10; i++){
            mine.insertSorted((int)(100*Math.random()));
        }

        //Print the whole list
        mine.print();
    }

}

