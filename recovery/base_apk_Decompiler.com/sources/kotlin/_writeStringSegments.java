package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0016\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e"}, d2 = {"Lo/_writeStringSegments;", "", "", "p0", "", "p1", "Lo/_flushBuffer;", "p2", "Lo/findOverride;", "p3", "<init>", "(IJLo/_flushBuffer;Lo/findOverride;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "I", "RemoteActionCompatParcelizer", "write", "read", "J", "AudioAttributesCompatParcelizer", "Lo/_flushBuffer;", "()Lo/_flushBuffer;", "Lo/findOverride;", "()Lo/findOverride;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class _writeStringSegments {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final _flushBuffer RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final long IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final findOverride AudioAttributesCompatParcelizer;

    public _writeStringSegments(int i, long j, _flushBuffer _flushbuffer, findOverride findoverride) {
        this.write = i;
        this.IconCompatParcelizer = j;
        this.RemoteActionCompatParcelizer = _flushbuffer;
        this.AudioAttributesCompatParcelizer = findoverride;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final _flushBuffer getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final findOverride getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof _writeStringSegments)) {
            return false;
        }
        _writeStringSegments _writestringsegments = (_writeStringSegments) p0;
        return this.write == _writestringsegments.write && this.IconCompatParcelizer == _writestringsegments.IconCompatParcelizer && this.RemoteActionCompatParcelizer == _writestringsegments.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, _writestringsegments.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.write);
        int iHashCode2 = Long.hashCode(this.IconCompatParcelizer);
        int iHashCode3 = this.RemoteActionCompatParcelizer.hashCode();
        findOverride findoverride = this.AudioAttributesCompatParcelizer;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (findoverride == null ? 0 : findoverride.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("_writeStringSegments(write=");
        sb.append(this.write);
        sb.append(", IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
