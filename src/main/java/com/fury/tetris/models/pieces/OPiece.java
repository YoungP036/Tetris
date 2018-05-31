package com.fury.tetris.models.pieces;

import java.awt.Color;

public class OPiece extends Piece {

    public OPiece(int boardRows, int boardCols) {
        super(boardRows, boardCols);
        this.pieceGrid[0][0].setColor(Color.YELLOW);
        this.pieceGrid[0][1].setColor(Color.YELLOW);
        this.pieceGrid[1][0].setColor(Color.YELLOW);
        this.pieceGrid[1][1].setColor(Color.YELLOW);
        this.setName("O");
        this.setColor(Color.YELLOW);
    }

}
