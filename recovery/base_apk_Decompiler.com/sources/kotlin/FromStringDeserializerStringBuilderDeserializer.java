package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class FromStringDeserializerStringBuilderDeserializer implements _shouldTrim {
    private float AudioAttributesCompatParcelizer;
    private float AudioAttributesImplApi21Parcelizer;
    private float AudioAttributesImplApi26Parcelizer;
    private float AudioAttributesImplBaseParcelizer;
    private float MediaBrowserCompatCustomActionResultReceiver;
    private float MediaBrowserCompatItemReceiver;
    private float MediaBrowserCompatMediaItem;
    private float MediaBrowserCompatSearchResultReceiver;
    private float MediaDescriptionCompat;
    private float MediaMetadataCompat;
    private float RatingCompat;
    private float RemoteActionCompatParcelizer;
    private String onCommand;
    private int read;
    private boolean IconCompatParcelizer = false;
    private boolean write = false;

    private float RemoteActionCompatParcelizer(float f) {
        float f2;
        float f3;
        float f4 = this.AudioAttributesImplApi26Parcelizer;
        if (f <= f4) {
            f2 = this.MediaBrowserCompatCustomActionResultReceiver;
            f3 = this.RatingCompat;
        } else {
            int i = this.read;
            if (i == 1) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            f -= f4;
            f4 = this.MediaBrowserCompatItemReceiver;
            if (f >= f4) {
                if (i == 2) {
                    return BitmapDescriptorFactory.HUE_RED;
                }
                float f5 = f - f4;
                float f6 = this.MediaBrowserCompatSearchResultReceiver;
                if (f5 >= f6) {
                    return BitmapDescriptorFactory.HUE_RED;
                }
                float f7 = this.MediaDescriptionCompat;
                return f7 - ((f5 * f7) / f6);
            }
            f2 = this.RatingCompat;
            f3 = this.MediaDescriptionCompat;
        }
        return f2 + (((f3 - f2) * f) / f4);
    }

    private float IconCompatParcelizer(float f) {
        this.write = false;
        float f2 = this.AudioAttributesImplApi26Parcelizer;
        if (f <= f2) {
            float f3 = this.MediaBrowserCompatCustomActionResultReceiver;
            return (f3 * f) + ((((this.RatingCompat - f3) * f) * f) / (f2 * 2.0f));
        }
        int i = this.read;
        if (i == 1) {
            return this.AudioAttributesImplBaseParcelizer;
        }
        float f4 = f - f2;
        float f5 = this.MediaBrowserCompatItemReceiver;
        if (f4 < f5) {
            float f6 = this.AudioAttributesImplBaseParcelizer;
            float f7 = this.RatingCompat;
            return f6 + (f7 * f4) + ((((this.MediaDescriptionCompat - f7) * f4) * f4) / (f5 * 2.0f));
        }
        if (i == 2) {
            return this.AudioAttributesImplApi21Parcelizer;
        }
        float f8 = f4 - f5;
        float f9 = this.MediaBrowserCompatSearchResultReceiver;
        if (f8 <= f9) {
            float f10 = this.AudioAttributesImplApi21Parcelizer;
            float f11 = this.MediaDescriptionCompat * f8;
            return (f10 + f11) - ((f11 * f8) / (f9 * 2.0f));
        }
        this.write = true;
        return this.MediaMetadataCompat;
    }

    public final void RemoteActionCompatParcelizer(float f, float f2, float f3, float f4, float f5, float f6) {
        this.write = false;
        this.MediaBrowserCompatMediaItem = f;
        boolean z = f > f2;
        this.IconCompatParcelizer = z;
        if (z) {
            AudioAttributesCompatParcelizer(-f3, f - f2, f5, f6, f4);
        } else {
            AudioAttributesCompatParcelizer(f3, f2 - f, f5, f6, f4);
        }
    }

    @Override // kotlin._shouldTrim
    public final float write(float f) {
        float fIconCompatParcelizer = IconCompatParcelizer(f);
        this.AudioAttributesCompatParcelizer = fIconCompatParcelizer;
        this.RemoteActionCompatParcelizer = f;
        boolean z = this.IconCompatParcelizer;
        float f2 = this.MediaBrowserCompatMediaItem;
        return z ? f2 - fIconCompatParcelizer : f2 + fIconCompatParcelizer;
    }

    @Override // kotlin._shouldTrim
    public final float RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer ? -RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer) : RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin._shouldTrim
    public final boolean write() {
        return RemoteActionCompatParcelizer() < 1.0E-5f && Math.abs(this.MediaMetadataCompat - this.AudioAttributesCompatParcelizer) < 1.0E-5f;
    }

    private void AudioAttributesCompatParcelizer(float f, float f2, float f3, float f4, float f5) {
        this.write = false;
        this.MediaMetadataCompat = f2;
        if (f == BitmapDescriptorFactory.HUE_RED) {
            f = 1.0E-4f;
        }
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            float fSqrt = (float) Math.sqrt((f2 - ((((-f) / f3) * f) / 2.0f)) * f3);
            if (fSqrt < f4) {
                this.onCommand = "backward accelerate, decelerate";
                this.read = 2;
                this.MediaBrowserCompatCustomActionResultReceiver = f;
                this.RatingCompat = fSqrt;
                this.MediaDescriptionCompat = BitmapDescriptorFactory.HUE_RED;
                float f8 = (fSqrt - f) / f3;
                this.AudioAttributesImplApi26Parcelizer = f8;
                this.MediaBrowserCompatItemReceiver = fSqrt / f3;
                this.AudioAttributesImplBaseParcelizer = ((f + fSqrt) * f8) / 2.0f;
                this.AudioAttributesImplApi21Parcelizer = f2;
                this.MediaMetadataCompat = f2;
                return;
            }
            this.onCommand = "backward accelerate cruse decelerate";
            this.read = 3;
            this.MediaBrowserCompatCustomActionResultReceiver = f;
            this.RatingCompat = f4;
            this.MediaDescriptionCompat = f4;
            float f9 = (f4 - f) / f3;
            this.AudioAttributesImplApi26Parcelizer = f9;
            float f10 = f4 / f3;
            this.MediaBrowserCompatSearchResultReceiver = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.MediaBrowserCompatItemReceiver = ((f2 - f11) - f12) / f4;
            this.AudioAttributesImplBaseParcelizer = f11;
            this.AudioAttributesImplApi21Parcelizer = f2 - f12;
            this.MediaMetadataCompat = f2;
            return;
        }
        if (f7 >= f2) {
            this.onCommand = "hard stop";
            this.read = 1;
            this.MediaBrowserCompatCustomActionResultReceiver = f;
            this.RatingCompat = BitmapDescriptorFactory.HUE_RED;
            this.AudioAttributesImplBaseParcelizer = f2;
            this.AudioAttributesImplApi26Parcelizer = (2.0f * f2) / f;
            return;
        }
        float f13 = f2 - f7;
        float f14 = f13 / f;
        if (f14 + f6 < f5) {
            this.onCommand = "cruse decelerate";
            this.read = 2;
            this.MediaBrowserCompatCustomActionResultReceiver = f;
            this.RatingCompat = f;
            this.MediaDescriptionCompat = BitmapDescriptorFactory.HUE_RED;
            this.AudioAttributesImplBaseParcelizer = f13;
            this.AudioAttributesImplApi21Parcelizer = f2;
            this.AudioAttributesImplApi26Parcelizer = f14;
            this.MediaBrowserCompatItemReceiver = f6;
            return;
        }
        float fSqrt2 = (float) Math.sqrt((f3 * f2) + ((f * f) / 2.0f));
        float f15 = (fSqrt2 - f) / f3;
        this.AudioAttributesImplApi26Parcelizer = f15;
        float f16 = fSqrt2 / f3;
        this.MediaBrowserCompatItemReceiver = f16;
        if (fSqrt2 < f4) {
            this.onCommand = "accelerate decelerate";
            this.read = 2;
            this.MediaBrowserCompatCustomActionResultReceiver = f;
            this.RatingCompat = fSqrt2;
            this.MediaDescriptionCompat = BitmapDescriptorFactory.HUE_RED;
            this.AudioAttributesImplApi26Parcelizer = f15;
            this.MediaBrowserCompatItemReceiver = f16;
            this.AudioAttributesImplBaseParcelizer = ((f + fSqrt2) * f15) / 2.0f;
            this.AudioAttributesImplApi21Parcelizer = f2;
            return;
        }
        this.onCommand = "accelerate cruse decelerate";
        this.read = 3;
        this.MediaBrowserCompatCustomActionResultReceiver = f;
        this.RatingCompat = f4;
        this.MediaDescriptionCompat = f4;
        float f17 = (f4 - f) / f3;
        this.AudioAttributesImplApi26Parcelizer = f17;
        float f18 = f4 / f3;
        this.MediaBrowserCompatSearchResultReceiver = f18;
        float f19 = ((f + f4) * f17) / 2.0f;
        float f20 = (f18 * f4) / 2.0f;
        this.MediaBrowserCompatItemReceiver = ((f2 - f19) - f20) / f4;
        this.AudioAttributesImplBaseParcelizer = f19;
        this.AudioAttributesImplApi21Parcelizer = f2 - f20;
        this.MediaMetadataCompat = f2;
    }
}
