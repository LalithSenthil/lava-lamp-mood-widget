package com.example.lavalamp.util;

import javafx.scene.paint.Color;

public class FXUtils {

    public static Color interpolateColor(Color color1, Color color2, double ratio) {
        double red = color1.getRed() + (color2.getRed() - color1.getRed()) * ratio;
        double green = color1.getGreen() + (color2.getGreen() - color1.getGreen()) * ratio;
        double blue = color1.getBlue() + (color2.getBlue() - color1.getBlue()) * ratio;
        return new Color(red, green, blue, 1.0);
    }

    public static double clamp(double value, double min, double max) {
        return Math.max(min, Math.min(max, value));
    }

    public static double mapRange(double value, double fromLow, double fromHigh, double toLow, double toHigh) {
        return toLow + (toHigh - toLow) * ((value - fromLow) / (fromHigh - fromLow));
    }
}