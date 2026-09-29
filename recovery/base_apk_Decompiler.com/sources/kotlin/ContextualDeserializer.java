package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012"}, d2 = {"Lo/ContextualDeserializer;", "Lo/tryToResolveUnresolvedObjectId;", "", "p0", "<init>", "(I)V", "Lo/getDataStream;", "AudioAttributesCompatParcelizer", "(Lo/getDataStream;)Lo/getDataStream;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ContextualDeserializer implements tryToResolveUnresolvedObjectId {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int write;

    public ContextualDeserializer(int i) {
        this.write = i;
    }

    @Override // kotlin.tryToResolveUnresolvedObjectId
    public final getDataStream AudioAttributesCompatParcelizer(getDataStream p0) {
        int i = this.write;
        return (i == 0 || i == Integer.MAX_VALUE) ? p0 : new getDataStream(getQues.write(p0.getAudioAttributesCompatParcelizer() + this.write, 1, 1000));
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof ContextualDeserializer) && this.write == ((ContextualDeserializer) p0).write;
    }

    public final int hashCode() {
        return Integer.hashCode(this.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextualDeserializer(write=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
