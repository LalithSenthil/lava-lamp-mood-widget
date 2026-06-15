package com.example.lavalamp.render;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class CanvasRenderer extends Renderer {
    private Canvas canvas;
    private GraphicsContext gc;

    public CanvasRenderer(Canvas canvas) {
        this.canvas = canvas;
        this.gc = canvas.getGraphicsContext2D();
    }

    @Override
    public void render() {
        clearCanvas();
        drawParticles();
        drawBlobs();
    }

    private void clearCanvas() {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }

    private void drawParticles() {
        // Logic to draw particles on the canvas
        // Example: gc.setFill(Color.RED); gc.fillOval(x, y, size, size);
    }

    private void drawBlobs() {
        // Logic to draw blobs on the canvas
        // Example: gc.setFill(Color.BLUE); gc.fillOval(x, y, width, height);
    }

    public void setCanvasSize(double width, double height) {
        canvas.setWidth(width);
        canvas.setHeight(height);
    }
}