package com.example.lavalamp.render;

import com.example.lavalamp.core.Blob;
import java.util.List;
import javafx.scene.canvas.GraphicsContext;

public abstract class Renderer {
    protected final GraphicsContext gc;

    public Renderer(GraphicsContext gc) {
        this.gc = gc;
    }

    public abstract void render(java.util.List<Blob> blobs);
}
