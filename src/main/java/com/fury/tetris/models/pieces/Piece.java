package com.fury.tetris.models.pieces;

import com.fury.tetris.models.Square;

/*
 * Abstract base class that will be extended by all game pieces
 * Using abstract class instead of interface 
 */
public abstract class Piece implements GamePiece {

    protected Square[][] pieceGrid;// all pieces exist in a [4][4] box containing 16 squares, some will be empty, others not
    private int orientation;
    private int xCord;
    private int yCord;

    public Piece() {
        pieceGrid = new Square[4][4];
        orientation = 0;
        xCord = 0;
        yCord = 0;
    }

    public void rotateLeft() {
        //check for collisions
        //rotate piece 90 degrees left
    }

    public void rotateRight() {
        //check for collisions
        //rotate piece 90 degrees right
    }

    public void shiftLeft() {
        //check for collisions
        //shift piece left one grid unit
    }

    public void shiftRight() {
        //check for collisions
        //shift piece right one grid unit
    }

    public void shiftDown() {
        //check for collisions
        //shift piece down one grid unit
    }

    public Square[][] getPieceGrid() {
        return pieceGrid;
    }

    public void setPieceGrid(Square[][] pieceGrid) {
        this.pieceGrid = pieceGrid;
    }

    public int getOrientation() {
        return orientation;
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }

    public int getxCord() {
        return xCord;
    }

    public void setxCord(int xCord) {
        this.xCord = xCord;
    }

    public int getyCord() {
        return yCord;
    }

    public void setyCord(int yCord) {
        this.yCord = yCord;
    }

}
