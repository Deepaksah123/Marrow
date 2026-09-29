package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\t*\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001a\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lo/buffered;", "Lo/bufferMapProperty;", "", "p0", "p1", "Lo/TypeWrappedDeserializer;", "p2", "<init>", "(FFLo/TypeWrappedDeserializer;)V", "Lo/assignParameter;", "Lo/ReadableObjectIdReferring;", "read", "(F)J", "e_", "(J)F", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "F", "IconCompatParcelizer", "()F", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "Lo/TypeWrappedDeserializer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class buffered implements bufferMapProperty {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final float IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final TypeWrappedDeserializer read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;

    public buffered(float f, float f2, TypeWrappedDeserializer typeWrappedDeserializer) {
        this.AudioAttributesCompatParcelizer = f;
        this.IconCompatParcelizer = f2;
        this.read = typeWrappedDeserializer;
    }

    @Override // kotlin.bufferMapProperty
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final float getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.getParameter
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final float getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.getParameter
    public final long read(float f) {
        return setResolver.RemoteActionCompatParcelizer(this.read.AudioAttributesCompatParcelizer(f));
    }

    @Override // kotlin.getParameter
    public final float e_(long j) {
        if (!processUnwrapped.read(ReadableObjectIdReferring.write(j), processUnwrapped.INSTANCE.read())) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        return assignParameter.IconCompatParcelizer(this.read.RemoteActionCompatParcelizer(ReadableObjectIdReferring.AudioAttributesCompatParcelizer(j)));
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof buffered)) {
            return false;
        }
        buffered bufferedVar = (buffered) p0;
        return Float.compare(this.AudioAttributesCompatParcelizer, bufferedVar.AudioAttributesCompatParcelizer) == 0 && Float.compare(this.IconCompatParcelizer, bufferedVar.IconCompatParcelizer) == 0 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, bufferedVar.read);
    }

    public final int hashCode() {
        return (((Float.hashCode(this.AudioAttributesCompatParcelizer) * 31) + Float.hashCode(this.IconCompatParcelizer)) * 31) + this.read.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("buffered(AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", read=");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }
}
