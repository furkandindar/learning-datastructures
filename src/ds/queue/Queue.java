package ds.queue;

public class Queue {

    private int maxSize; // initializes the set number of slots
    private long[] queArray; // slots to maintain the data
    private int front; // index position for the element in the front
    private int rear; // index position for the element in the back
    private int nItems; // counter to maintain the number of items in queue

    public Queue(int size){
        this.maxSize = size;
        this.queArray = new long[size];
        front = 0; // first slot of the array
        rear = -1; // no item in the array at the beginning
        nItems = 0; // emtpy queue
    }

    public void insert(long j){

        if (rear == maxSize -1){ // circular queue
            rear = -1; // set rear back to initial
        }
        rear++;
        queArray[rear] = j;
        nItems++;
    }

    public long remove(){ // remove from the front
        long temp = queArray[front];
        front++;
        if (front == maxSize){
            front = 0; // set front back to initial
        }
        nItems--;
        return temp;
    }

    public long peekFront(){
        return queArray[front];
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }

    public void view(){
        System.out.print("[ ");
        for (int i = 0 ; i < queArray.length ; i++){
            System.out.print(queArray[i] + " ");
        }
        System.out.print(" ]");
    }
}
