package adt;

public class App {

    public static void main(String[] args) {
        Counter myCounter = new Counter("Furkan's counter");

        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();

        System.out.println(myCounter.getCurrentValue());

        System.out.println(myCounter.toString());
    }
}