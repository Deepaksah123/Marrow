package kotlin;

import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hasAnnotations implements View.OnTouchListener {
    private static final int MediaBrowserCompatItemReceiver = ViewConfiguration.getTapTimeout();
    final View AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    boolean RemoteActionCompatParcelizer;
    private Runnable handleMediaPlayPauseIfPendingOnHandler;
    boolean read;
    boolean write;
    final read IconCompatParcelizer = new read();
    private final Interpolator AudioAttributesImplBaseParcelizer = new AccelerateInterpolator();
    private float[] onCommand = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
    private float[] MediaBrowserCompatMediaItem = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] onAddQueueItem = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
    private float[] RatingCompat = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
    private float[] MediaBrowserCompatSearchResultReceiver = {Float.MAX_VALUE, Float.MAX_VALUE};

    static float AudioAttributesCompatParcelizer(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    static int RemoteActionCompatParcelizer(int i, int i2) {
        if (i > i2) {
            return i2;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public abstract void IconCompatParcelizer(int i);

    public abstract boolean RemoteActionCompatParcelizer(int i);

    public hasAnnotations(View view) {
        this.AudioAttributesCompatParcelizer = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((displayMetrics.density * 1575.0f) + 0.5f);
        int i2 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        float f = i;
        IconCompatParcelizer(f, f);
        float f2 = i2;
        read(f2, f2);
        IconCompatParcelizer();
        AudioAttributesImplApi26Parcelizer();
        MediaBrowserCompatCustomActionResultReceiver();
        AudioAttributesImplApi21Parcelizer();
        read(MediaBrowserCompatItemReceiver);
        AudioAttributesImplBaseParcelizer();
        MediaBrowserCompatItemReceiver();
    }

    public final hasAnnotations RemoteActionCompatParcelizer(boolean z) {
        if (this.MediaDescriptionCompat && !z) {
            AudioAttributesCompatParcelizer();
        }
        this.MediaDescriptionCompat = z;
        return this;
    }

    private hasAnnotations IconCompatParcelizer(float f, float f2) {
        float[] fArr = this.MediaBrowserCompatSearchResultReceiver;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    private hasAnnotations read(float f, float f2) {
        float[] fArr = this.RatingCompat;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    private hasAnnotations AudioAttributesImplApi21Parcelizer() {
        float[] fArr = this.onAddQueueItem;
        fArr[0] = 0.001f;
        fArr[1] = 0.001f;
        return this;
    }

    private hasAnnotations IconCompatParcelizer() {
        this.AudioAttributesImplApi21Parcelizer = 1;
        return this;
    }

    private hasAnnotations MediaBrowserCompatCustomActionResultReceiver() {
        float[] fArr = this.onCommand;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        return this;
    }

    private hasAnnotations AudioAttributesImplApi26Parcelizer() {
        float[] fArr = this.MediaBrowserCompatMediaItem;
        fArr[0] = Float.MAX_VALUE;
        fArr[1] = Float.MAX_VALUE;
        return this;
    }

    private hasAnnotations read(int i) {
        this.AudioAttributesImplApi26Parcelizer = i;
        return this;
    }

    private hasAnnotations AudioAttributesImplBaseParcelizer() {
        this.IconCompatParcelizer.IconCompatParcelizer(500);
        return this;
    }

    private hasAnnotations MediaBrowserCompatItemReceiver() {
        this.IconCompatParcelizer.write(500);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.MediaDescriptionCompat
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L19
            if (r0 == r2) goto L15
            r3 = 2
            if (r0 == r3) goto L1d
            r6 = 3
            if (r0 != r6) goto L57
        L15:
            r5.AudioAttributesCompatParcelizer()
            goto L57
        L19:
            r5.RemoteActionCompatParcelizer = r2
            r5.MediaBrowserCompatCustomActionResultReceiver = r1
        L1d:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.AudioAttributesCompatParcelizer
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.RemoteActionCompatParcelizer(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.AudioAttributesCompatParcelizer
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.RemoteActionCompatParcelizer(r2, r7, r6, r3)
            o.hasAnnotations$read r7 = r5.IconCompatParcelizer
            r7.read(r0, r6)
            boolean r6 = r5.read
            if (r6 != 0) goto L57
            boolean r6 = r5.RemoteActionCompatParcelizer()
            if (r6 == 0) goto L57
            r5.write()
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.hasAnnotations.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    final boolean RemoteActionCompatParcelizer() {
        read readVar = this.IconCompatParcelizer;
        int iRemoteActionCompatParcelizer = readVar.RemoteActionCompatParcelizer();
        readVar.read();
        return iRemoteActionCompatParcelizer != 0 && RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer);
    }

    private void write() {
        int i;
        if (this.handleMediaPlayPauseIfPendingOnHandler == null) {
            this.handleMediaPlayPauseIfPendingOnHandler = new AudioAttributesCompatParcelizer();
        }
        this.read = true;
        this.write = true;
        if (!this.MediaBrowserCompatCustomActionResultReceiver && (i = this.AudioAttributesImplApi26Parcelizer) > 0) {
            InvalidTypeIdException.read(this.AudioAttributesCompatParcelizer, this.handleMediaPlayPauseIfPendingOnHandler, i);
        } else {
            this.handleMediaPlayPauseIfPendingOnHandler.run();
        }
        this.MediaBrowserCompatCustomActionResultReceiver = true;
    }

    private void AudioAttributesCompatParcelizer() {
        if (this.write) {
            this.read = false;
        } else {
            this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        }
    }

    private float RemoteActionCompatParcelizer(int i, float f, float f2, float f3) {
        float f4 = read(this.onCommand[i], f2, this.MediaBrowserCompatMediaItem[i], f);
        if (f4 == BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f5 = this.onAddQueueItem[i];
        float f6 = this.RatingCompat[i];
        float f7 = this.MediaBrowserCompatSearchResultReceiver[i];
        float f8 = f5 * f3;
        if (f4 > BitmapDescriptorFactory.HUE_RED) {
            return AudioAttributesCompatParcelizer(f4 * f8, f6, f7);
        }
        return -AudioAttributesCompatParcelizer((-f4) * f8, f6, f7);
    }

    private float read(float f, float f2, float f3, float f4) {
        float interpolation;
        float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(f * f2, BitmapDescriptorFactory.HUE_RED, f3);
        float fAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(f2 - f4, fAudioAttributesCompatParcelizer) - AudioAttributesCompatParcelizer(f4, fAudioAttributesCompatParcelizer);
        if (fAudioAttributesCompatParcelizer2 < BitmapDescriptorFactory.HUE_RED) {
            interpolation = -this.AudioAttributesImplBaseParcelizer.getInterpolation(-fAudioAttributesCompatParcelizer2);
        } else {
            if (fAudioAttributesCompatParcelizer2 <= BitmapDescriptorFactory.HUE_RED) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            interpolation = this.AudioAttributesImplBaseParcelizer.getInterpolation(fAudioAttributesCompatParcelizer2);
        }
        return AudioAttributesCompatParcelizer(interpolation, -1.0f, 1.0f);
    }

    private float AudioAttributesCompatParcelizer(float f, float f2) {
        if (f2 == BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int i = this.AudioAttributesImplApi21Parcelizer;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= BitmapDescriptorFactory.HUE_RED) {
                    return 1.0f - (f / f2);
                }
                if (this.read && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < BitmapDescriptorFactory.HUE_RED) {
            return f / (-f2);
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    final void read() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
        this.AudioAttributesCompatParcelizer.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    class AudioAttributesCompatParcelizer implements Runnable {
        AudioAttributesCompatParcelizer() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (hasAnnotations.this.read) {
                if (hasAnnotations.this.write) {
                    hasAnnotations.this.write = false;
                    hasAnnotations.this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
                }
                read readVar = hasAnnotations.this.IconCompatParcelizer;
                if (readVar.AudioAttributesImplBaseParcelizer() || !hasAnnotations.this.RemoteActionCompatParcelizer()) {
                    hasAnnotations.this.read = false;
                    return;
                }
                if (hasAnnotations.this.RemoteActionCompatParcelizer) {
                    hasAnnotations.this.RemoteActionCompatParcelizer = false;
                    hasAnnotations.this.read();
                }
                readVar.IconCompatParcelizer();
                readVar.AudioAttributesCompatParcelizer();
                hasAnnotations.this.IconCompatParcelizer(readVar.write());
                InvalidTypeIdException.AudioAttributesCompatParcelizer(hasAnnotations.this.AudioAttributesCompatParcelizer, this);
            }
        }
    }

    static class read {
        private float AudioAttributesImplApi26Parcelizer;
        private int IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private float MediaBrowserCompatItemReceiver;
        private float MediaMetadataCompat;
        private int read;
        private long AudioAttributesImplBaseParcelizer = Long.MIN_VALUE;
        private long AudioAttributesImplApi21Parcelizer = -1;
        private long AudioAttributesCompatParcelizer = 0;
        private int RemoteActionCompatParcelizer = 0;
        private int write = 0;

        private static float write(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        read() {
        }

        public final void IconCompatParcelizer(int i) {
            this.MediaBrowserCompatCustomActionResultReceiver = 500;
        }

        public final void write(int i) {
            this.IconCompatParcelizer = 500;
        }

        public final void MediaBrowserCompatCustomActionResultReceiver() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.AudioAttributesImplBaseParcelizer = jCurrentAnimationTimeMillis;
            this.AudioAttributesImplApi21Parcelizer = -1L;
            this.AudioAttributesCompatParcelizer = jCurrentAnimationTimeMillis;
            this.MediaBrowserCompatItemReceiver = 0.5f;
            this.RemoteActionCompatParcelizer = 0;
            this.write = 0;
        }

        public final void AudioAttributesImplApi21Parcelizer() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.read = hasAnnotations.RemoteActionCompatParcelizer((int) (jCurrentAnimationTimeMillis - this.AudioAttributesImplBaseParcelizer), this.IconCompatParcelizer);
            this.MediaBrowserCompatItemReceiver = AudioAttributesCompatParcelizer(jCurrentAnimationTimeMillis);
            this.AudioAttributesImplApi21Parcelizer = jCurrentAnimationTimeMillis;
        }

        public final boolean AudioAttributesImplBaseParcelizer() {
            return this.AudioAttributesImplApi21Parcelizer > 0 && AnimationUtils.currentAnimationTimeMillis() > this.AudioAttributesImplApi21Parcelizer + ((long) this.read);
        }

        private float AudioAttributesCompatParcelizer(long j) {
            if (j < this.AudioAttributesImplBaseParcelizer) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            long j2 = this.AudioAttributesImplApi21Parcelizer;
            if (j2 < 0 || j < j2) {
                return hasAnnotations.AudioAttributesCompatParcelizer((j - r0) / this.MediaBrowserCompatCustomActionResultReceiver, BitmapDescriptorFactory.HUE_RED, 1.0f) * 0.5f;
            }
            float f = this.MediaBrowserCompatItemReceiver;
            return (1.0f - f) + (f * hasAnnotations.AudioAttributesCompatParcelizer((j - j2) / this.read, BitmapDescriptorFactory.HUE_RED, 1.0f));
        }

        public final void IconCompatParcelizer() {
            if (this.AudioAttributesCompatParcelizer == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fWrite = write(AudioAttributesCompatParcelizer(jCurrentAnimationTimeMillis));
            long j = this.AudioAttributesCompatParcelizer;
            this.AudioAttributesCompatParcelizer = jCurrentAnimationTimeMillis;
            float f = (jCurrentAnimationTimeMillis - j) * fWrite;
            this.RemoteActionCompatParcelizer = (int) (this.AudioAttributesImplApi26Parcelizer * f);
            this.write = (int) (f * this.MediaMetadataCompat);
        }

        public final void read(float f, float f2) {
            this.AudioAttributesImplApi26Parcelizer = f;
            this.MediaMetadataCompat = f2;
        }

        public final int read() {
            float f = this.AudioAttributesImplApi26Parcelizer;
            return (int) (f / Math.abs(f));
        }

        public final int RemoteActionCompatParcelizer() {
            float f = this.MediaMetadataCompat;
            return (int) (f / Math.abs(f));
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final int write() {
            return this.write;
        }
    }
}
