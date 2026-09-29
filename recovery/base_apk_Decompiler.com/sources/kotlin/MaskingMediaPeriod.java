package kotlin;

import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final class MaskingMediaPeriod {
    private final String RemoteActionCompatParcelizer;
    private final Handler write;

    public MaskingMediaPeriod(String str, Handler handler) {
        this.RemoteActionCompatParcelizer = str;
        this.write = handler;
    }

    public final String read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer() {
        this.write.removeCallbacksAndMessages(null);
    }
}
