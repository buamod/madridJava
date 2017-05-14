package LinkedList;

/**
 * Created by buamod on 2017-05-07.
 */


public class MyLinkedList<E>{
    private Node<E> first;

    public MyLinkedList(){
        this.first = null;
    }

    /*
     * Insertion at the beginning
     */
    public void insert(E info){
        Node<E> newNode = new Node<E>(info);
        newNode.setNext(first);
        first = newNode;
    }
    /*
 * Delete the first occurrence of a value
 * Return a boolean stating if the delete was successful
 */
    public boolean deleteFirstOccurrence(E info){
        boolean success = false;
        Node<E> newNode = new Node<E>(info);
        Node<E> travel = first;

        if(first.getNext() == null){
            first.getInfo().equals(newNode);
            first.setInfo(null);
            success = true;
        }
        if(first.getInfo().equals(info)){
        first = first.getNext();
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
        Node<E> loopNode = first;

        if (loopNode == null) {
            first = newNode;
        } else {
            while (loopNode.getNext() != null) {
                loopNode = loopNode.getNext();
            }
            loopNode.setNext(newNode);
        }
    }


    /*
     * Extraction of the first node
     */
    public E extract(){
        E data = null;
        if (first != null){
            data = first.getInfo();
            first = first.getNext();
        }
        return data;
    }
    /*
     * Print all list
     */
    public void print(){
        Node<E> current  = first;

        while (current != null){
            System.out.print(current.getInfo() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
