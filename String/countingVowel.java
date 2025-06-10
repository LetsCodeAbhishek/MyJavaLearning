import java.util.*;
public class countingVowel{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count =0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'|| ch=='o'||ch=='u'||ch=='i'){
                count++;
            }
        }
        System.out.println("total vowels are: "+count);


    }
}