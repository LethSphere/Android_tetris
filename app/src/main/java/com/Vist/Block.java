package com.Vist;

import android.graphics.Color;

public class Block {
    private int[][] shape;
    private int color;
    private int x, y;
    public Block(int[][] shape, int color) {
        this.shape = shape;
        this.color = color;
        x= 3;
        y= 2;
    }

    public int[][] getShape() {
        return shape;
    }

    public void setShape(int[][] shape) {
        this.shape = shape;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    public int getHeight(){
        return shape.length;
    }

    public int getWidth(){
        return shape[0].length;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
