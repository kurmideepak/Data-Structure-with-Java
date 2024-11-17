import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        System.out.println(linkedList.size());

        linkedList.add("Java");
        linkedList.add("JavaScript");
        linkedList.add("SQLite");
        linkedList.add("Android Application Development");
        linkedList.add("Python");
        linkedList.add("React");

        System.out.println(linkedList);

        linkedList.add(2, "C++");
        linkedList.remove(0);
        linkedList.remove("Python");

        System.out.println(linkedList);
        System.out.println(linkedList.size());
    }
}
