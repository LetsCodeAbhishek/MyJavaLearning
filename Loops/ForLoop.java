public class ForLoop{
    public static void main(String args[]){
        System.out.println("For Loop...");
    // to print Hello world 10 times...
        // for(int i=1; i<=10; i++){
        //     System.out.println("Hello World "+ i);
        // }
        // System.out.println("Well Done");

    // to print Pattern (Square)..
    //  for(int i=1; i<=4; i++){
    //         System.out.println("****");
    //     }
    //  System.out.println("While Loop...");

    //  int a= 1;
    //  while(a<=4){
    //     System.out.println("****");
    //     a++;
    //  }

    //  Reverse of number...
        // int n=123;
        // while(n>0){
        //     int ld = n%10;
        //     System.out.print(ld + " ");
        //      n =n/10;
             
        // }
        // System.out.print("\n"+n + " ");
          
    // Reverse of Given number

        int n= 12345;
        int rev =0;

        while(n>0){
           int ld = n%10;
           System.out.println(ld);
            rev = (rev*10)+ld;
            n=n/10;
        }
        System.out.println(rev);
        System.out.println(n);






     



    }
}