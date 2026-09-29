package kotlin;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class access4200 implements access3900 {
    private static final Bitmap.Config IconCompatParcelizer = Bitmap.Config.ARGB_8888;
    private final Set<Bitmap.Config> AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private final long AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private final setEndPositionMs MediaBrowserCompatCustomActionResultReceiver;
    private long MediaBrowserCompatItemReceiver;
    private final read MediaMetadataCompat;
    private int RemoteActionCompatParcelizer;
    private long read;
    private int write;

    interface read {
    }

    private access4200(long j, setEndPositionMs setendpositionms, Set<Bitmap.Config> set) {
        this.AudioAttributesImplApi26Parcelizer = j;
        this.MediaBrowserCompatItemReceiver = j;
        this.MediaBrowserCompatCustomActionResultReceiver = setendpositionms;
        this.AudioAttributesCompatParcelizer = set;
        this.MediaMetadataCompat = new IconCompatParcelizer();
    }

    public access4200(long j) {
        this(j, read(), AudioAttributesCompatParcelizer());
    }

    private long write() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // kotlin.access3900
    public final void write(Bitmap bitmap) {
        synchronized (this) {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.MediaBrowserCompatCustomActionResultReceiver.write(bitmap) <= this.MediaBrowserCompatItemReceiver && this.AudioAttributesCompatParcelizer.contains(bitmap.getConfig())) {
                int iWrite = this.MediaBrowserCompatCustomActionResultReceiver.write(bitmap);
                this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(bitmap);
                this.AudioAttributesImplApi21Parcelizer++;
                this.read += (long) iWrite;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(bitmap);
                }
                RemoteActionCompatParcelizer();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(bitmap);
                bitmap.isMutable();
                this.AudioAttributesCompatParcelizer.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        }
    }

    private void RemoteActionCompatParcelizer() {
        AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver);
    }

    @Override // kotlin.access3900
    public final Bitmap write(int i, int i2, Bitmap.Config config) {
        Bitmap bitmap = read(i, i2, config);
        if (bitmap != null) {
            bitmap.eraseColor(0);
            return bitmap;
        }
        return AudioAttributesCompatParcelizer(i, i2, config);
    }

    @Override // kotlin.access3900
    public final Bitmap RemoteActionCompatParcelizer(int i, int i2, Bitmap.Config config) {
        Bitmap bitmap = read(i, i2, config);
        return bitmap == null ? AudioAttributesCompatParcelizer(i, i2, config) : bitmap;
    }

    private static Bitmap AudioAttributesCompatParcelizer(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = IconCompatParcelizer;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    private static void RemoteActionCompatParcelizer(Bitmap.Config config) {
        if (config != Bitmap.Config.HARDWARE) {
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot create a mutable Bitmap with config: ");
        sb.append(config);
        sb.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        throw new IllegalArgumentException(sb.toString());
    }

    private Bitmap read(int i, int i2, Bitmap.Config config) {
        Bitmap bitmap;
        synchronized (this) {
            RemoteActionCompatParcelizer(config);
            bitmap = this.MediaBrowserCompatCustomActionResultReceiver.read(i, i2, config != null ? config : IconCompatParcelizer);
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(i, i2, config);
                }
                this.AudioAttributesImplBaseParcelizer++;
            } else {
                this.RemoteActionCompatParcelizer++;
                this.read -= (long) this.MediaBrowserCompatCustomActionResultReceiver.write(bitmap);
                IconCompatParcelizer(bitmap);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(i, i2, config);
            }
        }
        return bitmap;
    }

    private static void IconCompatParcelizer(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        RemoteActionCompatParcelizer(bitmap);
    }

    private static void RemoteActionCompatParcelizer(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    @Override // kotlin.access3900
    public final void IconCompatParcelizer() {
        AudioAttributesCompatParcelizer(0L);
    }

    @Override // kotlin.access3900
    public final void read(int i) {
        if (i >= 40 || i >= 20) {
            IconCompatParcelizer();
        } else if (i >= 20 || i == 15) {
            AudioAttributesCompatParcelizer(write() / 2);
        }
    }

    private void AudioAttributesCompatParcelizer(long j) {
        synchronized (this) {
            while (this.read > j) {
                Bitmap bitmapWrite = this.MediaBrowserCompatCustomActionResultReceiver.write();
                if (bitmapWrite == null) {
                    this.read = 0L;
                    return;
                }
                this.read -= (long) this.MediaBrowserCompatCustomActionResultReceiver.write(bitmapWrite);
                this.write++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(bitmapWrite);
                }
                bitmapWrite.recycle();
            }
        }
    }

    private static setEndPositionMs read() {
        return new MediaItemDrmConfiguration();
    }

    private static Set<Bitmap.Config> AudioAttributesCompatParcelizer() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        return Collections.unmodifiableSet(hashSet);
    }

    static final class IconCompatParcelizer implements read {
        IconCompatParcelizer() {
        }
    }
}
