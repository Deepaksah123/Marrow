package kotlin;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface _ensureOverride {

    public interface AudioAttributesCompatParcelizer {
        default void AudioAttributesCompatParcelizer() {
        }

        default void read() {
        }
    }

    public interface RemoteActionCompatParcelizer {
        void IconCompatParcelizer(_ensureOverride _ensureoverride, long j, long j2);
    }

    int AudioAttributesCompatParcelizer();

    void AudioAttributesCompatParcelizer(int i);

    ByteBuffer IconCompatParcelizer(int i);

    void IconCompatParcelizer();

    default boolean IconCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        return false;
    }

    MediaFormat RemoteActionCompatParcelizer();

    void RemoteActionCompatParcelizer(int i, TypeSerializerBase typeSerializerBase, long j, int i2);

    void read();

    void read(int i, int i2, long j, int i3);

    void read(int i, long j);

    void read(Bundle bundle);

    void read(Surface surface);

    int write(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer write(int i);

    void write(int i, boolean z);

    void write(RemoteActionCompatParcelizer remoteActionCompatParcelizer, Handler handler);

    public static final class write {
        public final MediaCrypto AudioAttributesCompatParcelizer;
        public final Surface AudioAttributesImplApi21Parcelizer;
        public final MediaFormat IconCompatParcelizer;
        public final int RemoteActionCompatParcelizer = 0;
        public final C0170format read;
        public final _writeNullKeyedEntry write;

        public static write AudioAttributesCompatParcelizer(_writeNullKeyedEntry _writenullkeyedentry, MediaFormat mediaFormat, C0170format c0170format, MediaCrypto mediaCrypto) {
            return new write(_writenullkeyedentry, mediaFormat, c0170format, null, mediaCrypto);
        }

        public static write AudioAttributesCompatParcelizer(_writeNullKeyedEntry _writenullkeyedentry, MediaFormat mediaFormat, C0170format c0170format, Surface surface, MediaCrypto mediaCrypto) {
            return new write(_writenullkeyedentry, mediaFormat, c0170format, surface, mediaCrypto);
        }

        private write(_writeNullKeyedEntry _writenullkeyedentry, MediaFormat mediaFormat, C0170format c0170format, Surface surface, MediaCrypto mediaCrypto) {
            this.write = _writenullkeyedentry;
            this.IconCompatParcelizer = mediaFormat;
            this.read = c0170format;
            this.AudioAttributesImplApi21Parcelizer = surface;
            this.AudioAttributesCompatParcelizer = mediaCrypto;
        }
    }

    public interface IconCompatParcelizer {
        _ensureOverride IconCompatParcelizer(write writeVar) throws IOException;

        static {
            new _findSerializer();
        }
    }
}
