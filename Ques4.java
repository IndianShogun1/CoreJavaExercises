import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        int countOfUpperCase = 0;
        int countOfLowerCase = 0;
        int countOfDigits = 0;
        int countOfSpecialChars = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ((ch >= 'a') && (ch <= 'z')) {
                countOfLowerCase++;
            } else if ((ch >= 'A') && (ch <= 'Z')) {
                countOfUpperCase++;
            } else if ((ch >= '0') && (ch <= '9')) {
                countOfDigits++;
            } else {
                countOfSpecialChars++;
            }
        }
        int totalChars = input.length();
        System.out.println("Count and percentage of upper case chars " + countOfUpperCase + " " +
                ((countOfUpperCase * 100) / totalChars) + "%");
        System.out.println("Count and percentage of lower case chars " + countOfUpperCase + " " +
                ((countOfUpperCase * 100) / totalChars) + "%");
        System.out.println("Count and percentage of digits " + countOfUpperCase + " " +
                ((countOfUpperCase * 100) / totalChars) + "%");
        System.out.println("Count and percentage of special chars " + countOfUpperCase + " " +
                ((countOfUpperCase * 100) / totalChars) + "%");
    }
}
