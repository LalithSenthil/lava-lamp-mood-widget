package com.example.lavalamp.input;

import javafx.scene.input.TouchEvent;
import javafx.scene.input.TouchPoint;

public class TouchHandler {

    public TouchHandler() {
        // Constructor for TouchHandler
    }

    public void handleTouchEvent(TouchEvent event) {
        for (TouchPoint touchPoint : event.getTouchPoints()) {
            switch (event.getEventType().getName()) {
                case "TOUCH_PRESSED":
                    onTouchPressed(touchPoint);
                    break;
                case "TOUCH_MOVED":
                    onTouchMoved(touchPoint);
                    break;
                case "TOUCH_RELEASED":
                    onTouchReleased(touchPoint);
                    break;
            }
        }
    }

    private void onTouchPressed(TouchPoint touchPoint) {
        // Handle touch pressed event
    }

    private void onTouchMoved(TouchPoint touchPoint) {
        // Handle touch moved event
    }

    private void onTouchReleased(TouchPoint touchPoint) {
        // Handle touch released event
    }
}