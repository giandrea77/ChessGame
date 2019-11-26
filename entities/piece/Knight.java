package entities.piece;

import entities.board.Board;
import entities.board.Cell;

public class Knight extends Piece {

    public Knight(String owner, char label, Cell initialPosition, int side) {
        super(owner, label, initialPosition, side);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Board moveTo(Cell cell, Board currentBoard) {
        // TODO Auto-generated method stub
        return super.moveTo(cell, currentBoard);
    }

    
}