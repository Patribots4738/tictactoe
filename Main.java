import java.util.Scanner;

public class Main {

    public static void main(String... args) {
    
        Board board = new Board();
        Scanner input = new Scanner(System.in);

        // while there is no winner, loop forever
        while (board.getWinner() == null) {
            System.out.println("\n" + board.toString() + "\n");
            System.out.println("Please make your move " + board.whoseTurn() + " (row, col)\n");
            int[] move = stringToInt(input.nextLine());
            if (move == null) {
                System.out.println("Invalid move; try again!");
                continue;
            }
            board.makeMove(move[0], move[1]);
        }
        System.out.println(board.toString());
        System.out.println(board.getWinner() + " wins!");
        
        input.close();
    }
    
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