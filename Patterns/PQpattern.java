
public class PQpattern{
    public static void main(String args[]){
//Pq 1 Hollow rectangle......
        //    int n = 5;
        //    for(int line=1; line<=(n-1); line++){
               
        //        if(line==1 || line== (n-1)){
        //         for(int star=1; star<=n; star++)
        //        System.out.print("* ");
        //        }else{ 
        //         System.out.print("* ");

        //         for(int space=1 ; space<=(n-2); space++){
        //             System.out.print("  "); 
        //             }

        //         System.out.print("* "); 
               
        //        }
        //        System.out.println();
        //        }
// ----------------------------------------------------------------------------              
// Inverted and rotated half pyramid Pattern-
      
    //   int n =4 ;
    //   int space=n-1;
    //   int star =1;

    //   for(int line=1 ; line<=n; line++){
    //     for( int i=1; i<=(space) ; i++){
    //         System.out.print("  ");
    //     }
    //     for(int j=1; j<=star; j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    //     space--;
    //     star++;

    //   }
//----------------------------------------------------------------------------
// PQ 3 INVERTED HALF-PYRAMID with Numbers pattern
       
    //    int n=5 ;
    //    int decrease= n;
       
    //    for(int line=1; line<=n; line++){
    //       for(int number=1; number<=decrease; number++){
    //         System.out.print(number+" ");
    //       }
    //       decrease--;
    //       System.out.println();

    //    }
//---------------------------------------------------------------------------------
// Pq 4 FLOYD'S Triangle pattern.......
    // int n=10;
    // int num=1;
    // for(int line=1; line<=n; line++){
    //     for(int i=1; i<=line; i++){
    //         System.out.print(num+" ");
    //         num++;
    //     }
    //     System.out.println();
    // }
//----------------------------------------------------------------------------------
// PQ 5 0-1 Triangle pattern
    //  int n=5;
    //  for(int line=1; line<=n; line++){
    //     for(int num=1; num<=line; num++){
    //         if((num+line)%2==0){
    //             System.out.print(1+" ");
    //         }else{
    //             System.out.print(0+" ");
    //         }
    //     }
    //     System.out.println();
    //  }
//----------------------------------------------------------------
// Butterfly Pattern
    // int n=10;
    // int star=1;
    // int space = (n-2);
    // int row =1;
    // while(row<=n){

    //     for(int i=1; i<=star;i++){
    //         System.out.print("* ");
    //     }
    //     for(int i=1; i<=space;i++){
    //         System.out.print("  ");
    //     }
    //     for(int j=1; j<=star; j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    //     if(row<(n/2)){
    //         star++;
    //         space=space-2;
    //         row++;
            
    //     }else if(row==(n/2)){
    //         row++;
    //     }
    //     else{
    //         star--;
    //         space = space+2;
    //         row++;
            
    //     }}

//-----------------------------------------------------------------------
// Solid Rhombus Pattern

    //   int n = 5;
    //   for(int i=1; i<=n; i++){
    //     for(int j=1; j<=(n-i); j++){
    //          System.out.print("  ");
    //     }
    //     for(int j=1; j<=n;j++){
    //         // if(j==1||j==n||i==1||i==n){
    //         //      System.out.print("* ");
    //         // }else{
    //         //      System.out.print("  ");
    //         // }
    //         System.out.print("* ");
           
    //     }
    //     System.out.println();
    //   }  
//---------------------------------------------------------------------------
// DIAMOND pattern
    int n=4;
    int star=1;
    

    for(int i=1; i<=n; i++){
        for(int j=1; j<=(n-i); j++){
            System.out.print("  ");
        }
        for(int j=1; j<=star; j++){
            System.out.print("* ");
        }
        star+=2;
        System.out.println();
    }
     for(int i=4; i>=1; i--){
        for(int j=1; j<=(n-i); j++){
            System.out.print("  ");
        }
        for(int j=1; j<=star-2; j++){
            System.out.print("* ");
        }
        star-=2;
        System.out.println();
    }



            
           } 
    
}