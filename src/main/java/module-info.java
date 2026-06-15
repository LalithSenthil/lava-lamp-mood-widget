module lava.lamp.mood.widget {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    requires java.desktop; // for java.awt (TimeColorProvider)
    requires java.prefs;   // for Preferences API

    opens com.example.lavalamp.ui to javafx.fxml;

    exports com.example.lavalamp;
    exports com.example.lavalamp.core;
    exports com.example.lavalamp.render;
    exports com.example.lavalamp.ui;
    exports com.example.lavalamp.input;
    exports com.example.lavalamp.services;
    exports com.example.lavalamp.util;
}