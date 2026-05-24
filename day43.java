
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class day43 {
    public static String placeadjacent(String s) {
        
        HashMap<Character, Integer> d = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {

            if (d.containsKey(s.charAt(i))) {
                d.put(s.charAt(i), d.get(s.charAt(i)) + 1);
            } else {
                d.put(s.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : d.entrySet()) {

            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        String str = "";
        if (s.length() == 1) {
            return s;
        } else if (s.length() == 2 && s.charAt(0) != s.charAt(1)) {
            return s;
        } else {
            while (!d.isEmpty()) {
                Iterator<Map.Entry<Character, Integer>> it = d.entrySet().iterator();

                while (it.hasNext()) {

                    Map.Entry<Character, Integer> entry = it.next();
                    if (entry.getValue() == 1) {
                        str = str + entry.getKey();
                        it.remove();
                    } else {
                        str = str + entry.getKey();
                        entry.setValue(entry.getValue() - 1);
                    }
                }
            }
        }
        
        if (str.charAt(str.length() - 1) != str.charAt(str.length() - 2)) {
            return str;
        }
        return "";

    }
}
//     public static void main(String[] args) {
//         System.out.println(placeadjacent("vvlvo"));
//     }
// }

// HashMap<Character, Integer> d = new HashMap<>();

//     for(int i = 0; i < s.length(); i++) {

//         if(d.containsKey(s.charAt(i))) {
//             d.put(s.charAt(i), d.get(s.charAt(i)) + 1);
//         } 
//         else {
//             d.put(s.charAt(i), 1);
//         }
//     }

//     String str = "";
//     char prev = '#';

//     while(!d.isEmpty()) {

//         char maxKey = ' ';
//         int maxValue = Integer.MIN_VALUE;

//         for(Map.Entry<Character, Integer> entry : d.entrySet()) {

//             if(entry.getValue() > maxValue && entry.getKey() != prev) {

//                 maxValue = entry.getValue();
//                 maxKey = entry.getKey();
//             }
//         }

//         if(maxKey == ' ') {
//             return "";
//         }

//         str = str + maxKey;
//         prev = maxKey;

//         if(maxValue == 1) {
//             d.remove(maxKey);
//         } 
//         else {
//             d.put(maxKey, maxValue - 1);
//         }
//     }

//     return str;