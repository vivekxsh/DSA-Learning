package BackTracking;

public class nQueens {

    public static void placeQueens(char board[][], int row) {

        // base case
        if (row == board.length) {
            printBoard(board);
            return;
        }

        // recusion
        for (int j = 0; j < board.length; j++) {

            board[row][j] = 'Q';
            placeQueens(board, row + 1); // function call
            board[row][j] = '.'; // backtrack
        }
    }

    public static void printBoard(char[][] board) {
        System.out.println("------------ chess board ----------");

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 2;
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        placeQueens(board, 0);

    }
}
