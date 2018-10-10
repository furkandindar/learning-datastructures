package ds.singlylinkedlist;

public class SinglyLinkedList {

    private Node first;

    public SinglyLinkedList(){

    }

    public boolean isEmpty(){
        return (first == null);
    }

    //insert at the beginning
    public void insertFirst(int data){ //
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int data){ // not efficient - solution can be circular linkedlist
        Node current = first;
        while (current.next != null){
            current = current.next;
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }

    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void displayList(){
        System.out.println("Listing (first --> last)");
        Node current = first;
        while (current != null){
            current.displayNode();
            current = current.next;
        }

    }
}
