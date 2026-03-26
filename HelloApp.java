public class HelloApp {

    public static void main(String[] args) {

        if (args.length > 0) {
            String message = String.join("", "Hello, ", args[0], "!");
            System.out.println(message);
        } else {
            System.out.println("Hello, World!");
        }

    }
}