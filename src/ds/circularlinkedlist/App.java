package ds.circularlinkedlist;

public class App {

    public static void main(String[] args) {
        CircularLinkedList myList = new CircularLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(25);
        myList.insertFirst(10);
        myList.insertLast(9999999);
        myList.deleteFirst();

        myList.displayList();
    }
}
