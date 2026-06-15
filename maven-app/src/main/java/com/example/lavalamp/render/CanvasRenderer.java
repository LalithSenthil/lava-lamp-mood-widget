package com.example.lavalamp.render;

import com.example.lavalamp.core.Blob;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.List;

public class CanvasRenderer extends Renderer {
    private final Canvas canvas;

    public CanvasRenderer(Canvas canvas) {
        super(canvas.getGraphicsContext2D());
        this.canvas = canvas;
    }

    @Override
    public void render(List<Blob> blobs) {
        clear();
        for (Blob b : blobs) {
            drawBlob(b);
        }
    }

    private void clear() {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }

    private void drawBlob(Blob b) {
        double x = b.getX() - b.getRadius();
        double y = b.getY() - b.getRadius();
        double size = b.getRadius() * 2;

        gc.setFill(b.getColor());
        gc.fillOval(x, y, size, size);

        // soft edge
        gc.setGlobalAlpha(0.15);
        gc.setFill(b.getColor());
        gc.fillOval(x - 8, y - 8, size + 16, size + 16);
        gc.setGlobalAlpha(1.0);
    }
}
