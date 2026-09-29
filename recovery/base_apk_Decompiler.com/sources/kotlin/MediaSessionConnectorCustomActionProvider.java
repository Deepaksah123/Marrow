package kotlin;

import android.database.Cursor;
import kotlin.setMapStateIdleToSessionStateStopped;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MediaSessionConnectorCustomActionProvider implements setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer {
    public static int IconCompatParcelizer;
    public static int RemoteActionCompatParcelizer;

    public static int IconCompatParcelizer() {
        int i = RemoteActionCompatParcelizer;
        int i2 = i % 8297440;
        RemoteActionCompatParcelizer = i + 1;
        if (i2 != 0) {
            return IconCompatParcelizer;
        }
        int i3 = (int) Runtime.getRuntime().totalMemory();
        IconCompatParcelizer = i3;
        return i3;
    }

    @Override // o.setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer
    public final Object AudioAttributesCompatParcelizer(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}
