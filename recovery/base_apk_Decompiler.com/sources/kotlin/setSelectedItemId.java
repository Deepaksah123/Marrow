package kotlin;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class setSelectedItemId implements getCreatedOnDateMs {
    public static int RemoteActionCompatParcelizer;
    public static int write;

    public static int read() {
        int i = RemoteActionCompatParcelizer;
        int i2 = i % 7474296;
        RemoteActionCompatParcelizer = i + 1;
        if (i2 != 0) {
            return write;
        }
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        write = iElapsedRealtime;
        return iElapsedRealtime;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        return NavigationView.MediaBrowserCompatCustomActionResultReceiver();
    }
}
