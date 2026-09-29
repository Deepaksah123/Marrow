package kotlin;

import android.os.Process;

/* JADX INFO: loaded from: classes4.dex */
public final class getExpiresOn {
    public static int IconCompatParcelizer;
    public static int write;

    public static int AudioAttributesCompatParcelizer(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }

    public static int write() {
        int i = IconCompatParcelizer;
        int i2 = i % 9447208;
        IconCompatParcelizer = i + 1;
        if (i2 != 0) {
            return write;
        }
        int iMyPid = Process.myPid();
        write = iMyPid;
        return iMyPid;
    }
}
