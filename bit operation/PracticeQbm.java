public class PracticeQbm{
    public static void main(String args[]){
    // Q1----What is the value of x^x for any value of x?
        // int x = 5;
        // System.out.println(x^0);
        // System.out.println(x^x);
    // Q2 --- Swap two numbers without using any third variable.
    int x=10;
    int y=20;
      // x=x^y;
      // y=x^y;
      // x=x^y;
      // System.out.println(x +" "+ y);
    // Q3 -- Add 1 to an integer using Bit Manipulation.
    System.out.println(-~x); // -x = x + 1;
    System.out.println(-~y);
    
    // Q4 ---  Convert uppercase characters to lowercase using bits.

    for(char i='A'; i<='Z'; i++){
      System.out.print( (char) (i | ' ') + " ");
    }

    }
}