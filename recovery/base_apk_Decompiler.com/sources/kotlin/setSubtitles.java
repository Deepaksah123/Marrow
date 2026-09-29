package kotlin;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
final class setSubtitles {
    private boolean AudioAttributesCompatParcelizer;
    private final Handler write = new Handler(Looper.getMainLooper(), new read());

    setSubtitles() {
    }

    final void AudioAttributesCompatParcelizer(setMimeType<?> setmimetype, boolean z) {
        synchronized (this) {
            if (this.AudioAttributesCompatParcelizer || z) {
                this.write.obtainMessage(1, setmimetype).sendToTarget();
            } else {
                this.AudioAttributesCompatParcelizer = true;
                setmimetype.MediaBrowserCompatCustomActionResultReceiver();
                this.AudioAttributesCompatParcelizer = false;
            }
        }
    }

    static final class read implements Handler.Callback {
        read() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((setMimeType) message.obj).MediaBrowserCompatCustomActionResultReceiver();
            return true;
        }
    }
}
