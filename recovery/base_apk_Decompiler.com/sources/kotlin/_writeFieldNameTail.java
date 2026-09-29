package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0011\u0010$\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\"\u0010#R\u0011\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b!\u0010%R\u0011\u0010'\u001a\u00020\t8\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u0011\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\u0006\n\u0004\b$\u0010(R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u0006\n\u0004\b'\u0010)"}, d2 = {"Lo/_writeFieldNameTail;", "Lo/writerFor;", "Lo/_writeSegmentASCII;", "Lo/isAnnotationBundle;", "p0", "", "p1", "Lo/_skipWSOrEnd;", "p2", "Lo/getContentType;", "p3", "", "p4", "Lo/switchAndReturnNext;", "p5", "<init>", "(Lo/isAnnotationBundle;ZLo/_skipWSOrEnd;Lo/getContentType;FLo/switchAndReturnNext;)V", "read", "()Lo/_writeSegmentASCII;", "", "AudioAttributesCompatParcelizer", "(Lo/_writeSegmentASCII;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesImplApi21Parcelizer", "Lo/isAnnotationBundle;", "IconCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Z", "write", "Lo/_skipWSOrEnd;", "Lo/getContentType;", "RemoteActionCompatParcelizer", "F", "Lo/switchAndReturnNext;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class _writeFieldNameTail extends writerFor<_writeSegmentASCII> {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final isAnnotationBundle IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final _skipWSOrEnd read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final boolean write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final switchAndReturnNext AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getContentType RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;

    public _writeFieldNameTail(isAnnotationBundle isannotationbundle, boolean z, _skipWSOrEnd _skipwsorend, getContentType getcontenttype, float f, switchAndReturnNext switchandreturnnext) {
        this.IconCompatParcelizer = isannotationbundle;
        this.write = z;
        this.read = _skipwsorend;
        this.RemoteActionCompatParcelizer = getcontenttype;
        this.AudioAttributesCompatParcelizer = f;
        this.AudioAttributesImplApi21Parcelizer = switchandreturnnext;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final _writeSegmentASCII IconCompatParcelizer() {
        return new _writeSegmentASCII(this.IconCompatParcelizer, this.write, this.read, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi21Parcelizer);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(_writeSegmentASCII p0) {
        boolean read = p0.getRead();
        boolean z = this.write;
        boolean z2 = read != z || (z && !calloc.RemoteActionCompatParcelizer(p0.getIconCompatParcelizer().read(), this.IconCompatParcelizer.read()));
        p0.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
        p0.read(this.write);
        p0.write(this.read);
        p0.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        p0.write(this.AudioAttributesCompatParcelizer);
        p0.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
        if (z2) {
            _newReader.RemoteActionCompatParcelizer(p0);
        }
        addDeserializers.read(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof _writeFieldNameTail)) {
            return false;
        }
        _writeFieldNameTail _writefieldnametail = (_writeFieldNameTail) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, _writefieldnametail.IconCompatParcelizer) && this.write == _writefieldnametail.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, _writefieldnametail.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, _writefieldnametail.RemoteActionCompatParcelizer) && Float.compare(this.AudioAttributesCompatParcelizer, _writefieldnametail.AudioAttributesCompatParcelizer) == 0 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, _writefieldnametail.AudioAttributesImplApi21Parcelizer);
    }

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iHashCode2 = Boolean.hashCode(this.write);
        int iHashCode3 = this.read.hashCode();
        int iHashCode4 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode5 = Float.hashCode(this.AudioAttributesCompatParcelizer);
        switchAndReturnNext switchandreturnnext = this.AudioAttributesImplApi21Parcelizer;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (switchandreturnnext == null ? 0 : switchandreturnnext.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("_writeFieldNameTail(IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", write=");
        sb.append(this.write);
        sb.append(", read=");
        sb.append(this.read);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(')');
        return sb.toString();
    }
}
