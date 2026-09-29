package kotlin;

import android.os.Process;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfe {
    public static int AudioAttributesCompatParcelizer = 0;
    public static String IconCompatParcelizer = "com.marrow2.ui.recent_updates.RecentUpdateDetailViewModel";
    public static int read;

    public static int read() {
        int i = read;
        int i2 = i % 9868414;
        read = i + 1;
        if (i2 != 0) {
            return AudioAttributesCompatParcelizer;
        }
        int iMyTid = Process.myTid();
        AudioAttributesCompatParcelizer = iMyTid;
        return iMyTid;
    }
}
