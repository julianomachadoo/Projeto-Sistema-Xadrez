package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;	// Por padrão o java coloca o valor como nulo
	}

	protected Board getBoard() {
		return board;
	}
}
