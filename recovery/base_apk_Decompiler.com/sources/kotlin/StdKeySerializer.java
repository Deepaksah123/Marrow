package kotlin;

import android.os.Handler;
import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.StdKeySerializers;

/* JADX INFO: loaded from: classes2.dex */
public interface StdKeySerializer {
    default void AudioAttributesCompatParcelizer(int i, StdKeySerializers.write writeVar, StdDelegatingSerializer stdDelegatingSerializer, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer, IOException iOException, boolean z) {
    }

    default void IconCompatParcelizer(int i, StdKeySerializers.write writeVar, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
    }

    default void IconCompatParcelizer(int i, StdKeySerializers.write writeVar, StdDelegatingSerializer stdDelegatingSerializer, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
    }

    default void RemoteActionCompatParcelizer(int i, StdKeySerializers.write writeVar, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
    }

    default void read(int i, StdKeySerializers.write writeVar, StdDelegatingSerializer stdDelegatingSerializer, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
    }

    default void write(int i, StdKeySerializers.write writeVar, StdDelegatingSerializer stdDelegatingSerializer, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
    }

    public static class read {
        private final CopyOnWriteArrayList<C0050read> AudioAttributesCompatParcelizer;
        public final StdKeySerializers.write IconCompatParcelizer;
        public final int write;

        public read() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private read(CopyOnWriteArrayList<C0050read> copyOnWriteArrayList, int i, StdKeySerializers.write writeVar) {
            this.AudioAttributesCompatParcelizer = copyOnWriteArrayList;
            this.write = i;
            this.IconCompatParcelizer = writeVar;
        }

        public final read IconCompatParcelizer(int i, StdKeySerializers.write writeVar) {
            return new read(this.AudioAttributesCompatParcelizer, i, writeVar);
        }

        public final void RemoteActionCompatParcelizer(Handler handler, StdKeySerializer stdKeySerializer) {
            this.AudioAttributesCompatParcelizer.add(new C0050read(handler, stdKeySerializer));
        }

        public final void RemoteActionCompatParcelizer(StdKeySerializer stdKeySerializer) {
            for (C0050read c0050read : this.AudioAttributesCompatParcelizer) {
                if (c0050read.IconCompatParcelizer == stdKeySerializer) {
                    this.AudioAttributesCompatParcelizer.remove(c0050read);
                }
            }
        }

        public final void AudioAttributesCompatParcelizer(StdDelegatingSerializer stdDelegatingSerializer, int i) {
            write(stdDelegatingSerializer, i, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        }

        public final void write(StdDelegatingSerializer stdDelegatingSerializer, int i, int i2, C0170format c0170format, int i3, Object obj, long j, long j2) {
            AudioAttributesCompatParcelizer(stdDelegatingSerializer, new StdArraySerializersShortArraySerializer(i, i2, c0170format, i3, obj, LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(j), LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(j2)));
        }

        public final void AudioAttributesCompatParcelizer(final StdDelegatingSerializer stdDelegatingSerializer, final StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
            for (C0050read c0050read : this.AudioAttributesCompatParcelizer) {
                final StdKeySerializer stdKeySerializer = c0050read.IconCompatParcelizer;
                LaissezFaireSubTypeValidator.read(c0050read.read, new Runnable() { // from class: o.StdJdkSerializersAtomicLongSerializer
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.read.AudioAttributesCompatParcelizer(stdKeySerializer, stdDelegatingSerializer, stdArraySerializersShortArraySerializer);
                    }
                });
            }
        }

        final /* synthetic */ void AudioAttributesCompatParcelizer(StdKeySerializer stdKeySerializer, StdDelegatingSerializer stdDelegatingSerializer, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
            stdKeySerializer.IconCompatParcelizer(this.write, this.IconCompatParcelizer, stdDelegatingSerializer, stdArraySerializersShortArraySerializer);
        }

        public final void read(StdDelegatingSerializer stdDelegatingSerializer, int i) {
            RemoteActionCompatParcelizer(stdDelegatingSerializer, i, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        }

        public final void RemoteActionCompatParcelizer(StdDelegatingSerializer stdDelegatingSerializer, int i, int i2, C0170format c0170format, int i3, Object obj, long j, long j2) {
            write(stdDelegatingSerializer, new StdArraySerializersShortArraySerializer(i, i2, c0170format, i3, obj, LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(j), LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(j2)));
        }

        public final void write(final StdDelegatingSerializer stdDelegatingSerializer, final StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
            for (C0050read c0050read : this.AudioAttributesCompatParcelizer) {
                final StdKeySerializer stdKeySerializer = c0050read.IconCompatParcelizer;
                LaissezFaireSubTypeValidator.read(c0050read.read, new Runnable() { // from class: o.StdKeySerializersDynamic
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.write.write(stdKeySerializer, stdDelegatingSerializer, stdArraySerializersShortArraySerializer);
                    }
                });
            }
        }

        final /* synthetic */ void write(StdKeySerializer stdKeySerializer, StdDelegatingSerializer stdDelegatingSerializer, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
            stdKeySerializer.read(this.write, this.IconCompatParcelizer, stdDelegatingSerializer, stdArraySerializersShortArraySerializer);
        }

        public final void IconCompatParcelizer(StdDelegatingSerializer stdDelegatingSerializer, int i) {
            AudioAttributesCompatParcelizer(stdDelegatingSerializer, i, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        }

        public final void AudioAttributesCompatParcelizer(StdDelegatingSerializer stdDelegatingSerializer, int i, int i2, C0170format c0170format, int i3, Object obj, long j, long j2) {
            RemoteActionCompatParcelizer(stdDelegatingSerializer, new StdArraySerializersShortArraySerializer(i, i2, c0170format, i3, obj, LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(j), LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(j2)));
        }

        public final void RemoteActionCompatParcelizer(final StdDelegatingSerializer stdDelegatingSerializer, final StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
            for (C0050read c0050read : this.AudioAttributesCompatParcelizer) {
                final StdKeySerializer stdKeySerializer = c0050read.IconCompatParcelizer;
                LaissezFaireSubTypeValidator.read(c0050read.read, new Runnable() { // from class: o.StdKeySerializersStringKeySerializer
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(stdKeySerializer, stdDelegatingSerializer, stdArraySerializersShortArraySerializer);
                    }
                });
            }
        }

        final /* synthetic */ void RemoteActionCompatParcelizer(StdKeySerializer stdKeySerializer, StdDelegatingSerializer stdDelegatingSerializer, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
            stdKeySerializer.write(this.write, this.IconCompatParcelizer, stdDelegatingSerializer, stdArraySerializersShortArraySerializer);
        }

        public final void read(StdDelegatingSerializer stdDelegatingSerializer, int i, IOException iOException, boolean z) {
            RemoteActionCompatParcelizer(stdDelegatingSerializer, i, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, iOException, z);
        }

        public final void RemoteActionCompatParcelizer(StdDelegatingSerializer stdDelegatingSerializer, int i, int i2, C0170format c0170format, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
            read(stdDelegatingSerializer, new StdArraySerializersShortArraySerializer(i, i2, c0170format, i3, obj, LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(j), LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(j2)), iOException, z);
        }

        public final void read(final StdDelegatingSerializer stdDelegatingSerializer, final StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer, final IOException iOException, final boolean z) {
            for (C0050read c0050read : this.AudioAttributesCompatParcelizer) {
                final StdKeySerializer stdKeySerializer = c0050read.IconCompatParcelizer;
                LaissezFaireSubTypeValidator.read(c0050read.read, new Runnable() { // from class: o.getStdKeySerializer
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.write.write(stdKeySerializer, stdDelegatingSerializer, stdArraySerializersShortArraySerializer, iOException, z);
                    }
                });
            }
        }

        final /* synthetic */ void write(StdKeySerializer stdKeySerializer, StdDelegatingSerializer stdDelegatingSerializer, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer, IOException iOException, boolean z) {
            stdKeySerializer.AudioAttributesCompatParcelizer(this.write, this.IconCompatParcelizer, stdDelegatingSerializer, stdArraySerializersShortArraySerializer, iOException, z);
        }

        public final void write(int i, long j, long j2) {
            RemoteActionCompatParcelizer(new StdArraySerializersShortArraySerializer(1, i, null, 3, null, LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(j), LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(j2)));
        }

        public final void RemoteActionCompatParcelizer(final StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
            final StdKeySerializers.write writeVar = (StdKeySerializers.write) buildTypeSerializer.IconCompatParcelizer(this.IconCompatParcelizer);
            for (C0050read c0050read : this.AudioAttributesCompatParcelizer) {
                final StdKeySerializer stdKeySerializer = c0050read.IconCompatParcelizer;
                LaissezFaireSubTypeValidator.read(c0050read.read, new Runnable() { // from class: o.StdKeySerializersEnumKeySerializer
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.IconCompatParcelizer.read(stdKeySerializer, writeVar, stdArraySerializersShortArraySerializer);
                    }
                });
            }
        }

        final /* synthetic */ void read(StdKeySerializer stdKeySerializer, StdKeySerializers.write writeVar, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
            stdKeySerializer.RemoteActionCompatParcelizer(this.write, writeVar, stdArraySerializersShortArraySerializer);
        }

        public final void RemoteActionCompatParcelizer(int i, C0170format c0170format, int i2, Object obj, long j) {
            write(new StdArraySerializersShortArraySerializer(1, i, c0170format, i2, obj, LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(j), C.TIME_UNSET));
        }

        public final void write(final StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
            for (C0050read c0050read : this.AudioAttributesCompatParcelizer) {
                final StdKeySerializer stdKeySerializer = c0050read.IconCompatParcelizer;
                LaissezFaireSubTypeValidator.read(c0050read.read, new Runnable() { // from class: o.getFallbackKeySerializer
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.AudioAttributesCompatParcelizer.read(stdKeySerializer, stdArraySerializersShortArraySerializer);
                    }
                });
            }
        }

        final /* synthetic */ void read(StdKeySerializer stdKeySerializer, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
            stdKeySerializer.IconCompatParcelizer(this.write, this.IconCompatParcelizer, stdArraySerializersShortArraySerializer);
        }

        /* JADX INFO: renamed from: o.StdKeySerializer$read$read, reason: collision with other inner class name */
        static final class C0050read {
            public StdKeySerializer IconCompatParcelizer;
            public Handler read;

            public C0050read(Handler handler, StdKeySerializer stdKeySerializer) {
                this.read = handler;
                this.IconCompatParcelizer = stdKeySerializer;
            }
        }
    }
}
