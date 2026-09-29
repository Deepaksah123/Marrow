package kotlin;

import kotlin.Metadata;
import kotlin.ScrollingTabContainerView;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\r\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0004\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lo/setNavigationContentDescription;", "Lo/ScrollingTabContainerView;", "V", "Lo/ParcelableSnapshotMutableIntState;", "p0", "", "p1", "<init>", "(Lo/ParcelableSnapshotMutableIntState;J)V", "p2", "write", "(Lo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;)J", "p3", "read", "(JLo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;)Lo/ScrollingTabContainerView;", "IconCompatParcelizer", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "RemoteActionCompatParcelizer", "Lo/ParcelableSnapshotMutableIntState;", "J", "AudioAttributesCompatParcelizer", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setNavigationContentDescription<V extends ScrollingTabContainerView> implements ParcelableSnapshotMutableIntState<V> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final long read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final ParcelableSnapshotMutableIntState<V> write;

    public setNavigationContentDescription(ParcelableSnapshotMutableIntState<V> parcelableSnapshotMutableIntState, long j) {
        this.write = parcelableSnapshotMutableIntState;
        this.read = j;
    }

    @Override // kotlin.ParcelableSnapshotMutableIntState
    public final boolean AudioAttributesCompatParcelizer() {
        return this.write.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.ParcelableSnapshotMutableIntState
    public final long write(V p0, V p1, V p2) {
        return this.write.write(p0, p1, p2) + this.read;
    }

    @Override // kotlin.ParcelableSnapshotMutableIntState
    public final V read(long p0, V p1, V p2, V p3) {
        long j = this.read;
        return p0 < j ? p3 : (V) this.write.read(p0 - j, p1, p2, p3);
    }

    @Override // kotlin.ParcelableSnapshotMutableIntState
    public final V IconCompatParcelizer(long p0, V p1, V p2, V p3) {
        long j = this.read;
        return p0 < j ? p1 : (V) this.write.IconCompatParcelizer(p0 - j, p1, p2, p3);
    }

    public final int hashCode() {
        return (this.write.hashCode() * 31) + Long.hashCode(this.read);
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof setNavigationContentDescription)) {
            return false;
        }
        setNavigationContentDescription setnavigationcontentdescription = (setNavigationContentDescription) p0;
        return setnavigationcontentdescription.read == this.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setnavigationcontentdescription.write, this.write);
    }
}
