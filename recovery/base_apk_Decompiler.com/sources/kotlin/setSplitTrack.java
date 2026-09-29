package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e\"\b\b\u0001\u0010\f*\u00020\u000b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0004\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u000f\u0010\u001aR\u001a\u0010\u000f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lo/setSplitTrack;", "T", "Lo/setOrientation;", "Lo/setOnQueryTextListener;", "p0", "Lo/setContentInsetsRelative;", "p1", "Lo/setSubtitleTextAppearance;", "p2", "<init>", "(Lo/setOnQueryTextListener;Lo/setContentInsetsRelative;JLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/ScrollingTabContainerView;", "V", "Lo/evictionCount;", "Lo/ParcelableSnapshotMutableIntState;", "IconCompatParcelizer", "(Lo/evictionCount;)Lo/ParcelableSnapshotMutableIntState;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "write", "Lo/setOnQueryTextListener;", "()Lo/setOnQueryTextListener;", "read", "Lo/setContentInsetsRelative;", "RemoteActionCompatParcelizer", "()Lo/setContentInsetsRelative;", "AudioAttributesCompatParcelizer", "J"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setSplitTrack<T> implements setOrientation<T> {
    public static final int RemoteActionCompatParcelizer = 8;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final long read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setContentInsetsRelative IconCompatParcelizer;
    private final setOnQueryTextListener<T> write;

    private setSplitTrack(setOnQueryTextListener<T> setonquerytextlistener, setContentInsetsRelative setcontentinsetsrelative, long j) {
        this.write = setonquerytextlistener;
        this.IconCompatParcelizer = setcontentinsetsrelative;
        this.read = j;
    }

    public final setOnQueryTextListener<T> IconCompatParcelizer() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final setContentInsetsRelative getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.setOrientation
    public final <V extends ScrollingTabContainerView> ParcelableSnapshotMutableIntState<V> IconCompatParcelizer(evictionCount<T, V> p0) {
        return new isInvalidated(this.write.IconCompatParcelizer(p0), this.IconCompatParcelizer, this.read, null);
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof setSplitTrack)) {
            return false;
        }
        setSplitTrack setsplittrack = (setSplitTrack) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setsplittrack.write, this.write) && setsplittrack.IconCompatParcelizer == this.IconCompatParcelizer && setSubtitleTextAppearance.IconCompatParcelizer(setsplittrack.read, this.read);
    }

    public final int hashCode() {
        return (((this.write.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + setSubtitleTextAppearance.read(this.read);
    }

    public /* synthetic */ setSplitTrack(setOnQueryTextListener setonquerytextlistener, setContentInsetsRelative setcontentinsetsrelative, long j, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(setonquerytextlistener, setcontentinsetsrelative, j);
    }
}
