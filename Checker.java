public class Checker {

    public static boolean checkRowVictories(Board board) {

        char[] row1 = board.getRow(0);
        char[] row2 = board.getRow(1);
        char[] row3 = board.getRow(2);

        boolean firstRowVictory = (row1[0] == row1[1]) && (row1[1] == row1[2]) && (row1[0] == 'X' || row1[0] == 'O');
        boolean secondRowVictory = (row2[0] == row2[1]) && (row2[1] == row2[2]) && (row2[0] == 'X' || row2[0] == 'O');
        boolean thirdRowVictory = (row3[0] == row3[1]) && (row3[1] == row3[2]) && (row3[0] == 'X' || row3[0] == 'O');

        return (firstRowVictory) || (secondRowVictory) || (thirdRowVictory);

    }

    public static boolean checkColumnVictories(Board board) {

        char[] column1 = board.getColumn(0);
        char[] column2 = board.getColumn(1);
        char[] column3 = board.getColumn(2);

        boolean firstColumnVictory = (column1[0] == column1[1]) && (column1[1] == column1[2]) && (column1[0] == 'X' || column1[0] == 'O');
        boolean secondColumnVictory = (column2[0] == column2[1]) && (column2[1] == column2[2]) && (column2[0] == 'X' || column2[0] == 'O');
        boolean thirdColumnVictory = (column3[0] == column3[1]) && (column3[1] == column3[2]) && (column3[0] == 'X' || column3[0] == 'O');

        return (firstColumnVictory) || (secondColumnVictory) || (thirdColumnVictory);

    }

    public static boolean checkDiagonalVictories(Board board) {

        char[] leftDiagonal = board.getDiagonal('L');
        char[] rightDiagonal = board.getDiagonal('R');

        boolean leftDiagonalVictory = (leftDiagonal[0] == leftDiagonal[1]) && (leftDiagonal[1] == leftDiagonal[2]) && (leftDiagonal[0] == 'X' || leftDiagonal[0] == 'O');
        boolean rightDiagonalVictory = (rightDiagonal[0] == rightDiagonal[1]) && (rightDiagonal[1] == rightDiagonal[2]) && (rightDiagonal[0] == 'X' || rightDiagonal[0] == 'O');

        return (leftDiagonalVictory) || (rightDiagonalVictory);

    }

    public static boolean isValidInput(String input) {

        boolean isValid = false;

        if(input.length() == 3) {

            if(input.charAt(0) == '0' || input.charAt(0) == '1' || input.charAt(0) == '2') {

                if(input.charAt(1) == ',') {

                    if(input.charAt(2) == '0' || input.charAt(2) == '1' || input.charAt(2) == '2') {

                        isValid = true;

                    }

                }

            }

        }

        return isValid;

    }
    
}