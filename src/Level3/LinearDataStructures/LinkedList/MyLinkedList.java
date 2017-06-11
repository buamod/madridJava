package Level3.LinearDataStructures.LinkedList;

/**
 * Created by buamod on 2017-05-07.
 */


public class MyLinkedList<E extends Comparable<E>>{
    // Notice that stating E extends Comparable<E> is needed, as we should use
    // compareTo for inserting in a sorted way
    private Node<E> head;
    private Node<E> tail;

    public MyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    /*
 * Insertion at the beginning
 */
    public void insert(E info){
        Node<E> newNode = new Node<E>(info);
        newNode.setNext(head);
        head = newNode;
        if (tail == null){
            tail = newNode;
        }
    }

    /*
 * Insertion at the beginning
 * Change this method to insert the values in a sorted way
 */
    public void insertSorted(E info){
        Node<E> newNode = new Node<E>(info);
        Node<E> current, previous;
        if (head == null){
            head = newNode;
        }else{
            current = head;
            previous = head;
            while ( (current!=null) && (current.getInfo().compareTo(info)<0) ){
                // if we want to insert the elements from higher to lower,
                // we will need to change the "sign" of the comparison
                //(current.getInfo().compareTo(info)>0) )
                previous = current;
                current = current.getNext();
            }
            if (previous == current){
                // at the beginning
                newNode.setNext(head);
                head = newNode;
            }else{
                //this works at the end
                // and at the middle
                previous.setNext(newNode);
                newNode.setNext(current);
            }
        }

    }

    /*
 * Delete the head occurrence of a value
 * Return a boolean stating if the delete was successful
 */
    public boolean deleteFirstOccurrence(E info){
        boolean success = false;
        Node<E> newNode = new Node<E>(info);
        Node<E> travel = head;

        if(head.getNext() == null){
            head.getInfo().equals(newNode);
            head.setInfo(null);
            success = true;
        }
        if(head.getInfo().equals(info)){
        head = head.getNext();
        return true;
        }

        while(travel.getNext() != null){
            if(travel.getNext().getInfo().equals(info)){
                travel.setNext(travel.getNext().getNext());
                return true;
            }
            travel = travel.getNext();
        }

        return success;
    }
    /*
     * Delete all the occurrences of a value
     * Returns the number of deleted nodes
     * You can use deleteFirstOccurrence
     */
    public int deleteAll(E info) {
        int number = 0;
        while (deleteFirstOccurrence(info))
            number++;
        return number;

    }
    /*
     * Insertion at the end
     * Implement this method
     */

    public void insertEnd(E info) {
        Node<E> newNode = new Node<E>(info);
        if(head == null){
            head = newNode;
            tail = head;
        }else {
            tail.setNext(newNode);
        }
    }

    /*
 * Extraction of the last node
 * Implement this method
 */
    public E extractEnd(){
        E data = null;
        //Implement this method
        return data;
    }

    /*
     * Extraction of the head node
     */
    public E extract(){
        E data = null;
        if (head != null && tail != null){
            data = head.getInfo();
            head = head.getNext();
        }
        return data;
    }

    /*
     * Print all list
     */
    public void print(){
        Node<E> current  = head;

        while (current != null){
            System.out.print(current.getInfo() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
