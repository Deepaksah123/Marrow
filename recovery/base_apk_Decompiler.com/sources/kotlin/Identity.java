package kotlin;

import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Identity implements getCreatedOnDateMs {
    public static int RemoteActionCompatParcelizer;
    public static int write;
    private /* synthetic */ getCreatedOnDateMs read;

    public /* synthetic */ Identity(getCreatedOnDateMs getcreatedondatems) {
        this.read = getcreatedondatems;
    }

    public static int write() {
        int i = RemoteActionCompatParcelizer;
        int i2 = i % 8276506;
        RemoteActionCompatParcelizer = i + 1;
        if (i2 != 0) {
            return write;
        }
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        write = startUptimeMillis;
        return startUptimeMillis;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        return GetSignInIntentRequest.RemoteActionCompatParcelizer(this.read);
    }
}
