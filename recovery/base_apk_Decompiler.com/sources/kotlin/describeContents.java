package kotlin;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public abstract class describeContents {
    public static final String IconCompatParcelizer;

    static {
        IconCompatParcelizer = Build.VERSION.SDK_INT >= 35 ? "content://com.google.android.gsf.gservices/prefix" : "content://com.google.android.gsf.gservices";
    }
}
