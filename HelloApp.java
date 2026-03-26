public class HelloApp {

    // Inner class
    static class Message {

        private String[] parts;

        public Message(String name) {
            parts = new String[]{"Hello, ", name, "!"};
        }

        public void print() {
            for (String part : parts) {
                System.out.print(part);
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