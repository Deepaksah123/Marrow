package kotlin;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin._ensureOverride;

/* JADX INFO: loaded from: classes2.dex */
public final class NullSerializer implements _ensureOverride {
    private ByteBuffer[] AudioAttributesCompatParcelizer;
    private final MediaCodec IconCompatParcelizer;
    private ByteBuffer[] write;

    /* synthetic */ NullSerializer(MediaCodec mediaCodec, byte b) {
        this(mediaCodec);
    }

    public static class AudioAttributesCompatParcelizer implements _ensureOverride.IconCompatParcelizer {
        @Override // o._ensureOverride.IconCompatParcelizer
        public final _ensureOverride IconCompatParcelizer(_ensureOverride.write writeVar) throws Throwable {
            Throwable e;
            MediaCodec mediaCodecRemoteActionCompatParcelizer;
            try {
                mediaCodecRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(writeVar);
                try {
                    StdSubtypeResolver.write("configureCodec");
                    mediaCodecRemoteActionCompatParcelizer.configure(writeVar.IconCompatParcelizer, writeVar.AudioAttributesImplApi21Parcelizer, writeVar.AudioAttributesCompatParcelizer, writeVar.RemoteActionCompatParcelizer);
                    StdSubtypeResolver.RemoteActionCompatParcelizer();
                    StdSubtypeResolver.write("startCodec");
                    mediaCodecRemoteActionCompatParcelizer.start();
                    StdSubtypeResolver.RemoteActionCompatParcelizer();
                    return new NullSerializer(mediaCodecRemoteActionCompatParcelizer, (byte) 0);
                } catch (IOException | RuntimeException e2) {
                    e = e2;
                    if (mediaCodecRemoteActionCompatParcelizer != null) {
                        mediaCodecRemoteActionCompatParcelizer.release();
                    }
                    throw e;
                }
            } catch (IOException | RuntimeException e3) {
                e = e3;
                mediaCodecRemoteActionCompatParcelizer = null;
            }
        }

        private static MediaCodec RemoteActionCompatParcelizer(_ensureOverride.write writeVar) throws IOException {
            _writeNullKeyedEntry _writenullkeyedentry = writeVar.write;
            String str = writeVar.write.MediaBrowserCompatCustomActionResultReceiver;
            StdSubtypeResolver.write("createCodec:".concat(String.valueOf(str)));
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            StdSubtypeResolver.RemoteActionCompatParcelizer();
            return mediaCodecCreateByCodecName;
        }
    }

    private NullSerializer(MediaCodec mediaCodec) {
        this.IconCompatParcelizer = mediaCodec;
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 21) {
            this.AudioAttributesCompatParcelizer = mediaCodec.getInputBuffers();
            this.write = mediaCodec.getOutputBuffers();
        }
    }

    @Override // kotlin._ensureOverride
    public final int AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer.dequeueInputBuffer(0L);
    }

    @Override // kotlin._ensureOverride
    public final int write(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.IconCompatParcelizer.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 21) {
                this.write = this.IconCompatParcelizer.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // kotlin._ensureOverride
    public final MediaFormat RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer.getOutputFormat();
    }

    @Override // kotlin._ensureOverride
    public final ByteBuffer IconCompatParcelizer(int i) {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21) {
            return this.IconCompatParcelizer.getInputBuffer(i);
        }
        return ((ByteBuffer[]) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesCompatParcelizer))[i];
    }

    @Override // kotlin._ensureOverride
    public final ByteBuffer write(int i) {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21) {
            return this.IconCompatParcelizer.getOutputBuffer(i);
        }
        return ((ByteBuffer[]) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.write))[i];
    }

    @Override // kotlin._ensureOverride
    public final void read(int i, int i2, long j, int i3) {
        this.IconCompatParcelizer.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // kotlin._ensureOverride
    public final void RemoteActionCompatParcelizer(int i, TypeSerializerBase typeSerializerBase, long j, int i2) {
        this.IconCompatParcelizer.queueSecureInputBuffer(i, 0, typeSerializerBase.RemoteActionCompatParcelizer(), j, i2);
    }

    @Override // kotlin._ensureOverride
    public final void write(int i, boolean z) {
        this.IconCompatParcelizer.releaseOutputBuffer(i, z);
    }

    @Override // kotlin._ensureOverride
    public final void read(int i, long j) {
        this.IconCompatParcelizer.releaseOutputBuffer(i, j);
    }

    @Override // kotlin._ensureOverride
    public final void read() {
        this.IconCompatParcelizer.flush();
    }

    @Override // kotlin._ensureOverride
    public final void IconCompatParcelizer() {
        this.AudioAttributesCompatParcelizer = null;
        this.write = null;
        try {
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 30 && LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 33) {
                this.IconCompatParcelizer.stop();
            }
        } finally {
            this.IconCompatParcelizer.release();
        }
    }

    @Override // kotlin._ensureOverride
    public final void write(final _ensureOverride.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Handler handler) {
        this.IconCompatParcelizer.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: o._verifyBigDecimalRange
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                this.write.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, j, j2);
            }
        }, handler);
    }

    final /* synthetic */ void AudioAttributesCompatParcelizer(_ensureOverride.RemoteActionCompatParcelizer remoteActionCompatParcelizer, long j, long j2) {
        remoteActionCompatParcelizer.IconCompatParcelizer(this, j, j2);
    }

    @Override // kotlin._ensureOverride
    public final void read(Surface surface) {
        this.IconCompatParcelizer.setOutputSurface(surface);
    }

    @Override // kotlin._ensureOverride
    public final void read(Bundle bundle) {
        this.IconCompatParcelizer.setParameters(bundle);
    }

    @Override // kotlin._ensureOverride
    public final void AudioAttributesCompatParcelizer(int i) {
        this.IconCompatParcelizer.setVideoScalingMode(i);
    }
}
