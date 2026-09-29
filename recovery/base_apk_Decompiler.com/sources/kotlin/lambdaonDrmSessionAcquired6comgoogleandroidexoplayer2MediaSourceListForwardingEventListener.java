package kotlin;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaonDrmSessionAcquired6comgoogleandroidexoplayer2MediaSourceListForwardingEventListener implements Serializable {
    private String IconCompatParcelizer;
    private String RemoteActionCompatParcelizer;
    private String write;

    public final String read() {
        return this.write;
    }

    public final void IconCompatParcelizer(String str) {
        this.write = str;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(String str) {
        this.IconCompatParcelizer = str;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void read(String str) {
        this.RemoteActionCompatParcelizer = str;
    }
}
