package kotlin;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class intFromChars {
    static int read(int i) {
        if (i == -1) {
            return -1;
        }
        if (Build.VERSION.SDK_INT < 34) {
            switch (i) {
                case 21:
                case 23:
                case 26:
                    i = 6;
                    break;
                case 22:
                case 24:
                case 27:
                    i = 4;
                    break;
                case 25:
                    i = 0;
                    break;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            if (i != 12) {
                if (i == 13) {
                    return 6;
                }
                if (i != 16) {
                    if (i == 17) {
                        return 0;
                    }
                }
            }
            return 1;
        }
        return i;
    }
}
