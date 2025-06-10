import java.util.*;
public class ArrayListQ{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(15);
        list.add(4);
        list.add(9);
        System.out.println(list);
        int n1 = 2;
        int n2 = 4;

        Collections.sort(list);
        System.out.println(list+" ");

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        //---------------------------
        // int temp = list.get(n1);
        // list.set(n1, list.get(n2));
        // list.set(n2, temp);

        // System.out.print(list + " ");
        //--------------------------------------
        // int max = Integer.MIN_VALUE;

        // for(int i=0; i<list.size(); i++){
        //     if(max < list.get(i)){
        //         max = list.get(i);
        //     }
        // }
        // System.out.println("Max Number: " + max);
        //---------------------------------------
        // for(int i=list.size()-1 ; i>=0; i--){
        //     System.out.print(list.get(i)+" ");
        // } 
    }
}