public class HelloWorld {
    public static void helloName(String first, String last) {
        System.out.println("Hello, " + first + " " + last + "!");
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        helloName("Rich", "Kleinhenz");
    }
}