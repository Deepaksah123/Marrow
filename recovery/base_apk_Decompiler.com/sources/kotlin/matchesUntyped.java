package kotlin;

import android.os.Looper;
import com.google.android.exoplayer2.PlaybackException;
import kotlin.PropertySerializerMapDouble;
import kotlin.PropertySerializerMapEmpty;

/* JADX INFO: loaded from: classes2.dex */
public interface matchesUntyped {
    public static final matchesUntyped write = new matchesUntyped() { // from class: o.matchesUntyped.3
        @Override // kotlin.matchesUntyped
        public final void write(Looper looper, modifyArraySerializer modifyarrayserializer) {
        }

        @Override // kotlin.matchesUntyped
        public final PropertySerializerMapDouble AudioAttributesCompatParcelizer(PropertySerializerMapEmpty.read readVar, C0170format c0170format) {
            if (c0170format.MediaBrowserCompatMediaItem == null) {
                return null;
            }
            return new StringArraySerializer(new PropertySerializerMapDouble.IconCompatParcelizer(new UnwrappingBeanPropertyWriter1(), PlaybackException.ERROR_CODE_DRM_SCHEME_UNSUPPORTED));
        }

        @Override // kotlin.matchesUntyped
        public final int AudioAttributesCompatParcelizer(C0170format c0170format) {
            return c0170format.MediaBrowserCompatMediaItem != null ? 1 : 0;
        }
    };

    public interface AudioAttributesCompatParcelizer {
        public static final AudioAttributesCompatParcelizer read = new AudioAttributesCompatParcelizer() { // from class: o.ReadOnlyClassToSerializerMapBucket
            @Override // o.matchesUntyped.AudioAttributesCompatParcelizer
            public final void AudioAttributesCompatParcelizer() {
            }
        };

        void AudioAttributesCompatParcelizer();
    }

    int AudioAttributesCompatParcelizer(C0170format c0170format);

    PropertySerializerMapDouble AudioAttributesCompatParcelizer(PropertySerializerMapEmpty.read readVar, C0170format c0170format);

    default void IconCompatParcelizer() {
    }

    default void write() {
    }

    void write(Looper looper, modifyArraySerializer modifyarrayserializer);

    default AudioAttributesCompatParcelizer IconCompatParcelizer(PropertySerializerMapEmpty.read readVar, C0170format c0170format) {
        return AudioAttributesCompatParcelizer.read;
    }
}
