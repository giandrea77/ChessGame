package entities.piece;

import entities.board.Board;
import entities.board.Cell;

public class Queen extends Piece {

    public Queen(String owner, char label, Cell initialPosition, int side) {
        super(owner, label, initialPosition, side);

    }

    @Override
    public Board moveTo(Cell cell, Board currentBoard) {
        // TODO Auto-generated method stub
        return super.moveTo(cell, currentBoard);
    }




}