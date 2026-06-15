package com.example.lavalamp.services;

import javafx.scene.paint.Color;

public class ColorProvider {
    private Color currentColor;

    public ColorProvider() {
        this.currentColor = Color.WHITE; // Default color
    }

    public Color getCurrentColor() {
        return currentColor;
    }

    public void updateColor(double mouseX, double mouseY, double width, double height) {
        // Example logic to change color based on mouse proximity
        double proximity = Math.sqrt(Math.pow(mouseX - width / 2, 2) + Math.pow(mouseY - height / 2, 2));
        double maxDistance = Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height / 2, 2));
        double ratio = Math.min(proximity / maxDistance, 1.0);
        currentColor = Color.hsb(ratio * 360, 1.0, 1.0); // Shift color based on proximity
    }

    public void setColor(Color color) {
        this.currentColor = color;
    }
}