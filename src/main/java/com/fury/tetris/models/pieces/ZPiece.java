package com.fury.tetris.models.pieces;

import java.awt.Color;

public class ZPiece extends Piece{

    public ZPiece(int boardRows, int boardCols) {
        super(boardRows, boardCols);
        this.pieceGrid[0][0].setColor(Color.RED);
        this.pieceGrid[0][1].setColor(Color.RED);
        this.pieceGrid[1][1].setColor(Color.RED);
        this.pieceGrid[1][2].setColor(Color.RED);
        this.setName("Z");
        this.setColor(Color.RED);
    }

}
