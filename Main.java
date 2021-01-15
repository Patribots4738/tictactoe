import java.util.Scanner;

public class Main {

    public static void main(String... args) {
    
        // initialize the board and scanner
        Board board = new Board();

        Scanner input = new Scanner(System.in);

        // while there is no winner, loop forever
        while (board.getWinner() == null && !board.isGameOver()) {

            System.out.println("\n" + board.toString() + "\n");
            System.out.println("Please make your move " + board.whoseTurn() + " (row, col)\n");
            
            // receive next move from the player whose turn it is
            int[] move = stringToInt(input.nextLine());

            // if the move isn't valid, continue to the next loop without making the move
            if (move == null) {

                System.out.println("Invalid move; try again!");

                continue;

            }

            // make the actual move
            board.makeMove(move[0], move[1]);

        }

        // print the board's winner screen
        System.out.println("\n" + board.toString() + "\n");
        System.out.println((board.getWinner() != null ? board.getWinner() : "Nobody") + " wins!");
        
        input.close();

    }
    
    // convert a string formatted like "int,int" where the ints are numbers as an integer array
    private static int[] stringToInt(String str) {

        try {

            String[] split = str.split(",");

            int[] move = {Integer.parseInt(split[0]), Integer.parseInt(split[1])};
            
            return move;

        } catch(Exception e) {

            return null;

        }

    }

}