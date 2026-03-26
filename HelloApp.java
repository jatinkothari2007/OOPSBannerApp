public class HelloApp {

    public static void main(String[] args) {

        String name;

        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World";
        }

        printMessage(name);

    }

    public static void printMessage(String name) {

        for (String part : new String[]{"Hello, ", name, "!"}) {
            System.out.print(part);
        }

    }
}