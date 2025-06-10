public class diagonalSun{
    
    // Approach 1:
   public static int diagonal_sum(int matrix[][]){
         int sum = 0;
         int pd = 0;
         int sd = 0;
         for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i==j){
                    pd += matrix[i][j];
                    
                }
                else if(i+j==matrix.length-1){
                    sd += matrix[i][j];
                    
                }
                
            }
        
         }
         System.out.println("sum of pd: "+pd);
         System.out.println("sum of sd: "+sd);
         sum = pd +sd;
         System.out.println("sum of diagonal: "+sum);
         return sum;
   }
   // Approach 2 :
     public static void diagonalSumTwo(int matrix[][]){
         int sum =0;
        for(int i=0; i<matrix.length; i++){
            //pd 
            sum+= matrix[i][i];
            //sd
            if( i != matrix.length-1-i)
                sum+= matrix[i][matrix.length-1-i];
        }
        System.out.println("sum "+sum +" ");
     }


    public static void main(String args[]){
        int matrix[][] = { {1,2,3},
                           {5,6,7}, 
                           {9,10,11} 
                            };
        // int res = diagonal_sum(matrix);
        // System.out.print("Diagonal Sum : "+res );
        diagonalSumTwo(matrix);
    }
}