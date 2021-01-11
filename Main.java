import java.util.Scanner;

public class Main {

    
    public static void main(String... args) {
    
        for(int i = 0; i < 100; i++) {

            System.out.println();

        }

        Board newBoard = new Board();

        newBoard.setSpace('X', 0, 0);
        newBoard.setSpace('X', 0, 1);
        newBoard.setSpace('X', 0, 2);

        newBoard.printBoard();

        char[] row1 = newBoard.getRow(0);
        char[] row2 = newBoard.getRow(1);
        char[] row3 = newBoard.getRow(2);

        boolean firstRowVictory = (row1[0] == row1[1]) && (row1[1] == row1[2]) && (row1[0] == 'X' || row1[0] == 'O');
        boolean secondRowVictory = (row2[0] == row2[1]) && (row2[1] == row2[2]) && (row2[0] == 'X' || row2[0] == 'O');
        boolean thirdRowVictory = (row3[0] == row3[1]) && (row3[1] == row3[2]) && (row3[0] == 'X' || row3[0] == 'O');

        char[] column1 = newBoard.getColumn(0);
        char[] column2 = newBoard.getColumn(1);
        char[] column3 = newBoard.getColumn(2);

        boolean firstColumnVictory = (column1[0] == column1[1]) && (column1[1] == column1[2]) && (column1[0] == 'X' || column1[0] == 'O');
        boolean secondColumnVictory = (column2[0] == column2[1]) && (column2[1] == column2[2]) && (column2[0] == 'X' || column2[0] == 'O');
        boolean thirdColumnVictory = (column3[0] == column3[1]) && (column3[1] == column3[2]) && (column3[0] == 'X' || column3[0] == 'O');

        char[] leftDiagonal = newBoard.getDiagonal('L');
        char[] rightDiagonal = newBoard.getDiagonal('R');

        boolean leftDiagonalVictory = (leftDiagonal[0] == leftDiagonal[1]) && (leftDiagonal[1] == leftDiagonal[2]) && (leftDiagonal[0] == 'X' || leftDiagonal[0] == 'O');
        boolean rightDiagonalVictory = (rightDiagonal[0] == rightDiagonal[1]) && (rightDiagonal[1] == rightDiagonal[2]) && (rightDiagonal[0] == 'X' || rightDiagonal[0] == 'O');

        System.out.println(firstRowVictory);
        System.out.println(secondRowVictory);
        System.out.println(thirdRowVictory);

        System.out.println();

        System.out.println(firstColumnVictory);
        System.out.println(secondColumnVictory);
        System.out.println(thirdColumnVictory);

        System.out.println();

        System.out.println(leftDiagonalVictory);
        System.out.println(rightDiagonalVictory);

    }
    
}