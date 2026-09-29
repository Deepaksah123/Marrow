package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
public final class consume extends getBitrateFromFrameSize implements Cloneable {
    private float AudioAttributesCompatParcelizer = -1.0f;
    private float IconCompatParcelizer;
    private float MediaBrowserCompatCustomActionResultReceiver;
    private float RemoteActionCompatParcelizer;
    private float read;
    private float write;

    public consume(float f, float f2, float f3) {
        this.RemoteActionCompatParcelizer = f;
        this.MediaBrowserCompatCustomActionResultReceiver = f2;
        read(f3);
        this.IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // kotlin.getBitrateFromFrameSize
    public final void read(float f, float f2, float f3, peekNextSampleSize peeknextsamplesize) {
        float f4;
        float f5;
        float f6 = this.read;
        if (f6 == BitmapDescriptorFactory.HUE_RED) {
            peeknextsamplesize.write(f, BitmapDescriptorFactory.HUE_RED);
            return;
        }
        float f7 = ((this.RemoteActionCompatParcelizer * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.MediaBrowserCompatCustomActionResultReceiver;
        float f9 = f2 + this.IconCompatParcelizer;
        float f10 = (this.write * f3) + ((1.0f - f3) * f7);
        if (f10 / f7 >= 1.0f) {
            peeknextsamplesize.write(f, BitmapDescriptorFactory.HUE_RED);
            return;
        }
        float f11 = this.AudioAttributesCompatParcelizer;
        float f12 = f11 * f3;
        boolean z = f11 == -1.0f || Math.abs((f11 * 2.0f) - f6) < 0.1f;
        if (z) {
            f4 = f10;
            f5 = 0.0f;
        } else {
            f5 = 1.75f;
            f4 = 0.0f;
        }
        float f13 = f7 + f8;
        float f14 = f4 + f8;
        float fSqrt = (float) Math.sqrt((f13 * f13) - (f14 * f14));
        float f15 = f9 - fSqrt;
        float f16 = f9 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f14));
        float f17 = (90.0f - degrees) + f5;
        peeknextsamplesize.write(f15, BitmapDescriptorFactory.HUE_RED);
        float f18 = f8 * 2.0f;
        peeknextsamplesize.IconCompatParcelizer(f15 - f8, BitmapDescriptorFactory.HUE_RED, f15 + f8, f18, 270.0f, degrees);
        if (z) {
            peeknextsamplesize.IconCompatParcelizer(f9 - f7, (-f7) - f4, f9 + f7, f7 - f4, 180.0f - f17, (f17 * 2.0f) - 180.0f);
        } else {
            float f19 = this.RemoteActionCompatParcelizer;
            float f20 = f12 * 2.0f;
            float f21 = f9 - f7;
            float f22 = f12 + f19;
            peeknextsamplesize.IconCompatParcelizer(f21, -f22, f19 + f20 + f21, f22, 180.0f - f17, ((f17 * 2.0f) - 180.0f) / 2.0f);
            float f23 = f9 + f7;
            float f24 = this.RemoteActionCompatParcelizer;
            peeknextsamplesize.write(f23 - ((f24 / 2.0f) + f12), f24 + f12);
            float f25 = this.RemoteActionCompatParcelizer;
            float f26 = f12 + f25;
            peeknextsamplesize.IconCompatParcelizer(f23 - (f20 + f25), -f26, f23, f26, 90.0f, f17 - 90.0f);
        }
        peeknextsamplesize.IconCompatParcelizer(f16 - f8, BitmapDescriptorFactory.HUE_RED, f16 + f8, f18, 270.0f - degrees, degrees);
        peeknextsamplesize.write(f, BitmapDescriptorFactory.HUE_RED);
    }

    public final float write() {
        return this.read;
    }

    public final void RemoteActionCompatParcelizer(float f) {
        this.read = f;
    }

    public final void AudioAttributesImplApi21Parcelizer(float f) {
        this.IconCompatParcelizer = f;
    }

    public final float MediaBrowserCompatCustomActionResultReceiver() {
        return this.IconCompatParcelizer;
    }

    public final float AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final void read(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.write = f;
    }

    public final float RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        this.RemoteActionCompatParcelizer = f;
    }

    public final float read() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void IconCompatParcelizer(float f) {
        this.MediaBrowserCompatCustomActionResultReceiver = f;
    }

    public final float IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void write(float f) {
        this.AudioAttributesCompatParcelizer = f;
    }
}
