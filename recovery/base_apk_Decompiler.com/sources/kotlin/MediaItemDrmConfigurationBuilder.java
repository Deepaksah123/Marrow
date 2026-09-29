package kotlin;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaItemDrmConfigurationBuilder {
    private final int AudioAttributesCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final Context read;
    private final int write;

    interface AudioAttributesCompatParcelizer {
        int AudioAttributesCompatParcelizer();

        int IconCompatParcelizer();
    }

    MediaItemDrmConfigurationBuilder(read readVar) {
        int i;
        this.read = readVar.read;
        if (write(readVar.AudioAttributesCompatParcelizer)) {
            i = readVar.RemoteActionCompatParcelizer / 2;
        } else {
            i = readVar.RemoteActionCompatParcelizer;
        }
        this.write = i;
        int iWrite = write(readVar.AudioAttributesCompatParcelizer, readVar.AudioAttributesImplApi26Parcelizer, readVar.write);
        float fAudioAttributesCompatParcelizer = (readVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer() * readVar.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer()) << 2;
        int iRound = Math.round(readVar.IconCompatParcelizer * fAudioAttributesCompatParcelizer);
        int iRound2 = Math.round(fAudioAttributesCompatParcelizer * readVar.MediaBrowserCompatItemReceiver);
        int i2 = iWrite - i;
        if (iRound2 + iRound <= i2) {
            this.AudioAttributesCompatParcelizer = iRound2;
            this.RemoteActionCompatParcelizer = iRound;
        } else {
            float f = i2 / (readVar.IconCompatParcelizer + readVar.MediaBrowserCompatItemReceiver);
            this.AudioAttributesCompatParcelizer = Math.round(readVar.MediaBrowserCompatItemReceiver * f);
            this.RemoteActionCompatParcelizer = Math.round(f * readVar.IconCompatParcelizer);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
            AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
            AudioAttributesCompatParcelizer(i);
            AudioAttributesCompatParcelizer(iWrite);
            readVar.AudioAttributesCompatParcelizer.getMemoryClass();
            write(readVar.AudioAttributesCompatParcelizer);
        }
    }

    public final int write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int read() {
        return this.write;
    }

    private static int write(ActivityManager activityManager, float f, float f2) {
        int memoryClass = activityManager.getMemoryClass();
        boolean zWrite = write(activityManager);
        float f3 = memoryClass * ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        if (zWrite) {
            f = f2;
        }
        return Math.round(f3 * f);
    }

    private String AudioAttributesCompatParcelizer(int i) {
        return Formatter.formatFileSize(this.read, i);
    }

    static boolean write(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    public static final class read {
        private static int AudioAttributesImplBaseParcelizer = 1;
        ActivityManager AudioAttributesCompatParcelizer;
        float IconCompatParcelizer;
        AudioAttributesCompatParcelizer MediaBrowserCompatCustomActionResultReceiver;
        final Context read;
        float MediaBrowserCompatItemReceiver = 2.0f;
        float AudioAttributesImplApi26Parcelizer = 0.4f;
        float write = 0.33f;
        int RemoteActionCompatParcelizer = 4194304;

        public read(Context context) {
            this.IconCompatParcelizer = AudioAttributesImplBaseParcelizer;
            this.read = context;
            this.AudioAttributesCompatParcelizer = (ActivityManager) context.getSystemService("activity");
            this.MediaBrowserCompatCustomActionResultReceiver = new write(context.getResources().getDisplayMetrics());
            if (MediaItemDrmConfigurationBuilder.write(this.AudioAttributesCompatParcelizer)) {
                this.IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
            }
        }

        public final MediaItemDrmConfigurationBuilder read() {
            return new MediaItemDrmConfigurationBuilder(this);
        }
    }

    static final class write implements AudioAttributesCompatParcelizer {
        private final DisplayMetrics IconCompatParcelizer;

        write(DisplayMetrics displayMetrics) {
            this.IconCompatParcelizer = displayMetrics;
        }

        @Override // o.MediaItemDrmConfigurationBuilder.AudioAttributesCompatParcelizer
        public final int AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer.widthPixels;
        }

        @Override // o.MediaItemDrmConfigurationBuilder.AudioAttributesCompatParcelizer
        public final int IconCompatParcelizer() {
            return this.IconCompatParcelizer.heightPixels;
        }
    }
}
