import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ques5 {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5, 6};
        int[] secondArray = {1, 2, 3, 5, 7, 8};
        Set set = new HashSet();
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if(firstArray[i] == secondArray[j]) {
                    set.add(firstArray[i]);
                }
            }
        }
        Iterator setIterator = set.iterator();
        while(setIterator.hasNext()){
            System.out.print(setIterator.next() + " ");
        }
    }
}
