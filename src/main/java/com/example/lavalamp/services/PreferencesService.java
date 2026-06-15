package com.example.lavalamp.services;

import java.util.prefs.Preferences;

public class PreferencesService {
    private static final String PREFS_NODE = "com.example.lavalamp";
    private Preferences preferences;

    public PreferencesService() {
        preferences = Preferences.userRoot().node(PREFS_NODE);
    }

    public void setPreference(String key, String value) {
        preferences.put(key, value);
    }

    public String getPreference(String key, String defaultValue) {
        return preferences.get(key, defaultValue);
    }

    public void removePreference(String key) {
        preferences.remove(key);
    }

    public void clearPreferences() {
        try {
            preferences.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}