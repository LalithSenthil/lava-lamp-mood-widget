package com.example.lavalamp.core;

import java.util.ArrayList;
import java.util.List;

public class Blob {
    private List<Particle> particles;
    private double centerX;
    private double centerY;
    private double radius;

    public Blob(double centerX, double centerY, double radius) {
        this.particles = new ArrayList<>();
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        initializeParticles();
    }

    private void initializeParticles() {
        // Initialize particles within the blob
        for (int i = 0; i < 100; i++) {
            double angle = Math.random() * 2 * Math.PI;
            double distance = Math.random() * radius;
            double x = centerX + Math.cos(angle) * distance;
            double y = centerY + Math.sin(angle) * distance;
            particles.add(new Particle(x, y));
        }
    }

    public void morph() {
        // Logic to morph the blob shape over time
        for (Particle particle : particles) {
            particle.updatePosition();
        }
    }

    public List<Particle> getParticles() {
        return particles;
    }

    public double getCenterX() {
        return centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public double getRadius() {
        return radius;
    }
}