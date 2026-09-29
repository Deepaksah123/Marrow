package kotlin;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class readFullyQuietly {
    public static boolean AudioAttributesCompatParcelizer() {
        return RemoteActionCompatParcelizer().equals("meizu");
    }

    private static String RemoteActionCompatParcelizer() {
        String str = Build.MANUFACTURER;
        if (str != null) {
            return str.toLowerCase(Locale.ENGLISH);
        }
        return "";
    }
}
