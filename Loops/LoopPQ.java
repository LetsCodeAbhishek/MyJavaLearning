import java.util.*;
public class LoopPQ{
    public static void main(String args[]){
// PQ1
       
        // for(int i=0;i<5;i++){
        //     System.out.println("hello");
        //     i+=2;
// PQ2   Write a program that reads a set of integers, and then prints the sum of the even and odd integer
   // Approach 1........
        // Scanner sc = new Scanner(System.in);
        // int count =0;
        // int odd=0;
        // int even=0;
        // do{
        //     System.out.println("Enter a Number : ");
        //    int n = sc.nextInt();
        //     if(n%2==0){
        //         even=even+n;
                
        //     }else{
        //         odd=odd+n;  
        //     }
        //     count++;
        // }while(count<6);
        // System.out.println("Sum of odd no. : "+ odd);
        // System.out.println("Sum of Even no. : "+ even); 
 //-------------------------------------------------------------------------       
// Approach 2..................

   //         Scanner sc = new Scanner(System.in);
   //         int number;
   //         int choice;
  //         int evenSum = 0;
  //         int oddSum = 0;
  //     do  {
  //        System.out.print("Enter the number ");
  //        number = sc.nextInt();
 //        if( number % 2 == 0) {
 //         evenSum += number;
 //        } else {
 //        oddSum += number;
 //               }
 //         System.out.print("Do you want to continue? Press 1 for yes or 0 for no: ");
 //         choice = sc.nextInt();
 //     } while(choice==1);
 //    System.out.println("Sum of even numbers: " + evenSum);
 //    System.out.println("Sum of odd numbers: " + oddSum);
//-----------------------------------------------------------------------------------

// PQ3 factorial of any number entered by the user.................................................
            // Scanner sc =new Scanner(System.in);
            // System.out.println("Enter a Number : ");
            // int n = sc.nextInt();
            // long fact =1;
            // // while(i<=n){
            // //     fact =fact*i;
            // //     i++;
            // // }
            // // System.out.println(fact);
            // for(int i=1;i<=n;i++){
            //     fact=fact*i;
            // }
            // System.out.println(fact);
//-------------------------------------------------------------------------------------
//PQ4 Write a program to print the multiplication table of a number N, entered by the user.
        //    Scanner sc = new Scanner(System.in);

        //    System.out.println("Enter a Number: ");
        //    int n = sc.nextInt();
           
        //    for(int i=1; i<=10;i++){
        //        System.out.println(n +" X "+i+" = "+(n*i));
        //    }
//------------------------------------------------------------------------------------------
// table......................
            // Scanner sc= new Scanner(System.in);
            // int n = sc.nextInt();
            // int i =1;
            // while(i<=10){
            //     System.out.println(n +" * "+i+" = "+(n*i));
            //     i++;
            // }
// Factorial...
            Scanner sc= new Scanner(System.in);
            int n = sc.nextInt();
            int fact =1;
            int i=1;
            while(i<=n){
                fact= fact *i;
                System.out.println(fact + " "+ i);
                i++;
            }
            System.out.println("Factorial is :" + fact);


    }
}