package kotlin;

import com.google.android.exoplayer2.C;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class _serializeDynamicContents {
    final long AudioAttributesCompatParcelizer;
    final long RemoteActionCompatParcelizer;
    final _withResolved read;

    public _serializeDynamicContents(_withResolved _withresolved, long j, long j2) {
        this.read = _withresolved;
        this.RemoteActionCompatParcelizer = j;
        this.AudioAttributesCompatParcelizer = j2;
    }

    public _withResolved AudioAttributesCompatParcelizer(IndexedStringListSerializer indexedStringListSerializer) {
        return this.read;
    }

    public final long AudioAttributesCompatParcelizer() {
        return LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, 1000000L, this.RemoteActionCompatParcelizer);
    }

    public static class AudioAttributesCompatParcelizer extends _serializeDynamicContents {
        final long IconCompatParcelizer;
        final long write;

        public AudioAttributesCompatParcelizer(_withResolved _withresolved, long j, long j2, long j3, long j4) {
            super(_withresolved, j, j2);
            this.IconCompatParcelizer = j3;
            this.write = j4;
        }

        public AudioAttributesCompatParcelizer() {
            this(null, 1L, 0L, 0L, 0L);
        }

        public final _withResolved write() {
            long j = this.write;
            if (j <= 0) {
                return null;
            }
            return new _withResolved(null, this.IconCompatParcelizer, j);
        }
    }

    public static abstract class IconCompatParcelizer extends _serializeDynamicContents {
        private final long AudioAttributesImplApi21Parcelizer;
        final List<RemoteActionCompatParcelizer> AudioAttributesImplApi26Parcelizer;
        final long AudioAttributesImplBaseParcelizer;
        final long IconCompatParcelizer;
        private final long MediaBrowserCompatItemReceiver;
        final long write;

        public abstract _withResolved IconCompatParcelizer(IndexedStringListSerializer indexedStringListSerializer, long j);

        public abstract long read(long j);

        public IconCompatParcelizer(_withResolved _withresolved, long j, long j2, long j3, long j4, List<RemoteActionCompatParcelizer> list, long j5, long j6, long j7) {
            super(_withresolved, j, j2);
            this.AudioAttributesImplBaseParcelizer = j3;
            this.IconCompatParcelizer = j4;
            this.AudioAttributesImplApi26Parcelizer = list;
            this.write = j5;
            this.AudioAttributesImplApi21Parcelizer = j6;
            this.MediaBrowserCompatItemReceiver = j7;
        }

        public final long IconCompatParcelizer(long j, long j2) {
            long jWrite = write();
            long j3 = read(j2);
            if (j3 != 0) {
                if (this.AudioAttributesImplApi26Parcelizer != null) {
                    long j4 = (j3 + jWrite) - 1;
                    long j5 = jWrite;
                    while (j5 <= j4) {
                        long j6 = ((j4 - j5) / 2) + j5;
                        long jIconCompatParcelizer = IconCompatParcelizer(j6);
                        if (jIconCompatParcelizer < j) {
                            j5 = j6 + 1;
                        } else {
                            if (jIconCompatParcelizer <= j) {
                                return j6;
                            }
                            j4 = j6 - 1;
                        }
                    }
                    return j5 == jWrite ? j5 : j4;
                }
                long j7 = this.AudioAttributesImplBaseParcelizer + (j / ((this.IconCompatParcelizer * 1000000) / this.RemoteActionCompatParcelizer));
                if (j7 >= jWrite) {
                    return j3 == -1 ? j7 : Math.min(j7, (jWrite + j3) - 1);
                }
            }
            return jWrite;
        }

        public final long read(long j, long j2) {
            List<RemoteActionCompatParcelizer> list = this.AudioAttributesImplApi26Parcelizer;
            if (list != null) {
                return (list.get((int) (j - this.AudioAttributesImplBaseParcelizer)).IconCompatParcelizer * 1000000) / this.RemoteActionCompatParcelizer;
            }
            long j3 = read(j2);
            if (j3 != -1 && j == (write() + j3) - 1) {
                return j2 - IconCompatParcelizer(j);
            }
            return (this.IconCompatParcelizer * 1000000) / this.RemoteActionCompatParcelizer;
        }

        public final long IconCompatParcelizer(long j) {
            long j2;
            List<RemoteActionCompatParcelizer> list = this.AudioAttributesImplApi26Parcelizer;
            if (list != null) {
                j2 = list.get((int) (j - this.AudioAttributesImplBaseParcelizer)).AudioAttributesCompatParcelizer - this.AudioAttributesCompatParcelizer;
            } else {
                j2 = (j - this.AudioAttributesImplBaseParcelizer) * this.IconCompatParcelizer;
            }
            return LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(j2, 1000000L, this.RemoteActionCompatParcelizer);
        }

        public final long write() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public final long write(long j, long j2) {
            if (read(j) == -1) {
                long j3 = this.AudioAttributesImplApi21Parcelizer;
                if (j3 != C.TIME_UNSET) {
                    return Math.max(write(), IconCompatParcelizer((j2 - this.MediaBrowserCompatItemReceiver) - j3, j));
                }
            }
            return write();
        }

        public final long RemoteActionCompatParcelizer(long j, long j2) {
            long j3 = read(j);
            if (j3 != -1) {
                return j3;
            }
            return (int) (IconCompatParcelizer((j2 - this.MediaBrowserCompatItemReceiver) + this.write, j) - write(j, j2));
        }

        public final long AudioAttributesCompatParcelizer(long j, long j2) {
            if (this.AudioAttributesImplApi26Parcelizer != null) {
                return C.TIME_UNSET;
            }
            long jWrite = write(j, j2) + RemoteActionCompatParcelizer(j, j2);
            return (IconCompatParcelizer(jWrite) + read(jWrite, j)) - this.write;
        }

        public boolean RemoteActionCompatParcelizer() {
            return this.AudioAttributesImplApi26Parcelizer != null;
        }
    }

    public static final class read extends IconCompatParcelizer {
        final List<_withResolved> MediaBrowserCompatItemReceiver;

        @Override // o._serializeDynamicContents.IconCompatParcelizer
        public final boolean RemoteActionCompatParcelizer() {
            return true;
        }

        public read(_withResolved _withresolved, long j, long j2, long j3, long j4, List<RemoteActionCompatParcelizer> list, long j5, List<_withResolved> list2, long j6, long j7) {
            super(_withresolved, j, j2, j3, j4, list, j5, j6, j7);
            this.MediaBrowserCompatItemReceiver = list2;
        }

        @Override // o._serializeDynamicContents.IconCompatParcelizer
        public final _withResolved IconCompatParcelizer(IndexedStringListSerializer indexedStringListSerializer, long j) {
            return this.MediaBrowserCompatItemReceiver.get((int) (j - this.AudioAttributesImplBaseParcelizer));
        }

        @Override // o._serializeDynamicContents.IconCompatParcelizer
        public final long read(long j) {
            return this.MediaBrowserCompatItemReceiver.size();
        }
    }

    public static final class write extends IconCompatParcelizer {
        final long AudioAttributesImplApi21Parcelizer;
        final acceptContentVisitor MediaBrowserCompatCustomActionResultReceiver;
        final acceptContentVisitor MediaBrowserCompatItemReceiver;

        public write(_withResolved _withresolved, long j, long j2, long j3, long j4, long j5, List<RemoteActionCompatParcelizer> list, long j6, acceptContentVisitor acceptcontentvisitor, acceptContentVisitor acceptcontentvisitor2, long j7, long j8) {
            super(_withresolved, j, j2, j3, j5, list, j6, j7, j8);
            this.MediaBrowserCompatItemReceiver = acceptcontentvisitor;
            this.MediaBrowserCompatCustomActionResultReceiver = acceptcontentvisitor2;
            this.AudioAttributesImplApi21Parcelizer = j4;
        }

        @Override // kotlin._serializeDynamicContents
        public final _withResolved AudioAttributesCompatParcelizer(IndexedStringListSerializer indexedStringListSerializer) {
            acceptContentVisitor acceptcontentvisitor = this.MediaBrowserCompatItemReceiver;
            if (acceptcontentvisitor != null) {
                return new _withResolved(acceptcontentvisitor.write(indexedStringListSerializer.write.handleMediaPlayPauseIfPendingOnHandler, 0L, indexedStringListSerializer.write.read, 0L), 0L, -1L);
            }
            return super.AudioAttributesCompatParcelizer(indexedStringListSerializer);
        }

        @Override // o._serializeDynamicContents.IconCompatParcelizer
        public final _withResolved IconCompatParcelizer(IndexedStringListSerializer indexedStringListSerializer, long j) {
            long j2;
            if (this.AudioAttributesImplApi26Parcelizer != null) {
                j2 = this.AudioAttributesImplApi26Parcelizer.get((int) (j - this.AudioAttributesImplBaseParcelizer)).AudioAttributesCompatParcelizer;
            } else {
                j2 = (j - this.AudioAttributesImplBaseParcelizer) * this.IconCompatParcelizer;
            }
            return new _withResolved(this.MediaBrowserCompatCustomActionResultReceiver.write(indexedStringListSerializer.write.handleMediaPlayPauseIfPendingOnHandler, j, indexedStringListSerializer.write.read, j2), 0L, -1L);
        }

        @Override // o._serializeDynamicContents.IconCompatParcelizer
        public final long read(long j) {
            if (this.AudioAttributesImplApi26Parcelizer != null) {
                return this.AudioAttributesImplApi26Parcelizer.size();
            }
            long j2 = this.AudioAttributesImplApi21Parcelizer;
            if (j2 != -1) {
                return (j2 - this.AudioAttributesImplBaseParcelizer) + 1;
            }
            if (j != C.TIME_UNSET) {
                return outputSampleEncryptionData.IconCompatParcelizer(BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.RemoteActionCompatParcelizer)), BigInteger.valueOf(this.IconCompatParcelizer).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }
    }

    public static final class RemoteActionCompatParcelizer {
        final long AudioAttributesCompatParcelizer;
        final long IconCompatParcelizer;

        public RemoteActionCompatParcelizer(long j, long j2) {
            this.AudioAttributesCompatParcelizer = j;
            this.IconCompatParcelizer = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
            return this.AudioAttributesCompatParcelizer == remoteActionCompatParcelizer.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == remoteActionCompatParcelizer.IconCompatParcelizer;
        }

        public final int hashCode() {
            return (((int) this.AudioAttributesCompatParcelizer) * 31) + ((int) this.IconCompatParcelizer);
        }
    }
}
