import java.util.*;
public class CsPracticeQ{
    public static void main (String args[]){
        System.out.println("Helllo There:");
// positive and negative
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a Number");
        // int number = sc.nextInt();

        // if(number>=0){
        //     System.out.println("Number is + : " + number);
        // }else{
        //     System.out.println("Numbee is - : "+ number);
        // }

//   temperature (fever)
           
        //   double temp = 99;

        //   if(temp>100){
        //     System.out.println("You Have Fever ");
        //   } else{
        //     System.out.println("You don't have Fever ");
        //   }

// Java program to input week number(1-7) and print day of week name.
        
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Day ");
        // int day = sc.nextInt();

        // switch(day){
        //     case 1 : System.out.println("Monday");
        //     break;
        //     case 2 : System.out.println("Tuesday");
        //     break;
        //     case 3 : System.out.println("wednesday");
        //     break;
        //     case 4 : System.out.println("Thursday");
        //     break;
        //     case 5 : System.out.println("Friday");
        //     break;
        //     case 6 : System.out.println("Saturday");
        //     break;
        //     case 7 : System.out.println("Sunday");
        //     break;
        //     default: System.out.println("Not Found");
        // }

// ternary Operator....
        //    int a=63 , b =36;
        //    boolean x = (a < b ) ? true : false;
        //    int y= (a > b ) ? a : b;
        //    System.out.println(x);
        //    System.out.println(y);

// Leap Year...

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter a Year: ");
          int year = sc.nextInt();

          boolean x = (year%4==0);
          boolean y = (year%100!=0);
          boolean z = (year %100 ==0) && (year% 400 ==0);

          if (x && (y||z)){
                System.out.println("Leap Year ");
          } else{
                System.out.println("not Leap Year ");
          }

    }
}