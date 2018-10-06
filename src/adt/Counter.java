package adt;

public class Counter {

    private String name = null;
    private int number = 0;

    public Counter(String str){
        this.name = str;
    }

    public void increment(){
        number++;
    }

    public int getCurrentValue(){
        return number;
    }

    public String toString(){
        return name + " " + number;
    }
}
