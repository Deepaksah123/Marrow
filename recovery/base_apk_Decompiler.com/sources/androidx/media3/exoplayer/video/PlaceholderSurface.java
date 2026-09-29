package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import kotlin.TypeSerializer1;
import kotlin._locateTypeId;
import kotlin.buildTypeSerializer;
import kotlin.prune;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaceholderSurface extends Surface {
    private static boolean RemoteActionCompatParcelizer;
    private static int read;
    public final boolean AudioAttributesCompatParcelizer;
    private boolean IconCompatParcelizer;
    private final AudioAttributesCompatParcelizer write;

    /* synthetic */ PlaceholderSurface(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, SurfaceTexture surfaceTexture, boolean z, byte b) {
        this(audioAttributesCompatParcelizer, surfaceTexture, z);
    }

    public static boolean AudioAttributesCompatParcelizer(Context context) {
        boolean z;
        synchronized (PlaceholderSurface.class) {
            if (!RemoteActionCompatParcelizer) {
                read = IconCompatParcelizer(context);
                RemoteActionCompatParcelizer = true;
            }
            z = read != 0;
        }
        return z;
    }

    public static PlaceholderSurface write(Context context, boolean z) {
        buildTypeSerializer.write(!z || AudioAttributesCompatParcelizer(context));
        return new AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(z ? read : 0);
    }

    private PlaceholderSurface(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.write = audioAttributesCompatParcelizer;
        this.AudioAttributesCompatParcelizer = z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.write) {
            if (!this.IconCompatParcelizer) {
                this.write.RemoteActionCompatParcelizer();
                this.IconCompatParcelizer = true;
            }
        }
    }

    private static int IconCompatParcelizer(Context context) {
        if (TypeSerializer1.read(context)) {
            return TypeSerializer1.read() ? 1 : 2;
        }
        return 0;
    }

    static class AudioAttributesCompatParcelizer extends HandlerThread implements Handler.Callback {
        private PlaceholderSurface AudioAttributesCompatParcelizer;
        private RuntimeException IconCompatParcelizer;
        private Error RemoteActionCompatParcelizer;
        private Handler read;
        private _locateTypeId write;

        public AudioAttributesCompatParcelizer() {
            super("ExoPlayer:PlaceholderSurface");
        }

        public final PlaceholderSurface RemoteActionCompatParcelizer(int i) {
            boolean z;
            start();
            this.read = new Handler(getLooper(), this);
            this.write = new _locateTypeId(this.read);
            synchronized (this) {
                z = false;
                this.read.obtainMessage(1, i, 0).sendToTarget();
                while (this.AudioAttributesCompatParcelizer == null && this.IconCompatParcelizer == null && this.RemoteActionCompatParcelizer == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.IconCompatParcelizer;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.RemoteActionCompatParcelizer;
            if (error != null) {
                throw error;
            }
            return (PlaceholderSurface) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
        }

        public final void RemoteActionCompatParcelizer() {
            this.read.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        write();
                    } finally {
                        try {
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    read(message.arg1);
                } catch (Error e) {
                    prune.read("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.RemoteActionCompatParcelizer = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    prune.read("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.IconCompatParcelizer = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (TypeSerializer1.IconCompatParcelizer e3) {
                    prune.read("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.IconCompatParcelizer = new IllegalStateException(e3);
                    synchronized (this) {
                        notify();
                    }
                }
                synchronized (this) {
                    notify();
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }

        private void read(int i) throws TypeSerializer1.IconCompatParcelizer {
            this.write.IconCompatParcelizer(i);
            this.AudioAttributesCompatParcelizer = new PlaceholderSurface(this, this.write.AudioAttributesCompatParcelizer(), i != 0, (byte) 0);
        }

        private void write() {
            this.write.IconCompatParcelizer();
        }
    }
}
