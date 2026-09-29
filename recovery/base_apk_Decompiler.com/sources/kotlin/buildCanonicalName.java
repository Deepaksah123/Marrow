package kotlin;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class buildCanonicalName implements ResolvedRecursiveType {
    private final long IconCompatParcelizer;
    private long RemoteActionCompatParcelizer;
    private final long write;

    public buildCanonicalName(long j, long j2) {
        this.IconCompatParcelizer = j;
        this.write = j2;
        AudioAttributesImplApi26Parcelizer();
    }

    private boolean AudioAttributesImplBaseParcelizer() {
        return this.RemoteActionCompatParcelizer > this.write;
    }

    @Override // kotlin.ResolvedRecursiveType
    public final boolean read() {
        this.RemoteActionCompatParcelizer++;
        return !AudioAttributesImplBaseParcelizer();
    }

    private void AudioAttributesImplApi26Parcelizer() {
        this.RemoteActionCompatParcelizer = this.IconCompatParcelizer - 1;
    }

    protected final void write() {
        long j = this.RemoteActionCompatParcelizer;
        if (j < this.IconCompatParcelizer || j > this.write) {
            throw new NoSuchElementException();
        }
    }

    protected final long IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }
}
