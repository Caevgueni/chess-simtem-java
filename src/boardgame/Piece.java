package boardgame;

public class Piece {
	protected Poisition position;
	private Board board;
	public Piece(Board board) {
		
		this.board = board;
		this.position= null;
	}
	protected Board getBoar() {
		return board;
	}
	
	
	
	
	

}
