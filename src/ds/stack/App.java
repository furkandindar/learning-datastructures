package ds.stack;

public class App {

    public static void main(String[] args) {
        /*Stack s = new Stack(3);// test commit
        s.push(1);
        s.push(3);
        s.push(5);
        s.push(7);

        while (!s.isEmpty()){
            long value = s.pop();
            System.out.println(value);
        }*/
        System.out.println(reverseString("FURKAN"));

    }

    public static String reverseString(String str){

        int stack_size = str.length(); // get the max stack size
        Stack theStack = new Stack(stack_size); // creating the stack
        for (int i =0; i < str.length(); i++){
            char ch = str.charAt(i);
            theStack.push(ch);
        }

        String result = "";

        while (!theStack.isEmpty()){
            char ch = theStack.pop();
            result = result + ch;
        }

        return result;
    }
}
