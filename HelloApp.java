import java.util.HashMap;
import java.util.Map;

public class HelloApp {

    static class Message {

        private Map<Integer, String> parts;

        public Message(String name) {
            parts = new HashMap<>();
            parts.put(1, "Hello, ");
            parts.put(2, name);
            parts.put(3, "!");
        }

        public void print() {
            for (int i = 1; i <= parts.size(); i++) {
                System.out.print(parts.get(i));
            }
        }
    }

    public static void main(String[] args) {

        String name;

        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World";
        }

        Message msg = new Message(name);
        msg.print();
    }
}