package kotlin;

import kotlin.Metadata;
import kotlin.ScrollingTabContainerView;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\f\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\rR\u001a\u0010\f\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u000e\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0011"}, d2 = {"Lo/DrawChildContainer;", "Lo/ScrollingTabContainerView;", "V", "Lo/ParcelableSnapshotMutableLongState;", "", "p0", "<init>", "(I)V", "", "p1", "p2", "p3", "IconCompatParcelizer", "(JLo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;)Lo/ScrollingTabContainerView;", "read", "I", "write", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DrawChildContainer<V extends ScrollingTabContainerView> implements ParcelableSnapshotMutableLongState<V> {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    @Override // kotlin.ParcelableSnapshotMutableLongState
    public final int read() {
        return 0;
    }

    @Override // kotlin.ParcelableSnapshotMutableIntState
    public final V read(long p0, V p1, V p2, V p3) {
        return p3;
    }

    public DrawChildContainer(int i) {
        this.IconCompatParcelizer = i;
    }

    public /* synthetic */ DrawChildContainer(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    @Override // kotlin.ParcelableSnapshotMutableLongState
    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.ParcelableSnapshotMutableIntState
    public final V IconCompatParcelizer(long p0, V p1, V p2, V p3) {
        return p0 < ((long) getIconCompatParcelizer()) * 1000000 ? p1 : p2;
    }

    public DrawChildContainer() {
        this(0, 1, null);
    }
}
