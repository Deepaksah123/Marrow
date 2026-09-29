package kotlin;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class parseFrom {
    private static parseFrom write;
    private read IconCompatParcelizer;
    private read RemoteActionCompatParcelizer;
    private final Object AudioAttributesCompatParcelizer = new Object();
    private final Handler read = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: o.parseFrom.3
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            parseFrom.this.write((read) message.obj);
            return true;
        }
    });

    public interface AudioAttributesCompatParcelizer {
        void IconCompatParcelizer();

        void RemoteActionCompatParcelizer(int i);
    }

    public static parseFrom read() {
        if (write == null) {
            write = new parseFrom();
        }
        return write;
    }

    private parseFrom() {
    }

    public final void IconCompatParcelizer(int i, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        synchronized (this.AudioAttributesCompatParcelizer) {
            if (AudioAttributesImplApi26Parcelizer(audioAttributesCompatParcelizer)) {
                this.IconCompatParcelizer.RemoteActionCompatParcelizer = i;
                this.read.removeCallbacksAndMessages(this.IconCompatParcelizer);
                RemoteActionCompatParcelizer(this.IconCompatParcelizer);
                return;
            }
            if (MediaBrowserCompatCustomActionResultReceiver(audioAttributesCompatParcelizer)) {
                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer = i;
            } else {
                this.RemoteActionCompatParcelizer = new read(i, audioAttributesCompatParcelizer);
            }
            read readVar = this.IconCompatParcelizer;
            if (readVar == null || !read(readVar, 4)) {
                this.IconCompatParcelizer = null;
                AudioAttributesCompatParcelizer();
            }
        }
    }

    public final void AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, int i) {
        synchronized (this.AudioAttributesCompatParcelizer) {
            if (AudioAttributesImplApi26Parcelizer(audioAttributesCompatParcelizer)) {
                read(this.IconCompatParcelizer, i);
            } else if (MediaBrowserCompatCustomActionResultReceiver(audioAttributesCompatParcelizer)) {
                read(this.RemoteActionCompatParcelizer, i);
            }
        }
    }

    public final void RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        synchronized (this.AudioAttributesCompatParcelizer) {
            if (AudioAttributesImplApi26Parcelizer(audioAttributesCompatParcelizer)) {
                this.IconCompatParcelizer = null;
                if (this.RemoteActionCompatParcelizer != null) {
                    AudioAttributesCompatParcelizer();
                }
            }
        }
    }

    public final void write(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        synchronized (this.AudioAttributesCompatParcelizer) {
            if (AudioAttributesImplApi26Parcelizer(audioAttributesCompatParcelizer)) {
                RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            }
        }
    }

    public final void AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        synchronized (this.AudioAttributesCompatParcelizer) {
            if (AudioAttributesImplApi26Parcelizer(audioAttributesCompatParcelizer) && !this.IconCompatParcelizer.read) {
                this.IconCompatParcelizer.read = true;
                this.read.removeCallbacksAndMessages(this.IconCompatParcelizer);
            }
        }
    }

    public final void AudioAttributesImplBaseParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        synchronized (this.AudioAttributesCompatParcelizer) {
            if (AudioAttributesImplApi26Parcelizer(audioAttributesCompatParcelizer) && this.IconCompatParcelizer.read) {
                this.IconCompatParcelizer.read = false;
                RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            }
        }
    }

    public final boolean IconCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        boolean zAudioAttributesImplApi26Parcelizer;
        synchronized (this.AudioAttributesCompatParcelizer) {
            zAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(audioAttributesCompatParcelizer);
        }
        return zAudioAttributesImplApi26Parcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean read(o.parseFrom.AudioAttributesCompatParcelizer r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.AudioAttributesCompatParcelizer
            monitor-enter(r0)
            boolean r1 = r2.AudioAttributesImplApi26Parcelizer(r3)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L12
            boolean r2 = r2.MediaBrowserCompatCustomActionResultReceiver(r3)     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L10
            goto L12
        L10:
            r2 = 0
            goto L13
        L12:
            r2 = 1
        L13:
            monitor-exit(r0)
            return r2
        L15:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseFrom.read(o.parseFrom$AudioAttributesCompatParcelizer):boolean");
    }

    static class read {
        final WeakReference<AudioAttributesCompatParcelizer> AudioAttributesCompatParcelizer;
        int RemoteActionCompatParcelizer;
        boolean read;

        read(int i, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = new WeakReference<>(audioAttributesCompatParcelizer);
            this.RemoteActionCompatParcelizer = i;
        }

        final boolean AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            return audioAttributesCompatParcelizer != null && this.AudioAttributesCompatParcelizer.get() == audioAttributesCompatParcelizer;
        }
    }

    private void AudioAttributesCompatParcelizer() {
        read readVar = this.RemoteActionCompatParcelizer;
        if (readVar != null) {
            this.IconCompatParcelizer = readVar;
            this.RemoteActionCompatParcelizer = null;
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = readVar.AudioAttributesCompatParcelizer.get();
            if (audioAttributesCompatParcelizer != null) {
                audioAttributesCompatParcelizer.IconCompatParcelizer();
            } else {
                this.IconCompatParcelizer = null;
            }
        }
    }

    private boolean read(read readVar, int i) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = readVar.AudioAttributesCompatParcelizer.get();
        if (audioAttributesCompatParcelizer == null) {
            return false;
        }
        this.read.removeCallbacksAndMessages(readVar);
        audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i);
        return true;
    }

    private boolean AudioAttributesImplApi26Parcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        read readVar = this.IconCompatParcelizer;
        return readVar != null && readVar.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer);
    }

    private boolean MediaBrowserCompatCustomActionResultReceiver(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        read readVar = this.RemoteActionCompatParcelizer;
        return readVar != null && readVar.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer);
    }

    private void RemoteActionCompatParcelizer(read readVar) {
        int i;
        if (readVar.RemoteActionCompatParcelizer == -2) {
            return;
        }
        if (readVar.RemoteActionCompatParcelizer > 0) {
            i = readVar.RemoteActionCompatParcelizer;
        } else {
            i = readVar.RemoteActionCompatParcelizer == -1 ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : 2750;
        }
        this.read.removeCallbacksAndMessages(readVar);
        Handler handler = this.read;
        handler.sendMessageDelayed(Message.obtain(handler, 0, readVar), i);
    }

    final void write(read readVar) {
        synchronized (this.AudioAttributesCompatParcelizer) {
            if (this.IconCompatParcelizer == readVar || this.RemoteActionCompatParcelizer == readVar) {
                read(readVar, 2);
            }
        }
    }
}
