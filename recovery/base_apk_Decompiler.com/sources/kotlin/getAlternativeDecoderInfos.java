package kotlin;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class getAlternativeDecoderInfos extends InputStream {
    private final avcLevelToMaxFrameSize AudioAttributesCompatParcelizer;
    private final InputStream IconCompatParcelizer;
    private final Timer MediaBrowserCompatItemReceiver;
    private long write;
    private long read = -1;
    private long RemoteActionCompatParcelizer = -1;

    public getAlternativeDecoderInfos(InputStream inputStream, avcLevelToMaxFrameSize avcleveltomaxframesize, Timer timer) {
        this.MediaBrowserCompatItemReceiver = timer;
        this.IconCompatParcelizer = inputStream;
        this.AudioAttributesCompatParcelizer = avcleveltomaxframesize;
        this.write = avcleveltomaxframesize.MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        try {
            return this.IconCompatParcelizer.available();
        } catch (IOException e) {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer());
            getDecoderInfosSortedByFormatSupport.read(this.AudioAttributesCompatParcelizer);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        long jAudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer();
        if (this.RemoteActionCompatParcelizer == -1) {
            this.RemoteActionCompatParcelizer = jAudioAttributesCompatParcelizer;
        }
        try {
            this.IconCompatParcelizer.close();
            long j = this.read;
            if (j != -1) {
                this.AudioAttributesCompatParcelizer.read(j);
            }
            long j2 = this.write;
            if (j2 != -1) {
                this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(j2);
            }
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        } catch (IOException e) {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer());
            getDecoderInfosSortedByFormatSupport.read(this.AudioAttributesCompatParcelizer);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.IconCompatParcelizer.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.IconCompatParcelizer.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            int i = this.IconCompatParcelizer.read();
            long jAudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer();
            if (this.write == -1) {
                this.write = jAudioAttributesCompatParcelizer;
            }
            if (i == -1 && this.RemoteActionCompatParcelizer == -1) {
                this.RemoteActionCompatParcelizer = jAudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(jAudioAttributesCompatParcelizer);
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                return i;
            }
            long j = this.read + 1;
            this.read = j;
            this.AudioAttributesCompatParcelizer.read(j);
            return i;
        } catch (IOException e) {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer());
            getDecoderInfosSortedByFormatSupport.read(this.AudioAttributesCompatParcelizer);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            int i3 = this.IconCompatParcelizer.read(bArr, i, i2);
            long jAudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer();
            if (this.write == -1) {
                this.write = jAudioAttributesCompatParcelizer;
            }
            if (i3 == -1 && this.RemoteActionCompatParcelizer == -1) {
                this.RemoteActionCompatParcelizer = jAudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(jAudioAttributesCompatParcelizer);
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                return i3;
            }
            long j = this.read + ((long) i3);
            this.read = j;
            this.AudioAttributesCompatParcelizer.read(j);
            return i3;
        } catch (IOException e) {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer());
            getDecoderInfosSortedByFormatSupport.read(this.AudioAttributesCompatParcelizer);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            int i = this.IconCompatParcelizer.read(bArr);
            long jAudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer();
            if (this.write == -1) {
                this.write = jAudioAttributesCompatParcelizer;
            }
            if (i == -1 && this.RemoteActionCompatParcelizer == -1) {
                this.RemoteActionCompatParcelizer = jAudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(jAudioAttributesCompatParcelizer);
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                return i;
            }
            long j = this.read + ((long) i);
            this.read = j;
            this.AudioAttributesCompatParcelizer.read(j);
            return i;
        } catch (IOException e) {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer());
            getDecoderInfosSortedByFormatSupport.read(this.AudioAttributesCompatParcelizer);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        try {
            this.IconCompatParcelizer.reset();
        } catch (IOException e) {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer());
            getDecoderInfosSortedByFormatSupport.read(this.AudioAttributesCompatParcelizer);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            long jSkip = this.IconCompatParcelizer.skip(j);
            long jAudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer();
            if (this.write == -1) {
                this.write = jAudioAttributesCompatParcelizer;
            }
            if (jSkip == -1 && this.RemoteActionCompatParcelizer == -1) {
                this.RemoteActionCompatParcelizer = jAudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(jAudioAttributesCompatParcelizer);
                return jSkip;
            }
            long j2 = this.read + jSkip;
            this.read = j2;
            this.AudioAttributesCompatParcelizer.read(j2);
            return jSkip;
        } catch (IOException e) {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer());
            getDecoderInfosSortedByFormatSupport.read(this.AudioAttributesCompatParcelizer);
            throw e;
        }
    }
}
