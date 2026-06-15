package com.example.lavalamp.core;

public class Particle {
    private double x;
    private double y;
    private double radius;
    private double velocityX;
    private double velocityY;
    private String color;

    public Particle(double x, double y, double radius, double velocityX, double velocityY, String color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.color = color;
    }

    public void updatePosition() {
        x += velocityX;
        y += velocityY;
        // Add boundary checks and other behaviors as needed
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}