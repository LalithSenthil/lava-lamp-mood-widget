package com.example.lavalamp.ui;

import com.example.lavalamp.core.SimulationManager;
import com.example.lavalamp.render.CanvasRenderer;
import com.example.lavalamp.AnimationManager;
import com.example.lavalamp.input.MouseTracker;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.input.MouseEvent;

public class WidgetWindow2 {
    private final Stage stage;
    private final Canvas canvas;
    private final SimulationManager simulationManager;
    private final CanvasRenderer renderer;
    private final AnimationManager animationManager;
    private final MouseTracker mouseTracker = new MouseTracker();

    public WidgetWindow2(Stage stage) {
        this.stage = stage;
        this.stage.initStyle(StageStyle.TRANSPARENT);
        this.stage.setAlwaysOnTop(true);

        StackPane root = new StackPane();
        root.setStyle("-fx-background-color: transparent;");

        canvas = new Canvas(800, 600);
        root.getChildren().add(canvas);

        Scene scene = new Scene(root, 800, 600, Color.TRANSPARENT);
        this.stage.setScene(scene);
        this.stage.setResizable(false);

        this.simulationManager = new SimulationManager(10, canvas.getWidth(), canvas.getHeight());
        this.renderer = new CanvasRenderer(canvas);

        // attach mouse tracker to the canvas for interaction and dragging
        mouseTracker.attach(canvas, stage);

        // allow dragging by pressing and dragging anywhere on the canvas
        canvas.addEventHandler(MouseEvent.MOUSE_PRESSED, e -> {
            mouseTracker.attach(canvas, stage);
        });

        this.animationManager = new AnimationManager((timestamp, delta) -> {
            simulationManager.update(delta);
            renderer.render(simulationManager.getBlobs());
        });

        this.stage.show();
        this.animationManager.start();
    }
}
