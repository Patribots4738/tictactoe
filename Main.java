import java.util.Scanner;

public class Main {

    public static void main(String... args) {

        Scanner scan = new Scanner(System.in);

        Board board = new Board();

        boolean victory = Checker.checkColumnVictories(board) || Checker.checkRowVictories(board) || Checker.checkDiagonalVictories(board);

        char turn = 'O';

        while(!victory) {

            board.printBoard();
            
            System.out.println("Input your coordinates:");

            String input = scan.nextLine();

            while(Checker.isValidInput(input)) {

                System.out.println("Invalid space, choose again");

                input = scan.nextLine();

            }

            String[] coordinateStrings = input.split(",");

            int[] coordinates = {Integer.parseInt(coordinateStrings[0]), Integer.parseInt(coordinateStrings[1])};

            while(board.getSpace(coordinates[0], coordinates[1]) != '_') {

                System.out.println("Invalid space, choose again");

                input = scan.nextLine();

                coordinateStrings = input.split(",");

                coordinates[0] = Integer.parseInt(coordinateStrings[0]);
                coordinates[1] = Integer.parseInt(coordinateStrings[1]);

            }

            board.setSpace(turn, coordinates[0], coordinates[1]);

            if(turn == 'O') {

                turn = 'X';

            } else {

                turn = 'O';

            }

            victory = Checker.checkColumnVictories(board) || Checker.checkRowVictories(board) || Checker.checkDiagonalVictories(board);

        }

    }
    
}