package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n\"\b\b\u0001\u0010\b*\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/setContentInsetStartWithNavigation;", "T", "Lo/setOnQueryTextListener;", "", "p0", "<init>", "(I)V", "Lo/ScrollingTabContainerView;", "V", "Lo/evictionCount;", "Lo/ParcelableSnapshotMutableLongState;", "RemoteActionCompatParcelizer", "(Lo/evictionCount;)Lo/ParcelableSnapshotMutableLongState;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "IconCompatParcelizer", "I", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setContentInsetStartWithNavigation<T> implements setOnQueryTextListener<T> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int write;

    public setContentInsetStartWithNavigation(int i) {
        this.write = i;
    }

    public /* synthetic */ setContentInsetStartWithNavigation(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    @Override // kotlin.setOrientation
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final <V extends ScrollingTabContainerView> ParcelableSnapshotMutableLongState<V> IconCompatParcelizer(evictionCount<T, V> p0) {
        return new DrawChildContainer(this.write);
    }

    public final boolean equals(Object p0) {
        return (p0 instanceof setContentInsetStartWithNavigation) && ((setContentInsetStartWithNavigation) p0).write == this.write;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    public setContentInsetStartWithNavigation() {
        this(0, 1, null);
    }
}
