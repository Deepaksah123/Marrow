package kotlin;

import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ai implements _addFields {
    public static int RemoteActionCompatParcelizer;
    public static int write;
    private /* synthetic */ getAnswerMap read;

    public /* synthetic */ ai(getAnswerMap getanswermap) {
        this.read = getanswermap;
    }

    public static int write() {
        int i = write;
        int i2 = i % 9442103;
        write = i + 1;
        if (i2 != 0) {
            return RemoteActionCompatParcelizer;
        }
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        RemoteActionCompatParcelizer = iElapsedRealtime;
        return iElapsedRealtime;
    }

    @Override // kotlin._addFields
    public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
        ak.read(this.read, str, bundle);
    }
}
