package main.boardgame;

import main.BoardGames;
import main.consts.PieceColor;
import main.entities.ChessBoard;
import main.entities.Player;
import main.strategy.player.impl.HumanPlayerStrategy;

import java.util.Deque;
import java.util.LinkedList;

public class ChessGame implements BoardGames {

    private final ChessBoard chessBoard;

    private String winner;

    private final Deque<Player> players;

    public ChessGame() {
        chessBoard = ChessBoard.getChessBoardInstance(8);
        players = new LinkedList<>();
        Player blackPlayer = new Player("Alex", PieceColor.BLACK, new HumanPlayerStrategy());
        Player whitePlayer = new Player("Michael", PieceColor.WHITE, new HumanPlayerStrategy());
    }

    @Override
    public void playGame() {

    }

    @Override
    public void announceWinner() {

    }
}
