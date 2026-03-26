public class HelloApp {

    public static void main(String[] args) {

        String name;

        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World";
        }

        for (String part : new String[]{"Hello, ", name, "!"}) {
            System.out.print(part);
        }

    }
}