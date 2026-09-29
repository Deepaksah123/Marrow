package kotlin;

import android.os.Process;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class GoogleMapOnCameraMoveStartedListener implements getCreatedOnDateMs {
    public static int AudioAttributesCompatParcelizer;
    public static int RemoteActionCompatParcelizer;
    private /* synthetic */ getCreatedOnDateMs write;

    public /* synthetic */ GoogleMapOnCameraMoveStartedListener(getCreatedOnDateMs getcreatedondatems) {
        this.write = getcreatedondatems;
    }

    public static int AudioAttributesCompatParcelizer() {
        int i = RemoteActionCompatParcelizer;
        int i2 = i % 8579530;
        RemoteActionCompatParcelizer = i + 1;
        if (i2 != 0) {
            return AudioAttributesCompatParcelizer;
        }
        int iMyPid = Process.myPid();
        AudioAttributesCompatParcelizer = iMyPid;
        return iMyPid;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        return onCameraMoveCanceled.RemoteActionCompatParcelizer(this.write);
    }
}
