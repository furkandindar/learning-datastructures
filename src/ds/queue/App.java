package ds.queue;

public class App {

    public static void main(String[] args) {

        Queue myQ = new Queue(5);

        myQ.insert(100);
        myQ.insert(200);
        myQ.insert(300);
        myQ.insert(400);
        myQ.insert(500);
        myQ.insert(1); // circular queue test
        myQ.view();
    }
}
