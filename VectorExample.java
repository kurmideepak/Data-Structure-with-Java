import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        System.out.println(vector.size());

        vector.add("Programming");
        vector.add("Networking");
        vector.add("Database");
        vector.add("Software");
        vector.add("Cloud eng.");
        vector.add("Deployment");

        System.out.println(vector);

        System.out.println(vector.size());

        vector.remove(0);

        System.out.println(vector);
        System.out.println(vector.size());

        vector.clear();

        System.out.println(vector.size());
    }
}
