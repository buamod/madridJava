package Level3.LinearDataStructures.LinkedList;

/**
 * Created by buamod on 2017-05-08.
 */
/*
 * Exercise for Removing the first occurrence of a given value
 * and removing all the occurrence of a given value
 *
 *
 * Read carefully the provided code (all the classes).
 * Implement the code of the method deleteFirstOccurrence(E info), which deletes in the linked list
 * the first occurrence of the value received as argument. The method returns a boolean indicating
 * if the operation was succesful. Implement the code of the method deleteAll(E info),
 * which deletes in the linked list all the occurrences of the value received as argument.
 * The method returns the number of deleted elements. Test your code using the main method provided
 * (it is already prepared for testing your new code, so that you only need to implement the aforementioned two methods).
 *
 */
public class RemoveLinkedList{

    public static void main(String args[]){
        // Create a linked list using MyLinkedList<Integer>
        MyLinkedList<Integer> mine = new MyLinkedList<Integer>();
        boolean success;

        // Insert 10 ints at the beginning (twice)
        for (int i=0; i< 10; i++){
            mine.insert(i);
            mine.insert(i);
        }

        System.out.println("Test: deleting first occurrence of a value");
        //Print the whole list
        mine.print();

        System.out.print("Deleting 9: ");
        success = mine.deleteFirstOccurrence(9);
        if (success){
            System.out.println("First occurence deleted");
        }else{
            System.out.println("Element with that info not found");
        }
        mine.print();

        System.out.print("Deleting 9: ");
        success = mine.deleteFirstOccurrence(9);
        if (success){
            System.out.println("First occurence deleted");
        }else{
            System.out.println("Element with that info not found");
        }
        mine.print();

        System.out.print("Deleting 9: ");
        success = mine.deleteFirstOccurrence(9);
        if (success){
            System.out.println("First occurence deleted");
        }else{
            System.out.println("Element with that info not found");
        }
        mine.print();

        System.out.print("Deleting 5: ");
        success = mine.deleteFirstOccurrence(5);
        if (success){
            System.out.println("First occurence deleted");
        }else{
            System.out.println("Element with that info not found");
        }
        mine.print();

        System.out.print("Deleting 5: ");
        success = mine.deleteFirstOccurrence(5);
        if (success){
            System.out.println("First occurence deleted");
        }else{
            System.out.println("Element with that info not found");
        }
        mine.print();

        System.out.print("Deleting 5: ");
        success = mine.deleteFirstOccurrence(5);
        if (success){
            System.out.println("First occurence deleted");
        }else{
            System.out.println("Element with that info not found");
        }
        mine.print();

        System.out.print("Deleting 0: ");
        success = mine.deleteFirstOccurrence(0);
        if (success){
            System.out.println("First occurence deleted");
        }else{
            System.out.println("Element with that info not found");
        }
        mine.print();

        System.out.print("Deleting 0: ");
        success = mine.deleteFirstOccurrence(0);
        if (success){
            System.out.println("First occurence deleted");
        }else{
            System.out.println("Element with that info not found");
        }
        mine.print();

        System.out.print("Deleting 0: ");
        success = mine.deleteFirstOccurrence(0);
        if (success){
            System.out.println("First occurence deleted");
        }else{
            System.out.println("Element with that info not found");
        }
        mine.print();


        mine = new MyLinkedList<Integer>();
        int numberdeleted;

        // Insert 10 ints at the beginning (twice)
        for (int i=0; i< 10; i++){
            mine.insert(i);
            mine.insert(i);
        }
        System.out.println("Test: deleting of all the occurrences of a value");
        //Print the whole list
        mine.print();

        System.out.print("Deleting 9: ");
        numberdeleted = mine.deleteAll(9);
        System.out.println(numberdeleted + " deleted nodes");
        mine.print();
        System.out.print("Deleting 0: ");
        numberdeleted = mine.deleteAll(0);
        System.out.println(numberdeleted + " deleted nodes");
        mine.print();
        System.out.print("Deleting 5: ");
        numberdeleted = mine.deleteAll(5);
        System.out.println(numberdeleted + " deleted nodes");
        mine.print();
        System.out.print("Deleting 100: ");
        numberdeleted = mine.deleteAll(100);
        System.out.println(numberdeleted + " deleted nodes");
        mine.print();
    }
}
