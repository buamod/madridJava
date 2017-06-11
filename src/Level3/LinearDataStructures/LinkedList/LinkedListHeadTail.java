package Level3.LinearDataStructures.LinkedList;

/**
 * Created by buamod on 2017-05-14.
 /*
 * Exercise for Linked List with Head and Tail
 * Read carefully the provided code (all the classes).
 * We changed the name of the attribute first to head and we added another attribute,
 * tail. head is a reference to the first node of the linked list, while tail is a
 * reference to the last node of the linked list.
 * Implement the missing methods in order to insert at the beginning and at the end, 
 * and to extract from the beginning and from the end. Remember to update the values of tail and head accordingly.
 */
public class LinkedListHeadTail{

    public static void main(String args[]){
        // Create a linked list using MyLinkedList<Integer>
        MyLinkedList<Integer> mine = new MyLinkedList<Integer>();

        System.out.println("Inserting at beginning");
        // Insert the first 10 ints at the beginning
        for (int i=0; i< 10; i++){
            mine.insert(i);
        }
        //Print the whole list
        mine.print();

        System.out.println("Extracting from beginning");
        //Extract all the elements from the list from the beginning
        Integer bar;
        while( (bar=mine.extract()) != null){
            System.out.println(bar + " removed");
        }
        System.out.println();
        System.out.println("Inserting at the end");
        // Insert 10 ints at the end
        for (int i=0; i< 10; i++){
            mine.insertEnd(i);
        }
        //Print the whole second list
        mine.print();
        System.out.println("Extracting from the end");

        //Extract all the elements from the list from the end

        while( (bar=mine.extractEnd()) != null){
            System.out.print(bar + " ");
        }

    }
}
