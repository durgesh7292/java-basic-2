public class nqueenrow {
    public static void nqueens(char board[][],int row){
        if(row==board.length){
            printboard(board);
            return;
        }
        for(int j=0;j<board.length;j++){
            board[row][j]= 'Q';
            nqueens(board, row+1);
            board[row][j]='.';
        }
    }
    public static void printboard(char board[][]){
        System.out.println("--------chess board");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=2;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nqueens(board,0);
    }
}
