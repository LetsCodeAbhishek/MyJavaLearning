import java.util.ArrayList;
public class ArraylistBaisc{
    public static void main(String args[]){

        ArrayList <Integer> list = new ArrayList<>();
        // to add element..
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // get element...
        int i = list.get(1); 
        System.out.println("value of Index 1 of Element "+ i);

        // Remove element... 
          // list.remove(2);
          // System.out.println(list);

        // set
           // list.set(2,9);
          // System.out.println(list);

        // Contains Element ... true or false
        System.out.println(list.contains(5));
        System.out.println(list.contains(11));

        // Size of ArrayList
        int s = list.size();
        System.out.println(s);

        // to print..
        for(int z=0; z<list.size(); z++){
            System.out.print(list.get(z)+" ");
        }
    } 
}