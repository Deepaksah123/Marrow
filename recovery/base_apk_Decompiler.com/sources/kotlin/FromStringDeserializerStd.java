package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class FromStringDeserializerStd implements _shouldTrim {
    private double AudioAttributesImplApi21Parcelizer;
    private float AudioAttributesImplApi26Parcelizer;
    private double AudioAttributesImplBaseParcelizer;
    private float MediaBrowserCompatCustomActionResultReceiver;
    private float MediaBrowserCompatItemReceiver;
    private float MediaBrowserCompatMediaItem;
    private double read;
    private float write;
    private double AudioAttributesCompatParcelizer = 0.5d;
    private boolean IconCompatParcelizer = false;
    private int RemoteActionCompatParcelizer = 0;

    @Override // kotlin._shouldTrim
    public final float RemoteActionCompatParcelizer() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    public final void read(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        this.AudioAttributesImplApi21Parcelizer = f2;
        this.AudioAttributesCompatParcelizer = f6;
        this.IconCompatParcelizer = false;
        this.MediaBrowserCompatCustomActionResultReceiver = f;
        this.read = f3;
        this.AudioAttributesImplBaseParcelizer = f5;
        this.AudioAttributesImplApi26Parcelizer = f4;
        this.MediaBrowserCompatItemReceiver = f7;
        this.RemoteActionCompatParcelizer = i;
        this.write = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // kotlin._shouldTrim
    public final float write(float f) {
        RemoteActionCompatParcelizer(f - this.write);
        this.write = f;
        if (write()) {
            this.MediaBrowserCompatCustomActionResultReceiver = (float) this.AudioAttributesImplApi21Parcelizer;
        }
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin._shouldTrim
    public final boolean write() {
        double d = ((double) this.MediaBrowserCompatCustomActionResultReceiver) - this.AudioAttributesImplApi21Parcelizer;
        double d2 = this.AudioAttributesImplBaseParcelizer;
        double d3 = this.MediaBrowserCompatMediaItem;
        return Math.sqrt((((d3 * d3) * ((double) this.AudioAttributesImplApi26Parcelizer)) + ((d2 * d) * d)) / d2) <= ((double) this.MediaBrowserCompatItemReceiver);
    }

    private void RemoteActionCompatParcelizer(double d) {
        if (d > 0.0d) {
            double d2 = this.AudioAttributesImplBaseParcelizer;
            double d3 = this.AudioAttributesCompatParcelizer;
            int iSqrt = (int) ((9.0d / ((Math.sqrt(d2 / ((double) this.AudioAttributesImplApi26Parcelizer)) * d) * 4.0d)) + 1.0d);
            double d4 = d / ((double) iSqrt);
            int i = 0;
            while (i < iSqrt) {
                float f = this.MediaBrowserCompatCustomActionResultReceiver;
                double d5 = f;
                double d6 = this.AudioAttributesImplApi21Parcelizer;
                int i2 = iSqrt;
                float f2 = this.MediaBrowserCompatMediaItem;
                int i3 = i;
                double d7 = f2;
                double d8 = ((-d2) * (d5 - d6)) - (d7 * d3);
                double d9 = d3;
                double d10 = this.AudioAttributesImplApi26Parcelizer;
                double d11 = (((d8 / d10) * d4) / 2.0d) + d7;
                double d12 = ((((-((d5 + ((d4 * d11) / 2.0d)) - d6)) * d2) - (d11 * d9)) / d10) * d4;
                float f3 = f2 + ((float) d12);
                this.MediaBrowserCompatMediaItem = f3;
                float f4 = f + ((float) ((d7 + (d12 / 2.0d)) * d4));
                this.MediaBrowserCompatCustomActionResultReceiver = f4;
                int i4 = this.RemoteActionCompatParcelizer;
                if (i4 > 0) {
                    if (f4 < BitmapDescriptorFactory.HUE_RED && (i4 & 1) == 1) {
                        this.MediaBrowserCompatCustomActionResultReceiver = -f4;
                        this.MediaBrowserCompatMediaItem = -f3;
                    }
                    float f5 = this.MediaBrowserCompatCustomActionResultReceiver;
                    if (f5 > 1.0f && (i4 & 2) == 2) {
                        this.MediaBrowserCompatCustomActionResultReceiver = 2.0f - f5;
                        this.MediaBrowserCompatMediaItem = -this.MediaBrowserCompatMediaItem;
                    }
                }
                i = i3 + 1;
                iSqrt = i2;
                d3 = d9;
            }
        }
    }
}
