package kotlin;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import kotlin._ensureOverride;
import kotlin._notNullClass;

/* JADX INFO: loaded from: classes2.dex */
final class _notNullClass implements _ensureOverride {
    private final MediaCodec AudioAttributesCompatParcelizer;
    private final MapSerializer IconCompatParcelizer;
    private final _orderEntries RemoteActionCompatParcelizer;
    private int read;
    private boolean write;

    /* synthetic */ _notNullClass(MediaCodec mediaCodec, HandlerThread handlerThread, _orderEntries _orderentries, byte b) {
        this(mediaCodec, handlerThread, _orderentries);
    }

    public static final class write implements _ensureOverride.IconCompatParcelizer {
        private boolean IconCompatParcelizer;
        private final parseUdtaMeta<HandlerThread> RemoteActionCompatParcelizer;
        private final parseUdtaMeta<HandlerThread> write;

        public write(final int i) {
            this(new parseUdtaMeta() { // from class: o._acceptJsonFormatVisitorForEnum
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return _notNullClass.write.RemoteActionCompatParcelizer(i);
                }
            }, new parseUdtaMeta() { // from class: o._findDynamicSerializer
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return _notNullClass.write.write(i);
                }
            });
        }

        static /* synthetic */ HandlerThread RemoteActionCompatParcelizer(int i) {
            return new HandlerThread(_notNullClass.MediaBrowserCompatItemReceiver(i));
        }

        static /* synthetic */ HandlerThread write(int i) {
            return new HandlerThread(_notNullClass.AudioAttributesImplBaseParcelizer(i));
        }

        private write(parseUdtaMeta<HandlerThread> parseudtameta, parseUdtaMeta<HandlerThread> parseudtameta2) {
            this.RemoteActionCompatParcelizer = parseudtameta;
            this.write = parseudtameta2;
            this.IconCompatParcelizer = true;
        }

        public final void write(boolean z) {
            this.IconCompatParcelizer = z;
        }

        @Override // o._ensureOverride.IconCompatParcelizer
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final _notNullClass IconCompatParcelizer(_ensureOverride.write writeVar) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            int i;
            _orderEntries jsonValueSerializerTypeSerializerRerouter;
            _notNullClass _notnullclass;
            String str = writeVar.write.MediaBrowserCompatCustomActionResultReceiver;
            _notNullClass _notnullclass2 = null;
            try {
                StringBuilder sb = new StringBuilder("createCodec:");
                sb.append(str);
                StdSubtypeResolver.write(sb.toString());
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    i = writeVar.RemoteActionCompatParcelizer;
                    if (this.IconCompatParcelizer && IconCompatParcelizer(writeVar.read)) {
                        jsonValueSerializerTypeSerializerRerouter = new NumberSerializers(mediaCodecCreateByCodecName);
                        i |= 4;
                    } else {
                        jsonValueSerializerTypeSerializerRerouter = new JsonValueSerializerTypeSerializerRerouter(mediaCodecCreateByCodecName, this.write.get());
                    }
                    _notnullclass = new _notNullClass(mediaCodecCreateByCodecName, this.RemoteActionCompatParcelizer.get(), jsonValueSerializerTypeSerializerRerouter, (byte) 0);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
                mediaCodecCreateByCodecName = null;
            }
            try {
                StdSubtypeResolver.RemoteActionCompatParcelizer();
                _notnullclass.read(writeVar.IconCompatParcelizer, writeVar.AudioAttributesImplApi21Parcelizer, writeVar.AudioAttributesCompatParcelizer, i);
                return _notnullclass;
            } catch (Exception e3) {
                e = e3;
                _notnullclass2 = _notnullclass;
                if (_notnullclass2 != null) {
                    _notnullclass2.IconCompatParcelizer();
                } else if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw e;
            }
        }

        private static boolean IconCompatParcelizer(C0170format c0170format) {
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 34) {
                return false;
            }
            return LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 35 || DefaultBaseTypeLimitingValidator.MediaBrowserCompatItemReceiver(c0170format.onPlayFromUri);
        }
    }

    private _notNullClass(MediaCodec mediaCodec, HandlerThread handlerThread, _orderEntries _orderentries) {
        this.AudioAttributesCompatParcelizer = mediaCodec;
        this.IconCompatParcelizer = new MapSerializer(handlerThread);
        this.RemoteActionCompatParcelizer = _orderentries;
        this.read = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.IconCompatParcelizer.read(this.AudioAttributesCompatParcelizer);
        StdSubtypeResolver.write("configureCodec");
        this.AudioAttributesCompatParcelizer.configure(mediaFormat, surface, mediaCrypto, i);
        StdSubtypeResolver.RemoteActionCompatParcelizer();
        this.RemoteActionCompatParcelizer.read();
        StdSubtypeResolver.write("startCodec");
        this.AudioAttributesCompatParcelizer.start();
        StdSubtypeResolver.RemoteActionCompatParcelizer();
        this.read = 1;
    }

    @Override // kotlin._ensureOverride
    public final void read(int i, int i2, long j, int i3) {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(i, 0, i2, j, i3);
    }

    @Override // kotlin._ensureOverride
    public final void RemoteActionCompatParcelizer(int i, TypeSerializerBase typeSerializerBase, long j, int i2) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(i, 0, typeSerializerBase, j, i2);
    }

    @Override // kotlin._ensureOverride
    public final void write(int i, boolean z) {
        this.AudioAttributesCompatParcelizer.releaseOutputBuffer(i, z);
    }

    @Override // kotlin._ensureOverride
    public final void read(int i, long j) {
        this.AudioAttributesCompatParcelizer.releaseOutputBuffer(i, j);
    }

    @Override // kotlin._ensureOverride
    public final int AudioAttributesCompatParcelizer() {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        return this.IconCompatParcelizer.read();
    }

    @Override // kotlin._ensureOverride
    public final int write(MediaCodec.BufferInfo bufferInfo) {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        return this.IconCompatParcelizer.IconCompatParcelizer(bufferInfo);
    }

    @Override // kotlin._ensureOverride
    public final MediaFormat RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin._ensureOverride
    public final ByteBuffer IconCompatParcelizer(int i) {
        return this.AudioAttributesCompatParcelizer.getInputBuffer(i);
    }

    @Override // kotlin._ensureOverride
    public final ByteBuffer write(int i) {
        return this.AudioAttributesCompatParcelizer.getOutputBuffer(i);
    }

    @Override // kotlin._ensureOverride
    public final void read() {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        this.AudioAttributesCompatParcelizer.flush();
        this.IconCompatParcelizer.write();
        this.AudioAttributesCompatParcelizer.start();
    }

    @Override // kotlin._ensureOverride
    public final void IconCompatParcelizer() {
        try {
            if (this.read == 1) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer();
                this.IconCompatParcelizer.IconCompatParcelizer();
            }
            this.read = 2;
            if (this.write) {
                return;
            }
            try {
                if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 30 && LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 33) {
                    this.AudioAttributesCompatParcelizer.stop();
                }
            } finally {
            }
        } catch (Throwable th) {
            if (!this.write) {
                try {
                    if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 30 && LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 33) {
                        this.AudioAttributesCompatParcelizer.stop();
                    }
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // kotlin._ensureOverride
    public final void write(final _ensureOverride.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Handler handler) {
        this.AudioAttributesCompatParcelizer.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: o.JsonValueSerializer
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                this.IconCompatParcelizer.read(remoteActionCompatParcelizer, j, j2);
            }
        }, handler);
    }

    final /* synthetic */ void read(_ensureOverride.RemoteActionCompatParcelizer remoteActionCompatParcelizer, long j, long j2) {
        remoteActionCompatParcelizer.IconCompatParcelizer(this, j, j2);
    }

    @Override // kotlin._ensureOverride
    public final boolean IconCompatParcelizer(_ensureOverride.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer);
        return true;
    }

    @Override // kotlin._ensureOverride
    public final void read(Surface surface) {
        this.AudioAttributesCompatParcelizer.setOutputSurface(surface);
    }

    @Override // kotlin._ensureOverride
    public final void read(Bundle bundle) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(bundle);
    }

    @Override // kotlin._ensureOverride
    public final void AudioAttributesCompatParcelizer(int i) {
        this.AudioAttributesCompatParcelizer.setVideoScalingMode(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String MediaBrowserCompatItemReceiver(int i) {
        return RemoteActionCompatParcelizer(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String AudioAttributesImplBaseParcelizer(int i) {
        return RemoteActionCompatParcelizer(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String RemoteActionCompatParcelizer(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }
}
