package com.example.lavalamp.core;

import java.util.List;
import java.util.ArrayList;

public class MorphEngine {
    private List<Blob> blobs;

    public MorphEngine() {
        this.blobs = new ArrayList<>();
    }

    public void addBlob(Blob blob) {
        blobs.add(blob);
    }

    public void updateMorphing(double deltaTime) {
        for (Blob blob : blobs) {
            blob.morph(deltaTime);
        }
    }

    public void clearBlobs() {
        blobs.clear();
    }

    public List<Blob> getBlobs() {
        return blobs;
    }
}