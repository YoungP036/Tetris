package com.fury.tetris.models.pieces;

import com.fury.tetris.models.GameBoard;

public interface GamePiece {
    public void rotateCounterClockwise();

    public void rotateClockwise();

    public void shiftLeft();

    public void shiftRight();

    public void shiftDown();

    public boolean isColliding(GameBoard board, GamePiece piece);
}
