package boardgame;

public abstract class Piece {
	protected Poisition position;
	private Board board;
	public Piece(Board board) {
		
		this.board = board;
		this.position= null;
	}
	protected Board getBoar() {
		return board;
	}
	public abstract boolean[][]  possibleMoves();
	
	public boolean possibleMove(Poisition pasition) {
		return possibleMoves()[position.getRow()][position.getColumn()];
		
		
	}
	public boolean isThereAnyPossibleMove() {
	
	boolean[][] mat = possibleMoves();
	for (int i=0; i<mat.length; i++) {
		
		    for (int j=0; j<mat.length; j++) {
		    	if (mat[i][j]) {
		    		return  true;
		    	}
		    			  
		    
	}
	}
	return false;
	}
	
	
	
	
	

}
