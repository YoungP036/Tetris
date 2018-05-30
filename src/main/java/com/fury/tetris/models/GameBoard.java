package com.fury.tetris.models;

import java.awt.Rectangle;

import com.fury.tetris.models.pieces.GamePiece;

public class GameBoard {
    boolean[][] boardState;
    Rectangle[][] boardGrid;//redundant?
    GamePiece currPiece;
    
    public GameBoard() {
        boardState = new boolean[20][10];
        boardGrid = new Rectangle[20][10];
        currPiece=null;
    }
    
    public boolean isCollision(GamePiece piece) {
     
        return false;
    }
    
    //returns int in range [0,4] depending on number of completed rows
    public int checkCompleteRows() {
        //iterate boardState to see if any rows are complete, if so remove
        
        return 0;
    }
    
    public void removeRow(int row) {
        //clear row in boardState/boardGrid
    }
    
    public void compactRows() {
        //compact remaining rows downwards after removeRow
    }
    
    public void startGame() {
        //begins the game loop
    }
    
    public void releaseNextPiece() {
        //release next piece or random type
    }
    
    public void mergePiece(GamePiece piece) {
        //once piece is not moving, merge it into boardState and boardGrid
    }    
    

    public boolean[][] getBoardState() {
        return boardState;
    }

    public void setBoardState(boolean[][] boardState) {
        this.boardState = boardState;
    }

    public Rectangle[][] getBoardGrid() {
        return boardGrid;
    }

    public void setBoardGrid(Rectangle[][] boardGrid) {
        this.boardGrid = boardGrid;
    }

    public GamePiece getCurrPiece() {
        return currPiece;
    }

    public void setCurrPiece(GamePiece currPiece) {
        this.currPiece = currPiece;
    }
    
    
}
