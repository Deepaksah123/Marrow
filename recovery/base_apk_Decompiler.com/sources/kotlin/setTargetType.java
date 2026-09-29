package kotlin;

import android.view.MotionEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
final class setTargetType {
    private final float[] write = new float[20];
    private final long[] IconCompatParcelizer = new long[20];
    private float read = BitmapDescriptorFactory.HUE_RED;
    private int RemoteActionCompatParcelizer = 0;
    private int AudioAttributesCompatParcelizer = 0;

    setTargetType() {
    }

    final void AudioAttributesCompatParcelizer(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.RemoteActionCompatParcelizer != 0 && eventTime - this.IconCompatParcelizer[this.AudioAttributesCompatParcelizer] > 40) {
            IconCompatParcelizer();
        }
        int i = (this.AudioAttributesCompatParcelizer + 1) % 20;
        this.AudioAttributesCompatParcelizer = i;
        int i2 = this.RemoteActionCompatParcelizer;
        if (i2 != 20) {
            this.RemoteActionCompatParcelizer = i2 + 1;
        }
        this.write[i] = motionEvent.getAxisValue(26);
        this.IconCompatParcelizer[this.AudioAttributesCompatParcelizer] = eventTime;
    }

    final void IconCompatParcelizer(int i, float f) {
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer() * i;
        this.read = fRemoteActionCompatParcelizer;
        if (fRemoteActionCompatParcelizer < (-Math.abs(f))) {
            this.read = -Math.abs(f);
        } else if (this.read > Math.abs(f)) {
            this.read = Math.abs(f);
        }
    }

    final float write(int i) {
        return i != 26 ? BitmapDescriptorFactory.HUE_RED : this.read;
    }

    private void IconCompatParcelizer() {
        this.RemoteActionCompatParcelizer = 0;
        this.read = BitmapDescriptorFactory.HUE_RED;
    }

    private float RemoteActionCompatParcelizer() {
        long[] jArr;
        long j;
        int i = this.RemoteActionCompatParcelizer;
        if (i < 2) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int i2 = this.AudioAttributesCompatParcelizer;
        int i3 = ((i2 + 20) - (i - 1)) % 20;
        long j2 = this.IconCompatParcelizer[i2];
        while (true) {
            jArr = this.IconCompatParcelizer;
            j = jArr[i3];
            if (j2 - j <= 100) {
                break;
            }
            this.RemoteActionCompatParcelizer--;
            i3 = (i3 + 1) % 20;
        }
        int i4 = this.RemoteActionCompatParcelizer;
        if (i4 < 2) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (i4 == 2) {
            int i5 = (i3 + 1) % 20;
            return j == jArr[i5] ? BitmapDescriptorFactory.HUE_RED : this.write[i5] / (r2 - j);
        }
        float fAbs = 0.0f;
        int i6 = 0;
        for (int i7 = 0; i7 < this.RemoteActionCompatParcelizer - 1; i7++) {
            int i8 = i7 + i3;
            long[] jArr2 = this.IconCompatParcelizer;
            long j3 = jArr2[i8 % 20];
            int i9 = (i8 + 1) % 20;
            if (jArr2[i9] != j3) {
                i6++;
                float f = read(fAbs);
                float f2 = this.write[i9] / (this.IconCompatParcelizer[i9] - j3);
                fAbs += (f2 - f) * Math.abs(f2);
                if (i6 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return read(fAbs);
    }

    private static float read(float f) {
        return (f < BitmapDescriptorFactory.HUE_RED ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f) * 2.0f));
    }
}
