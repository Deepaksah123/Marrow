package kotlin;

import com.github.mikephil.charting.data.BarEntry;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
public class onKeysRequired extends onError<setLoadErrorHandlingPolicy> {
    private int AudioAttributesImplApi26Parcelizer;
    protected boolean AudioAttributesImplBaseParcelizer;
    protected float IconCompatParcelizer;
    protected boolean MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;

    public onKeysRequired(int i, int i2, boolean z) {
        super(i);
        this.MediaBrowserCompatItemReceiver = 0;
        this.AudioAttributesImplBaseParcelizer = false;
        this.IconCompatParcelizer = 1.0f;
        this.AudioAttributesImplApi26Parcelizer = i2;
        this.MediaBrowserCompatCustomActionResultReceiver = z;
    }

    public final void read(float f) {
        this.IconCompatParcelizer = f;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.AudioAttributesImplBaseParcelizer = z;
    }

    protected final void read(float f, float f2, float f3, float f4) {
        float[] fArr = this.read;
        int i = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i + 1;
        fArr[i] = f;
        float[] fArr2 = this.read;
        int i2 = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i2 + 1;
        fArr2[i2] = f2;
        float[] fArr3 = this.read;
        int i3 = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i3 + 1;
        fArr3[i3] = f3;
        float[] fArr4 = this.read;
        int i4 = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i4 + 1;
        fArr4[i4] = f4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void IconCompatParcelizer(setLoadErrorHandlingPolicy setloaderrorhandlingpolicy) {
        float f;
        float f2;
        float fAbs;
        float fAbs2;
        float f3;
        float fOnMediaButtonEvent = setloaderrorhandlingpolicy.onMediaButtonEvent();
        float f4 = this.write;
        float f5 = this.IconCompatParcelizer / 2.0f;
        for (int i = 0; i < fOnMediaButtonEvent * f4; i++) {
            BarEntry barEntry = (BarEntry) setloaderrorhandlingpolicy.IconCompatParcelizer(i);
            if (barEntry != null) {
                float fMediaBrowserCompatCustomActionResultReceiver = barEntry.MediaBrowserCompatCustomActionResultReceiver();
                float f6 = barEntry.read();
                float[] fArrAudioAttributesCompatParcelizer = barEntry.AudioAttributesCompatParcelizer();
                boolean z = this.MediaBrowserCompatCustomActionResultReceiver;
                float f7 = BitmapDescriptorFactory.HUE_RED;
                if (!z || fArrAudioAttributesCompatParcelizer == null) {
                    if (this.AudioAttributesImplBaseParcelizer) {
                        f = BitmapDescriptorFactory.HUE_RED;
                        f2 = f6 >= BitmapDescriptorFactory.HUE_RED ? f6 : 0.0f;
                        if (f6 > BitmapDescriptorFactory.HUE_RED) {
                            f6 = 0.0f;
                        }
                    } else {
                        f = BitmapDescriptorFactory.HUE_RED;
                        float f8 = f6 >= BitmapDescriptorFactory.HUE_RED ? f6 : 0.0f;
                        if (f6 > BitmapDescriptorFactory.HUE_RED) {
                            f6 = 0.0f;
                        }
                        float f9 = f6;
                        f6 = f8;
                        f2 = f9;
                    }
                    if (f6 > f) {
                        f6 *= this.AudioAttributesCompatParcelizer;
                    } else {
                        f2 *= this.AudioAttributesCompatParcelizer;
                    }
                    read(fMediaBrowserCompatCustomActionResultReceiver - f5, f6, fMediaBrowserCompatCustomActionResultReceiver + f5, f2);
                } else {
                    float f10 = -barEntry.RemoteActionCompatParcelizer();
                    float f11 = 0.0f;
                    int i2 = 0;
                    while (i2 < fArrAudioAttributesCompatParcelizer.length) {
                        float f12 = fArrAudioAttributesCompatParcelizer[i2];
                        if (f12 == f7 && (f11 == f7 || f10 == f7)) {
                            fAbs = f12;
                            fAbs2 = f10;
                            f10 = fAbs;
                        } else if (f12 >= f7) {
                            fAbs = f12 + f11;
                            fAbs2 = f10;
                            f10 = f11;
                            f11 = fAbs;
                        } else {
                            fAbs = Math.abs(f12) + f10;
                            fAbs2 = Math.abs(f12) + f10;
                        }
                        if (this.AudioAttributesImplBaseParcelizer) {
                            f3 = f10 >= fAbs ? f10 : fAbs;
                            if (f10 > fAbs) {
                                f10 = fAbs;
                            }
                        } else {
                            float f13 = f10 >= fAbs ? f10 : fAbs;
                            if (f10 > fAbs) {
                                f10 = fAbs;
                            }
                            float f14 = f13;
                            f3 = f10;
                            f10 = f14;
                        }
                        read(fMediaBrowserCompatCustomActionResultReceiver - f5, f10 * this.AudioAttributesCompatParcelizer, fMediaBrowserCompatCustomActionResultReceiver + f5, f3 * this.AudioAttributesCompatParcelizer);
                        i2++;
                        f10 = fAbs2;
                        f7 = BitmapDescriptorFactory.HUE_RED;
                    }
                }
            }
        }
        write();
    }
}
