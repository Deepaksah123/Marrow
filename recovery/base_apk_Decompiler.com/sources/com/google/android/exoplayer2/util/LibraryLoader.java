package com.google.android.exoplayer2.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public abstract class LibraryLoader {
    private static final String TAG = "LibraryLoader";
    private boolean isAvailable;
    private boolean loadAttempted;
    private String[] nativeLibraries;

    protected abstract void loadLibrary(String str);

    public LibraryLoader(String... strArr) {
        this.nativeLibraries = strArr;
    }

    public void setLibraries(String... strArr) {
        synchronized (this) {
            Assertions.checkState(!this.loadAttempted, "Cannot set libraries after loading");
            this.nativeLibraries = strArr;
        }
    }

    public boolean isAvailable() {
        synchronized (this) {
            if (this.loadAttempted) {
                return this.isAvailable;
            }
            this.loadAttempted = true;
            try {
                for (String str : this.nativeLibraries) {
                    loadLibrary(str);
                }
                this.isAvailable = true;
            } catch (UnsatisfiedLinkError unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to load ");
                sb.append(Arrays.toString(this.nativeLibraries));
                Log.w(TAG, sb.toString());
            }
            return this.isAvailable;
        }
    }
}
