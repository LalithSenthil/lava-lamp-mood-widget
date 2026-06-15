package com.example.lavalamp.input;

import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MouseTracker {
    private double mouseX = 0;
    private double mouseY = 0;

    // For dragging
    private double dragOffsetX = 0;
    private double dragOffsetY = 0;

    public void attach(Node node, Stage stage) {
        node.addEventHandler(MouseEvent.MOUSE_MOVED, e -> {
            mouseX = e.getX();
            mouseY = e.getY();
        });
        node.addEventHandler(MouseEvent.MOUSE_DRAGGED, e -> {
            mouseX = e.getX();
            mouseY = e.getY();
            // move stage if primary button is down
            if (e.isPrimaryButtonDown()) {
                stage.setX(e.getScreenX() - dragOffsetX);
                stage.setY(e.getScreenY() - dragOffsetY);
            }
        });
        node.addEventHandler(MouseEvent.MOUSE_PRESSED, e -> {
            dragOffsetX = e.getX();
            dragOffsetY = e.getY();
        });
    }

    public double getMouseX() { return mouseX; }
    public double getMouseY() { return mouseY; }
}
