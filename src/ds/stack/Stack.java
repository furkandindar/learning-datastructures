package ds.stack;

public class Stack {

    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack(int size){
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        this.top = -1; // it represents the index position of the last item
    }

    public void push(long new_item){
        if (isFull()){
            System.out.println("Stack is already full!"); //error handling
        }
        else {
            top++;
            stackArray[top] = new_item;
        }
    }

    public long pop(){
        if(isEmpty()){
            System.out.println("Stack is already empty!"); //error handling
            return -1;
        }
        else{
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
    }

    public long peak(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return( top == -1);
    }

    public boolean isFull(){
        return (maxSize -1 == top);
    }
}
