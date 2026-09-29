package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
final class ensureSpaceForPeek {
    float AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private float AudioAttributesImplApi26Parcelizer;
    final int IconCompatParcelizer;
    float MediaBrowserCompatCustomActionResultReceiver;
    int RemoteActionCompatParcelizer;
    float read;
    int write;

    private static float AudioAttributesCompatParcelizer(float f, int i, float f2, int i2, int i3) {
        if (i <= 0) {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        float f3 = i2 / 2.0f;
        return (f - ((i + f3) * f2)) / (i3 + f3);
    }

    private ensureSpaceForPeek(int i, float f, float f2, float f3, int i2, float f4, int i3, float f5, int i4, float f6) {
        this.AudioAttributesImplApi21Parcelizer = i;
        this.MediaBrowserCompatCustomActionResultReceiver = StdKeyDeserializer.write(f, f2, f3);
        this.RemoteActionCompatParcelizer = i2;
        this.read = f4;
        this.write = i3;
        this.AudioAttributesCompatParcelizer = f5;
        this.IconCompatParcelizer = i4;
        read(f6, f2, f3, f5);
        this.AudioAttributesImplApi26Parcelizer = read(f5);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Arrangement [priority=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", smallCount=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", smallSize=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", mediumCount=");
        sb.append(this.write);
        sb.append(", mediumSize=");
        sb.append(this.read);
        sb.append(", largeCount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", largeSize=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", cost=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append("]");
        return sb.toString();
    }

    private float read() {
        return (this.AudioAttributesCompatParcelizer * this.IconCompatParcelizer) + (this.read * this.write) + (this.MediaBrowserCompatCustomActionResultReceiver * this.RemoteActionCompatParcelizer);
    }

    private void read(float f, float f2, float f3, float f4) {
        float f5 = f - read();
        int i = this.RemoteActionCompatParcelizer;
        if (i > 0 && f5 > BitmapDescriptorFactory.HUE_RED) {
            float f6 = this.MediaBrowserCompatCustomActionResultReceiver;
            this.MediaBrowserCompatCustomActionResultReceiver = f6 + Math.min(f5 / i, f3 - f6);
        } else if (i > 0 && f5 < BitmapDescriptorFactory.HUE_RED) {
            float f7 = this.MediaBrowserCompatCustomActionResultReceiver;
            this.MediaBrowserCompatCustomActionResultReceiver = f7 + Math.max(f5 / i, f2 - f7);
        }
        int i2 = this.RemoteActionCompatParcelizer;
        float f8 = i2 > 0 ? this.MediaBrowserCompatCustomActionResultReceiver : 0.0f;
        this.MediaBrowserCompatCustomActionResultReceiver = f8;
        float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(f, i2, f8, this.write, this.IconCompatParcelizer);
        this.AudioAttributesCompatParcelizer = fAudioAttributesCompatParcelizer;
        float f9 = (this.MediaBrowserCompatCustomActionResultReceiver + fAudioAttributesCompatParcelizer) / 2.0f;
        this.read = f9;
        int i3 = this.write;
        if (i3 <= 0 || fAudioAttributesCompatParcelizer == f4) {
            return;
        }
        float f10 = (f4 - fAudioAttributesCompatParcelizer) * this.IconCompatParcelizer;
        float fMin = Math.min(Math.abs(f10), f9 * 0.1f * i3);
        if (f10 > BitmapDescriptorFactory.HUE_RED) {
            this.read -= fMin / this.write;
            this.AudioAttributesCompatParcelizer += fMin / this.IconCompatParcelizer;
        } else {
            this.read += fMin / this.write;
            this.AudioAttributesCompatParcelizer -= fMin / this.IconCompatParcelizer;
        }
    }

    private boolean AudioAttributesCompatParcelizer() {
        int i = this.IconCompatParcelizer;
        if (i <= 0 || this.RemoteActionCompatParcelizer <= 0 || this.write <= 0) {
            return i <= 0 || this.RemoteActionCompatParcelizer <= 0 || this.AudioAttributesCompatParcelizer > this.MediaBrowserCompatCustomActionResultReceiver;
        }
        float f = this.AudioAttributesCompatParcelizer;
        float f2 = this.read;
        return f > f2 && f2 > this.MediaBrowserCompatCustomActionResultReceiver;
    }

    private float read(float f) {
        if (AudioAttributesCompatParcelizer()) {
            return Math.abs(f - this.AudioAttributesCompatParcelizer) * this.AudioAttributesImplApi21Parcelizer;
        }
        return Float.MAX_VALUE;
    }

    static ensureSpaceForPeek AudioAttributesCompatParcelizer(float f, float f2, float f3, float f4, int[] iArr, float f5, int[] iArr2, float f6, int[] iArr3) {
        ensureSpaceForPeek ensurespaceforpeek = null;
        int i = 1;
        for (int i2 : iArr3) {
            int length = iArr2.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = iArr2[i3];
                int length2 = iArr.length;
                int i5 = 0;
                while (i5 < length2) {
                    int i6 = i5;
                    int i7 = length2;
                    int i8 = i3;
                    int i9 = length;
                    ensureSpaceForPeek ensurespaceforpeek2 = new ensureSpaceForPeek(i, f2, f3, f4, iArr[i5], f5, i4, f6, i2, f);
                    if (ensurespaceforpeek == null || ensurespaceforpeek2.AudioAttributesImplApi26Parcelizer < ensurespaceforpeek.AudioAttributesImplApi26Parcelizer) {
                        if (ensurespaceforpeek2.AudioAttributesImplApi26Parcelizer == BitmapDescriptorFactory.HUE_RED) {
                            return ensurespaceforpeek2;
                        }
                        ensurespaceforpeek = ensurespaceforpeek2;
                    }
                    i5 = i6 + 1;
                    i++;
                    length2 = i7;
                    i3 = i8;
                    length = i9;
                }
                i3++;
            }
        }
        return ensurespaceforpeek;
    }

    final int write() {
        return this.RemoteActionCompatParcelizer + this.write + this.IconCompatParcelizer;
    }
}
