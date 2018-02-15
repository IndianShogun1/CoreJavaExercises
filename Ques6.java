import java.util.Arrays;

public class Ques6 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 3, 4, 4, 5, 5};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i = i + 2) {
            if(a[i] != a[i+1]){
                System.out.println(a[i]);
                break;
            }
        }
    }
}
