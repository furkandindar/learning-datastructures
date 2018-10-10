package ds.circularlinkedlist;

public class CircularLinkedList {

    private Node first;
    private Node last;

    public CircularLinkedList(){
        first = null;
        last = null;
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()){
            last = newNode;
        }
        newNode.next = first; // newNode --> old first
        first = newNode; //first place
    }

    private boolean isEmpty() {
        return (first == null);
    }

    public void insertLast(int data){ // more efficient than singlylinkedlist
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()){
            first = newNode;
        }
        else {
            last.next = newNode;
            last = newNode;
        }
    }

    public int deleteFirst(){
        int temp = first.data;

        if (first.next == null){
            last = null;
        }
        first = first.next;

        return temp;
    }

    public void displayList(){
        System.out.println("Listing (first --> last)");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
    }
}
