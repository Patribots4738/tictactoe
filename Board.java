public class Board {

	// index 0 is top row, 1 is middle row, 2 is bottom row
	String[][] board;
	boolean turn;

	public Board() {
		this.board = new String[3][3];
		// initalizes the board with 9 spaces
		for (int i = 0; i < this.board.length; i++) {
			for (int j = 0; j < this.board[i].length; j++) {
				this.board[i][j] = " ";
			}
		}
		this.turn = false;  
	}

	public void makeMove(int x, int y) {
		// checks to make sure the move is in range
		if (x <= 2 || x >= 0 || y <= 2 || y >= 0) {
			// checks to make sure the space isn't already occupied
			if (board[x][y] != " ") {
				System.out.println("Invalid move; try again!");
				return;
			}
		} else {
			System.out.println("Invalid move; try again!");
			return;
		}

		board[x][y] = this.whoseTurn();
		// switches the turn to the opposite player
		this.turn = !this.turn;
	}

	public String getSpace(int x, int y) {
		return board[x][y];
	}

	public String whoseTurn() {
		return this.turn ? "O" : "X";
	}
	// returns null if there is no winner, and X or O if there is a winner
	public String getWinner() {
		String[][] board = this.board;
		for (int i = 0; i < board.length; i++) {
			String[] row = board[i];
			// checks if row i is 3 of the same character in a row that is not a space
			if (checkEquals(row[0], row[1], row[2])) {
				return row[0];
			}
			// checks if column i is 3 of the same character in a row that is not a space
			if (checkEquals(board[0][i], board[1][i], board[2][i])) {
				return board[0][i];
			}
		}
		// checks diagonals for equality
		if (checkEquals(board[0][0], board[1][1], board[2][2])) {
			return board[0][0];
		}
		// other diagonal check
		if (checkEquals(board[0][2], board[1][1], board[2][0])) {
			return board[0][2];
		}
		return null;
	}
	// checks if 3 strings are equal and not a space
	private boolean checkEquals(String s1, String s2, String s3) {
		return s1 == s2 && s2 == s3 && s1 != " ";
	}
	public String toString() {
		String board = "";
		for (int i = 0; i < this.board.length; i++) {
			for (int j = 0; j < this.board[i].length; j++) {
				board += this.board[i][j] + (j == 2 ? "" : " | ");
			}
			board += (i == 2) ? "" : "\n----------\n";
		}
		return board;
	}
}