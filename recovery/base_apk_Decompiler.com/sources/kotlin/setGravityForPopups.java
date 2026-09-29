package kotlin;

import android.graphics.Bitmap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class setGravityForPopups {
    private final ConcurrentLinkedQueue<RemoteActionCompatParcelizer> AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer = 320;
    private float AudioAttributesImplBaseParcelizer;
    private final Bitmap[] IconCompatParcelizer;
    private final float[] MediaBrowserCompatCustomActionResultReceiver;
    private float[] MediaBrowserCompatItemReceiver;
    private float[] MediaBrowserCompatMediaItem;
    private final int[] MediaDescriptionCompat;
    private int RemoteActionCompatParcelizer;
    private final int read;
    private float[] write;

    public setGravityForPopups(int i, int i2) {
        int iMax = Math.max(1, getOnline.RemoteActionCompatParcelizer((i2 * 320.0f) / i));
        this.AudioAttributesImplApi21Parcelizer = iMax;
        int i3 = iMax * 320;
        this.read = i3;
        this.write = new float[i3];
        this.MediaBrowserCompatMediaItem = new float[i3];
        this.MediaBrowserCompatItemReceiver = new float[i3];
        this.MediaBrowserCompatCustomActionResultReceiver = new float[i3];
        this.MediaDescriptionCompat = new int[i3];
        this.AudioAttributesCompatParcelizer = new ConcurrentLinkedQueue<>();
        Bitmap[] bitmapArr = new Bitmap[2];
        for (int i4 = 0; i4 < 2; i4++) {
            bitmapArr[i4] = Bitmap.createBitmap(this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplApi21Parcelizer, Bitmap.Config.ARGB_8888);
        }
        this.IconCompatParcelizer = bitmapArr;
        int i5 = this.AudioAttributesImplApi21Parcelizer;
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = this.AudioAttributesImplApi26Parcelizer;
            for (int i8 = 0; i8 < i7; i8++) {
                this.MediaBrowserCompatCustomActionResultReceiver[(this.AudioAttributesImplApi26Parcelizer * i6) + i8] = (RemoteActionCompatParcelizer(Math.min(Math.min(i8, (this.AudioAttributesImplApi26Parcelizer - 1) - i8) / this.AudioAttributesImplApi26Parcelizer, Math.min(i6, (this.AudioAttributesImplApi21Parcelizer - 1) - i6) / this.AudioAttributesImplApi21Parcelizer)) * 0.13999999f) + 0.86f;
            }
        }
    }

    static final class RemoteActionCompatParcelizer {
        private final float IconCompatParcelizer;
        private final float RemoteActionCompatParcelizer;
        private final float read;
        private final float write;

        public RemoteActionCompatParcelizer(float f, float f2, float f3, float f4) {
            this.IconCompatParcelizer = f;
            this.RemoteActionCompatParcelizer = f2;
            this.read = f3;
            this.write = f4;
        }

        public final float write() {
            return this.IconCompatParcelizer;
        }

        public final float IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final float AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final float read() {
            return this.write;
        }
    }

    public final int RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final int write() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final boolean IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer < 0.0015f;
    }

    public final void write(float f, float f2, float f3, float f4) {
        if (f < -0.05f || f > 1.05f || f2 < -0.05f || f2 > 1.05f) {
            return;
        }
        while (this.AudioAttributesCompatParcelizer.size() > 12) {
            this.AudioAttributesCompatParcelizer.poll();
        }
        ConcurrentLinkedQueue<RemoteActionCompatParcelizer> concurrentLinkedQueue = this.AudioAttributesCompatParcelizer;
        float f5 = this.AudioAttributesImplApi26Parcelizer;
        concurrentLinkedQueue.add(new RemoteActionCompatParcelizer(f * f5, f2 * this.AudioAttributesImplApi21Parcelizer, f3 * f5, f4));
    }

    public final boolean read() {
        return !this.AudioAttributesCompatParcelizer.isEmpty();
    }

    public final Bitmap write(int i) {
        int iMax = Math.max(1, i);
        for (int i2 = 0; i2 < iMax; i2++) {
            AudioAttributesCompatParcelizer();
            AudioAttributesImplApi26Parcelizer();
        }
        return MediaBrowserCompatItemReceiver();
    }

    private final void AudioAttributesCompatParcelizer() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizerPoll;
        for (int i = 0; i < 4 && (remoteActionCompatParcelizerPoll = this.AudioAttributesCompatParcelizer.poll()) != null; i++) {
            RemoteActionCompatParcelizer(remoteActionCompatParcelizerPoll);
        }
    }

    private final void RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        float fMax = Math.max(1.0f, remoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
        int iMax = Math.max(0, (int) Math.floor(remoteActionCompatParcelizer.write() - fMax));
        int iMin = Math.min(this.AudioAttributesImplApi26Parcelizer - 1, (int) (remoteActionCompatParcelizer.write() + fMax));
        int iMax2 = Math.max(0, (int) Math.floor(remoteActionCompatParcelizer.IconCompatParcelizer() - fMax));
        int iMin2 = Math.min(this.AudioAttributesImplApi21Parcelizer - 1, (int) (remoteActionCompatParcelizer.IconCompatParcelizer() + fMax));
        if (iMax2 > iMin2) {
            return;
        }
        while (true) {
            if (iMax <= iMin) {
                int i = iMax;
                while (true) {
                    if (((float) Math.hypot(i - remoteActionCompatParcelizer.write(), iMax2 - remoteActionCompatParcelizer.IconCompatParcelizer())) <= fMax) {
                        float[] fArr = this.write;
                        int i2 = (this.AudioAttributesImplApi26Parcelizer * iMax2) + i;
                        fArr[i2] = fArr[i2] + (remoteActionCompatParcelizer.read() * 0.5f * (((float) Math.cos((r7 / fMax) * 3.1415927f)) + 1.0f));
                    }
                    if (i == iMin) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (iMax2 == iMin2) {
                return;
            } else {
                iMax2++;
            }
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        float[] fArr = this.write;
        float[] fArr2 = this.MediaBrowserCompatMediaItem;
        float[] fArr3 = this.MediaBrowserCompatItemReceiver;
        int i = this.AudioAttributesImplApi21Parcelizer;
        int i2 = 0;
        while (i2 < i) {
            int i3 = this.AudioAttributesImplApi26Parcelizer;
            int i4 = i2 * i3;
            int i5 = i2 > 0 ? i4 - i3 : i4;
            int i6 = i2 < this.AudioAttributesImplApi21Parcelizer + (-1) ? i4 + i3 : i4;
            int i7 = 0;
            while (i7 < i3) {
                int i8 = i4 + i7;
                float f = fArr[(i7 > 0 ? i7 - 1 : i7) + i4];
                float f2 = fArr[(i7 < this.AudioAttributesImplApi26Parcelizer + (-1) ? i7 + 1 : i7) + i4];
                fArr3[i8] = (((((f + f2) + fArr[i5 + i7]) + fArr[i6 + i7]) * 0.5f) - fArr2[i8]) * this.MediaBrowserCompatCustomActionResultReceiver[i8] * 0.9875f;
                i7++;
            }
            i2++;
        }
        this.MediaBrowserCompatMediaItem = fArr;
        this.write = fArr3;
        this.MediaBrowserCompatItemReceiver = fArr2;
    }

    private final Bitmap MediaBrowserCompatItemReceiver() {
        int i = this.read;
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            float f2 = this.write[i2];
            float fAbs = Math.abs(f2);
            if (fAbs > f) {
                f = fAbs;
            }
            int iFloor = (int) Math.floor(r5);
            this.MediaDescriptionCompat[i2] = (getQues.write(getOnline.RemoteActionCompatParcelizer(((getQues.read((f2 * 0.5f) + 0.5f, BitmapDescriptorFactory.HUE_RED, 1.0f) * 255.0f) - iFloor) * 255.0f), 0, 255) << 8) | (iFloor << 16) | (-16777216);
        }
        this.AudioAttributesImplBaseParcelizer = f;
        Bitmap bitmap = this.IconCompatParcelizer[this.RemoteActionCompatParcelizer];
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bitmap, "");
        this.RemoteActionCompatParcelizer = 1 - this.RemoteActionCompatParcelizer;
        int[] iArr = this.MediaDescriptionCompat;
        int i3 = this.AudioAttributesImplApi26Parcelizer;
        bitmap.setPixels(iArr, 0, i3, 0, 0, i3, this.AudioAttributesImplApi21Parcelizer);
        return bitmap;
    }

    private static float RemoteActionCompatParcelizer(float f) {
        float f2 = getQues.read(f / 0.045f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        return f2 * f2 * (3.0f - (f2 * 2.0f));
    }
}
