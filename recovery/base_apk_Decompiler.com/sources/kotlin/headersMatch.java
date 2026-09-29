package kotlin;

import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class headersMatch extends maybeReadSeekFrame {
    static final maybeReadSeekFrame write = new headersMatch(new Object[0]);
    private transient Object[] AudioAttributesCompatParcelizer;

    private headersMatch(Object[] objArr) {
        this.AudioAttributesCompatParcelizer = objArr;
    }

    @Override // kotlin.computeSeeker
    final int RemoteActionCompatParcelizer() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        getId3TlenUs.RemoteActionCompatParcelizer(i, 0);
        return Objects.requireNonNull(this.AudioAttributesCompatParcelizer[i]);
    }

    @Override // kotlin.computeSeeker
    final int read() {
        return 0;
    }

    @Override // kotlin.maybeReadSeekFrame, kotlin.computeSeeker
    final int read(Object[] objArr) {
        System.arraycopy(this.AudioAttributesCompatParcelizer, 0, objArr, 0, 0);
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }

    @Override // kotlin.computeSeeker
    final Object[] write() {
        return this.AudioAttributesCompatParcelizer;
    }
}
