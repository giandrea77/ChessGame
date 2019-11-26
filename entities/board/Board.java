package entities.board;

import entities.piece.Piece;

public class Board {

    private Piece[][] gameBoard;

    public Board() {
        gameBoard = new Piece[8][8];
    }

    /**
     * Check if a cell is free
     * @param cell
     * @return
     */
    public boolean isFreeAt(int x, int y) {
        return gameBoard[x][y] == null;
    }

    /**
     * Remove a piece from position
     * @param cell
     */
    public void removePieceAt(Cell cell) {
        gameBoard[cell.getRow()][cell.getColumn()] = null;
    }

    /**
     * Check if the piece in the @Cell position has correct owner
     * @param cell
     * @param owner
     * @return
     */
    public boolean isOwned(Cell cell, String owner) {
        if ( getPieceAt(cell).getOwner().equals(owner) ) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 
     * @param cell
     * @return
     */
    public Piece getPieceAt(Cell cell) {
        Piece piece = gameBoard[cell.getRow()][cell.getColumn()];
        return piece;
    }

    public void setPiece(Piece piece) {
        gameBoard[piece.getCurrentPosition().getRow()][piece.getCurrentPosition().getColumn()] = piece;
    }

    /**
     * 
     * @param newPiece
     * @param cell
     */
    public void setPieceAt(Piece piece, Cell cell) {
        gameBoard[cell.getRow()][cell.getColumn()] = piece;
    }

    public boolean isBoundRespected(Cell cell) {

        if ( cell.getRow() >=0 && cell.getRow() < 8 && cell.getColumn() >= 0 && cell.getColumn() < 8 ) {
            return true;
        } 

        return false;

    }

    public void initialize() {



    }

    @Override
    public String toString() {
        String s = "  0 1 2 3 4 5 6 7\n";
        for (int row = 0; row < 8; row++) {
            s += row;
            for (int col = 0; col < 8; col++) {
                if (gameBoard[row][col] != null) {
                    s += " " + gameBoard[row][col].getLabel();
                } else {
                    s += " -";
                }
            }
            s += "\n";
        }
        return s;
    }

}