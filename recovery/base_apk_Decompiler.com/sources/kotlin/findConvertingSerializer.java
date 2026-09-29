package kotlin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
final class findConvertingSerializer {
    private final AudioManager AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private read IconCompatParcelizer;
    private final Handler RemoteActionCompatParcelizer;
    private boolean read;
    private final RemoteActionCompatParcelizer write;

    public interface RemoteActionCompatParcelizer {
        void write(int i, boolean z);
    }

    public final void RemoteActionCompatParcelizer() {
    }

    public final int AudioAttributesCompatParcelizer() {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 28) {
            return this.AudioAttributesCompatParcelizer.getStreamMinVolume(this.AudioAttributesImplApi21Parcelizer);
        }
        return 0;
    }

    public final int write() {
        return this.AudioAttributesCompatParcelizer.getStreamMaxVolume(this.AudioAttributesImplApi21Parcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer() {
        int i = read(this.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi21Parcelizer);
        boolean zWrite = write(this.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi21Parcelizer);
        if (this.AudioAttributesImplApi26Parcelizer == i && this.read == zWrite) {
            return;
        }
        this.AudioAttributesImplApi26Parcelizer = i;
        this.read = zWrite;
        this.write.write(i, zWrite);
    }

    private static int read(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            prune.write("StreamVolumeManager", "Could not retrieve stream volume for stream type ".concat(String.valueOf(i)), e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    private static boolean write(AudioManager audioManager, int i) {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23) {
            return audioManager.isStreamMute(i);
        }
        return read(audioManager, i) == 0;
    }

    final class read extends BroadcastReceiver {
        final /* synthetic */ findConvertingSerializer IconCompatParcelizer;

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Handler handler = this.IconCompatParcelizer.RemoteActionCompatParcelizer;
            final findConvertingSerializer findconvertingserializer = this.IconCompatParcelizer;
            handler.post(new Runnable() { // from class: o.createTypeSerializer
                @Override // java.lang.Runnable
                public final void run() {
                    findconvertingserializer.IconCompatParcelizer();
                }
            });
        }
    }
}
