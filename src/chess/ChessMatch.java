package chess;

import boardgame.Board;

public class ChessMatch {
	
	private Board board;
	final int boardRows = 8;
	final int boardColumns = 8;
	
	public ChessMatch() {
		board = new Board(boardRows, boardColumns);
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[boardRows][boardColumns];
		for (int i = 0; i < boardRows; i++) {
			for(int j = 0; j < boardColumns; j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
}
