package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lo/weirdNativeValueException;", "", "", "p0", "p1", "", "p2", "", "p3", "<init>", "(FFJI)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "F", "read", "RemoteActionCompatParcelizer", "write", "J", "AudioAttributesCompatParcelizer", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class weirdNativeValueException {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final float read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final float write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final long AudioAttributesCompatParcelizer;

    public weirdNativeValueException(float f, float f2, long j, int i) {
        this.read = f;
        this.write = f2;
        this.AudioAttributesCompatParcelizer = j;
        this.IconCompatParcelizer = i;
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof weirdNativeValueException)) {
            return false;
        }
        weirdNativeValueException weirdnativevalueexception = (weirdNativeValueException) p0;
        return weirdnativevalueexception.read == this.read && weirdnativevalueexception.write == this.write && weirdnativevalueexception.AudioAttributesCompatParcelizer == this.AudioAttributesCompatParcelizer && weirdnativevalueexception.IconCompatParcelizer == this.IconCompatParcelizer;
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.read);
        return (((((iHashCode * 31) + Float.hashCode(this.write)) * 31) + Long.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        sb.append(this.read);
        sb.append(",horizontalScrollPixels=");
        sb.append(this.write);
        sb.append(",uptimeMillis=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(",deviceId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
