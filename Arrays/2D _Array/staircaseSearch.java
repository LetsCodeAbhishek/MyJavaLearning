public class staircaseSearch{

    public static boolean stairCase(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;
        while( row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("key found : " + row +","+col);
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("not found");
        return false;

    }


    public static void main(String args[]){
        int matrix[][] = { {1,2,3,4},
                           {5,6,7,8}, 
                           {9,10,11,12},
                           {13,14,15,16}
                            };
        int key = 10;
        stairCase(matrix,key);
    }
}