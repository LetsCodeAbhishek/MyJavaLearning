
public class NestedPattern{
    public static void main(String args[]){

// to print star Pattern......................

        // for(int line=1; line<=6;line++){
        //     // one line...
        //     for(int star=1; star<=line; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
//-----------------------------------------------------------------
// to print inverted -star pattern..................
        // int n=10;
        // for(int line=1; line<=n; line++){
        //     for(int star=1; star<=(n-line+1); star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
//------------------------------------------------------------------
// to print half pyramid pattern:
    //    int n=4;
    //    for(int line=1; line<=n; line++){
    //      for(int count=1; count<=line; count++){
    //         System.out.print(count);
    //      }
    //      System.out.println();
    //    }
//----------------------------------------------------------------------
// print Charactor pattern:
       int n=6;
       char ch = 'A';

       for(int line=1; line<=n; line++){
         for(int letter=1; letter<=line; letter++){
            System.out.print(ch);
            ch++;
         }
         System.out.println();
       }


    }
}