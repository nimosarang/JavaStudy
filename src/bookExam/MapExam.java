package bookExam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();

        map.put("1", "슥");
        map.put("2", "키움");
        map.put("3", "엘지");

        System.out.println("요소의 사이즈: " + map.size());

        if (map.containsValue("슥")){
            map.remove("1");
        }
        System.out.println("변경된 요소사이즈: " + map.size());

        System.out.println(map.get("2"));
        System.out.println(map.get("3"));

        Set set = map.entrySet();
        Iterator iter  = set.iterator();

        while (iter.hasNext()){
            Map.Entry<String, String> e = (Map.Entry<String, String>)iter.next();
            System.out.println("key: " + e.getKey());
            System.out.println("value: " + e.getValue());


        }





    }
}
