package kotlin;

import android.content.ContentResolver;
import android.provider.Settings;

/* JADX INFO: loaded from: classes3.dex */
public class FlacStreamMetadataSeekTable {
    public static float RemoteActionCompatParcelizer(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
