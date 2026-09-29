package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u0006\n\u0004\b\u001b\u0010\u001e"}, d2 = {"Lo/handleUnknownTypeId;", "Lo/writerFor;", "Lo/keyDeserializerInstance;", "Lo/extractScalarFromObject;", "p0", "", "p1", "Lo/addKeyDeserializers;", "p2", "<init>", "(Lo/extractScalarFromObject;ZLo/addKeyDeserializers;)V", "write", "()Lo/keyDeserializerInstance;", "", "AudioAttributesCompatParcelizer", "(Lo/keyDeserializerInstance;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "Lo/extractScalarFromObject;", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "Z", "Lo/addKeyDeserializers;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class handleUnknownTypeId extends writerFor<keyDeserializerInstance> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final addKeyDeserializers read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final extractScalarFromObject IconCompatParcelizer;

    public handleUnknownTypeId(extractScalarFromObject extractscalarfromobject, boolean z, addKeyDeserializers addkeydeserializers) {
        this.IconCompatParcelizer = extractscalarfromobject;
        this.write = z;
        this.read = addkeydeserializers;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final keyDeserializerInstance IconCompatParcelizer() {
        return new keyDeserializerInstance(this.IconCompatParcelizer, this.write, this.read);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(keyDeserializerInstance p0) {
        p0.write(this.IconCompatParcelizer);
        p0.read(this.write);
        p0.RemoteActionCompatParcelizer(this.read);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof handleUnknownTypeId)) {
            return false;
        }
        handleUnknownTypeId handleunknowntypeid = (handleUnknownTypeId) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, handleunknowntypeid.IconCompatParcelizer) && this.write == handleunknowntypeid.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, handleunknowntypeid.read);
    }

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iHashCode2 = Boolean.hashCode(this.write);
        addKeyDeserializers addkeydeserializers = this.read;
        return (((iHashCode * 31) + iHashCode2) * 31) + (addkeydeserializers == null ? 0 : addkeydeserializers.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("handleUnknownTypeId(IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", write=");
        sb.append(this.write);
        sb.append(", read=");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }
}
