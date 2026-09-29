package kotlin;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface serializePolymorphic {

    public interface IconCompatParcelizer {
        default void AudioAttributesCompatParcelizer() {
        }

        void AudioAttributesCompatParcelizer(int i, long j, long j2);

        default void IconCompatParcelizer() {
        }

        default void IconCompatParcelizer(Exception exc) {
        }

        default void RemoteActionCompatParcelizer() {
        }

        default void RemoteActionCompatParcelizer(read readVar) {
        }

        void read();

        default void read(read readVar) {
        }

        default void write() {
        }

        default void write(long j) {
        }

        void write(boolean z);
    }

    long AudioAttributesCompatParcelizer(boolean z);

    void AudioAttributesCompatParcelizer();

    default void AudioAttributesCompatParcelizer(modifyArraySerializer modifyarrayserializer) {
    }

    void AudioAttributesImplApi21Parcelizer();

    boolean AudioAttributesImplApi26Parcelizer();

    void AudioAttributesImplBaseParcelizer() throws MediaBrowserCompatItemReceiver;

    void IconCompatParcelizer();

    void IconCompatParcelizer(float f);

    default void IconCompatParcelizer(int i) {
    }

    void IconCompatParcelizer(boolean z);

    boolean IconCompatParcelizer(C0170format c0170format);

    void MediaBrowserCompatCustomActionResultReceiver();

    boolean MediaBrowserCompatItemReceiver();

    default void MediaBrowserCompatMediaItem() {
    }

    void MediaBrowserCompatSearchResultReceiver();

    int RemoteActionCompatParcelizer(C0170format c0170format);

    DefaultBaseTypeLimitingValidatorUnsafeBaseTypes RemoteActionCompatParcelizer();

    default void RemoteActionCompatParcelizer(int i, int i2) {
    }

    default void RemoteActionCompatParcelizer(AudioDeviceInfo audioDeviceInfo) {
    }

    void RemoteActionCompatParcelizer(C0170format c0170format, int[] iArr) throws RemoteActionCompatParcelizer;

    void read();

    void read(DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypes);

    void read(JsonIntegerFormatVisitor jsonIntegerFormatVisitor);

    void read(expectNumberFormat expectnumberformat);

    boolean read(ByteBuffer byteBuffer, long j, int i) throws AudioAttributesCompatParcelizer, MediaBrowserCompatItemReceiver;

    void write();

    void write(int i);

    default void write(buildTypeDeserializer buildtypedeserializer) {
    }

    void write(IconCompatParcelizer iconCompatParcelizer);

    public static final class read {
        public final int AudioAttributesCompatParcelizer;
        public final boolean AudioAttributesImplApi21Parcelizer;
        public final boolean IconCompatParcelizer;
        public final int RemoteActionCompatParcelizer;
        public final int read;
        public final int write;

        public read(int i, int i2, int i3, boolean z, boolean z2, int i4) {
            this.write = i;
            this.read = i2;
            this.RemoteActionCompatParcelizer = i3;
            this.AudioAttributesImplApi21Parcelizer = z;
            this.IconCompatParcelizer = z2;
            this.AudioAttributesCompatParcelizer = i4;
        }
    }

    public static final class RemoteActionCompatParcelizer extends Exception {
        public final C0170format read;

        public RemoteActionCompatParcelizer(Throwable th, C0170format c0170format) {
            super(th);
            this.read = c0170format;
        }

        public RemoteActionCompatParcelizer(String str, C0170format c0170format) {
            super(str);
            this.read = c0170format;
        }
    }

    public static final class AudioAttributesCompatParcelizer extends Exception {
        public final C0170format AudioAttributesCompatParcelizer;
        public final boolean IconCompatParcelizer;
        public final int RemoteActionCompatParcelizer;

        public AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4, C0170format c0170format, boolean z, Exception exc) {
            StringBuilder sb = new StringBuilder("AudioTrack init failed ");
            sb.append(i);
            sb.append(" Config(");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            sb.append(", ");
            sb.append(i4);
            sb.append(") ");
            sb.append(c0170format);
            sb.append(z ? " (recoverable)" : "");
            super(sb.toString(), exc);
            this.RemoteActionCompatParcelizer = i;
            this.IconCompatParcelizer = z;
            this.AudioAttributesCompatParcelizer = c0170format;
        }
    }

    public static final class MediaBrowserCompatItemReceiver extends Exception {
        public final boolean IconCompatParcelizer;
        public final int read;
        public final C0170format write;

        public MediaBrowserCompatItemReceiver(int i, C0170format c0170format, boolean z) {
            super("AudioTrack write failed: ".concat(String.valueOf(i)));
            this.IconCompatParcelizer = z;
            this.read = i;
            this.write = c0170format;
        }
    }

    public static final class write extends Exception {
        public final long AudioAttributesCompatParcelizer;
        public final long IconCompatParcelizer;

        public write(long j, long j2) {
            StringBuilder sb = new StringBuilder("Unexpected audio track timestamp discontinuity: expected ");
            sb.append(j2);
            sb.append(", got ");
            sb.append(j);
            super(sb.toString());
            this.AudioAttributesCompatParcelizer = j;
            this.IconCompatParcelizer = j2;
        }
    }

    default modifyEnumSerializer read(C0170format c0170format) {
        return modifyEnumSerializer.read;
    }
}
