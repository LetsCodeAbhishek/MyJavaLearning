public class powerOfTwo{

    public static boolean powerof2(int n){
        return ((n & (n-1)) == 0 );
    }
    // count set bits in a number :

    public static void countSetBit(int n){
        int count=0;
        while(n>0){
            if((n & 1)!=0){// counting lsb
                count++;
            }
           n  =  n>>1;
        }
        System.out.println(count);
    }
    // Fast EXponentation:
    public static void fastExpo(int a, int n){
        int ans = 1;
        while(n>0){
            if((n & 1)!=0){
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        System.out.println(ans);
    }
    public static int modularExpo(int a, int n, int p){
        int res = 1;
        while(n>0){
            if((n&1)!=0){
                res =res *a;
            }
            n = n>>1;
            a = a*a;
        }
        return res % p;
    }

    public static void main(String args[]){
        // System.out.println(powerof2(7));
        // countSetBit(7);
        // fastExpo(2,5);
        System.out.println(modularExpo(2,5,13));
    }
}