package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class peekEndOfStreamOrHeader extends maybeReadSeekFrame {
    private transient int IconCompatParcelizer;
    private transient int RemoteActionCompatParcelizer;
    private /* synthetic */ maybeReadSeekFrame write;

    peekEndOfStreamOrHeader(maybeReadSeekFrame maybereadseekframe, int i, int i2) {
        this.write = maybereadseekframe;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
    }

    @Override // kotlin.maybeReadSeekFrame
    /* JADX INFO: renamed from: IconCompatParcelizer */
    public final maybeReadSeekFrame subList(int i, int i2) {
        getId3TlenUs.write(i, i2, this.RemoteActionCompatParcelizer);
        int i3 = this.IconCompatParcelizer;
        return this.write.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        getId3TlenUs.RemoteActionCompatParcelizer(i, this.RemoteActionCompatParcelizer);
        return this.write.get(i + this.IconCompatParcelizer);
    }

    @Override // kotlin.maybeReadSeekFrame, java.util.List
    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // kotlin.computeSeeker
    final int RemoteActionCompatParcelizer() {
        return this.write.read() + this.IconCompatParcelizer + this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.computeSeeker
    final int read() {
        return this.write.read() + this.IconCompatParcelizer;
    }

    @Override // kotlin.computeSeeker
    final Object[] write() {
        return this.write.write();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.RemoteActionCompatParcelizer;
    }
}
