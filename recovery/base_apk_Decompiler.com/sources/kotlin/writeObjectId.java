package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\t\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\t\u0010\u0014"}, d2 = {"Lo/writeObjectId;", "", "Lo/switchToNext;", "p0", "p1", "p2", "p3", "<init>", "(JJJJLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "write", "(JJJJ)Lo/writeObjectId;", "", "read", "(Z)J", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "IconCompatParcelizer", "J", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class writeObjectId {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final long IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final long read;
    private final long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final long AudioAttributesCompatParcelizer;

    private writeObjectId(long j, long j2, long j3, long j4) {
        this.read = j;
        this.IconCompatParcelizer = j2;
        this.RemoteActionCompatParcelizer = j3;
        this.AudioAttributesCompatParcelizer = j4;
    }

    public final writeObjectId write(long p0, long p1, long p2, long p3) {
        return new writeObjectId(p0 == 16 ? this.read : p0, p1 == 16 ? this.IconCompatParcelizer : p1, p2 == 16 ? this.RemoteActionCompatParcelizer : p2, p3 == 16 ? this.AudioAttributesCompatParcelizer : p3, null);
    }

    public final long read(boolean p0) {
        return p0 ? this.read : this.RemoteActionCompatParcelizer;
    }

    public final long write(boolean p0) {
        return p0 ? this.IconCompatParcelizer : this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || !(p0 instanceof writeObjectId)) {
            return false;
        }
        writeObjectId writeobjectid = (writeObjectId) p0;
        return switchToNext.RemoteActionCompatParcelizer(this.read, writeobjectid.read) && switchToNext.RemoteActionCompatParcelizer(this.IconCompatParcelizer, writeobjectid.IconCompatParcelizer) && switchToNext.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, writeobjectid.RemoteActionCompatParcelizer) && switchToNext.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, writeobjectid.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        int iMediaBrowserCompatItemReceiver = switchToNext.MediaBrowserCompatItemReceiver(this.read);
        return (((((iMediaBrowserCompatItemReceiver * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer)) * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer)) * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer);
    }

    public /* synthetic */ writeObjectId(long j, long j2, long j3, long j4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, j2, j3, j4);
    }
}
