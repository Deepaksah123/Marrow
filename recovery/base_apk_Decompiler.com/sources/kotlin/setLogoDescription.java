package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\t*\u00020\b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/setLogoDescription;", "T", "Lo/setOrientation;", "p0", "", "p1", "<init>", "(Lo/setOrientation;J)V", "Lo/ScrollingTabContainerView;", "V", "Lo/evictionCount;", "Lo/ParcelableSnapshotMutableIntState;", "IconCompatParcelizer", "(Lo/evictionCount;)Lo/ParcelableSnapshotMutableIntState;", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "Lo/setOrientation;", "read", "write", "J"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setLogoDescription<T> implements setOrientation<T> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final setOrientation<T> read;
    private final long write;

    public setLogoDescription(setOrientation<T> setorientation, long j) {
        this.read = setorientation;
        this.write = j;
    }

    @Override // kotlin.setOrientation
    public final <V extends ScrollingTabContainerView> ParcelableSnapshotMutableIntState<V> IconCompatParcelizer(evictionCount<T, V> p0) {
        return new setNavigationContentDescription(this.read.IconCompatParcelizer(p0), this.write);
    }

    public final int hashCode() {
        return (this.read.hashCode() * 31) + Long.hashCode(this.write);
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof setLogoDescription)) {
            return false;
        }
        setLogoDescription setlogodescription = (setLogoDescription) p0;
        return setlogodescription.write == this.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setlogodescription.read, this.read);
    }
}
