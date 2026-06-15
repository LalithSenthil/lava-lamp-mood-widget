package com.example.lavalamp.util;

public class MathUtils {
    public static double lerp(double start, double end, double t) {
        return start + t * (end - start);
    }

    public static double clamp(double value, double min, double max) {
        return Math.max(min, Math.min(max, value));
    }

    public static double map(double value, double start1, double stop1, double start2, double stop2) {
        return start2 + (stop2 - start2) * ((value - start1) / (stop1 - start1));
    }

    public static double randomInRange(double min, double max) {
        return min + Math.random() * (max - min);
    }
}