package kotlin;

import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eventStreamId implements getAnswerMap {
    public static int read;
    public static int write;

    public static int write() {
        int i = read;
        int i2 = i % 7298886;
        read = i + 1;
        if (i2 != 0) {
            return write;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        write = elapsedCpuTime;
        return elapsedCpuTime;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        return getSegmentStartTimeUs.IconCompatParcelizer((Object[]) obj);
    }
}
