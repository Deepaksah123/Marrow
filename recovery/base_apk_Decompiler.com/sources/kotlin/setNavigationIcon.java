package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\u00020\u00028\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005R\u0016\u0010\u000e\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R$\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0012\"\u0004\b\u000f\u0010\u0005R*\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u0012\"\u0004\b\u0013\u0010\u0005"}, d2 = {"Lo/setNavigationIcon;", "", "", "p0", "<init>", "(F)V", "p1", "", "p2", "Lo/setTrackTintList;", "IconCompatParcelizer", "(FFJ)J", "write", "F", "RemoteActionCompatParcelizer", "read", "", "D", "()F", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setNavigationIcon {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private float read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private double RemoteActionCompatParcelizer = Math.sqrt(50.0d);

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private float AudioAttributesCompatParcelizer = 1.0f;

    public setNavigationIcon(float f) {
        this.read = f;
    }

    public final void RemoteActionCompatParcelizer(float f) {
        this.read = f;
    }

    public final void read(float f) {
        if (RemoteActionCompatParcelizer() <= BitmapDescriptorFactory.HUE_RED) {
            setCollapsible.write("Spring stiffness constant must be positive.");
        }
        this.RemoteActionCompatParcelizer = Math.sqrt(f);
    }

    public final float RemoteActionCompatParcelizer() {
        double d = this.RemoteActionCompatParcelizer;
        return (float) (d * d);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final float getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            setCollapsible.write("Damping ratio must be non-negative");
        }
        this.AudioAttributesCompatParcelizer = f;
    }

    public final long IconCompatParcelizer(float p0, float p1, long p2) {
        double dSin;
        double dExp;
        float f = p0 - this.read;
        double d = p2 / 1000.0d;
        float f2 = this.AudioAttributesCompatParcelizer;
        double d2 = f2;
        double d3 = d2 * d2;
        double d4 = this.RemoteActionCompatParcelizer;
        double d5 = ((double) (-f2)) * d4;
        if (f2 > 1.0f) {
            double dSqrt = d4 * Math.sqrt(d3 - 1.0d);
            double d6 = d5 + dSqrt;
            double d7 = d5 - dSqrt;
            double d8 = f;
            double d9 = ((d7 * d8) - ((double) p1)) / (d7 - d6);
            double d10 = d8 - d9;
            double d11 = d7 * d;
            double d12 = d * d6;
            dExp = (Math.exp(d11) * d10) + (Math.exp(d12) * d9);
            dSin = (d10 * d7 * Math.exp(d11)) + (d9 * d6 * Math.exp(d12));
        } else if (f2 == 1.0f) {
            double d13 = f;
            double d14 = ((double) p1) + (d4 * d13);
            double d15 = (-d4) * d;
            double d16 = d13 + (d * d14);
            dExp = d16 * Math.exp(d15);
            dSin = (d16 * Math.exp(d15) * (-this.RemoteActionCompatParcelizer)) + (d14 * Math.exp(d15));
        } else {
            double dSqrt2 = d4 * Math.sqrt(1.0d - d3);
            double d17 = f;
            double d18 = (1.0d / dSqrt2) * (((-d5) * d17) + ((double) p1));
            double d19 = dSqrt2 * d;
            double d20 = d * d5;
            double dExp2 = Math.exp(d20) * ((Math.cos(d19) * d17) + (Math.sin(d19) * d18));
            dSin = (d5 * dExp2) + ((((-dSqrt2) * d17 * Math.sin(d19)) + (dSqrt2 * d18 * Math.cos(d19))) * Math.exp(d20));
            dExp = dExp2;
        }
        long j = -1;
        return setTrackTintList.RemoteActionCompatParcelizer((((long) Float.floatToRawIntBits((float) dSin)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits((float) (dExp + ((double) this.read)))) << 32));
    }
}
