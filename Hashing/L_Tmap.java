import java.util.*;

public class L_Tmap{

     //Volid Anagram

        public static boolean isAnangram(String s, String t){
            HashMap <Character, Integer> map = new HashMap<>();

            for(int i=0; i< s.length() ; i++){
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0)+1);
            }
            for(int i=0; i<t.length(); i++){
                char ch = t.charAt(i);
                if(map.get(ch) != null){
                    if(map.get(ch) == 1){
                        map.remove(ch);
                    }else{
                        map.put(ch , map.get(ch)-1);
                    }
                }else{
                    return false;
                }
            }
            return map.isEmpty();
        }
    public static void main(String args[]){

        // LinkedHashMap<String, Integer> hlm = new LinkedHashMap<>();
        // hlm.put("India", 100);
        // hlm.put("China", 150);
        // hlm.put("Us", 50);
        // hlm.put("Indonia", 10);
        // System.out.println(hlm);
        // TreeMap<String, Integer> htm = new TreeMap<>();
        // htm.put("India", 100);
        // htm.put("China", 150);
        // htm.put("US", 50);
        // htm.put("Indonia", 10);
        // System.out.println(htm);

    // Majority Element :

        // int arr[] = {1,3,2,5,2,3,2,5,2};

        // HashMap <Integer, Integer> map = new HashMap<>();

        // for(int i=0; i<arr.length; i++){
        //     if(map.containsKey(arr[i])){
        //         map.put(arr[i], map.get(arr[i]) +1);
        //     }else{
        //         map.put(arr[i], 1);
        //     }
        // }
        // Set<Integer> keySet = map.keySet();
        // for(Integer key : keySet){
        //     if(map.get(key) > arr.length/3){
        //         System.out.println(key);
        //     }
        // }

        String s = "abhi";
        String t = "habi";

        System.out.println(isAnangram(s,t));

    }
}