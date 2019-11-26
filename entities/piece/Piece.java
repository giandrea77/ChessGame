package entities.piece;

import entities.board.Board;
import entities.board.Cell;

public abstract class Piece implements IPiece {

    protected String owner;

    protected char label;

    protected Cell currentPosition;

    protected int side;

    public Piece(String owner, char label, Cell initialPosition, int side) {
        this.currentPosition = initialPosition;
        this.owner = owner;
        this.label = label;
        this.side = side;
    }


    /**
     * // Actual move - all checks are stored on specific piece move
     */
    @Override
    public Board moveTo(Cell cell, Board currentBoard) {      
        currentBoard.removePieceAt(currentPosition);  
        currentBoard.setPieceAt(this, cell);     
        currentPosition = cell;   
        return currentBoard;       
    }

    public boolean isValidMove(Cell cell) {
        return cell.getRow() >= 0 && cell.getRow() < 8 && cell.getColumn() >= 0 && cell.getColumn() < 8;
    }

    /**
     * @return the owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * @return the label
     */
    public char getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(char label) {
        this.label = label;
    }

    /**
     * @return the currentPosition
     */
    public Cell getCurrentPosition() {
        return currentPosition;
    }

    /**
     * @param currentPosition the currentPosition to set
     */
    public void setCurrentPosition(Cell currentPosition) {
        this.currentPosition = currentPosition;
    }

    /**
     * @return the side
     */
    public int getSide() {
        return side;
    }

    /**
     * @param side the side to set
     */
    public void setSide(int side) {
        this.side = side;
    }

}