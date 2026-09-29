package kotlin;

import android.os.Process;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fromSyncData implements getAnswerMap {
    public static int AudioAttributesCompatParcelizer;
    public static int RemoteActionCompatParcelizer;
    private /* synthetic */ int write;

    public /* synthetic */ fromSyncData(int i) {
        this.write = i;
    }

    public static int RemoteActionCompatParcelizer() {
        int i = RemoteActionCompatParcelizer;
        int i2 = i % 9547932;
        RemoteActionCompatParcelizer = i + 1;
        if (i2 != 0) {
            return AudioAttributesCompatParcelizer;
        }
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        AudioAttributesCompatParcelizer = startElapsedRealtime;
        return startElapsedRealtime;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        return setStateId.IconCompatParcelizer(this.write);
    }
}
