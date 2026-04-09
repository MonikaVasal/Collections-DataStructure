package Map;

import java.util.*;

import static java.util.Arrays.compare;

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
        Collections.sort(list,new Comparator<Map.Entry<String, Integer>>() {

            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                // TODO Auto-generated method stub
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        System.out.println(list);
    }
}
