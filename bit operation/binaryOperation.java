public class binaryOperation{
    public static void oddEven(int num){
        int bitmask =  1;
        if((num & bitmask)==0){
            System.out.println("Even: ");
        }else{
            System.out.println("Odd: ");
        }
    }
    public static int getIbit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int getIset(int n , int i){
        int bitmask = 1<<i;
        return n | bitmask;       
    }
    public static int clearIbit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static int updateIbit(int n, int i, int newBit){
    // Approach 1
        // if(newBit==0){
        //    return clearIbit(n,i);
        // }else{
        //     return getIset(n,i);
        // }
    // Approach 2
        n = clearIbit(n,i);
        int bitmask = newBit<<i;
        return n | bitmask;
    }

    public static int clearBit(int n, int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static int clearRange(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static void main(String args[]){
        System.out.println(clearRange(10,2,4));

        // System.out.print(clearIbit(10,1));
        // oddEven(9);
        // oddEven(10);
        // oddEven(2);
        //System.out.println((6>>1));

        // XOR
        // System.out.println((2^2));
//
        // int x=2;
        // int y=3;
        // x=x^y;
        // y=y^x;
        // x=x^y;
        // System.out.println(x +" "+ y);
//
        // int x=10;
        // System.out.println(x + "=> "+ -~x);
//      
        // for(char ch ='A'; ch<='Z'; ch++){
        //     // A =65 , " " = 32;
        //     System.out.print((char)(ch | ' ')+ " ");
        // }        

    };
}