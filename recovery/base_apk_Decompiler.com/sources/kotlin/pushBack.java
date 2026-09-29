package kotlin;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import com.google.android.exoplayer2.C;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class pushBack {
    private float AudioAttributesCompatParcelizer;
    private long AudioAttributesImplApi21Parcelizer;
    private float AudioAttributesImplApi26Parcelizer;
    private long AudioAttributesImplBaseParcelizer;
    private long IconCompatParcelizer;
    private long MediaBrowserCompatCustomActionResultReceiver;
    private long MediaBrowserCompatItemReceiver;
    private float MediaBrowserCompatMediaItem;
    private long MediaBrowserCompatSearchResultReceiver;
    private boolean MediaDescriptionCompat;
    private float MediaMetadataCompat;
    private Surface RatingCompat;
    private final TypeParserMyTokenizer RemoteActionCompatParcelizer = new TypeParserMyTokenizer();
    private long onCommand;
    private final AudioAttributesCompatParcelizer onCustomAction;
    private final IconCompatParcelizer read;
    private int write;

    public pushBack(Context context) {
        IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(context);
        this.read = iconCompatParcelizerAudioAttributesCompatParcelizer;
        this.onCustomAction = iconCompatParcelizerAudioAttributesCompatParcelizer != null ? AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer() : null;
        this.MediaBrowserCompatSearchResultReceiver = C.TIME_UNSET;
        this.onCommand = C.TIME_UNSET;
        this.AudioAttributesCompatParcelizer = -1.0f;
        this.AudioAttributesImplApi26Parcelizer = 1.0f;
        this.write = 0;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        if (this.write == i) {
            return;
        }
        this.write = i;
        read(true);
    }

    public final void RemoteActionCompatParcelizer() {
        this.MediaDescriptionCompat = true;
        read();
        if (this.read != null) {
            ((AudioAttributesCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.onCustomAction)).write();
            this.read.write();
        }
        read(false);
    }

    public final void read(Surface surface) {
        if (surface instanceof PlaceholderSurface) {
            surface = null;
        }
        if (this.RatingCompat == surface) {
            return;
        }
        write();
        this.RatingCompat = surface;
        read(true);
    }

    public final void AudioAttributesCompatParcelizer() {
        read();
    }

    public final void read(float f) {
        this.AudioAttributesImplApi26Parcelizer = f;
        read();
        read(false);
    }

    public final void IconCompatParcelizer(float f) {
        this.AudioAttributesCompatParcelizer = f;
        this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver();
        MediaBrowserCompatCustomActionResultReceiver();
    }

    public final void write(long j) {
        long j2 = this.AudioAttributesImplApi21Parcelizer;
        if (j2 != -1) {
            this.MediaBrowserCompatItemReceiver = j2;
            this.AudioAttributesImplBaseParcelizer = this.MediaBrowserCompatCustomActionResultReceiver;
        }
        this.IconCompatParcelizer++;
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(j * 1000);
        MediaBrowserCompatCustomActionResultReceiver();
    }

    public final void IconCompatParcelizer() {
        this.MediaDescriptionCompat = false;
        IconCompatParcelizer iconCompatParcelizer = this.read;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.AudioAttributesCompatParcelizer();
            ((AudioAttributesCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.onCustomAction)).IconCompatParcelizer();
        }
        write();
    }

    public final long RemoteActionCompatParcelizer(long j) {
        long j2;
        if (this.MediaBrowserCompatItemReceiver == -1 || !this.RemoteActionCompatParcelizer.IconCompatParcelizer()) {
            j2 = j;
        } else {
            long jWrite = this.AudioAttributesImplBaseParcelizer + ((long) ((this.RemoteActionCompatParcelizer.write() * (this.IconCompatParcelizer - this.MediaBrowserCompatItemReceiver)) / this.AudioAttributesImplApi26Parcelizer));
            if (IconCompatParcelizer(j, jWrite)) {
                j2 = jWrite;
            } else {
                read();
                j2 = j;
            }
        }
        this.AudioAttributesImplApi21Parcelizer = this.IconCompatParcelizer;
        this.MediaBrowserCompatCustomActionResultReceiver = j2;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.onCustomAction;
        if (audioAttributesCompatParcelizer != null && this.MediaBrowserCompatSearchResultReceiver != C.TIME_UNSET) {
            long j3 = audioAttributesCompatParcelizer.write;
            if (j3 != C.TIME_UNSET) {
                return AudioAttributesCompatParcelizer(j2, j3, this.MediaBrowserCompatSearchResultReceiver) - this.onCommand;
            }
        }
        return j2;
    }

    private void read() {
        this.IconCompatParcelizer = 0L;
        this.MediaBrowserCompatItemReceiver = -1L;
        this.AudioAttributesImplApi21Parcelizer = -1L;
    }

    private static boolean IconCompatParcelizer(long j, long j2) {
        return Math.abs(j - j2) <= 20000000;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 30 || this.RatingCompat == null) {
            return;
        }
        float fAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer() ? this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer() : this.AudioAttributesCompatParcelizer;
        float f = this.MediaBrowserCompatMediaItem;
        if (fAudioAttributesCompatParcelizer != f) {
            if (fAudioAttributesCompatParcelizer != -1.0f && f != -1.0f) {
                if (Math.abs(fAudioAttributesCompatParcelizer - this.MediaBrowserCompatMediaItem) < ((!this.RemoteActionCompatParcelizer.IconCompatParcelizer() || this.RemoteActionCompatParcelizer.read() < 5000000000L) ? 1.0f : 0.02f)) {
                    return;
                }
            } else if (fAudioAttributesCompatParcelizer == -1.0f && this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() < 30) {
                return;
            }
            this.MediaBrowserCompatMediaItem = fAudioAttributesCompatParcelizer;
            read(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void read(boolean r4) {
        /*
            r3 = this;
            int r0 = kotlin.LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver
            r1 = 30
            if (r0 < r1) goto L2e
            android.view.Surface r0 = r3.RatingCompat
            if (r0 == 0) goto L2e
            int r1 = r3.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L2e
            boolean r1 = r3.MediaDescriptionCompat
            if (r1 == 0) goto L20
            float r1 = r3.MediaBrowserCompatMediaItem
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L20
            float r2 = r3.AudioAttributesImplApi26Parcelizer
            float r1 = r1 * r2
            goto L21
        L20:
            r1 = 0
        L21:
            if (r4 != 0) goto L29
            float r4 = r3.MediaMetadataCompat
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 == 0) goto L2e
        L29:
            r3.MediaMetadataCompat = r1
            o.pushBack.RemoteActionCompatParcelizer.read(r0, r1)
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.pushBack.read(boolean):void");
    }

    private void write() {
        Surface surface;
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 30 || (surface = this.RatingCompat) == null || this.write == Integer.MIN_VALUE || this.MediaMetadataCompat == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        this.MediaMetadataCompat = BitmapDescriptorFactory.HUE_RED;
        RemoteActionCompatParcelizer.read(surface, BitmapDescriptorFactory.HUE_RED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.MediaBrowserCompatSearchResultReceiver = refreshRate;
            this.onCommand = (refreshRate * 80) / 100;
        } else {
            prune.RemoteActionCompatParcelizer("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.MediaBrowserCompatSearchResultReceiver = C.TIME_UNSET;
            this.onCommand = C.TIME_UNSET;
        }
    }

    private static long AudioAttributesCompatParcelizer(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j5 = j3 + j5;
            j4 = j5;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    private IconCompatParcelizer AudioAttributesCompatParcelizer(Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            return null;
        }
        return new IconCompatParcelizer(displayManager);
    }

    static final class RemoteActionCompatParcelizer {
        public static void read(Surface surface, float f) {
            try {
                surface.setFrameRate(f, f == BitmapDescriptorFactory.HUE_RED ? 0 : 1);
            } catch (IllegalStateException e) {
                prune.read("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    final class IconCompatParcelizer implements DisplayManager.DisplayListener {
        private final DisplayManager RemoteActionCompatParcelizer;

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }

        public IconCompatParcelizer(DisplayManager displayManager) {
            this.RemoteActionCompatParcelizer = displayManager;
        }

        public final void write() {
            this.RemoteActionCompatParcelizer.registerDisplayListener(this, LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer());
            pushBack.this.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer());
        }

        public final void AudioAttributesCompatParcelizer() {
            this.RemoteActionCompatParcelizer.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            if (i == 0) {
                pushBack.this.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer());
            }
        }

        private Display RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer.getDisplay(0);
        }
    }

    static final class AudioAttributesCompatParcelizer implements Choreographer.FrameCallback, Handler.Callback {
        private static final AudioAttributesCompatParcelizer IconCompatParcelizer = new AudioAttributesCompatParcelizer();
        private Choreographer AudioAttributesCompatParcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private final HandlerThread RemoteActionCompatParcelizer;
        private final Handler read;
        public volatile long write = C.TIME_UNSET;

        public static AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer() {
            return IconCompatParcelizer;
        }

        private AudioAttributesCompatParcelizer() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.RemoteActionCompatParcelizer = handlerThread;
            handlerThread.start();
            Handler handlerWrite = LaissezFaireSubTypeValidator.write(handlerThread.getLooper(), this);
            this.read = handlerWrite;
            handlerWrite.sendEmptyMessage(1);
        }

        public final void write() {
            this.read.sendEmptyMessage(2);
        }

        public final void IconCompatParcelizer() {
            this.read.sendEmptyMessage(3);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            this.write = j;
            ((Choreographer) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)).postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                RemoteActionCompatParcelizer();
                return true;
            }
            if (i == 2) {
                read();
                return true;
            }
            if (i != 3) {
                return false;
            }
            AudioAttributesImplApi21Parcelizer();
            return true;
        }

        private void RemoteActionCompatParcelizer() {
            try {
                this.AudioAttributesCompatParcelizer = Choreographer.getInstance();
            } catch (RuntimeException e) {
                prune.write("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }

        private void read() {
            Choreographer choreographer = this.AudioAttributesCompatParcelizer;
            if (choreographer != null) {
                int i = this.AudioAttributesImplBaseParcelizer + 1;
                this.AudioAttributesImplBaseParcelizer = i;
                if (i == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void AudioAttributesImplApi21Parcelizer() {
            Choreographer choreographer = this.AudioAttributesCompatParcelizer;
            if (choreographer != null) {
                int i = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i;
                if (i == 0) {
                    choreographer.removeFrameCallback(this);
                    this.write = C.TIME_UNSET;
                }
            }
        }
    }
}
