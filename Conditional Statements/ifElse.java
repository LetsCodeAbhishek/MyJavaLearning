import java.util.*;

 public class ifElse{
    public static void main(String args[]){
        // int age= 199;
        //  if(age>15 && age<18){
        //     System.out.println("You Are Teenager ");
        // }
        // else if(age>=18){
        //     System.out.println("You Are Adult ");
        // }
        // else{
        //     System.out.println("you are kid");
        // }

// Greatest b/w 2 number
        // int a=66 , b=3;
        // if(a>=b){
        //     System.out.println(a);
        // }
        // else{
        //     System.out.println(b);
        // }

// to find if a number is even or odd 
    //    Scanner sc = new Scanner(System.in);
    //    System.out.print("enter your Number: ");
    //    int a = sc.nextInt();      

    //     if (a%2==0){
    //         System.out.println("EVen number");
    //     }else{
    //         System.out.println("Odd Number");
    //     }

// income tax calculator....
      
    //   Scanner sc = new Scanner(System.in);
    //   int income = sc.nextInt();
    //   int tax;

    //   if (income<500000){
    //     tax=0;
    //     System.out.println("tax: " + tax);
    //   }
    //   else if(income>=500000 && income<1000000){
    //     tax = (int) (income * 0.2) ;
    //     System.out.println("tax: " + tax);
    //   }
    //   else{
    //     tax = (int)(income * 0.3);
    //     System.out.println("tax: "+tax);
    //   }

// largest b/w 3 number

       Scanner sc =new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();

       if ( a>=b && a>=c ){
        System.out.println("A is Largest: "+ a);
       }
       else if(b>=c){
        System.out.println("B is Largest: "+ b);
       }
       else{
        System.out.println("C is Largest: "+c);
       }


    }
 }