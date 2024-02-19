package boardgame;

public class Piece {
	protected Poisition position;
	private Board boar;
	public Piece(Board boar) {
		
		this.boar = boar;
		this.position= null;
	}
	protected Board getBoar() {
		return boar;
	}
	
	
	
	
	

}
