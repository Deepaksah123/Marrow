package kotlin;

import java.util.List;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class parseMpegAudioFrameSampleCount extends Exception {
    public final List IconCompatParcelizer;

    public parseMpegAudioFrameSampleCount(TimeoutException timeoutException, List list) {
        super(timeoutException);
        this.IconCompatParcelizer = list;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "";
    }
}
