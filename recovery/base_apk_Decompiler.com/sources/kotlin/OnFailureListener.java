package kotlin;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class OnFailureListener {
    public static int AudioAttributesCompatParcelizer = 0;
    public static String IconCompatParcelizer = "com.marrow2.ui.test.gtanalytics.GTAnalyticsSubjectViewModel";
    public static int read;

    public static int AudioAttributesCompatParcelizer() {
        int i = AudioAttributesCompatParcelizer;
        int i2 = i % 6138484;
        AudioAttributesCompatParcelizer = i + 1;
        if (i2 != 0) {
            return read;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
        read = i3;
        return i3;
    }
}
