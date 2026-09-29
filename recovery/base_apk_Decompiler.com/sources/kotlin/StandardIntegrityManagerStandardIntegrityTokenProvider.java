package kotlin;

import android.os.Process;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class StandardIntegrityManagerStandardIntegrityTokenProvider implements getCreatedOnDateMs {
    public static int AudioAttributesCompatParcelizer;
    public static int RemoteActionCompatParcelizer;

    public static int write() {
        int i = RemoteActionCompatParcelizer;
        int i2 = i % 6267694;
        RemoteActionCompatParcelizer = i + 1;
        if (i2 != 0) {
            return AudioAttributesCompatParcelizer;
        }
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        AudioAttributesCompatParcelizer = startUptimeMillis;
        return startUptimeMillis;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        return StandardIntegrityManagerStandardIntegrityToken.AudioAttributesImplBaseParcelizer();
    }
}
