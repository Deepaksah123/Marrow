package kotlin;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lambdaonAudioUnderrun7 implements getAnswerMap {
    public static int AudioAttributesCompatParcelizer;
    public static int read;
    private /* synthetic */ getCreatedOnDateMs RemoteActionCompatParcelizer;

    public /* synthetic */ lambdaonAudioUnderrun7(getCreatedOnDateMs getcreatedondatems) {
        this.RemoteActionCompatParcelizer = getcreatedondatems;
    }

    public static int AudioAttributesCompatParcelizer() {
        int i = AudioAttributesCompatParcelizer;
        int i2 = i % 7584939;
        AudioAttributesCompatParcelizer = i + 1;
        if (i2 != 0) {
            return read;
        }
        int iMyPid = Process.myPid();
        read = iMyPid;
        return iMyPid;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        return lambdaonCues52.write(this.RemoteActionCompatParcelizer);
    }
}
