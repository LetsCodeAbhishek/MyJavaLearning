import java.util.*;
public class ternarayO{
    public static void main( String args[])
    {
        // Odd Or Even
        // int x= 10;
        // String n = (x%2==0)?"even":"Odd";
        // System.out.println(n);  

        // Pass or Fail

        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String res = (score>=33)? "Pass":"fail";

        System.out.println(res);
    } 
}