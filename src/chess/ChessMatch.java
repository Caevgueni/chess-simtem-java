package chess;



import boardgame.Board;
import boardgame.Poisition;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	private Board board;

public ChessMatch() {
	board = new Board(8, 8);
	initialSetup();
}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {

			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Poisition(2,1));
		board.placePiece(new King(board, Color.BLACK), new Poisition(0, 4));
		board.placePiece(new King(board, Color.WHITE), new Poisition(7, 4));
		
	}

}