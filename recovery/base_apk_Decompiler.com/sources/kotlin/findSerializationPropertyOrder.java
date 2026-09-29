package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015"}, d2 = {"Lo/findSerializationPropertyOrder;", "", "", "p0", "p1", "<init>", "(FF)V", "", "AudioAttributesCompatParcelizer", "()[F", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "F", "()F", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class findSerializationPropertyOrder {
    private final float AudioAttributesCompatParcelizer;
    private final float RemoteActionCompatParcelizer;

    public findSerializationPropertyOrder(float f, float f2) {
        this.RemoteActionCompatParcelizer = f;
        this.AudioAttributesCompatParcelizer = f2;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final float getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final float getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final float[] AudioAttributesCompatParcelizer() {
        float f = this.RemoteActionCompatParcelizer;
        float f2 = this.AudioAttributesCompatParcelizer;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof findSerializationPropertyOrder)) {
            return false;
        }
        findSerializationPropertyOrder findserializationpropertyorder = (findSerializationPropertyOrder) p0;
        return Float.compare(this.RemoteActionCompatParcelizer, findserializationpropertyorder.RemoteActionCompatParcelizer) == 0 && Float.compare(this.AudioAttributesCompatParcelizer, findserializationpropertyorder.AudioAttributesCompatParcelizer) == 0;
    }

    public final int hashCode() {
        return (Float.hashCode(this.RemoteActionCompatParcelizer) * 31) + Float.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("findSerializationPropertyOrder(RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
