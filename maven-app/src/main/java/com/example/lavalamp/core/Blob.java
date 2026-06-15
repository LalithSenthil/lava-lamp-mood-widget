package com.example.lavalamp.core;

import javafx.scene.paint.Color;

public class Blob {
    private double x;
    private double y;
    private double vx;
    private double vy;
    private double radius;
    private Color color;

    public Blob(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.vx = (Math.random() - 0.5) * 60;
        this.vy = (Math.random() - 0.5) * 60;
        this.color = Color.hsb(Math.random() * 360, 0.7, 0.9, 0.9);
    }

    public void update(double dt, double width, double height) {
        x += vx * dt;
        y += vy * dt;

        // simple bounds bounce
        if (x - radius < 0) {
            x = radius;
            vx = Math.abs(vx);
        } else if (x + radius > width) {
            x = width - radius;
            vx = -Math.abs(vx);
        }
        if (y - radius < 0) {
            y = radius;
            vy = Math.abs(vy);
        } else if (y + radius > height) {
            y = height - radius;
            vy = -Math.abs(vy);
        }

        // slight damping
        vx *= 0.999;
        vy *= 0.999;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public double getRadius() { return radius; }
    public Color getColor() { return color; }
}
