package Map;

import java.util.*;

public class HashmapCustom {
    static void main(String[] args) {

        Map<String, Integer> mp = new HashMap<>();
        mp.put("Hi", 80);
        mp.put("Ai", 10);
        mp.put("Ea", 50);
        mp.put("Du", 40);
        mp.put("Ip", 90);
        mp.put("xF", 60);
        mp.put("Bt", 20);
        mp.put("C", 30);
        mp.put("G", 70);
        System.out.println(mp);
        /*Sorting the map by keys*/
        Set<Map.Entry<String,Integer>> st = mp.entrySet();
        List<Map.Entry<String,Integer>> list = new ArrayList<>(st);
        list.sort((o1, o2) -> {
            // TODO Auto-generated method stub
            return o1.getKey().compareTo(o2.getKey());
        });
        System.out.println(list);
    }
}
