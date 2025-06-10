public class PrintNumber{

    public static void printNumDec(int n){ 
       if(n==1){
        System.out.print(n+" ");
        return;
       }
       System.out.print(n+" ");
       printNumDec(n-1); 
    }
    public static void printNumInc(int n){
         if(n==1){
        System.out.print(n+" ");
        return;
       }
       printNumInc(n-1);
       System.out.print(n+" ");         
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int f = fact(n-1);
        System.out.println( n + "*" + f);
        int re = n * f;
        return re;
    }
    public static int sumNUm(int n){
        if(n==0){
            return 1;
        }
        int num = sumNUm(n-1);
        int res = num + n;
        System.out.println(n +"+"+num);
        return res;
    }

    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int f1 = fib(n-1);
        int f2 = fib(n-2);
        int res = f1 + f2;
        return res;
    }    

    public static boolean isSorted(int arr[],int i){
        if(i== arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }

    public static int firstTime(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstTime(arr,key,i+1);
    }

    public static int lastTime(int arr[], int key, int i ){
        if(i==arr.length){
            return -1;
        }
        int res = lastTime(arr,key,i+1);
        if(res == -1 && arr[i]==key){
            return i;
        }
        return res ;
    }
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        // int x1 = power(x,n-1);
        // int xn = x*x1;
        // return xn;
        return x * power(x,n-1);
    }

    // public static int optPower(int x, int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     int power = optPower(x,n/2) * optPower(x,n/2);

    //     if ((x%2)!=0){
    //         power = x*power;
    //     }
        
    //     return power;
    // }
    public static int optPower(int a, int n){
        if(n==0){
            return 1;
        }
         int hp = optPower(a,n/2);
         int hps = hp*hp;
        //int hps = optPower(a,n/2) * optPower(a,n/2);
        if(n%2!=0){
            hps = a*hps;
        }
        
        return hps;
    }

    public static void main(String args[]){
        int n=25;
        int arr[] = {1,2,3,4,5,3,5,6,5,5};
        System.out.println(optPower(2,2));
        
    }
}

