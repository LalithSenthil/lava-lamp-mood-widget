package com.example.lavalamp.ui;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

public class WidgetController {

    @FXML
    private Pane widgetPane;

    private Shape currentShape;

    public void initialize() {
        // Initialize the widget with default settings
        setupInitialShape();
        startAnimation();
    }

    private void setupInitialShape() {
        // Create and add the initial shape to the widgetPane
        currentShape = createShape();
        widgetPane.getChildren().add(currentShape);
    }

    private Shape createShape() {
        // Logic to create an organic shape
        // Placeholder for actual shape creation logic
        return new javafx.scene.shape.Circle(50, Color.BLUE);
    }

    private void startAnimation() {
        // Logic to start the animation of the shape
        // This could involve a timeline or animation loop
    }

    @FXML
    private void handleMouseMoved(javafx.scene.input.MouseEvent event) {
        // Update shape color based on mouse proximity
        updateShapeColor(event.getX(), event.getY());
    }

    private void updateShapeColor(double mouseX, double mouseY) {
        // Logic to change the color of the shape based on mouse position
        double distance = calculateDistance(mouseX, mouseY);
        Color newColor = calculateColorBasedOnDistance(distance);
        currentShape.setFill(newColor);
    }

    private double calculateDistance(double mouseX, double mouseY) {
        // Calculate distance from the mouse to the center of the shape
        double centerX = currentShape.getLayoutX();
        double centerY = currentShape.getLayoutY();
        return Math.sqrt(Math.pow(mouseX - centerX, 2) + Math.pow(mouseY - centerY, 2));
    }

    private Color calculateColorBasedOnDistance(double distance) {
        // Logic to determine color based on distance
        // Placeholder for actual color calculation logic
        return Color.hsb(distance % 360, 1.0, 1.0);
    }
}