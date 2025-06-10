
public class AdvPattern{

// Hollow Rectangle 
    public static void hollow_rectangle(int n){
        // Outer Loop 
        for(int row=1; row<=n; row++){
               // Inner Loop 
               for(int col=1; col<=(n+1);col++){
                  if(row==1 || row==n || col==1 || col==(n+1)){
                    System.out.print("* ");
                  }else{
                    System.out.print("  ");
                  }
               } 
               System.out.println();
        }
    }
// ----------------------------------------------------------------
// Inverted And Rotated Half Pyramid:
    
    public static void rotated_half_pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print("  ");
            }
            for(int star=1; star<=i; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//----------------------------------------------------------------
// Inverted Half Pyramid Pattern with number:
    
    public static void pyramid_number(int n){
        int a=n;
        for(int i=1;i<=n;i++){
            // inner loop (n-i+1)
            for(int j=1; j<=a; j++){
                System.out.print(j+" ");

            }
            a--;
            System.out.println();
        }
    }
//--------------------------------------------------------------------
// FLOYD'S Triangle pattern
    
    public static void floyd_triangle(int n){
        int count =1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count +" ");
                count++;
            }
            System.out.println();
        }
    }



    public static void main(String args[]){
        floyd_triangle(5);
        
    }
}