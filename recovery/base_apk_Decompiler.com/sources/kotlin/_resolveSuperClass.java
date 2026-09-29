package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface _resolveSuperClass {
    RemoteActionCompatParcelizer read(read readVar, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer);

    int write(int i);

    long write(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer);

    public static final class AudioAttributesCompatParcelizer {
        public final StdArraySerializersShortArraySerializer AudioAttributesCompatParcelizer;
        public final IOException IconCompatParcelizer;
        public final StdDelegatingSerializer RemoteActionCompatParcelizer;
        public final int read;

        public AudioAttributesCompatParcelizer(StdDelegatingSerializer stdDelegatingSerializer, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer, IOException iOException, int i) {
            this.RemoteActionCompatParcelizer = stdDelegatingSerializer;
            this.AudioAttributesCompatParcelizer = stdArraySerializersShortArraySerializer;
            this.IconCompatParcelizer = iOException;
            this.read = i;
        }
    }

    public static final class read {
        public final int AudioAttributesCompatParcelizer;
        public final int RemoteActionCompatParcelizer;
        public final int read;
        public final int write;

        public read(int i, int i2, int i3, int i4) {
            this.write = i;
            this.read = i2;
            this.AudioAttributesCompatParcelizer = i3;
            this.RemoteActionCompatParcelizer = i4;
        }

        public final boolean write(int i) {
            return i == 1 ? this.write - this.read > 1 : this.AudioAttributesCompatParcelizer - this.RemoteActionCompatParcelizer > 1;
        }
    }

    public static final class RemoteActionCompatParcelizer {
        public final long AudioAttributesCompatParcelizer;
        public final int RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(int i, long j) {
            buildTypeSerializer.IconCompatParcelizer(j >= 0);
            this.RemoteActionCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = j;
        }
    }
}
