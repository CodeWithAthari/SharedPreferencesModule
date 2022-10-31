package com.atharapps.prefutils;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefUtils {
    public static SharedPreferences preferences;
    public static SharedPreferences.Editor editor;


    public static void PREF_INIT(Context context) {
        preferences = context.getSharedPreferences("pref", Context.MODE_PRIVATE);
    }

    public static String get_Pref_String(String KEY, String DEFAULT_VALUE) {
        return preferences.getString(KEY, DEFAULT_VALUE);
    }

    public static Boolean get_Pref_Boolean(String KEY, Boolean DEFAULT_VALUE) {
        return preferences.getBoolean(KEY, DEFAULT_VALUE);
    }

    public static int get_Pref_Int(String KEY, int DEFAULT_VALUE) {
        return preferences.getInt(KEY, DEFAULT_VALUE);
    }

    public static Boolean put_Pref_String(String KEY, String VALUE) {
        editor = preferences.edit();
        editor.putString(KEY, VALUE);
        editor.apply();
        return true;
    }

    public static Boolean put_Pref_Int(String KEY, int VALUE) {
        editor = preferences.edit();
        editor.putInt(KEY, VALUE);
        editor.apply();
        return true;
    }

    public static Boolean put_Pref_Boolean(String KEY, Boolean VALUE) {
        editor = preferences.edit();
        editor.putBoolean(KEY, VALUE);
        editor.apply();
        return true;
    }



}