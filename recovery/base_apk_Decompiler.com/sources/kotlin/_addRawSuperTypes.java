package kotlin;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import kotlin.isCollectionMapOrArray;

/* JADX INFO: loaded from: classes2.dex */
public abstract class _addRawSuperTypes {
    private final int AudioAttributesCompatParcelizer;
    protected final write RemoteActionCompatParcelizer;
    private AudioAttributesCompatParcelizer read;
    protected final AudioAttributesImplApi26Parcelizer write;

    public interface AudioAttributesImplApi26Parcelizer {
        RemoteActionCompatParcelizer IconCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, long j) throws IOException;

        default void write() {
        }
    }

    public interface IconCompatParcelizer {
        long IconCompatParcelizer(long j);
    }

    public static final class read implements IconCompatParcelizer {
        @Override // o._addRawSuperTypes.IconCompatParcelizer
        public final long IconCompatParcelizer(long j) {
            return j;
        }
    }

    public _addRawSuperTypes(IconCompatParcelizer iconCompatParcelizer, AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, long j, long j2, long j3, long j4, long j5, int i) {
        this.write = audioAttributesImplApi26Parcelizer;
        this.AudioAttributesCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = new write(iconCompatParcelizer, j, 0L, j2, j3, j4, j5);
    }

    public final isCollectionMapOrArray AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(long j) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.read;
        if (audioAttributesCompatParcelizer == null || audioAttributesCompatParcelizer.read() != j) {
            this.read = read(j);
        }
    }

    public final boolean read() {
        return this.read != null;
    }

    public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        while (true) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) buildTypeSerializer.AudioAttributesCompatParcelizer(this.read);
            long jIconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer();
            long jAudioAttributesCompatParcelizer = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            long jWrite = audioAttributesCompatParcelizer.write();
            if (jAudioAttributesCompatParcelizer - jIconCompatParcelizer <= this.AudioAttributesCompatParcelizer) {
                IconCompatParcelizer();
                return write(closeonfailandthrowasioe, jIconCompatParcelizer, isjacksonstdimpl);
            }
            if (!IconCompatParcelizer(closeonfailandthrowasioe, jWrite)) {
                return write(closeonfailandthrowasioe, jWrite, isjacksonstdimpl);
            }
            closeonfailandthrowasioe.RemoteActionCompatParcelizer();
            RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = this.write.IconCompatParcelizer(closeonfailandthrowasioe, audioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
            int i = remoteActionCompatParcelizerIconCompatParcelizer.write;
            if (i == -3) {
                IconCompatParcelizer();
                return write(closeonfailandthrowasioe, jWrite, isjacksonstdimpl);
            }
            if (i == -2) {
                audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(remoteActionCompatParcelizerIconCompatParcelizer.IconCompatParcelizer, remoteActionCompatParcelizerIconCompatParcelizer.RemoteActionCompatParcelizer);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    IconCompatParcelizer(closeonfailandthrowasioe, remoteActionCompatParcelizerIconCompatParcelizer.RemoteActionCompatParcelizer);
                    long unused = remoteActionCompatParcelizerIconCompatParcelizer.RemoteActionCompatParcelizer;
                    IconCompatParcelizer();
                    return write(closeonfailandthrowasioe, remoteActionCompatParcelizerIconCompatParcelizer.RemoteActionCompatParcelizer, isjacksonstdimpl);
                }
                audioAttributesCompatParcelizer.read(remoteActionCompatParcelizerIconCompatParcelizer.IconCompatParcelizer, remoteActionCompatParcelizerIconCompatParcelizer.RemoteActionCompatParcelizer);
            }
        }
    }

    private AudioAttributesCompatParcelizer read(long j) {
        return new AudioAttributesCompatParcelizer(j, this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(j), this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver, this.RemoteActionCompatParcelizer.IconCompatParcelizer, this.RemoteActionCompatParcelizer.read, this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer.write);
    }

    private void IconCompatParcelizer() {
        this.read = null;
        this.write.write();
    }

    private static boolean IconCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, long j) throws IOException {
        long jIconCompatParcelizer = j - closeonfailandthrowasioe.IconCompatParcelizer();
        if (jIconCompatParcelizer < 0 || jIconCompatParcelizer > 262144) {
            return false;
        }
        closeonfailandthrowasioe.IconCompatParcelizer((int) jIconCompatParcelizer);
        return true;
    }

    private static int write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, long j, isJacksonStdImpl isjacksonstdimpl) {
        if (j == closeonfailandthrowasioe.IconCompatParcelizer()) {
            return 0;
        }
        isjacksonstdimpl.AudioAttributesCompatParcelizer = j;
        return 1;
    }

    protected static class AudioAttributesCompatParcelizer {
        private long AudioAttributesCompatParcelizer;
        private long AudioAttributesImplApi21Parcelizer;
        private long IconCompatParcelizer;
        private final long MediaBrowserCompatCustomActionResultReceiver;
        private final long MediaBrowserCompatItemReceiver;
        private long RemoteActionCompatParcelizer;
        private long read;
        private final long write;

        protected static long read(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return LaissezFaireSubTypeValidator.read(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        protected AudioAttributesCompatParcelizer(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.MediaBrowserCompatCustomActionResultReceiver = j;
            this.MediaBrowserCompatItemReceiver = j2;
            this.RemoteActionCompatParcelizer = j3;
            this.IconCompatParcelizer = j4;
            this.read = j5;
            this.AudioAttributesCompatParcelizer = j6;
            this.write = j7;
            this.AudioAttributesImplApi21Parcelizer = read(j2, j3, j4, j5, j6, j7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long IconCompatParcelizer() {
            return this.read;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long RemoteActionCompatParcelizer() {
            return this.MediaBrowserCompatItemReceiver;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long read() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void AudioAttributesCompatParcelizer(long j, long j2) {
            this.RemoteActionCompatParcelizer = j;
            this.read = j2;
            MediaBrowserCompatItemReceiver();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void read(long j, long j2) {
            this.IconCompatParcelizer = j;
            this.AudioAttributesCompatParcelizer = j2;
            MediaBrowserCompatItemReceiver();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long write() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        private void MediaBrowserCompatItemReceiver() {
            this.AudioAttributesImplApi21Parcelizer = read(this.MediaBrowserCompatItemReceiver, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.read, this.AudioAttributesCompatParcelizer, this.write);
        }
    }

    public static final class RemoteActionCompatParcelizer {
        public static final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer(-3, C.TIME_UNSET, -1);
        private final long IconCompatParcelizer;
        private final long RemoteActionCompatParcelizer;
        private final int write;

        private RemoteActionCompatParcelizer(int i, long j, long j2) {
            this.write = i;
            this.IconCompatParcelizer = j;
            this.RemoteActionCompatParcelizer = j2;
        }

        public static RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(long j, long j2) {
            return new RemoteActionCompatParcelizer(-1, j, j2);
        }

        public static RemoteActionCompatParcelizer write(long j, long j2) {
            return new RemoteActionCompatParcelizer(-2, j, j2);
        }

        public static RemoteActionCompatParcelizer write(long j) {
            return new RemoteActionCompatParcelizer(0, C.TIME_UNSET, j);
        }
    }

    public static class write implements isCollectionMapOrArray {
        private final long AudioAttributesCompatParcelizer;
        private final IconCompatParcelizer AudioAttributesImplApi26Parcelizer;
        private final long IconCompatParcelizer;
        private final long MediaBrowserCompatItemReceiver = 0;
        private final long RemoteActionCompatParcelizer;
        private final long read;
        private final long write;

        @Override // kotlin.isCollectionMapOrArray
        public final boolean IconCompatParcelizer() {
            return true;
        }

        public write(IconCompatParcelizer iconCompatParcelizer, long j, long j2, long j3, long j4, long j5, long j6) {
            this.AudioAttributesImplApi26Parcelizer = iconCompatParcelizer;
            this.AudioAttributesCompatParcelizer = j;
            this.IconCompatParcelizer = j3;
            this.read = j4;
            this.RemoteActionCompatParcelizer = j5;
            this.write = j6;
        }

        @Override // kotlin.isCollectionMapOrArray
        public final isCollectionMapOrArray.read write(long j) {
            return new isCollectionMapOrArray.read(new isLocalType(j, AudioAttributesCompatParcelizer.read(this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(j), this.MediaBrowserCompatItemReceiver, this.IconCompatParcelizer, this.read, this.RemoteActionCompatParcelizer, this.write)));
        }

        @Override // kotlin.isCollectionMapOrArray
        public final long read() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final long AudioAttributesCompatParcelizer(long j) {
            return this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(j);
        }
    }
}
