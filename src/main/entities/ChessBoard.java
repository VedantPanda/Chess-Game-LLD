package main.entities;

import main.entities.piece.Piece;

public class ChessBoard {

    private final Piece[][] chessBoard;

    private final int size;

    private static volatile ChessBoard chessBoardInstance;

    private ChessBoard(int size) {
        this.size = size;
        chessBoard = new Piece[size][size];
        initializeChessBoard();
    }

    public static ChessBoard getChessBoardInstance(int size) {
        if(chessBoardInstance==null) {
            synchronized (ChessBoard.class) {
                if(chessBoardInstance==null) {
                    chessBoardInstance = new ChessBoard(size);
                }
            }
        }
        return chessBoardInstance;
    }

    private void initializeChessBoard() {

    }

    public boolean isGameOver() {
        return false;
    }

    public boolean isGameTied(){
        return false;
    }

    public void displayChessBoard(){
        for(Piece[] pieces : chessBoard){
            for(Piece piece : pieces){
                if(piece!=null){
                    System.out.print(piece+" ");
                }
                else{
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }

    public void makeMove(int row, int col, Piece piece){
        chessBoard[row][col] = piece;
    }

}
