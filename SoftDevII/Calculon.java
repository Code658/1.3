public class Calculon {
    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        if(x < 10){
            System.out.println("x is less than 10");
            System.out.println("blah blah blah");
        }
        return x / y;
    }
    public static void main(String[] args) {
        double x = 5.5;
        double y = 7.7;
        System.out.println(add(x,y));
        System.out.println(subtract(x,y));
        System.out.println(multiply(x,y));
        System.out.println(divide(x,y));
    }
}
