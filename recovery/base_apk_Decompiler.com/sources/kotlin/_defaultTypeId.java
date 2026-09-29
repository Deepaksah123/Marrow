package kotlin;

import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes2.dex */
public abstract class _defaultTypeId {
    private int AudioAttributesCompatParcelizer;

    public void write() {
        this.AudioAttributesCompatParcelizer = 0;
    }

    public final boolean IconCompatParcelizer() {
        return RemoteActionCompatParcelizer(C.BUFFER_FLAG_FIRST_SAMPLE);
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return RemoteActionCompatParcelizer(4);
    }

    public final boolean read() {
        return RemoteActionCompatParcelizer(1);
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return RemoteActionCompatParcelizer(536870912);
    }

    public final boolean H_() {
        return RemoteActionCompatParcelizer(268435456);
    }

    public final void c_(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    public final void IconCompatParcelizer(int i) {
        this.AudioAttributesCompatParcelizer = i | this.AudioAttributesCompatParcelizer;
    }

    protected final boolean RemoteActionCompatParcelizer(int i) {
        return (this.AudioAttributesCompatParcelizer & i) == i;
    }
}
