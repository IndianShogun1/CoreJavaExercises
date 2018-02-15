public class Ques11 {
    private static int add(int a, int b) {
        return a + b;
    }
    private static double add(double a, double b) {
        return a + b;
    }
    private static float multiply(float a, float b) {
        return a * b;
    }
    private static int multiply(int a, int b) {
        return a * b;
    }
    private static String concat(String a, String b) {
        return a + b;
    }
    private static String concat(String a, String b, String c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(add(2,4));
        System.out.println(add(4.2,5.8));
        System.out.println(multiply(2,4));
        System.out.println(multiply(4.2f,5.8f));
        System.out.println(concat("Hello"," World"));
        System.out.println(concat("Hello"," World","!"));
    }
}
