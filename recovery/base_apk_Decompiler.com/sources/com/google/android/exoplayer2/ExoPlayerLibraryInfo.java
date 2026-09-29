package com.google.android.exoplayer2;

import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class ExoPlayerLibraryInfo {
    public static final boolean ASSERTIONS_ENABLED = true;
    public static final String TAG = "ExoPlayerLib";
    public static final boolean TRACE_ENABLED = true;
    public static final String VERSION = "2.19.1";
    public static final int VERSION_INT = 2019001;
    public static final String VERSION_SLASHY = "ExoPlayerLib/2.19.1";
    private static final HashSet<String> registeredModules = new HashSet<>();
    private static String registeredModulesString = "goog.exo.core";

    private ExoPlayerLibraryInfo() {
    }

    public static String registeredModules() {
        String str;
        synchronized (ExoPlayerLibraryInfo.class) {
            str = registeredModulesString;
        }
        return str;
    }

    public static void registerModule(String str) {
        synchronized (ExoPlayerLibraryInfo.class) {
            if (registeredModules.add(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append(registeredModulesString);
                sb.append(", ");
                sb.append(str);
                registeredModulesString = sb.toString();
            }
        }
    }
}
