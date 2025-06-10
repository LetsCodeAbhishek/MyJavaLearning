import java.util.*;
public class StringBasic{
    public static void subString(String str, int si, int ei){
        String count="";
        for(int i=si; i<ei; i++){
            count += str.charAt(i);
        }
        System.out.print(count + " ");
    }
    public static void largestString(String str[]){
        String largest = str[0];
        for(int i=1; i<str.length; i++){
            if(largest.compareTo(str[i]) < 0 ){
                largest = str[i];
            }
        }
        System.out.println("Largest String: "+ largest);
        
    }

    public static void main(String agrs[]){
        String str[] = {"apple", "mangoz","mango"};
        largestString(str);


    //     subString(str,0,5);
    // // String function
    //     System.out.println();
    //     System.out.print(str.substring(0,6));


        // String str = "abhishek";
        // String str1 = new String ("abhi");
        // System.out.println(str.length());
        // System.out.println(str1.length());
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Anything ");
        // String str = sc.nextLine();

        // for(int i=0; i<str.length(); i++){
        //     System.out.print(str.charAt(i)+" ");
        // }
        // System.out.println();

        // String str = "Tony";
        // String str2= new String("Tony");

        // if(str==str2){
        //     System.out.println("String are equal ");
        // }else if(str.equals(str2)){
        //     System.out.println(" are equal ");
        // }else{
        //     System.out.println("String not are equal ");
        // }


   
    }
}