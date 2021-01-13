public class Board {

    // index 0 is top row, 1 is middle row, 2 is bottom row
    char[][] board = { {'_', '_', '_'},
                       {'_', '_', '_'}, 
                       {'_', '_', '_'} };

    public Board() {}

    public void setSpace(char character, int y, int x) {

        board[x][y] = character;

    }

    public char getSpace(int y, int x) {

        return board[x][y];

    }

    public char[] getRow(int depth) {

        return board[depth];

    }

    public char[] getColumn(int width) {

        char[] column = { board[0][width], 
                          board[1][width], 
                          board[2][width] };

        return column;

    }

    public char[] getDiagonal(char leftRight) {

        char[] diagonal = new char[3];

        if(leftRight == 'L') {

            diagonal[0] = board[0][0];
            diagonal[1] = board[1][1];
            diagonal[2] = board[2][2];

        }

        if(leftRight == 'R') {

            diagonal[0] = board[0][1];
            diagonal[1] = board[1][1];
            diagonal[2] = board[2][0];

        }

        return diagonal;

    }

    public void printBoard() {

        System.out.println(board[0]);
        System.out.println(board[1]);
        System.out.println(board[2]);

    }

}