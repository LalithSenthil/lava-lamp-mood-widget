package com.example.lavalamp.services;

import java.awt.Color;
import java.time.LocalTime;

public class TimeColorProvider extends ColorProvider {

    @Override
    public Color getColor() {
        LocalTime now = LocalTime.now();
        float hue = (now.getHour() % 24) / 24f; // Normalize hour to [0, 1]
        float saturation = 0.8f; // Fixed saturation
        float brightness = 0.9f; // Fixed brightness
        return Color.getHSBColor(hue, saturation, brightness);
    }
}