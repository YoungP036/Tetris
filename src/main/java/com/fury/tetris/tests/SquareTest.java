package com.fury.tetris.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fury.tetris.models.Square;

class SquareTest {

    Square square;
    Color cellColor;

    @BeforeEach
    void setUp() throws Exception {
        square = new Square();
    }

    @Test
    void testGetColor() {
        cellColor = square.getColor();

        if (!cellColor.equals(Color.LIGHT_GRAY))
            fail("getColor from square failed");
    }

    @Test
    void testSetColor() {
        square.setColor(Color.BLUE);
        cellColor = square.getColor();

        if (!cellColor.equals(Color.BLUE))
            fail("setColor from square failed");
    }
}
