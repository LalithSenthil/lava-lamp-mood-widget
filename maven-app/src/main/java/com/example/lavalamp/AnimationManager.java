package com.example.lavalamp;

import javafx.animation.AnimationTimer;

public class AnimationManager {
    public interface FrameCallback {
        void onFrame(long timestamp, double deltaSeconds);
    }

    private final AnimationTimer timer;
    private long lastTimestamp = -1;

    public AnimationManager(FrameCallback callback) {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (lastTimestamp < 0) {
                    lastTimestamp = now;
                    return;
                }
                double delta = (now - lastTimestamp) / 1_000_000_000.0;
                lastTimestamp = now;
                callback.onFrame(now, delta);
            }
        };
    }

    public void start() {
        lastTimestamp = -1;
        timer.start();
    }

    public void stop() {
        timer.stop();
    }
}
