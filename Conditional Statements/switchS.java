
import java.util.*;
public class switchS{
    public static void main (String args[]){

// Default output of switch
        // int a = 3;

        // switch(a){
        //     case 1 : System.out.println(" case 1");

        //     case 2 : System.out.println(" case 2");

        //     case 3 : System.out.println(" case 3");

        //     case 4 : System.out.println(" case 4");

        //     case 5 : System.out.println(" case 5");

        //     default : System.out.println(" Default");

        // };
// switch with break....
        
        //  int a = 88;

        // switch(a){
        //     case 1 : System.out.println(" case 1");
        //     break;

        //     case 2 : System.out.println(" case 2");
        //     break;

        //     case 3 : System.out.println(" case 3");
        //     break;

        //     case 4 : System.out.println(" case 4");
        //     break;

        //     case 5 : System.out.println(" case 5");
        //     break;

        //     default : System.out.println(" Default");

        // };

    // Calculator....

         Scanner sc = new Scanner(System.in);
         System.out.println("enter a: ");
         int a = sc.nextInt();
         System.out.println("enter b: ");
         int b = sc.nextInt();

           System.out.println("enter operator: ");
         char operator = sc.next().charAt(0);

         switch(operator){
            case '+': System.out.println(a+b);
            break;
            case '-': System.out.println(a-b);
            break;
            case '*': System.out.println(a*b);
            break;
            case '/': System.out.println(a/b);
            break;
            case '%': System.out.println(a%b);
            break;
            default: System.out.println("not found");
            
         }


    }
}