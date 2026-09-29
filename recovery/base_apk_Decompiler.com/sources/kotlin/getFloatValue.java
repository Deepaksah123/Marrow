package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\f\u0010\u0016"}, d2 = {"Lo/getFloatValue;", "", "Lo/switchToNext;", "p0", "p1", "p2", "p3", "p4", "p5", "<init>", "(JJJJJJLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "AudioAttributesCompatParcelizer", "(Z)J", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "read", "J", "write", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getFloatValue {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final long AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final long IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final long write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final long AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final long read;

    private getFloatValue(long j, long j2, long j3, long j4, long j5, long j6) {
        this.AudioAttributesCompatParcelizer = j;
        this.read = j2;
        this.IconCompatParcelizer = j3;
        this.RemoteActionCompatParcelizer = j4;
        this.write = j5;
        this.AudioAttributesImplApi21Parcelizer = j6;
    }

    public final long AudioAttributesCompatParcelizer(boolean p0) {
        return p0 ? this.AudioAttributesCompatParcelizer : this.RemoteActionCompatParcelizer;
    }

    public final long IconCompatParcelizer(boolean p0) {
        return p0 ? this.read : this.write;
    }

    public final long RemoteActionCompatParcelizer(boolean p0) {
        return p0 ? this.IconCompatParcelizer : this.AudioAttributesImplApi21Parcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || !(p0 instanceof getFloatValue)) {
            return false;
        }
        getFloatValue getfloatvalue = (getFloatValue) p0;
        return switchToNext.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, getfloatvalue.AudioAttributesCompatParcelizer) && switchToNext.RemoteActionCompatParcelizer(this.read, getfloatvalue.read) && switchToNext.RemoteActionCompatParcelizer(this.IconCompatParcelizer, getfloatvalue.IconCompatParcelizer) && switchToNext.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, getfloatvalue.RemoteActionCompatParcelizer) && switchToNext.RemoteActionCompatParcelizer(this.write, getfloatvalue.write) && switchToNext.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, getfloatvalue.AudioAttributesImplApi21Parcelizer);
    }

    public final int hashCode() {
        int iMediaBrowserCompatItemReceiver = switchToNext.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer);
        int iMediaBrowserCompatItemReceiver2 = switchToNext.MediaBrowserCompatItemReceiver(this.read);
        int iMediaBrowserCompatItemReceiver3 = switchToNext.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer);
        return (((((((((iMediaBrowserCompatItemReceiver * 31) + iMediaBrowserCompatItemReceiver2) * 31) + iMediaBrowserCompatItemReceiver3) * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer)) * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.write)) * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.AudioAttributesImplApi21Parcelizer);
    }

    public /* synthetic */ getFloatValue(long j, long j2, long j3, long j4, long j5, long j6, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, j2, j3, j4, j5, j6);
    }
}
