public class NQueens{

    // 2x2 ....
    // public static void NQueens( char board[][], int row){
    //     // base case
    //     if(row == board.length){
    //         printBoard(board);
    //         return;
    //     }

    //     // BackTracking..
    //     for(int j=0; j<board.length; j++){
    //         board[row][j] = '0';
    //         NQueens(board, row+1);
    //         board[row][j] = 'X';
    //     }
    // }
    //-----------------------------------------------------------------
    // n X n-+

     public static boolean NQueens( char board[][], int row){
        // base case
        if(row == board.length){
            //-------------------------------
            // printBoard(board);
            //------------------------------
            count++;
            return true;
        }

        // BackTracking..
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                 board[row][j] = 'Q';
                 if(NQueens(board, row+1)){
                    return true;
                 }

                 board[row][j] = 'X';
            }
        }
        return false;
    }

    public static boolean isSafe(char board[][], int row, int col){
        // vertical up
        for(int i = row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        // diag left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j]== 'Q'){
                return false;
            }
        }

        // diag right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;

    }

    
    public static void printBoard(char board[][]){
        System.out.println("----------Chess Board----------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }
    }

    static int count = 0; 
    public static void main(String args[]){
        int n=4 ;
        char board[][] = new char[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'X';
            }
        }
        if(NQueens(board, 0)){
            System.out.println("Solution is possible ");
            printBoard(board);
        }else{
            System.out.print("Solution is not possible ");
        }
        //System.out.println("NO. of ways to print n Queens: "+ count);
    }
}