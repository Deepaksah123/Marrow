package kotlin;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class constructCollectionType implements classForName {
    public static final write AudioAttributesCompatParcelizer;
    public static final write IconCompatParcelizer;
    public static final write RemoteActionCompatParcelizer;
    private IOException AudioAttributesImplBaseParcelizer;
    private final ExecutorService read;
    private IconCompatParcelizer<? extends AudioAttributesCompatParcelizer> write;

    public interface AudioAttributesCompatParcelizer {
        void AudioAttributesCompatParcelizer() throws IOException;

        void B_();
    }

    public interface RemoteActionCompatParcelizer<T extends AudioAttributesCompatParcelizer> {
        write AudioAttributesCompatParcelizer(T t, long j, long j2, IOException iOException, int i);

        void RemoteActionCompatParcelizer(T t, long j, long j2);

        void read(T t, long j, long j2, boolean z);
    }

    public interface read {
        void AudioAttributesImplBaseParcelizer();
    }

    public static final class AudioAttributesImplApi26Parcelizer extends IOException {
        public AudioAttributesImplApi26Parcelizer(Throwable th) {
            String string;
            StringBuilder sb = new StringBuilder("Unexpected ");
            sb.append(th.getClass().getSimpleName());
            if (th.getMessage() != null) {
                StringBuilder sb2 = new StringBuilder(": ");
                sb2.append(th.getMessage());
                string = sb2.toString();
            } else {
                string = "";
            }
            sb.append(string);
            super(sb.toString(), th);
        }
    }

    static {
        byte b = 0;
        long j = C.TIME_UNSET;
        AudioAttributesCompatParcelizer = RemoteActionCompatParcelizer(false, C.TIME_UNSET);
        RemoteActionCompatParcelizer(true, C.TIME_UNSET);
        RemoteActionCompatParcelizer = new write(2, j, b);
        IconCompatParcelizer = new write(3, j, b);
    }

    public static final class write {
        private final long IconCompatParcelizer;
        private final int read;

        /* synthetic */ write(int i, long j, byte b) {
            this(i, j);
        }

        private write(int i, long j) {
            this.read = i;
            this.IconCompatParcelizer = j;
        }

        public final boolean read() {
            int i = this.read;
            return i == 0 || i == 1;
        }
    }

    public constructCollectionType(String str) {
        this.read = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer("ExoPlayer:Loader:".concat(String.valueOf(str)));
    }

    public static write RemoteActionCompatParcelizer(boolean z, long j) {
        return new write(z ? 1 : 0, j, (byte) 0);
    }

    public final boolean IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer != null;
    }

    public final void write() {
        this.AudioAttributesImplBaseParcelizer = null;
    }

    public final <T extends AudioAttributesCompatParcelizer> long read(T t, RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer, int i) {
        Looper looper = (Looper) buildTypeSerializer.AudioAttributesCompatParcelizer(Looper.myLooper());
        this.AudioAttributesImplBaseParcelizer = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new IconCompatParcelizer(looper, t, remoteActionCompatParcelizer, i, jElapsedRealtime).read(0L);
        return jElapsedRealtime;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.write != null;
    }

    public final void AudioAttributesCompatParcelizer() {
        ((IconCompatParcelizer) buildTypeSerializer.AudioAttributesCompatParcelizer(this.write)).write(false);
    }

    public final void AudioAttributesImplBaseParcelizer() {
        read(null);
    }

    public final void read(read readVar) {
        IconCompatParcelizer<? extends AudioAttributesCompatParcelizer> iconCompatParcelizer = this.write;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.write(true);
        }
        if (readVar != null) {
            this.read.execute(new AudioAttributesImplApi21Parcelizer(readVar));
        }
        this.read.shutdown();
    }

    @Override // kotlin.classForName
    public final void read() throws IOException {
        AudioAttributesCompatParcelizer(Integer.MIN_VALUE);
    }

    public final void AudioAttributesCompatParcelizer(int i) throws IOException {
        IOException iOException = this.AudioAttributesImplBaseParcelizer;
        if (iOException != null) {
            throw iOException;
        }
        IconCompatParcelizer<? extends AudioAttributesCompatParcelizer> iconCompatParcelizer = this.write;
        if (iconCompatParcelizer != null) {
            if (i == Integer.MIN_VALUE) {
                i = iconCompatParcelizer.RemoteActionCompatParcelizer;
            }
            iconCompatParcelizer.RemoteActionCompatParcelizer(i);
        }
    }

    final class IconCompatParcelizer<T extends AudioAttributesCompatParcelizer> extends Handler implements Runnable {
        private final long AudioAttributesImplApi21Parcelizer;
        private Thread AudioAttributesImplApi26Parcelizer;
        private volatile boolean AudioAttributesImplBaseParcelizer;
        private IOException IconCompatParcelizer;
        private final T MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        public final int RemoteActionCompatParcelizer;
        private boolean read;
        private RemoteActionCompatParcelizer<T> write;

        public IconCompatParcelizer(Looper looper, T t, RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer, int i, long j) {
            super(looper);
            this.MediaBrowserCompatCustomActionResultReceiver = t;
            this.write = remoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = i;
            this.AudioAttributesImplApi21Parcelizer = j;
        }

        public final void RemoteActionCompatParcelizer(int i) throws IOException {
            IOException iOException = this.IconCompatParcelizer;
            if (iOException != null && this.MediaBrowserCompatItemReceiver > i) {
                throw iOException;
            }
        }

        public final void read(long j) {
            buildTypeSerializer.write(constructCollectionType.this.write == null);
            constructCollectionType.this.write = this;
            if (j > 0) {
                sendEmptyMessageDelayed(1, j);
            } else {
                read();
            }
        }

        public final void write(boolean z) {
            this.AudioAttributesImplBaseParcelizer = z;
            this.IconCompatParcelizer = null;
            if (hasMessages(1)) {
                this.read = true;
                removeMessages(1);
                if (!z) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    this.read = true;
                    this.MediaBrowserCompatCustomActionResultReceiver.B_();
                    Thread thread = this.AudioAttributesImplApi26Parcelizer;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                AudioAttributesCompatParcelizer();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((RemoteActionCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.write)).read(this.MediaBrowserCompatCustomActionResultReceiver, jElapsedRealtime, jElapsedRealtime - this.AudioAttributesImplApi21Parcelizer, true);
                this.write = null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = this.read;
                    this.AudioAttributesImplApi26Parcelizer = Thread.currentThread();
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder("load:");
                    sb.append(this.MediaBrowserCompatCustomActionResultReceiver.getClass().getSimpleName());
                    StdSubtypeResolver.write(sb.toString());
                    try {
                        this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer();
                        StdSubtypeResolver.RemoteActionCompatParcelizer();
                    } catch (Throwable th) {
                        StdSubtypeResolver.RemoteActionCompatParcelizer();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.AudioAttributesImplApi26Parcelizer = null;
                    Thread.interrupted();
                }
                if (this.AudioAttributesImplBaseParcelizer) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e) {
                if (this.AudioAttributesImplBaseParcelizer) {
                    return;
                }
                obtainMessage(3, e).sendToTarget();
            } catch (OutOfMemoryError e2) {
                if (this.AudioAttributesImplBaseParcelizer) {
                    return;
                }
                prune.read("LoadTask", "OutOfMemory error loading stream", e2);
                obtainMessage(3, new AudioAttributesImplApi26Parcelizer(e2)).sendToTarget();
            } catch (Error e3) {
                if (!this.AudioAttributesImplBaseParcelizer) {
                    prune.read("LoadTask", "Unexpected error loading stream", e3);
                    obtainMessage(4, e3).sendToTarget();
                }
                throw e3;
            } catch (Exception e4) {
                if (this.AudioAttributesImplBaseParcelizer) {
                    return;
                }
                prune.read("LoadTask", "Unexpected exception loading stream", e4);
                obtainMessage(3, new AudioAttributesImplApi26Parcelizer(e4)).sendToTarget();
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            long jIconCompatParcelizer;
            if (this.AudioAttributesImplBaseParcelizer) {
                return;
            }
            if (message.what == 1) {
                read();
                return;
            }
            if (message.what == 4) {
                throw ((Error) message.obj);
            }
            AudioAttributesCompatParcelizer();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.AudioAttributesImplApi21Parcelizer;
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.write);
            if (this.read) {
                remoteActionCompatParcelizer.read(this.MediaBrowserCompatCustomActionResultReceiver, jElapsedRealtime, j, false);
                return;
            }
            int i = message.what;
            if (i == 2) {
                try {
                    remoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, jElapsedRealtime, j);
                    return;
                } catch (RuntimeException e) {
                    prune.read("LoadTask", "Unexpected exception handling load completed", e);
                    constructCollectionType.this.AudioAttributesImplBaseParcelizer = new AudioAttributesImplApi26Parcelizer(e);
                    return;
                }
            }
            if (i == 3) {
                IOException iOException = (IOException) message.obj;
                this.IconCompatParcelizer = iOException;
                int i2 = this.MediaBrowserCompatItemReceiver + 1;
                this.MediaBrowserCompatItemReceiver = i2;
                write writeVarAudioAttributesCompatParcelizer = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, jElapsedRealtime, j, iOException, i2);
                if (writeVarAudioAttributesCompatParcelizer.read != 3) {
                    if (writeVarAudioAttributesCompatParcelizer.read != 2) {
                        if (writeVarAudioAttributesCompatParcelizer.read == 1) {
                            this.MediaBrowserCompatItemReceiver = 1;
                        }
                        if (writeVarAudioAttributesCompatParcelizer.IconCompatParcelizer != C.TIME_UNSET) {
                            jIconCompatParcelizer = writeVarAudioAttributesCompatParcelizer.IconCompatParcelizer;
                        } else {
                            jIconCompatParcelizer = IconCompatParcelizer();
                        }
                        read(jIconCompatParcelizer);
                        return;
                    }
                    return;
                }
                constructCollectionType.this.AudioAttributesImplBaseParcelizer = this.IconCompatParcelizer;
            }
        }

        private void read() {
            this.IconCompatParcelizer = null;
            constructCollectionType.this.read.execute((Runnable) buildTypeSerializer.IconCompatParcelizer(constructCollectionType.this.write));
        }

        private void AudioAttributesCompatParcelizer() {
            constructCollectionType.this.write = null;
        }

        private long IconCompatParcelizer() {
            return Math.min((this.MediaBrowserCompatItemReceiver - 1) * 1000, 5000);
        }
    }

    static final class AudioAttributesImplApi21Parcelizer implements Runnable {
        private final read write;

        public AudioAttributesImplApi21Parcelizer(read readVar) {
            this.write = readVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.write.AudioAttributesImplBaseParcelizer();
        }
    }
}
