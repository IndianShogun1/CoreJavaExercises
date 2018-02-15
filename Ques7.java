public class Ques7 {
    static String firstName = "Shreyansh";
    static String lastName = "Sahu";
    static int age = 21;
    private static void print(){
        System.out.println("In static method");
        System.out.println("Shreyansh Sahu 21");
    }
    public static void main(String[] args) {
        System.out.println("In main");
        System.out.println(firstName + " " + lastName + " " + age);
        print();
    }
    static {
        System.out.println("In static block");
        System.out.println("Shreyansh Sahu 21");
    }
}
