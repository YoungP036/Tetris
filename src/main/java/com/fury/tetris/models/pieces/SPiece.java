package com.fury.tetris.models.pieces;

import java.awt.Color;

public class SPiece extends Piece {

    public SPiece(int boardRows, int boardCols) {
        super(boardRows, boardCols);
        this.pieceGrid[0][1].setColor(Color.GREEN);
        this.pieceGrid[0][2].setColor(Color.GREEN);
        this.pieceGrid[1][0].setColor(Color.GREEN);
        this.pieceGrid[1][1].setColor(Color.GREEN);
        this.setName("S");
        this.setColor(Color.GREEN);
    }

}
