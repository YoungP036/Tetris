package com.fury.tetris.models.pieces;

import java.awt.Color;

public class LPiece extends Piece{

    public LPiece(int boardRows, int boardCols) {
        super(boardRows, boardCols);
        this.pieceGrid[0][0].setColor(Color.ORANGE);
        this.pieceGrid[0][1].setColor(Color.ORANGE);
        this.pieceGrid[0][2].setColor(Color.ORANGE);
        this.pieceGrid[1][0].setColor(Color.ORANGE);
        this.setName("L");
        this.setColor(Color.ORANGE);        
    }
}
