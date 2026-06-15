package com.example.lavalamp.render;

import com.example.lavalamp.core.Blob;
import com.example.lavalamp.core.Particle;
import javafx.scene.canvas.GraphicsContext;

import java.util.List;

public abstract class Renderer {
    protected GraphicsContext graphicsContext;

    public Renderer(GraphicsContext graphicsContext) {
        this.graphicsContext = graphicsContext;
    }

    public abstract void renderParticles(List<Particle> particles);
    public abstract void renderBlobs(List<Blob> blobs);
    public abstract void clear();
}