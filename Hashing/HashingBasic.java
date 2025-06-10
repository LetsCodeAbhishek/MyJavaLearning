import java.util.*;
public class HashingBasic{
    public static void main(String args[]){
        // Create 
        HashMap<String , Integer> hm = new HashMap<>();
        // Insert 
        hm.put("India", 100);
        hm.put("china", 150);
        hm.put("US", 50);

        System.out.println(hm);

         hm.put("Us", 70);
        System.out.println(hm);

        // Get 
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia"));

        // ContainKey 
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        // Remove 
       // System.out.println(hm.remove("china"));
        //System.out.println(hm);

        // size
        System.out.println(hm.size());

        // clear
        // hm.clear();

        // // Is Empty
        // System.out.println(hm.size());

       

    }
}