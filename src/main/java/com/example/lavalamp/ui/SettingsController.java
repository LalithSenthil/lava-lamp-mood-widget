package com.example.lavalamp.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;

public class SettingsController {

    @FXML
    private Slider particleSizeSlider;

    @FXML
    private CheckBox enableAnimationsCheckBox;

    @FXML
    private ColorPicker backgroundColorPicker;

    @FXML
    private void initialize() {
        // Initialize default settings or load from preferences
    }

    @FXML
    private void handleParticleSizeChange() {
        // Update particle size based on slider value
    }

    @FXML
    private void handleAnimationToggle() {
        // Enable or disable animations based on checkbox state
    }

    @FXML
    private void handleBackgroundColorChange() {
        // Update background color based on color picker value
    }
}