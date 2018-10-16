package ds.doublylinkedlist;

public class App {

    public static void main(String[] args) {
        DoublyLinkedList my_list = new DoublyLinkedList();

        my_list.insertFirst(22);
        my_list.insertFirst(44);
        my_list.insertFirst(66);
        my_list.insertLast(11);
        my_list.insertLast(33);
        my_list.insertLast(55);

        my_list.displayForward();
        my_list.displayBackward();;

        my_list.deletFirst();
        my_list.deleteLast();
        my_list.deleteKey(11);

        my_list.displayForward();
        my_list.insertAfter(22,77);
        my_list.insertAfter(33,88);
        my_list.displayForward();
    }
}
