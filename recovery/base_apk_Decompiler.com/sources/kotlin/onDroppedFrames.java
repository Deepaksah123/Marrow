package kotlin;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class onDroppedFrames<V> {
    private final V AudioAttributesCompatParcelizer;
    private final Throwable RemoteActionCompatParcelizer;

    public onDroppedFrames(V v) {
        this.AudioAttributesCompatParcelizer = v;
        this.RemoteActionCompatParcelizer = null;
    }

    public onDroppedFrames(Throwable th) {
        this.RemoteActionCompatParcelizer = th;
        this.AudioAttributesCompatParcelizer = null;
    }

    public final V IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final Throwable write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onDroppedFrames)) {
            return false;
        }
        onDroppedFrames ondroppedframes = (onDroppedFrames) obj;
        if (IconCompatParcelizer() != null && IconCompatParcelizer().equals(ondroppedframes.IconCompatParcelizer())) {
            return true;
        }
        if (write() == null || ondroppedframes.write() == null) {
            return false;
        }
        return write().toString().equals(write().toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{IconCompatParcelizer(), write()});
    }
}
