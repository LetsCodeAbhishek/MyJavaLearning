import java.util.*;
public class StringBuild{

    public static void toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        String a = sb.toString();
        System.out.print(a);
    }


    public static void main(String args[]){
// To print A to Z:
        // StringBuilder sb = new StringBuilder("");
        // for(char ch = 'a'; ch<='z'; ch++){
        //     sb.append(ch +" ");
        // }
        // System.out.println(sb);
        // System.out.println(sb.length());


        String str = "hi, i am abhishek";
        toUpperCase(str);
        // char ch = Character.toUpperCase(str);
        // System.out.print(ch);
    }
}