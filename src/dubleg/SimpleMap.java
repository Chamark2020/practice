package dubleg;

import java.util.HashMap;
import java.util.Map;

class SimpleMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("World", 100);
//        System.out.println(map.size());
        map.put("Worldww", 150);
        map.put("Worldw22w", 130);
//        System.out.println(map.size());
//        System.out.println(map);

        for (Map.Entry<String, Integer> tmp: map.entrySet()) {
            System.out.println(tmp.getKey() + " " + tmp.getValue());
        }
    }
}
