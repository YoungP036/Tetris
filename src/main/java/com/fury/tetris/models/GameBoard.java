package com.fury.tetris.models;

import java.awt.Color;

import com.fury.tetris.models.pieces.GamePiece;

public class GameBoard {
    Square[][] boardState;
    GamePiece currPiece;
    int numRows = 24;
    int numCols = 10;

    public GameBoard(int numRows, int numCols) {
        this.numRows = numRows;
        this.numCols = numCols;
        currPiece = null;

        boardState = new Square[numRows][numCols];
        for(int i=0;i<this.numRows;i++)
            for(int j=0;j<this.numCols;j++)
                boardState[i][j]=new Square();
    }

    public GameBoard() {
        currPiece = null;

        boardState = new Square[this.numRows][this.numCols];
        
        for(int i=0;i<this.numRows;i++)
            for(int j=0;j<this.numCols;j++)
                boardState[i][j]=new Square();
    }

    public int getNumRows() {
        return numRows;
    }

    public int getNumCols() {
        return numCols;
    }

    public GamePiece getCurrPiece() {
        return currPiece;
    }

    public void setCurrPiece(GamePiece currPiece) {
        this.currPiece = currPiece;
    }

//    public Square[][] getBoardState() {
//        return this.boardState;
//    }

    public void clearRow(int row) {
        for (Square cell : this.boardState[row]) {
            cell.setColor(Color.LIGHT_GRAY);
        }
    }

    public void clearCell(int row, int col) {
        this.boardState[row][col].setColor(Color.LIGHT_GRAY);
    }

    public void setCellColor(Color color, int row, int col) {
        this.boardState[row][col].setColor(color);
    }

    public Color getCellColor(int row, int col) {
        Color color = boardState[row][col].getColor();
        return color;
    }

    public boolean isCellOccupied(int row, int col) {
        return !this.boardState[row][col].getColor().equals(Color.LIGHT_GRAY);
    }
}
