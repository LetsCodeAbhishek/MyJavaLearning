public class basicRecursion{
    public static int tilingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        int verticle = tilingProblem(n-1);
        int horizontal = tilingProblem(n-2);

        int totalWays = verticle + horizontal;
        return totalWays;
    }

    public static int friendPair(int n){
        //base case
        if(n==1 || n==2){
            return n;
        }
        //single person
        int sp = friendPair(n-1);

        // pair
        int pair = (n-1) * friendPair(n-2);

        //total pair 
        int totalPair = sp + pair;

        return totalPair;

    }

    public static void binaryString(int n, int lastplace,String str){
        // base case
        if(n==0){
            System.out.println(str);
            return;
        }

        //function
        binaryString(n-1, 0, str+"0");
        if(lastplace==0){
            binaryString(n-1, 1, str+"1");
        }

    }


    public static void main(String args[]){
        // System.out.println(tilingProblem(4));
        // System.out.println(friendPair(10));
        binaryString(4,0,"");
    }
}