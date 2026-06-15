package com.example.lavalamp.ui;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class WidgetWindow {

    private Stage stage;

    public WidgetWindow() {
        this.stage = new Stage();
        initialize();
    }

    private void initialize() {
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 300);
        
        // Set the stage properties
        stage.setTitle("Lava Lamp Mood Widget");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setOpacity(0.8); // Make it slightly transparent
        stage.setAlwaysOnTop(true); // Keep it on top of other windows
        stage.setOnCloseRequest(event -> Platform.exit()); // Exit on close

        // Show the stage
        stage.show();
    }

    public void update() {
        // Logic to update the widget's appearance based on simulation
    }
}