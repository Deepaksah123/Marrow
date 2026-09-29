package kotlin;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class Mp3Extractor {
    public static Context RemoteActionCompatParcelizer(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }
}
