package com.fury.tetris.models;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;

public class Square extends Rectangle {

    private static final long serialVersionUID = -962117205701508939L;
    private Color color;

    public Square() {
        super(new Dimension(1,1));
        this.color = Color.LIGHT_GRAY;
    }
    
    public Square(Color color) {
        super(new Dimension(1,1));
        this.color= color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
