package main.entities.piece;

import main.consts.PieceColor;
import main.consts.PieceName;
import main.strategy.move.MoveStrategy;
import main.strategy.validation.ValidationStrategy;

public class Queen extends Piece{

    public Queen(PieceColor pieceColor, PieceName pieceName, MoveStrategy moveStrategy, ValidationStrategy
            validationStrategy) {
        super(pieceColor, pieceName, moveStrategy, validationStrategy);
    }

    @Override
    public void makeMove() {
        validationStrategy.validateMove();
        moveStrategy.move();
    }
}
