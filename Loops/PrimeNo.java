import java.util.*;
public class PrimeNo{
    public static void main ( String args[]){
        // to check Number is prime or not.....
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        // if(n==2){
        //     System.out.println("n is prime");
        // }else{
        //     boolean isPrime = true;
        //     for (int i=2;i<=n-1;i++){
        //         if (n%i==0){
        //             isPrime=false;
        //         }
        //     }
        //     if(isPrime==true){
        //         System.out.println("Prime");
        //     }else{
        //         System.out.println("Not Prime");
        //     }
        // }

       if(n==2){
        System.out.println("number is prime: ");
       }else{
          boolean isPrime = true;
         for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime = false;
            }
         }
         if(isPrime == true){
            System.out.println("N is a prime Number: ");
         }else{
            System.out.println("N is not Prime Number: ");
         }

       };

        
    }
}