import java.util.Scanner;

import entities.ChessGame;
import entities.board.Cell;

public class Startup {

    public static void main(String[] args) {
        
        ChessGame chessGame = new ChessGame();
        chessGame.initialize("Andrea", "CPU");

        boolean stillPlaying = true;
        String currentPlayer = "CPU";

        Scanner scanner = new Scanner(System.in);
        String input;

        while (stillPlaying) {

            System.out.println(chessGame.getBoard().toString());

            System.out.println(currentPlayer + "'s Turn:");
            System.out.println("M - Enter next move");
            System.out.println("Q - Quit game");
            input = scanner.nextLine();

            if ( input.equalsIgnoreCase("Q") ) {
                stillPlaying = false;
                System.out.println(" #### GAME ABANDONED #### ");
                continue;
            } else if ( input.equalsIgnoreCase("M") ) {

                boolean moveIsCorrect = false;
                do { 
                    System.out.print("Current row [0-7]: ");
                    int currentRow = Integer.valueOf(scanner.nextLine());

                    System.out.print("Current column [0-7]: ");
                    int currentColumn = Integer.valueOf(scanner.nextLine());

                    System.out.print("New row [0-7]: ");
                    int newRow = Integer.valueOf(scanner.nextLine());

                    System.out.print("New column [0-7]: ");
                    int newColumn = Integer.valueOf(scanner.nextLine());
                    
                    if ( chessGame.getBoard().getPieceAt(new Cell(currentRow, currentColumn)) != null || chessGame.getBoard().isOwned(new Cell(currentRow, currentColumn), currentPlayer)) {

                        if ( chessGame.getBoard().getPieceAt(new Cell(currentRow, currentColumn)).moveTo(new Cell(newRow,newColumn), chessGame.getBoard()) == null ) {
                            System.out.println("You are not moving the rigth pieace - try again");
                            moveIsCorrect = false;
                        } else {
                            moveIsCorrect = true;
                        }


                    } else {
                        moveIsCorrect = false;
                        System.out.println("You are not moving the rigth pieace - try again");

                    }

                } while (!moveIsCorrect);
                
 
            }

            currentPlayer = currentPlayer.equals("CPU") ? "Andrea" : "CPU";

        }

    }

    // public static void main(String[] args) {

    //     ChessGame chessGame = new ChessGame();
    //     chessGame.initialize("Andrea", "CPU");
    //     chessGame.getBoard().getPieceAt(new Cell(6,3)).moveTo(new Cell(4,3), chessGame.getBoard());
    //     System.out.println(chessGame.getBoard().toString());

    //     chessGame.getBoard().getPieceAt(new Cell(1,2)).moveTo(new Cell(3,2), chessGame.getBoard());
    //     System.out.println(chessGame.getBoard().toString());

    //     chessGame.getBoard().getPieceAt(new Cell(7,2)).moveTo(new Cell(5,4), chessGame.getBoard());
    //     System.out.println(chessGame.getBoard().toString());

    // }

}