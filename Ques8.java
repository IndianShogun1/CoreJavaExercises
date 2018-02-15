import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.nextLine();
        StringBuffer sb = new StringBuffer(input);
        sb = sb.reverse();
        sb = sb.replace(4, 9, "");
        System.out.println(sb);
    }
}
