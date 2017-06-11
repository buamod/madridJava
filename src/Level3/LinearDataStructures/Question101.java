package Level3.LinearDataStructures;

/**
 * Created by buamod on 2017-05-08.
 */
public class Question101 {

    public class Class<E> {

        private E attribute;

        public void set (E value){
            this.attribute = value;
        }

        public E get(){
            return attribute;
        }

        public String method (Class<E> c, E e){
            c.set(e);
            return c.get().toString();
        }
    }

//    public static void main(String[] args){
//        Class<Integer> myClass = new Class<Integer>();
//        Class<String> yourClass = new Class<String>();
//        System.out.println(myClass.method(yourClass, 0) + yourClass.method(myClass, "0"));
//
//    }
//
     /*
     A disadvantage of linked lists against arrays
     Linked lists need more memory than arrays to store the same information.
     Explanation Linked lists need more memory than arrays as they need to store not only the information,
     but also the reference to the following node of the list. Insertion at the beginning, extraction from
     the beginning and concatenation are more efficient operations in linked lists than in arrays.

     Methods ensure Capacity(int minCapacity) and trimToSize() increase and decrease the capacity of an ArrayList<E> correct
     Explanation : The size of an ArrayList<E> is always lower than or equal to the capacity.
     We can add or remove elements from the ArrayList<E>, increasing or decreasing its size,
     but we can also use the methods ensureCapacity(int minCapacity) and trimToSize() to increase or decrease its capacity.
      */


}
