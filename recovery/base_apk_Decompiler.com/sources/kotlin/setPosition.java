package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016"}, d2 = {"Lo/setPosition;", "Lo/setUnplayedColor;", "Lo/JsonAppendProp;", "", "p0", "<init>", "(F)V", "Lo/calloc;", "Lo/bufferMapProperty;", "p1", "write", "(JLo/bufferMapProperty;)F", "", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "F", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class setPosition implements setUnplayedColor, JsonAppendProp {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;

    public setPosition(float f) {
        this.AudioAttributesCompatParcelizer = f;
        if (f < BitmapDescriptorFactory.HUE_RED || f > 100.0f) {
            getRootStableInsets.RemoteActionCompatParcelizer("The percent should be in the range of [0, 100]");
        }
    }

    @Override // kotlin.setUnplayedColor
    public final float write(long p0, bufferMapProperty p1) {
        return calloc.IconCompatParcelizer(p0) * (this.AudioAttributesCompatParcelizer / 100.0f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CornerSize(size = ");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append("%)");
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof setPosition) && Float.compare(this.AudioAttributesCompatParcelizer, ((setPosition) p0).AudioAttributesCompatParcelizer) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.AudioAttributesCompatParcelizer);
    }
}
