package com.cesarferreira.painlessprefs;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Map;

public class PainlessPrefs {

    static PainlessPrefs singleton = null;

    static SharedPreferences preferences;

    static SharedPreferences.Editor editor;
    private static Context mContext;


    public static PainlessPrefs getInstance(Context context) {
        if (singleton == null) {
            singleton = new PainlessPrefs();
            mContext = context;

            preferences = context.getSharedPreferences("painlessprefs", Context.MODE_PRIVATE);
            editor = preferences.edit();
        }
        return singleton;
    }

    private PainlessPrefs with(Context context) {
        if (singleton == null) {
            singleton = new Builder(context).build();
        }
        return singleton;
    }

    public void save(String key, boolean value) {
        with(mContext).editor.putBoolean(key, value).apply();
    }

    public void save(String key, String value) {
        with(mContext).editor.putString(key, value).apply();
    }

    public void save(String key, int value) {
        with(mContext).editor.putInt(key, value).apply();
    }

    public void save(String key, float value) {
        with(mContext).editor.putFloat(key, value).apply();
    }

    public void save(String key, long value) {
        with(mContext).editor.putLong(key, value).apply();
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        return with(mContext).preferences.getBoolean(key, defaultValue);
    }

    public String getString(String key, String defaultValue) {
        return with(mContext).preferences.getString(key, defaultValue);
    }

    public int getInt(String key, int defaultValue) {
        return with(mContext).preferences.getInt(key, defaultValue);
    }

    public float getFloat(String key, float defaultValue) {
        return with(mContext).preferences.getFloat(key, defaultValue);
    }

    public long getLong(String key, long defaultValue) {
        return with(mContext).preferences.getLong(key, defaultValue);
    }

    public void remove(String key) {
        with(mContext).editor.remove(key).apply();
    }

    public boolean hasPreference(String key) {
        return with(mContext).preferences.contains(key);
    }


    public Map<String, ?> getAll() {
        return with(mContext).preferences.getAll();
    }


    /**
     * Builder class
     */
    private static class Builder {

        private final Context context;

        public Builder(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.context = context.getApplicationContext();
        }

        /**
         * Method that creates an instance of Prefs
         *
         * @return an instance of Prefs
         */
        public PainlessPrefs build() {
            return PainlessPrefs.getInstance(context);
        }
    }
}

