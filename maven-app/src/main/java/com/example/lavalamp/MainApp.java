package com.example.lavalamp;

import com.example.lavalamp.ui.WidgetWindow;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Delegate to WidgetWindow which will configure and show the stage
        new WidgetWindow(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
