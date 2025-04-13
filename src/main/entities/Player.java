package main.entities;

import main.consts.PieceColor;
import main.strategy.player.PlayerStrategy;

public class Player {

    private final String name;

    private final PieceColor pieceColor;

    private final PlayerStrategy playerStrategy;

    public Player(String name, PieceColor pieceColor, PlayerStrategy playerStrategy) {
        this.name = name;
        this.pieceColor = pieceColor;
        this.playerStrategy = playerStrategy;
    }

    public String getName() {
        return name;
    }

    public PieceColor getPieceColor() {
        return pieceColor;
    }

    public PlayerStrategy getPlayerStrategy() {
        return playerStrategy;
    }
}
