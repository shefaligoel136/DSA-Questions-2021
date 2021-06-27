package Hashing;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapUse {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        // insert
        map.put("abc",1);
        map.put("def",2);
        map.put("def",5);
        map.put("def1",2);

        // size
        System.out.println("Size:" + map.size());

        // check presence
        if(map.containsKey("abc")){
            System.out.println("yes");
        }

        // get value corresponding to a key
        int v = map.get("abc");
        System.out.println(v);

        // remove

        int r = map.remove("abc");
        System.out.println(r);

        // value
        if(map.containsValue(2)){
            System.out.println("has val 2");
        }

        // iterate - key set
        Set<String> keys = map.keySet();
        System.out.println(keys);
        System.out.println("By loops");
        for(String str: keys){
            System.out.println(str);
        }

        // iterate - value set
        Collection<Integer> value = map.values();
        System.out.println(value);
        System.out.println("By loops");
        for(int val: value){
            System.out.println(val);
        }
    }
}
