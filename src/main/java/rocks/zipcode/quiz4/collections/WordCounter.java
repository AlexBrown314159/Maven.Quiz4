package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    String str[];

    public WordCounter(String... strings) {

        str = strings;

    }

    public Map<String, Integer> getWordCountMap() {
        int num = 0;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length; i++) {


            if (map.containsKey(str[i])) {
                num = map.get(str[i]) + 1;
                map.put(str[i], num);
            }
            else {
                map.put(str[i], 1);
            }

        }
        System.out.println(map);
        return map;
    }
}
