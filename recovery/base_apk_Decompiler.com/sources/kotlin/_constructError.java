package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u000e\u0010\u0016R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014"}, d2 = {"Lo/_constructError;", "", "Lo/switchToNext;", "p0", "p1", "p2", "p3", "<init>", "(JJJJLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "IconCompatParcelizer", "(JJJJ)Lo/_constructError;", "", "AudioAttributesCompatParcelizer", "(Z)J", "write", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "read", "()J", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _constructError {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final long IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final long write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final long AudioAttributesCompatParcelizer;

    private _constructError(long j, long j2, long j3, long j4) {
        this.AudioAttributesCompatParcelizer = j;
        this.write = j2;
        this.IconCompatParcelizer = j3;
        this.RemoteActionCompatParcelizer = j4;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final long getWrite() {
        return this.write;
    }

    public final _constructError IconCompatParcelizer(long p0, long p1, long p2, long p3) {
        return new _constructError(p0 == 16 ? this.AudioAttributesCompatParcelizer : p0, p1 == 16 ? this.write : p1, p2 == 16 ? this.IconCompatParcelizer : p2, p3 == 16 ? this.RemoteActionCompatParcelizer : p3, null);
    }

    public final long AudioAttributesCompatParcelizer(boolean p0) {
        return p0 ? this.AudioAttributesCompatParcelizer : this.IconCompatParcelizer;
    }

    public final long write(boolean p0) {
        return p0 ? this.write : this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || !(p0 instanceof _constructError)) {
            return false;
        }
        _constructError _constructerror = (_constructError) p0;
        return switchToNext.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, _constructerror.AudioAttributesCompatParcelizer) && switchToNext.RemoteActionCompatParcelizer(this.write, _constructerror.write) && switchToNext.RemoteActionCompatParcelizer(this.IconCompatParcelizer, _constructerror.IconCompatParcelizer) && switchToNext.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, _constructerror.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        int iMediaBrowserCompatItemReceiver = switchToNext.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer);
        return (((((iMediaBrowserCompatItemReceiver * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.write)) * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer)) * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer);
    }

    public /* synthetic */ _constructError(long j, long j2, long j3, long j4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, j2, j3, j4);
    }
}
