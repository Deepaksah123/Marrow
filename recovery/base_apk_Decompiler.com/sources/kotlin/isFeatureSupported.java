package kotlin;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
public final class isFeatureSupported {
    private static String[] IconCompatParcelizer;

    public static boolean IconCompatParcelizer(URI uri, Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        MediaCodecRendererDecoderInitializationException.IconCompatParcelizer();
        if (IconCompatParcelizer == null) {
            IconCompatParcelizer = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String str : IconCompatParcelizer) {
            if (host.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
