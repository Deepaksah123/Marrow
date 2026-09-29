package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\n\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0014\u0010\u000b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r"}, d2 = {"Lo/addFlags;", "Lo/SettableBeanProperty;", "p0", "", "p1", "p2", "<init>", "(Lo/SettableBeanProperty;II)V", "RemoteActionCompatParcelizer", "(I)I", "write", "IconCompatParcelizer", "Lo/SettableBeanProperty;", "I", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class addFlags implements SettableBeanProperty {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final SettableBeanProperty write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    public addFlags(SettableBeanProperty settableBeanProperty, int i, int i2) {
        this.write = settableBeanProperty;
        this.read = i;
        this.IconCompatParcelizer = i2;
    }

    @Override // kotlin.SettableBeanProperty
    public final int RemoteActionCompatParcelizer(int p0) {
        int iRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(p0);
        if (p0 >= 0 && p0 <= this.read) {
            createPayloadsIfNeeded.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, this.IconCompatParcelizer, p0);
        }
        return iRemoteActionCompatParcelizer;
    }

    @Override // kotlin.SettableBeanProperty
    public final int write(int p0) {
        int iWrite = this.write.write(p0);
        if (p0 >= 0 && p0 <= this.IconCompatParcelizer) {
            createPayloadsIfNeeded.write(iWrite, this.read, p0);
        }
        return iWrite;
    }
}
