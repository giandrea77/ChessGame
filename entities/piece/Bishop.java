package entities.piece;

import entities.board.Board;
import entities.board.Cell;

public class Bishop extends Piece {

    public Bishop(String owner, char label, Cell initialPosition, int side) {
        super(owner, label, initialPosition, side);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Board moveTo(Cell newPosition, Board currentBoard) {
        
        int pathLenght = Math.abs(newPosition.getRow() - super.getCurrentPosition().getRow());

        // if two points are diagonally aligned I can move bishop
        if ( pathLenght == Math.abs(newPosition.getColumn() - super.getCurrentPosition().getColumn()) ) {

            if ( isFreePath(pathLenght, newPosition, currentBoard) ) {
                super.moveTo(newPosition, currentBoard);
            } else {
                return null;
            }

        } else {
            return null;
        }

        return null;

    }

    /**
     * Check if Bishop (diagonal only) path to final position does not have 
     * @param pathLenght
     * @param cell
     * @param currentBoard
     * @return
     */
    private boolean isFreePath(int pathLenght, Cell cell, Board currentBoard) {

        boolean canEat = false;

        // If my target position is busy and the object is not my I could eat (of course if the path is free)
        if ( !currentBoard.isFreeAt(cell.getRow(),cell.getColumn()) && !super.owner.equals(currentBoard.getPieceAt(cell).owner)) {
            canEat = true;
        }

        int verticalDirection = cell.getRow() - super.getCurrentPosition().getRow();
        int orizontalDirection = cell.getColumn() - super.getCurrentPosition().getColumn();

        int x = super.currentPosition.getRow();
        int y = super.currentPosition.getColumn();

        do {
            
            x = (verticalDirection < 0 ? x - 1 : x + 1); 
            y = (orizontalDirection < 0 ? y - 1 : y + 1);

            if ( currentBoard.isFreeAt(x,y) ) {
                continue;
            } else { 

                // If I can eat and final destination is occupied, I can replace the piece                
                if ( x == cell.getRow() && y == cell.getColumn() && canEat ) {
                    return true;
                } 

                return false;
            }

        } while (x != cell.getRow() && y != cell.getColumn());

        return true;

    }

}