package entities.piece;

import entities.board.Board;
import entities.board.Cell;

public class Pawn extends Piece {

    private boolean firstMove;

    public Pawn(String owner, char label, Cell initialPosition, int side) {
        super(owner, label, initialPosition, side);
        firstMove = true;
    }

    @Override
    public Board moveTo(Cell cell, Board currentBoard) {

        // Check if it is a valid move [inside boundaries]
        if ( !super.isValidMove(cell) ) {
            return null;
        }

        int distance = 0;
        if ( super.side == 1 ) {
            distance = cell.getRow() - super.currentPosition.getRow();
        } else {
            distance = super.currentPosition.getRow() - cell.getRow();
        }

        // Only during first move I can move more than one 
        if ( distance == 2 && firstMove == false ) {
            return null;
        }

        // If I am moving forward and space is free, I can proceed
        if ( super.getCurrentPosition().getColumn() == cell.getColumn() ) {

            if ( currentBoard.isFreeAt(cell.getRow(), cell.getColumn()) == true )  {
                firstMove = false;
                return super.moveTo(cell, currentBoard);
            }

        } else {
            
            if ( distance == 1 && currentBoard.isFreeAt(cell.getRow(), cell.getColumn()) == false ) {
                firstMove = false;
                return super.moveTo(cell, currentBoard);
            }
        }

        // All other possibility does not work
        return null;

    }

}