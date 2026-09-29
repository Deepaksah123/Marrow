package kotlin;

import com.github.mikephil.charting.data.BarEntry;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class onProvisionResponse extends onKeysRequired {
    public onProvisionResponse(int i, int i2, boolean z) {
        super(i, i2, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.onKeysRequired
    public final void IconCompatParcelizer(setLoadErrorHandlingPolicy setloaderrorhandlingpolicy) {
        float f;
        float fAbs;
        float fAbs2;
        float f2;
        float fOnMediaButtonEvent = setloaderrorhandlingpolicy.onMediaButtonEvent();
        float f3 = this.write;
        float f4 = ((onKeysRequired) this).IconCompatParcelizer / 2.0f;
        for (int i = 0; i < fOnMediaButtonEvent * f3; i++) {
            BarEntry barEntry = (BarEntry) setloaderrorhandlingpolicy.IconCompatParcelizer(i);
            if (barEntry != null) {
                float fMediaBrowserCompatCustomActionResultReceiver = barEntry.MediaBrowserCompatCustomActionResultReceiver();
                float f5 = barEntry.read();
                float[] fArrAudioAttributesCompatParcelizer = barEntry.AudioAttributesCompatParcelizer();
                if (!this.MediaBrowserCompatCustomActionResultReceiver || fArrAudioAttributesCompatParcelizer == null) {
                    if (((onKeysRequired) this).AudioAttributesImplBaseParcelizer) {
                        f = f5 >= BitmapDescriptorFactory.HUE_RED ? f5 : 0.0f;
                        if (f5 > BitmapDescriptorFactory.HUE_RED) {
                            f5 = 0.0f;
                        }
                    } else {
                        float f6 = f5 >= BitmapDescriptorFactory.HUE_RED ? f5 : 0.0f;
                        if (f5 > BitmapDescriptorFactory.HUE_RED) {
                            f5 = 0.0f;
                        }
                        float f7 = f5;
                        f5 = f6;
                        f = f7;
                    }
                    if (f5 > BitmapDescriptorFactory.HUE_RED) {
                        f5 *= this.AudioAttributesCompatParcelizer;
                    } else {
                        f *= this.AudioAttributesCompatParcelizer;
                    }
                    read(f, fMediaBrowserCompatCustomActionResultReceiver + f4, f5, fMediaBrowserCompatCustomActionResultReceiver - f4);
                } else {
                    float f8 = -barEntry.RemoteActionCompatParcelizer();
                    float f9 = 0.0f;
                    int i2 = 0;
                    while (i2 < fArrAudioAttributesCompatParcelizer.length) {
                        float f10 = fArrAudioAttributesCompatParcelizer[i2];
                        if (f10 >= BitmapDescriptorFactory.HUE_RED) {
                            fAbs = f10 + f9;
                            fAbs2 = f8;
                            f8 = f9;
                            f9 = fAbs;
                        } else {
                            fAbs = Math.abs(f10) + f8;
                            fAbs2 = Math.abs(f10) + f8;
                        }
                        if (((onKeysRequired) this).AudioAttributesImplBaseParcelizer) {
                            f2 = f8 >= fAbs ? f8 : fAbs;
                            if (f8 > fAbs) {
                                f8 = fAbs;
                            }
                        } else {
                            float f11 = f8 >= fAbs ? f8 : fAbs;
                            if (f8 > fAbs) {
                                f8 = fAbs;
                            }
                            float f12 = f11;
                            f2 = f8;
                            f8 = f12;
                        }
                        read(f2 * this.AudioAttributesCompatParcelizer, fMediaBrowserCompatCustomActionResultReceiver + f4, f8 * this.AudioAttributesCompatParcelizer, fMediaBrowserCompatCustomActionResultReceiver - f4);
                        i2++;
                        f8 = fAbs2;
                    }
                }
            }
        }
        write();
    }
}
