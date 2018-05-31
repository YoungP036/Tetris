package com.fury.tetris.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fury.tetris.models.GameBoard;
import com.fury.tetris.models.Square;
import com.fury.tetris.models.pieces.IPiece;
import com.fury.tetris.models.pieces.Piece;

class PieceTest {
    GameBoard board;
    int numRows, numCols, oldxCord, oldyCord;
    Square[][] pieceGrid;
    Piece iPiece;

    @BeforeEach
    void setUp() throws Exception {
        board = new GameBoard();
        iPiece = new IPiece(board.getNumRows(),board.getNumCols());
        numRows = board.getNumRows();
        numCols = board.getNumCols();
        oldxCord = iPiece.getxCord();
        oldyCord = iPiece.getyCord();
    }

    @Test
    void testRotateCounterClockwise() {

        pieceGrid = iPiece.getPieceGrid();// top
        assertEquals(pieceGrid[0][0].getColor(), Color.CYAN);
        assertEquals(pieceGrid[0][1].getColor(), Color.CYAN);
        assertEquals(pieceGrid[0][2].getColor(), Color.CYAN);
        assertEquals(pieceGrid[0][3].getColor(), Color.CYAN);

        iPiece.rotateCounterClockwise();// left
        assertEquals(pieceGrid[0][0].getColor(), Color.CYAN);
        assertEquals(pieceGrid[1][0].getColor(), Color.CYAN);
        assertEquals(pieceGrid[2][0].getColor(), Color.CYAN);
        assertEquals(pieceGrid[3][0].getColor(), Color.CYAN);

        assertEquals(pieceGrid[0][1].getColor(), Color.LIGHT_GRAY);
        assertEquals(pieceGrid[0][2].getColor(), Color.LIGHT_GRAY);
        assertEquals(pieceGrid[0][3].getColor(), Color.LIGHT_GRAY);

        iPiece.rotateCounterClockwise();// bottom
        assertEquals(pieceGrid[3][0].getColor(), Color.CYAN);
        assertEquals(pieceGrid[3][1].getColor(), Color.CYAN);
        assertEquals(pieceGrid[3][2].getColor(), Color.CYAN);
        assertEquals(pieceGrid[3][3].getColor(), Color.CYAN);

        assertEquals(pieceGrid[1][0].getColor(), Color.LIGHT_GRAY);
        assertEquals(pieceGrid[2][0].getColor(), Color.LIGHT_GRAY);
        assertEquals(pieceGrid[3][0].getColor(), Color.LIGHT_GRAY);

        iPiece.rotateCounterClockwise();// right
        assertEquals(pieceGrid[0][3].getColor(), Color.CYAN);
        assertEquals(pieceGrid[1][3].getColor(), Color.CYAN);
        assertEquals(pieceGrid[2][3].getColor(), Color.CYAN);
        assertEquals(pieceGrid[3][3].getColor(), Color.CYAN);

        assertEquals(pieceGrid[3][0].getColor(), Color.LIGHT_GRAY);
        assertEquals(pieceGrid[3][1].getColor(), Color.LIGHT_GRAY);
        assertEquals(pieceGrid[3][2].getColor(), Color.LIGHT_GRAY);

    }

    @Test
    void testRotateClockwise() {

        pieceGrid = iPiece.getPieceGrid();// top
        assertEquals(pieceGrid[0][0].getColor(), Color.CYAN);
        assertEquals(pieceGrid[0][1].getColor(), Color.CYAN);
        assertEquals(pieceGrid[0][2].getColor(), Color.CYAN);
        assertEquals(pieceGrid[0][3].getColor(), Color.CYAN);

        iPiece.rotateCounterClockwise();// right
        assertEquals(pieceGrid[0][3].getColor(), Color.CYAN);
        assertEquals(pieceGrid[1][3].getColor(), Color.CYAN);
        assertEquals(pieceGrid[2][3].getColor(), Color.CYAN);
        assertEquals(pieceGrid[3][3].getColor(), Color.CYAN);

        assertEquals(pieceGrid[3][0].getColor(), Color.LIGHT_GRAY);
        assertEquals(pieceGrid[3][1].getColor(), Color.LIGHT_GRAY);
        assertEquals(pieceGrid[3][2].getColor(), Color.LIGHT_GRAY);

        iPiece.rotateCounterClockwise();// bottom
        assertEquals(pieceGrid[3][0].getColor(), Color.CYAN);
        assertEquals(pieceGrid[3][1].getColor(), Color.CYAN);
        assertEquals(pieceGrid[3][2].getColor(), Color.CYAN);
        assertEquals(pieceGrid[3][3].getColor(), Color.CYAN);

        assertEquals(pieceGrid[1][0].getColor(), Color.LIGHT_GRAY);
        assertEquals(pieceGrid[2][0].getColor(), Color.LIGHT_GRAY);
        assertEquals(pieceGrid[3][0].getColor(), Color.LIGHT_GRAY);

        iPiece.rotateCounterClockwise();// left
        assertEquals(pieceGrid[0][0].getColor(), Color.CYAN);
        assertEquals(pieceGrid[1][0].getColor(), Color.CYAN);
        assertEquals(pieceGrid[2][0].getColor(), Color.CYAN);
        assertEquals(pieceGrid[3][0].getColor(), Color.CYAN);

        assertEquals(pieceGrid[0][1].getColor(), Color.LIGHT_GRAY);
        assertEquals(pieceGrid[0][2].getColor(), Color.LIGHT_GRAY);
        assertEquals(pieceGrid[0][3].getColor(), Color.LIGHT_GRAY);
    }

    @Test
    void testShiftLeft() {

        iPiece.shiftLeft();

        assertEquals(iPiece.getxCord(), oldxCord - 1);
        assertEquals(iPiece.getyCord(), oldyCord);
    }

    @Test
    void testShiftRight() {
        iPiece.shiftRight();

        assertEquals(iPiece.getxCord(), oldxCord + 1);
        assertEquals(iPiece.getyCord(), oldyCord);

    }

    @Test
    void testShiftDown() {
        iPiece.shiftRight();

        assertEquals(iPiece.getxCord(), oldxCord);
        assertEquals(iPiece.getyCord(), oldyCord-1);

    }
}
