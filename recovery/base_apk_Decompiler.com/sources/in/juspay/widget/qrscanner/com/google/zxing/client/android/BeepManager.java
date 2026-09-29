package in.juspay.widget.qrscanner.com.google.zxing.client.android;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Vibrator;
import java.io.IOException;
import kotlin.onProgress;

/* JADX INFO: loaded from: classes5.dex */
public final class BeepManager {
    private static final String d = "BeepManager";
    private final Context a;
    private boolean b = true;
    private boolean c = false;

    public BeepManager(Activity activity) {
        activity.setVolumeControlStream(3);
        this.a = activity.getApplicationContext();
    }

    public final boolean isBeepEnabled() {
        return this.b;
    }

    public final boolean isVibrateEnabled() {
        return this.c;
    }

    public final MediaPlayer playBeepSound() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener(this) { // from class: in.juspay.widget.qrscanner.com.google.zxing.client.android.BeepManager.1
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer2) {
                mediaPlayer2.stop();
                mediaPlayer2.release();
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener(this) { // from class: in.juspay.widget.qrscanner.com.google.zxing.client.android.BeepManager.2
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                String unused = BeepManager.d;
                mediaPlayer2.stop();
                mediaPlayer2.release();
                return true;
            }
        });
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.a.getResources().openRawResourceFd(onProgress.write.zxing_beep);
            try {
                mediaPlayer.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                assetFileDescriptorOpenRawResourceFd.close();
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                mediaPlayer.start();
                return mediaPlayer;
            } catch (Throwable th) {
                assetFileDescriptorOpenRawResourceFd.close();
                throw th;
            }
        } catch (IOException unused) {
            mediaPlayer.release();
            return null;
        }
    }

    public final void playBeepSoundAndVibrate() {
        Vibrator vibrator;
        synchronized (this) {
            if (this.b) {
                playBeepSound();
            }
            if (this.c && (vibrator = (Vibrator) this.a.getSystemService("vibrator")) != null) {
                vibrator.vibrate(200L);
            }
        }
    }

    public final MediaPlayer playSound(String str) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener(this) { // from class: in.juspay.widget.qrscanner.com.google.zxing.client.android.BeepManager.3
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer2) {
                mediaPlayer2.stop();
                mediaPlayer2.release();
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener(this) { // from class: in.juspay.widget.qrscanner.com.google.zxing.client.android.BeepManager.4
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                String unused = BeepManager.d;
                mediaPlayer2.stop();
                mediaPlayer2.release();
                return true;
            }
        });
        try {
            AssetFileDescriptor assetFileDescriptorOpenFd = this.a.getResources().getAssets().openFd(str);
            try {
                mediaPlayer.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                assetFileDescriptorOpenFd.close();
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                mediaPlayer.start();
                return mediaPlayer;
            } catch (Throwable th) {
                assetFileDescriptorOpenFd.close();
                throw th;
            }
        } catch (IOException unused) {
            mediaPlayer.release();
            return null;
        }
    }

    public final void setBeepEnabled(boolean z) {
        this.b = z;
    }

    public final void setVibrateEnabled(boolean z) {
        this.c = z;
    }
}
