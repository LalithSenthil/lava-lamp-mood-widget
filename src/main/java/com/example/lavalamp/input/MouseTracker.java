package com.example.lavalamp.input;

import javafx.scene.input.MouseEvent;
import javafx.scene.Scene;

public class MouseTracker {
    private double mouseX;
    private double mouseY;

    public MouseTracker(Scene scene) {
        scene.addEventFilter(MouseEvent.MOUSE_MOVED, this::handleMouseMoved);
    }

    private void handleMouseMoved(MouseEvent event) {
        this.mouseX = event.getX();
        this.mouseY = event.getY();
        // Logic to influence color dynamics based on mouse position can be added here
    }

    public double getMouseX() {
        return mouseX;
    }

    public double getMouseY() {
        return mouseY;
    }
}