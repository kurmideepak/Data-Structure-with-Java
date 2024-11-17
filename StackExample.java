import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println(stack);

        System.out.println(stack.size());

        System.out.println(stack.pop()); // It will pop the element

        System.out.println(stack.peek()); // It shows the peak or top value

        System.out.println(stack.size());

        System.out.println(stack);

    }
}
