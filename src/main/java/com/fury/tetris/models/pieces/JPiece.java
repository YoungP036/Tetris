package com.fury.tetris.models.pieces;

import java.awt.Color;

public class JPiece extends Piece {

    public JPiece(int boardRows, int boardCols) {
        super(boardRows, boardCols);
        this.pieceGrid[0][0].setColor(Color.BLUE);
        this.pieceGrid[0][1].setColor(Color.BLUE);
        this.pieceGrid[0][2].setColor(Color.BLUE);
        this.pieceGrid[1][2].setColor(Color.BLUE);
        this.setColor(Color.BLUE);
        this.setName("J");
    }
}
