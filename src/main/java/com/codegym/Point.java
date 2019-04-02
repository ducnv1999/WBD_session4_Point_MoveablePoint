package com.codegym;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;
    private float[] xy = new float[2];

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
        xy[0] = x;
        xy[1] = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return xy;
    }

    public void setXY_(float x, float y) {
        xy[0] = x;
        xy[1] = y;
    }

    @Override
    public String toString() {
        return "(x,y) = (" + getXY()[0] + ", " + getXY()[1] + ")";

    }
}
