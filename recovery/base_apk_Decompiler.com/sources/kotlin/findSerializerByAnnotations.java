package kotlin;

import android.util.SparseArray;
import kotlin.StdKeySerializers;

/* JADX INFO: loaded from: classes2.dex */
public interface findSerializerByAnnotations {
    default void AudioAttributesCompatParcelizer(int i) {
    }

    default void AudioAttributesCompatParcelizer(deserializeTypedFromObject deserializetypedfromobject) {
    }

    default void IconCompatParcelizer(validateSubClassName validatesubclassname) {
    }

    default void RemoteActionCompatParcelizer(StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
    }

    default void read(_at _atVar) {
    }

    default void write(RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i, long j) {
    }

    default void write(RemoteActionCompatParcelizer remoteActionCompatParcelizer, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
    }

    default void write(isUnsafeBaseType isunsafebasetype, read readVar) {
    }

    public static final class read {
        private final enumTypes IconCompatParcelizer;
        private final SparseArray<RemoteActionCompatParcelizer> read;

        public read(enumTypes enumtypes, SparseArray<RemoteActionCompatParcelizer> sparseArray) {
            this.IconCompatParcelizer = enumtypes;
            SparseArray<RemoteActionCompatParcelizer> sparseArray2 = new SparseArray<>(enumtypes.AudioAttributesCompatParcelizer());
            for (int i = 0; i < enumtypes.AudioAttributesCompatParcelizer(); i++) {
                int iRemoteActionCompatParcelizer = enumtypes.RemoteActionCompatParcelizer(i);
                sparseArray2.append(iRemoteActionCompatParcelizer, (RemoteActionCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(sparseArray.get(iRemoteActionCompatParcelizer)));
            }
            this.read = sparseArray2;
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(int i) {
            return (RemoteActionCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.read.get(i));
        }

        public final boolean AudioAttributesCompatParcelizer(int i) {
            return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(i);
        }

        public final int read() {
            return this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        }

        public final int write(int i) {
            return this.IconCompatParcelizer.RemoteActionCompatParcelizer(i);
        }
    }

    public static final class RemoteActionCompatParcelizer {
        public final int AudioAttributesCompatParcelizer;
        public final PolymorphicTypeValidator AudioAttributesImplApi21Parcelizer;
        public final int AudioAttributesImplApi26Parcelizer;
        public final long AudioAttributesImplBaseParcelizer;
        public final long IconCompatParcelizer;
        public final StdKeySerializers.write MediaBrowserCompatCustomActionResultReceiver;
        public final long MediaBrowserCompatItemReceiver;
        public final long RemoteActionCompatParcelizer;
        public final StdKeySerializers.write read;
        public final PolymorphicTypeValidator write;

        public RemoteActionCompatParcelizer(long j, PolymorphicTypeValidator polymorphicTypeValidator, int i, StdKeySerializers.write writeVar, long j2, PolymorphicTypeValidator polymorphicTypeValidator2, int i2, StdKeySerializers.write writeVar2, long j3, long j4) {
            this.MediaBrowserCompatItemReceiver = j;
            this.AudioAttributesImplApi21Parcelizer = polymorphicTypeValidator;
            this.AudioAttributesImplApi26Parcelizer = i;
            this.MediaBrowserCompatCustomActionResultReceiver = writeVar;
            this.IconCompatParcelizer = j2;
            this.write = polymorphicTypeValidator2;
            this.AudioAttributesCompatParcelizer = i2;
            this.read = writeVar2;
            this.RemoteActionCompatParcelizer = j3;
            this.AudioAttributesImplBaseParcelizer = j4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
            return this.MediaBrowserCompatItemReceiver == remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver && this.AudioAttributesImplApi26Parcelizer == remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer && this.IconCompatParcelizer == remoteActionCompatParcelizer.IconCompatParcelizer && this.AudioAttributesCompatParcelizer == remoteActionCompatParcelizer.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == remoteActionCompatParcelizer.RemoteActionCompatParcelizer && this.AudioAttributesImplBaseParcelizer == remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer && parseSmta.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer) && parseSmta.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver) && parseSmta.AudioAttributesCompatParcelizer(this.write, remoteActionCompatParcelizer.write) && parseSmta.AudioAttributesCompatParcelizer(this.read, remoteActionCompatParcelizer.read);
        }

        public final int hashCode() {
            long j = this.MediaBrowserCompatItemReceiver;
            PolymorphicTypeValidator polymorphicTypeValidator = this.AudioAttributesImplApi21Parcelizer;
            int i = this.AudioAttributesImplApi26Parcelizer;
            StdKeySerializers.write writeVar = this.MediaBrowserCompatCustomActionResultReceiver;
            long j2 = this.IconCompatParcelizer;
            PolymorphicTypeValidator polymorphicTypeValidator2 = this.write;
            int i2 = this.AudioAttributesCompatParcelizer;
            return parseSmta.read(Long.valueOf(j), polymorphicTypeValidator, Integer.valueOf(i), writeVar, Long.valueOf(j2), polymorphicTypeValidator2, Integer.valueOf(i2), this.read, Long.valueOf(this.RemoteActionCompatParcelizer), Long.valueOf(this.AudioAttributesImplBaseParcelizer));
        }
    }
}
