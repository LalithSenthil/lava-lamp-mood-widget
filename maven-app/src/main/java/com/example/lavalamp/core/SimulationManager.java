package com.example.lavalamp.core;

import java.util.ArrayList;
import java.util.List;

public class SimulationManager {
    private final List<Blob> blobs = new ArrayList<>();
    private final double width;
    private final double height;

    public SimulationManager(int blobCount, double width, double height) {
        this.width = width;
        this.height = height;
        for (int i = 0; i < blobCount; i++) {
            double r = 30 + Math.random() * 60;
            double x = r + Math.random() * (width - 2 * r);
            double y = r + Math.random() * (height - 2 * r);
            blobs.add(new Blob(x, y, r));
        }
    }

    public void update(double dt) {
        for (Blob b : blobs) {
            b.update(dt, width, height);
        }
    }

    public List<Blob> getBlobs() { return blobs; }
}
