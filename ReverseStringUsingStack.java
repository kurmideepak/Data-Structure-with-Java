import java.util.Scanner;
import java.util.Stack;

class StringReverser {
    public String reverse(String input){
        Stack<Character> stack = new Stack<Character>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        String reversed = "";

        while(!stack.empty()){
            reversed += stack.pop();
        }
        return reversed;
    }
}

public class ReverseStringUsingStack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String Value: ");
        String str = sc.nextLine();

        StringReverser reverser = new StringReverser();
        String result = reverser.reverse(str);

        System.out.println("Reversed String: " + result);
    }
}
