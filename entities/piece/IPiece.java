package entities.piece;

import entities.board.Board;
import entities.board.Cell;

public interface IPiece {

    Board moveTo(Cell cell, Board currentBoard);

}