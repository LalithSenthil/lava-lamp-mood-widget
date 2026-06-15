package com.example.lavalamp.services;

import java.util.prefs.Preferences;

public class PreferencesService {
    private static final String KEY_BLOB_COUNT = "blobCount";
    private static final String KEY_INTERACTION = "interactionStrength";
    private static final String KEY_ALWAYS_ON_TOP = "alwaysOnTop";

    private final Preferences prefs = Preferences.userNodeForPackage(PreferencesService.class);

    public int getBlobCount() { return prefs.getInt(KEY_BLOB_COUNT, 10); }
    public void setBlobCount(int v) { prefs.putInt(KEY_BLOB_COUNT, v); }

    public double getInteractionStrength() { return prefs.getDouble(KEY_INTERACTION, 0.6); }
    public void setInteractionStrength(double v) { prefs.putDouble(KEY_INTERACTION, v); }

    public boolean isAlwaysOnTop() { return prefs.getBoolean(KEY_ALWAYS_ON_TOP, true); }
    public void setAlwaysOnTop(boolean v) { prefs.putBoolean(KEY_ALWAYS_ON_TOP, v); }
}
