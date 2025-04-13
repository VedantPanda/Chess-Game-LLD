package main.entities.piece;

import main.consts.PieceColor;
import main.consts.PieceName;
import main.strategy.move.MoveStrategy;
import main.strategy.validation.ValidationStrategy;

public abstract class Piece {

    protected PieceColor pieceColor;

    protected PieceName pieceName;

    protected MoveStrategy moveStrategy;

    protected ValidationStrategy validationStrategy;

    public Piece(PieceColor pieceColor, PieceName pieceName, MoveStrategy moveStrategy, ValidationStrategy
            validationStrategy) {
        this.pieceColor = pieceColor;
        this.pieceName = pieceName;
        this.moveStrategy = moveStrategy;
        this.validationStrategy = validationStrategy;
    }

    public PieceColor getPieceColor() {
        return pieceColor;
    }

    public PieceName getPieceName() {
        return pieceName;
    }

    public abstract void makeMove();

}
