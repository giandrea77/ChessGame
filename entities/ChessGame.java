package entities;

import entities.board.Board;
import entities.board.Cell;
import entities.piece.Bishop;
import entities.piece.King;
import entities.piece.Knight;
import entities.piece.Pawn;
import entities.piece.Queen;
import entities.piece.Rock;

public class ChessGame {

    private Board board;

    public ChessGame() {
        board = new Board();
    }

    public void initialize(String player1, String player2) {

        {
            // Player 1
            board.setPiece(new King(player1, 'K', new Cell(0, 3), 1));
            board.setPiece(new Queen(player1, 'Q', new Cell(0, 4), 1));
            board.setPiece(new Bishop(player1, 'B', new Cell(0, 2), 1));
            board.setPiece(new Bishop(player1, 'B', new Cell(0, 5), 1));
            board.setPiece(new Knight(player1, 'N', new Cell(0, 1), 1));
            board.setPiece(new Knight(player1, 'N', new Cell(0, 6), 1));
            board.setPiece(new Rock(player1, 'R', new Cell(0, 0), 1));
            board.setPiece(new Rock(player1, 'R', new Cell(0, 7), 1));

            board.setPiece(new Pawn(player1, 'P', new Cell(1, 0), 1));
            board.setPiece(new Pawn(player1, 'P', new Cell(1, 1), 1));
            board.setPiece(new Pawn(player1, 'P', new Cell(1, 2), 1));
            board.setPiece(new Pawn(player1, 'P', new Cell(1, 3), 1));
            board.setPiece(new Pawn(player1, 'P', new Cell(1, 4), 1));
            board.setPiece(new Pawn(player1, 'P', new Cell(1, 5), 1));
            board.setPiece(new Pawn(player1, 'P', new Cell(1, 6), 1));
            board.setPiece(new Pawn(player1, 'P', new Cell(1, 7), 1));  

        }

        {
            // Player 2
            board.setPiece(new King(player2, 'k', new Cell(7, 4), -1));
            board.setPiece(new Queen(player2, 'q', new Cell(7, 3), -1));
            board.setPiece(new Bishop(player2, 'b', new Cell(7, 2), -1));
            board.setPiece(new Bishop(player2, 'b', new Cell(7, 5), -1));
            board.setPiece(new Knight(player2, 'n', new Cell(7, 1), -1));
            board.setPiece(new Knight(player2, 'n', new Cell(7, 6), -1));
            board.setPiece(new Rock(player2, 'r', new Cell(7, 0), -1));
            board.setPiece(new Rock(player2, 'r', new Cell(7, 7), -1));

            board.setPiece(new Pawn(player2, 'p', new Cell(6, 0), -1));
            board.setPiece(new Pawn(player2, 'p', new Cell(6, 1), -1));
            board.setPiece(new Pawn(player2, 'p', new Cell(6, 2), -1));
            board.setPiece(new Pawn(player2, 'p', new Cell(6, 3), -1));
            board.setPiece(new Pawn(player2, 'p', new Cell(6, 4), -1));
            board.setPiece(new Pawn(player2, 'p', new Cell(6, 5), -1));
            board.setPiece(new Pawn(player2, 'p', new Cell(6, 6), -1));
            board.setPiece(new Pawn(player2, 'p', new Cell(6, 7), -1));   
        }

    }

    /**
     * @return the board
     */
    public Board getBoard() {
        return board;
    }

    /**
     * @param board the board to set
     */
    public void setBoard(Board board) {
        this.board = board;
    }

}