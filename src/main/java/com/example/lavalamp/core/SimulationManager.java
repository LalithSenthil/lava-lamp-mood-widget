package com.example.lavalamp.core;

import java.util.ArrayList;
import java.util.List;

public class SimulationManager {
    private List<Particle> particles;
    private List<Blob> blobs;

    public SimulationManager() {
        particles = new ArrayList<>();
        blobs = new ArrayList<>();
    }

    public void initializeSimulation(int particleCount) {
        for (int i = 0; i < particleCount; i++) {
            particles.add(new Particle());
        }
        // Initialize blobs or other simulation elements as needed
    }

    public void updateSimulation(double deltaTime) {
        for (Particle particle : particles) {
            particle.update(deltaTime);
        }
        for (Blob blob : blobs) {
            blob.update(deltaTime);
        }
    }

    public void addBlob(Blob blob) {
        blobs.add(blob);
    }

    public List<Particle> getParticles() {
        return particles;
    }

    public List<Blob> getBlobs() {
        return blobs;
    }
}