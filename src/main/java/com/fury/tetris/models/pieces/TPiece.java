package com.fury.tetris.models.pieces;

import java.awt.Color;

public class TPiece extends Piece{

    public TPiece(int boardRows, int boardCols) {
        super(boardRows, boardCols);
        this.pieceGrid[0][0].setColor(Color.MAGENTA);
        this.pieceGrid[0][1].setColor(Color.MAGENTA);
        this.pieceGrid[0][2].setColor(Color.MAGENTA);
        this.pieceGrid[1][1].setColor(Color.MAGENTA);
        this.setName("T");
        this.setColor(Color.MAGENTA);
    }

}
