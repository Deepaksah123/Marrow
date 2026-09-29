package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019"}, d2 = {"Lo/setMaxWidth;", "Lo/setOnQueryTextFocusChangeListener;", "", "p0", "p1", "p2", "p3", "<init>", "(FFFF)V", "AudioAttributesCompatParcelizer", "(F)F", "", "RemoteActionCompatParcelizer", "(F)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "write", "F", "IconCompatParcelizer", "read", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setMaxWidth implements setOnQueryTextFocusChangeListener {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final float write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final float AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final float read;
    private final float RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final float IconCompatParcelizer;

    public setMaxWidth(float f, float f2, float f3, float f4) {
        this.IconCompatParcelizer = f;
        this.RemoteActionCompatParcelizer = f2;
        this.AudioAttributesCompatParcelizer = f3;
        this.write = f4;
        if (Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) {
            StringBuilder sb = new StringBuilder("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ");
            sb.append(f);
            sb.append(", ");
            sb.append(f2);
            sb.append(", ");
            sb.append(f3);
            sb.append(", ");
            sb.append(f4);
            sb.append('.');
            setCollapsible.write(sb.toString());
        }
        long jAudioAttributesCompatParcelizer = DefaultPrettyPrinterNopIndenter.AudioAttributesCompatParcelizer(BitmapDescriptorFactory.HUE_RED, f2, f4, 1.0f, new float[5], 0);
        this.read = Float.intBitsToFloat((int) (jAudioAttributesCompatParcelizer >> 32));
        this.AudioAttributesImplBaseParcelizer = Float.intBitsToFloat((int) jAudioAttributesCompatParcelizer);
    }

    @Override // kotlin.setOnQueryTextFocusChangeListener
    public final float AudioAttributesCompatParcelizer(float p0) {
        if (p0 > BitmapDescriptorFactory.HUE_RED && p0 < 1.0f) {
            float fMax = Math.max(p0, 1.1920929E-7f);
            float fRemoteActionCompatParcelizer = DefaultPrettyPrinterNopIndenter.RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED - fMax, this.IconCompatParcelizer - fMax, this.AudioAttributesCompatParcelizer - fMax, 1.0f - fMax);
            if (Float.isNaN(fRemoteActionCompatParcelizer)) {
                RemoteActionCompatParcelizer(p0);
            }
            p0 = DefaultPrettyPrinterNopIndenter.write(this.RemoteActionCompatParcelizer, this.write, fRemoteActionCompatParcelizer);
            float f = this.read;
            float f2 = this.AudioAttributesImplBaseParcelizer;
            if (p0 < f) {
                p0 = f;
            }
            if (p0 > f2) {
                return f2;
            }
        }
        return p0;
    }

    private final void RemoteActionCompatParcelizer(float p0) {
        StringBuilder sb = new StringBuilder("The cubic curve with parameters (");
        sb.append(this.IconCompatParcelizer);
        sb.append(", ");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", ");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", ");
        sb.append(this.write);
        sb.append(") has no solution at ");
        sb.append(p0);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof setMaxWidth)) {
            return false;
        }
        setMaxWidth setmaxwidth = (setMaxWidth) p0;
        return this.IconCompatParcelizer == setmaxwidth.IconCompatParcelizer && this.RemoteActionCompatParcelizer == setmaxwidth.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer == setmaxwidth.AudioAttributesCompatParcelizer && this.write == setmaxwidth.write;
    }

    public final int hashCode() {
        return (((((Float.hashCode(this.IconCompatParcelizer) * 31) + Float.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Float.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Float.hashCode(this.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", b=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", c=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", d=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
