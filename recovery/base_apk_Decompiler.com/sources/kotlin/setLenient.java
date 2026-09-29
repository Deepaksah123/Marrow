package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class setLenient extends SimpleAbstractTypeResolver implements isLenient {
    private isLenient IconCompatParcelizer;
    private long RemoteActionCompatParcelizer;

    public final void read(long j, isLenient islenient, long j2) {
        this.write = j;
        this.IconCompatParcelizer = islenient;
        if (j2 == Long.MAX_VALUE) {
            j2 = this.write;
        }
        this.RemoteActionCompatParcelizer = j2;
    }

    @Override // kotlin.isLenient
    public final int RemoteActionCompatParcelizer() {
        return ((isLenient) buildTypeSerializer.IconCompatParcelizer(this.IconCompatParcelizer)).RemoteActionCompatParcelizer();
    }

    @Override // kotlin.isLenient
    public final long write(int i) {
        return ((isLenient) buildTypeSerializer.IconCompatParcelizer(this.IconCompatParcelizer)).write(i) + this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.isLenient
    public final int RemoteActionCompatParcelizer(long j) {
        return ((isLenient) buildTypeSerializer.IconCompatParcelizer(this.IconCompatParcelizer)).RemoteActionCompatParcelizer(j - this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.isLenient
    public final List<getDefaultImpl> read(long j) {
        return ((isLenient) buildTypeSerializer.IconCompatParcelizer(this.IconCompatParcelizer)).read(j - this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.SimpleAbstractTypeResolver, kotlin._defaultTypeId
    public final void write() {
        super.write();
        this.IconCompatParcelizer = null;
    }
}
