package ds.stack;

public class App {

    public static void main(String[] args) {
        Stack s = new Stack(3);// test commit
        s.push(1);
        s.push(3);
        s.push(5);
        s.push(7);

        while (!s.isEmpty()){
            long value = s.pop();
            System.out.println(value);
        }


    }
}
