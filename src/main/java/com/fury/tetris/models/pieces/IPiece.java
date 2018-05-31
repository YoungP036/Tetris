package com.fury.tetris.models.pieces;

import java.awt.Color;

public class IPiece extends Piece {

    public IPiece(int boardRows, int boardCols) {
        super(boardRows, boardCols);
        this.pieceGrid[0][0].setColor(Color.CYAN);
        this.pieceGrid[0][1].setColor(Color.CYAN);
        this.pieceGrid[0][2].setColor(Color.CYAN);
        this.pieceGrid[0][3].setColor(Color.CYAN);
        this.setName("I");
        this.setColor(Color.CYAN);
    }
}
