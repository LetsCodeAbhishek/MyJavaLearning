
import java.util.*;
public class TwodArray{

    public static boolean Search_arr(int matrix[][], int key){
        int max = Integer.MAX_VALUE;
        for( int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.print("found At "+i+" "+j);
                    return true;
                }
               
            }
        }
        System.out.print("not Found ");
        return false;
    }

    public static void max_arr(int matrix[][]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for( int i=0; i<matrix.length; i++){
            
            for(int j=0; j<matrix[0].length; j++){
                if ( max < matrix[i][j]){
                    max = matrix[i][j];
                }
                if (min > matrix[i][j]){
                    min = matrix[i][j];
                }
            
            }
        }
        System.out.println();
        System.out.println(max);
        System.out.println(min);
    }



    public static void main(String args[]){
        int matrix [][] = {{1,2,3},{5,6,7,},{8,9,10}};
        int key = 7; 
        // Scanner sc = new Scanner(System.in);
       int n = matrix.length , m = matrix[0].length;

        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //          matrix[i][j] = sc.nextInt();
        //     }
        // }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        Search_arr(matrix, key);
        max_arr(matrix);

    }
}