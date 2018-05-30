package com.fury.tetris.models.pieces;

public interface GamePiece {
    public void rotateLeft();
    public void rotateRight();
    public void shiftLeft();
    public void shiftRight();
    public void shiftDown();
}
