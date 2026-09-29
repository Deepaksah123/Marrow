package com.clevertap.android.sdk.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.lambdaupdateStateAndInformListeners32;

/* JADX INFO: loaded from: classes2.dex */
public class GifImageView extends AppCompatImageView implements Runnable {
    private Thread AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private lambdaupdateStateAndInformListeners32 AudioAttributesImplApi26Parcelizer;
    private long AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private IconCompatParcelizer MediaBrowserCompatCustomActionResultReceiver;
    private final Handler MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private Bitmap MediaDescriptionCompat;
    private final Runnable RatingCompat;
    private AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;
    private final Runnable read;
    private write write;

    public interface AudioAttributesCompatParcelizer {
    }

    public interface IconCompatParcelizer {
        Bitmap IconCompatParcelizer();
    }

    public interface write {
    }

    static /* synthetic */ lambdaupdateStateAndInformListeners32 AudioAttributesCompatParcelizer(GifImageView gifImageView) {
        gifImageView.AudioAttributesImplApi26Parcelizer = null;
        return null;
    }

    static /* synthetic */ Thread RemoteActionCompatParcelizer(GifImageView gifImageView) {
        gifImageView.AudioAttributesCompatParcelizer = null;
        return null;
    }

    static /* synthetic */ boolean read(GifImageView gifImageView) {
        gifImageView.MediaBrowserCompatMediaItem = false;
        return false;
    }

    static /* synthetic */ Bitmap write(GifImageView gifImageView) {
        gifImageView.MediaDescriptionCompat = null;
        return null;
    }

    public GifImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.write = null;
        this.RemoteActionCompatParcelizer = null;
        this.MediaBrowserCompatCustomActionResultReceiver = null;
        this.AudioAttributesImplBaseParcelizer = -1L;
        this.MediaBrowserCompatItemReceiver = new Handler(Looper.getMainLooper());
        this.read = new Runnable() { // from class: com.clevertap.android.sdk.gif.GifImageView.2
            @Override // java.lang.Runnable
            public final void run() {
                GifImageView.write(GifImageView.this);
                GifImageView.AudioAttributesCompatParcelizer(GifImageView.this);
                GifImageView.RemoteActionCompatParcelizer(GifImageView.this);
                GifImageView.read(GifImageView.this);
            }
        };
        this.RatingCompat = new Runnable() { // from class: com.clevertap.android.sdk.gif.GifImageView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (GifImageView.this.MediaDescriptionCompat == null || GifImageView.this.MediaDescriptionCompat.isRecycled()) {
                    return;
                }
                GifImageView gifImageView = GifImageView.this;
                gifImageView.setImageBitmap(gifImageView.MediaDescriptionCompat);
                GifImageView.this.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
        };
    }

    public GifImageView(Context context) {
        super(context);
        this.write = null;
        this.RemoteActionCompatParcelizer = null;
        this.MediaBrowserCompatCustomActionResultReceiver = null;
        this.AudioAttributesImplBaseParcelizer = -1L;
        this.MediaBrowserCompatItemReceiver = new Handler(Looper.getMainLooper());
        this.read = new Runnable() { // from class: com.clevertap.android.sdk.gif.GifImageView.2
            @Override // java.lang.Runnable
            public final void run() {
                GifImageView.write(GifImageView.this);
                GifImageView.AudioAttributesCompatParcelizer(GifImageView.this);
                GifImageView.RemoteActionCompatParcelizer(GifImageView.this);
                GifImageView.read(GifImageView.this);
            }
        };
        this.RatingCompat = new Runnable() { // from class: com.clevertap.android.sdk.gif.GifImageView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (GifImageView.this.MediaDescriptionCompat == null || GifImageView.this.MediaDescriptionCompat.isRecycled()) {
                    return;
                }
                GifImageView gifImageView = GifImageView.this;
                gifImageView.setImageBitmap(gifImageView.MediaDescriptionCompat);
                GifImageView.this.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
        };
    }

    public final void read() {
        this.IconCompatParcelizer = false;
        this.AudioAttributesImplApi21Parcelizer = false;
        this.MediaBrowserCompatMediaItem = true;
        AudioAttributesImplApi21Parcelizer();
        this.MediaBrowserCompatItemReceiver.post(this.read);
    }

    public void setFramesDisplayDuration(long j) {
        this.AudioAttributesImplBaseParcelizer = j;
    }

    public void setOnAnimationStop(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.RemoteActionCompatParcelizer = audioAttributesCompatParcelizer;
    }

    public void setOnFrameAvailable(IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizer;
    }

    private void IconCompatParcelizer() {
        if (this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer() == 0 || !this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(-1) || this.IconCompatParcelizer) {
            return;
        }
        this.AudioAttributesImplApi21Parcelizer = true;
        RemoteActionCompatParcelizer();
    }

    @Override // java.lang.Runnable
    public void run() {
        long jNanoTime;
        do {
            if (!this.IconCompatParcelizer && !this.AudioAttributesImplApi21Parcelizer) {
                break;
            }
            boolean zAudioAttributesCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
            try {
                long jNanoTime2 = System.nanoTime();
                this.MediaDescriptionCompat = this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
                IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver;
                if (iconCompatParcelizer != null) {
                    this.MediaDescriptionCompat = iconCompatParcelizer.IconCompatParcelizer();
                }
                jNanoTime = (System.nanoTime() - jNanoTime2) / 1000000;
                try {
                    this.MediaBrowserCompatItemReceiver.post(this.RatingCompat);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused) {
                }
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused2) {
                jNanoTime = 0;
            }
            this.AudioAttributesImplApi21Parcelizer = false;
            if (!this.IconCompatParcelizer || !zAudioAttributesCompatParcelizer) {
                this.IconCompatParcelizer = false;
                break;
            }
            try {
                int iWrite = (int) (((long) this.AudioAttributesImplApi26Parcelizer.write()) - jNanoTime);
                if (iWrite > 0) {
                    long j = this.AudioAttributesImplBaseParcelizer;
                    if (j <= 0) {
                        j = iWrite;
                    }
                    Thread.sleep(j);
                }
            } catch (InterruptedException unused3) {
            }
        } while (this.IconCompatParcelizer);
        if (this.MediaBrowserCompatMediaItem) {
            this.MediaBrowserCompatItemReceiver.post(this.read);
        }
        this.AudioAttributesCompatParcelizer = null;
    }

    public void setBytes(byte[] bArr) {
        lambdaupdateStateAndInformListeners32 lambdaupdatestateandinformlisteners32 = new lambdaupdateStateAndInformListeners32();
        this.AudioAttributesImplApi26Parcelizer = lambdaupdatestateandinformlisteners32;
        try {
            lambdaupdatestateandinformlisteners32.read(bArr);
            if (this.IconCompatParcelizer) {
                RemoteActionCompatParcelizer();
            } else {
                IconCompatParcelizer();
            }
        } catch (Exception unused) {
            this.AudioAttributesImplApi26Parcelizer = null;
        }
    }

    public void setOnAnimationStart(write writeVar) {
        this.write = writeVar;
    }

    public final void AudioAttributesCompatParcelizer() {
        this.IconCompatParcelizer = true;
        RemoteActionCompatParcelizer();
    }

    private void AudioAttributesImplApi21Parcelizer() {
        this.IconCompatParcelizer = false;
        Thread thread = this.AudioAttributesCompatParcelizer;
        if (thread != null) {
            thread.interrupt();
            this.AudioAttributesCompatParcelizer = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        read();
    }

    private boolean write() {
        return (this.IconCompatParcelizer || this.AudioAttributesImplApi21Parcelizer) && this.AudioAttributesImplApi26Parcelizer != null && this.AudioAttributesCompatParcelizer == null;
    }

    private void RemoteActionCompatParcelizer() {
        if (write()) {
            Thread thread = new Thread(this);
            this.AudioAttributesCompatParcelizer = thread;
            thread.start();
        }
    }
}
