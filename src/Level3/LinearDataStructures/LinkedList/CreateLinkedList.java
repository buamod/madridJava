package Level3.LinearDataStructures.LinkedList;

/**
 * Created by buamod on 2017-05-07.
 *
 * Exercise for Creation of a Linked List and printing
 * Read carefully the provided code (all the classes).

 First of all, create a linked list in the main method (class CreateLinkedList) inserting several elements at the beginning of the list.
 Print the list afterwards. Then, implement a new method called insertEnd(E info) in the class MyLinkedList that inserts elements at the end of the list.
 First of all, check if the list is empty. If so, the first node will be the one created with the information received as argument in insertEnd(E info).
 If the list is not empty, you should traverse it until the last node, appending the node created with the information received as argument in insertEnd(E info).
 In order to check if your method is correct, create another linked list in the main method (class CreateLinkedList) inserting several elements at
 the end of this list. Print this list afterwards.
 */
public class CreateLinkedList{

    public static void main(String args[]){
        // Create a linked list using MyLinkedList<Integer>
        MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();

        // Insert the first 10 ints at the beginning
        for (int i=0; i< 10; i++){
            linkedList.insert(i);
        }
        //Print the whole list
        linkedList.print();

        // Create another linked list using MyLinkedList<Integer>
        MyLinkedList<Integer> linkedList1 = new MyLinkedList<Integer>();

        // Insert 10 ints at the end
        for (int i=0; i< 10; i++){
        linkedList1.insertEnd(i);
        }
        //Print the whole second list
        linkedList1.print();


    }
}
