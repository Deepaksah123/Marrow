package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class aa {
    private long[] IconCompatParcelizer;
    private float[] write = new float[20];
    private int RemoteActionCompatParcelizer = 0;

    public aa() {
        long[] jArr = new long[20];
        this.IconCompatParcelizer = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    public final void RemoteActionCompatParcelizer(long j, float f) {
        int i = (this.RemoteActionCompatParcelizer + 1) % 20;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer[i] = j;
        this.write[i] = f;
    }

    public final float RemoteActionCompatParcelizer() {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0 && this.IconCompatParcelizer[i] == Long.MIN_VALUE) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        long j = this.IconCompatParcelizer[i];
        int i2 = 0;
        long j2 = j;
        while (true) {
            long j3 = this.IconCompatParcelizer[i];
            if (j3 == Long.MIN_VALUE) {
                break;
            }
            float f = j - j3;
            float fAbs = Math.abs(j3 - j2);
            if (f > 100.0f || fAbs > 40.0f) {
                break;
            }
            if (i == 0) {
                i = 20;
            }
            i--;
            i2++;
            if (i2 >= 20) {
                break;
            }
            j2 = j3;
        }
        if (i2 < 2) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (i2 == 2) {
            int i3 = this.RemoteActionCompatParcelizer;
            int i4 = i3 == 0 ? 19 : i3 - 1;
            long[] jArr = this.IconCompatParcelizer;
            float f2 = jArr[i3] - jArr[i4];
            if (f2 == BitmapDescriptorFactory.HUE_RED) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            float[] fArr = this.write;
            return ((fArr[i3] - fArr[i4]) / f2) * 1000.0f;
        }
        int i5 = this.RemoteActionCompatParcelizer;
        int i6 = ((i5 - i2) + 21) % 20;
        long j4 = this.IconCompatParcelizer[i6];
        float f3 = this.write[i6];
        int i7 = i6 + 1;
        float fAudioAttributesCompatParcelizer = 0.0f;
        for (int i8 = i7 % 20; i8 != (i5 + 21) % 20; i8 = (i8 + 1) % 20) {
            long j5 = this.IconCompatParcelizer[i8];
            float f4 = j5 - j4;
            if (f4 != BitmapDescriptorFactory.HUE_RED) {
                float f5 = this.write[i8];
                float f6 = (f5 - f3) / f4;
                fAudioAttributesCompatParcelizer += (f6 - AudioAttributesCompatParcelizer(fAudioAttributesCompatParcelizer)) * Math.abs(f6);
                if (i8 == i7) {
                    fAudioAttributesCompatParcelizer *= 0.5f;
                }
                f3 = f5;
                j4 = j5;
            }
        }
        return AudioAttributesCompatParcelizer(fAudioAttributesCompatParcelizer) * 1000.0f;
    }

    private static float AudioAttributesCompatParcelizer(float f) {
        return (float) (((double) Math.signum(f)) * Math.sqrt(Math.abs(f) * 2.0f));
    }
}
