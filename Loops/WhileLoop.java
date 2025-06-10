import java.util.*;
public class WhileLoop{
    public static void main (String args[]){

        // to print Hello AbhisheK 100 times....

        // int count = 0;
        // while(count<=100){
        //     System.out.println(count + "** Hello Abhishek **");
        //     count++;

        // To Print 1 to 10 ....
        // int count = 1;
        // while(count<=10){
        //     System.out.print(count + " ");
        //     count++;
        // }
        // System.out.println();

        // to print 1 to n..

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a Number: ");
        // int userinput = sc.nextInt();
        // int Count = 1;

        // while(Count<=userinput){
        //     System.out.println(Count);
        //     Count++;
        // }
        // System.out.println("Your Numbers are printed");
    
// to print Sum of n natural number...
          
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a Number: ");
           int ui = sc.nextInt();
           int sum = 0;
           int i = 1 ;

           while(i<=ui){
              sum= i+sum;
              i++;
           }
           System.out.println("Your sum is : " + sum);

        

    }
    
}