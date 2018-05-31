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
import com.fury.tetris.models.pieces.JPiece;
import com.fury.tetris.models.pieces.Piece;

class GameBoardTest {
    final int numRows = 24;
    final int numCols = 10;
    Color cellColor;
    Color[] colors = { Color.RED, Color.CYAN, Color.ORANGE, Color.BLUE, Color.GREEN, Color.YELLOW, Color.MAGENTA };
    GameBoard board;
    Square[][] boardState;

    @BeforeEach
    void setUp() throws Exception {

        board = new GameBoard(numRows, numCols);
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                board.setCellColor(colors[i % 7], i, j);
            }
        }
    }

    @Test
    void testSetColor() {
        board.setCellColor(Color.RED, 0, 0);
        cellColor = board.getCellColor(0, 0);
        assertEquals(Color.RED, cellColor);
    }

    @Test
    void testClearFirstRow() {

        board.clearRow(0);

        for (int col = 0; col < numCols; col++) {
            cellColor = board.getCellColor(0, col);
            assertEquals(Color.LIGHT_GRAY, cellColor);
        }
    }

    @Test
    void testClearLastRow() {

        board.clearRow(numRows - 1);

        for (int col = 0; col < numCols; col++) {
            cellColor = board.getCellColor(numRows - 1, col);
            assertEquals(Color.LIGHT_GRAY, cellColor);
        }
    }

    @Test
    void testClearMiddleRow() {

        board.clearRow(numRows / 2);

        for (int col = 0; col < numCols; col++) {
            cellColor = board.getCellColor(numRows / 2, col);
            assertEquals(Color.LIGHT_GRAY, cellColor);
        }
    }

    @Test
    void testClearFirstCell() {
        board.clearCell(0, 0);
        cellColor = board.getCellColor(0, 0);
        assertEquals(Color.LIGHT_GRAY, cellColor);
    }

    @Test
    void testClearMiddleCell() {
        board.clearCell(numRows / 2, numCols / 2);
        cellColor = board.getCellColor(numRows / 2, numCols / 2);
        assertEquals(Color.LIGHT_GRAY, cellColor);
    }

    @Test
    void testClearLastCell() {
        board.clearCell(numRows - 1, numCols - 1);
        cellColor = board.getCellColor(numRows - 1, numCols - 1);
        assertEquals(Color.LIGHT_GRAY, cellColor);
    }

    @Test
    void testIsFirstCellOccupied() {
        assertTrue(board.isCellOccupied(0, 0));
        board.clearCell(0, 0);
        assertFalse(board.isCellOccupied(0, 0));
    }

    @Test
    void testIsMiddleCellOccupied() {
        assertTrue(board.isCellOccupied(numRows / 2, numCols / 2));
        board.clearCell(numRows / 2, numCols / 2);
        assertFalse(board.isCellOccupied(numRows / 2, numCols / 2));
    }

    @Test
    void testIsLastCellOccupied() {
        assertTrue(board.isCellOccupied(numRows - 1, numCols - 1));
        board.clearCell(numRows - 1, numCols - 1);
        assertFalse(board.isCellOccupied(numRows - 1, numCols - 1));
    }

    @Test
    void testSetCurrPiece() {
        Piece jpiece = new JPiece(board.getNumRows(), board.getNumCols());
        board.setCurrPiece(jpiece);
        assertEquals(jpiece, board.getCurrPiece());
    }
}
