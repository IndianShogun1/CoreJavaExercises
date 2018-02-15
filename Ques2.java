import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ques2 {
    public static void main(String[] args) {
        String s = "abc xyz def xyz abc";
        String[] words = s.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String word: words) {
            if (map.containsKey(word)){
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        Set keys = map.keySet();
        Iterator keyIterator = keys.iterator();
        while (keyIterator.hasNext()) {
            String word = (String) keyIterator.next();
            if (map.get(word) > 1) {
                System.out.println(word + " count : " + map.get(word));
            }
        }
    }
}
