package com.codegym;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    private float[] speed = new float[2];

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        speed[0] = xSpeed;
        speed[1] = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        super.getXY()[0] = x;
        super.getXY()[1] = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        speed[0] = xSpeed;
        speed[1] = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return speed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        speed[0] = xSpeed;
        speed[1] = ySpeed;
    }

    public float[] move() {
        super.getXY()[0] += speed[0];
        super.getXY()[1] += speed[1];
        return super.getXY();
    }

    @Override
    public String toString() {
        float[] point = move();
        return super.toString() + ", with (xSpeed,ySpeed) = (" + speed[0] + ", " + speed[1] + ")" +
                ", new (x,y) = (" + point[0] + ", " + point[1] + ")";
    }
}
