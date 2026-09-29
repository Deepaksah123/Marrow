package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.findAliases;

/* JADX INFO: loaded from: classes2.dex */
public final class legacyManglePropertyName {
    private double AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private double AudioAttributesImplApi26Parcelizer;
    private double AudioAttributesImplBaseParcelizer;
    private double IconCompatParcelizer;
    private double MediaBrowserCompatCustomActionResultReceiver;
    private final findAliases.read MediaBrowserCompatItemReceiver;
    double RemoteActionCompatParcelizer;
    private double read;
    private double write;

    public legacyManglePropertyName() {
        this.AudioAttributesImplApi26Parcelizer = Math.sqrt(1500.0d);
        this.RemoteActionCompatParcelizer = 0.5d;
        this.AudioAttributesImplApi21Parcelizer = false;
        this.AudioAttributesCompatParcelizer = Double.MAX_VALUE;
        this.MediaBrowserCompatItemReceiver = new findAliases.read();
    }

    public legacyManglePropertyName(float f) {
        this.AudioAttributesImplApi26Parcelizer = Math.sqrt(1500.0d);
        this.RemoteActionCompatParcelizer = 0.5d;
        this.AudioAttributesImplApi21Parcelizer = false;
        this.AudioAttributesCompatParcelizer = Double.MAX_VALUE;
        this.MediaBrowserCompatItemReceiver = new findAliases.read();
        this.AudioAttributesCompatParcelizer = f;
    }

    public final legacyManglePropertyName AudioAttributesCompatParcelizer(float f) {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.AudioAttributesImplApi26Parcelizer = Math.sqrt(f);
        this.AudioAttributesImplApi21Parcelizer = false;
        return this;
    }

    public final legacyManglePropertyName write() {
        this.RemoteActionCompatParcelizer = 1.0d;
        this.AudioAttributesImplApi21Parcelizer = false;
        return this;
    }

    public final legacyManglePropertyName IconCompatParcelizer(float f) {
        this.AudioAttributesCompatParcelizer = f;
        return this;
    }

    public final float RemoteActionCompatParcelizer() {
        return (float) this.AudioAttributesCompatParcelizer;
    }

    public final boolean AudioAttributesCompatParcelizer(float f, float f2) {
        return ((double) Math.abs(f2)) < this.MediaBrowserCompatCustomActionResultReceiver && ((double) Math.abs(f - RemoteActionCompatParcelizer())) < this.AudioAttributesImplBaseParcelizer;
    }

    private void IconCompatParcelizer() {
        if (this.AudioAttributesImplApi21Parcelizer) {
            return;
        }
        if (this.AudioAttributesCompatParcelizer == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d = this.RemoteActionCompatParcelizer;
        if (d > 1.0d) {
            double d2 = this.AudioAttributesImplApi26Parcelizer;
            this.write = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
            double d3 = this.RemoteActionCompatParcelizer;
            double d4 = this.AudioAttributesImplApi26Parcelizer;
            this.IconCompatParcelizer = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
        } else if (d >= 0.0d && d < 1.0d) {
            this.read = this.AudioAttributesImplApi26Parcelizer * Math.sqrt(1.0d - (d * d));
        }
        this.AudioAttributesImplApi21Parcelizer = true;
    }

    final findAliases.read RemoteActionCompatParcelizer(double d, double d2, long j) {
        double dPow;
        double dCos;
        IconCompatParcelizer();
        double d3 = j / 1000.0d;
        double d4 = d - this.AudioAttributesCompatParcelizer;
        double d5 = this.RemoteActionCompatParcelizer;
        if (d5 > 1.0d) {
            double d6 = this.IconCompatParcelizer;
            double d7 = ((d6 * d4) - d2) / (d6 - this.write);
            double d8 = d4 - d7;
            dPow = (Math.pow(2.718281828459045d, d6 * d3) * d8) + (Math.pow(2.718281828459045d, this.write * d3) * d7);
            double d9 = this.IconCompatParcelizer;
            double dPow2 = Math.pow(2.718281828459045d, d9 * d3);
            double d10 = this.write;
            dCos = (d8 * d9 * dPow2) + (d7 * d10 * Math.pow(2.718281828459045d, d10 * d3));
        } else if (d5 == 1.0d) {
            double d11 = this.AudioAttributesImplApi26Parcelizer;
            double d12 = d2 + (d11 * d4);
            double d13 = d4 + (d12 * d3);
            dPow = Math.pow(2.718281828459045d, (-d11) * d3) * d13;
            double dPow3 = Math.pow(2.718281828459045d, (-this.AudioAttributesImplApi26Parcelizer) * d3);
            double d14 = -this.AudioAttributesImplApi26Parcelizer;
            dCos = (d13 * dPow3 * d14) + (d12 * Math.pow(2.718281828459045d, d3 * d14));
        } else {
            double d15 = 1.0d / this.read;
            double d16 = this.AudioAttributesImplApi26Parcelizer;
            double d17 = d15 * ((d5 * d16 * d4) + d2);
            dPow = Math.pow(2.718281828459045d, (-d5) * d16 * d3) * ((Math.cos(this.read * d3) * d4) + (Math.sin(this.read * d3) * d17));
            double d18 = this.AudioAttributesImplApi26Parcelizer;
            double d19 = -d18;
            double d20 = this.RemoteActionCompatParcelizer;
            double dPow4 = Math.pow(2.718281828459045d, (-d20) * d18 * d3);
            double d21 = this.read;
            double d22 = -d21;
            double dSin = Math.sin(d21 * d3);
            double d23 = this.read;
            dCos = (d19 * dPow * d20) + (((d22 * d4 * dSin) + (d17 * d23 * Math.cos(d23 * d3))) * dPow4);
        }
        this.MediaBrowserCompatItemReceiver.IconCompatParcelizer = (float) (dPow + this.AudioAttributesCompatParcelizer);
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer = (float) dCos;
        return this.MediaBrowserCompatItemReceiver;
    }

    final void AudioAttributesCompatParcelizer(double d) {
        double dAbs = Math.abs(d);
        this.AudioAttributesImplBaseParcelizer = dAbs;
        this.MediaBrowserCompatCustomActionResultReceiver = dAbs * 62.5d;
    }
}
