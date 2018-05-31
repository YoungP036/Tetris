package com.fury.tetris.models.pieces;

import java.awt.Color;

import com.fury.tetris.models.GameBoard;
import com.fury.tetris.models.Square;

/*
 * Abstract base class that will be extended by all game pieces
 * Using abstract class instead of interface 
 */
public abstract class Piece implements GamePiece {

    protected Square[][] pieceGrid;// all pieces exist in a [4][4] box containing 16 squares
    
    private int orientation;
    private int xCord;//x and y cords map top left square of pieceGrid to the gameBoard space
    private int yCord;
    private Color color;
    private String name;

    public Piece(int boardRows, int boardCols) {
        pieceGrid = new Square[4][4];
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
                pieceGrid[i][j]=new Square();
        orientation = 0;
        xCord = boardRows/2;
        yCord = boardCols-1;
    }

    public boolean isColliding(GameBoard board, GamePiece piece) {

        return false;
    }

    public void rotateCounterClockwise() {
        // check for collisions
        // rotate piece 90 degrees left
    }

    public void rotateClockwise() {
        // check for collisions
        // rotate piece 90 degrees right
    }

    public void shiftLeft() {
        // check for collisions
        // shift piece left one grid unit
    }

    public void shiftRight() {
        // check for collisions
        // shift piece right one grid unit
    }

    public void shiftDown() {
        // check for collisions
        // shift piece down one grid unit
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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

//    public void setxCord(int xCord) {
//        this.xCord = xCord;
//    }

    public int getyCord() {
        return yCord;
    }

//    public void setyCord(int yCord) {
//        this.yCord = yCord;
//    }

}
