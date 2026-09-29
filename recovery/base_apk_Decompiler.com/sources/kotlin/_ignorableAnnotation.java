package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class _ignorableAnnotation {
    static final int AudioAttributesCompatParcelizer = RemoteActionCompatParcelizer(1, 3);
    static final int IconCompatParcelizer = RemoteActionCompatParcelizer(1, 4);
    static final int RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(2, 0);
    static final int write = RemoteActionCompatParcelizer(3, 2);

    public static int RemoteActionCompatParcelizer(int i) {
        return i & 7;
    }

    static int RemoteActionCompatParcelizer(int i, int i2) {
        return (i << 3) | i2;
    }

    public static int read(int i) {
        return i >>> 3;
    }

    public enum AudioAttributesCompatParcelizer {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AnnotatedWithParams.AudioAttributesCompatParcelizer),
        ENUM(null),
        MESSAGE(null);

        private final Object MediaBrowserCompatSearchResultReceiver;

        AudioAttributesCompatParcelizer(Object obj) {
            this.MediaBrowserCompatSearchResultReceiver = obj;
        }
    }

    public enum IconCompatParcelizer {
        DOUBLE(AudioAttributesCompatParcelizer.DOUBLE, 1),
        FLOAT(AudioAttributesCompatParcelizer.FLOAT, 5),
        INT64(AudioAttributesCompatParcelizer.LONG, 0),
        UINT64(AudioAttributesCompatParcelizer.LONG, 0),
        INT32(AudioAttributesCompatParcelizer.INT, 0),
        FIXED64(AudioAttributesCompatParcelizer.LONG, 1),
        FIXED32(AudioAttributesCompatParcelizer.INT, 5),
        BOOL(AudioAttributesCompatParcelizer.BOOLEAN, 0),
        STRING { // from class: o._ignorableAnnotation.IconCompatParcelizer.4
        },
        GROUP { // from class: o._ignorableAnnotation.IconCompatParcelizer.2
        },
        MESSAGE { // from class: o._ignorableAnnotation.IconCompatParcelizer.3
        },
        BYTES { // from class: o._ignorableAnnotation.IconCompatParcelizer.5
        },
        UINT32(AudioAttributesCompatParcelizer.INT, 0),
        ENUM(AudioAttributesCompatParcelizer.ENUM, 0),
        SFIXED32(AudioAttributesCompatParcelizer.INT, 5),
        SFIXED64(AudioAttributesCompatParcelizer.LONG, 1),
        SINT32(AudioAttributesCompatParcelizer.INT, 0),
        SINT64(AudioAttributesCompatParcelizer.LONG, 0);

        private final AudioAttributesCompatParcelizer MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private final int onMediaButtonEvent;

        /* synthetic */ IconCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, int i, byte b) {
            this(audioAttributesCompatParcelizer, i);
        }

        IconCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, int i) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = audioAttributesCompatParcelizer;
            this.onMediaButtonEvent = i;
        }

        public final AudioAttributesCompatParcelizer IconCompatParcelizer() {
            return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.onMediaButtonEvent;
        }
    }
}
