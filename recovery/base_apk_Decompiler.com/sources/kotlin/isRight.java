package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class isRight {
    public static int AudioAttributesCompatParcelizer(int i) {
        return i >>> 3;
    }

    static int RemoteActionCompatParcelizer(int i) {
        return i & 7;
    }

    static int RemoteActionCompatParcelizer(int i, int i2) {
        return (i << 3) | i2;
    }

    public enum RemoteActionCompatParcelizer {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(setVideoAspectRatio.write),
        ENUM(null),
        MESSAGE(null);

        private final Object MediaBrowserCompatSearchResultReceiver;

        RemoteActionCompatParcelizer(Object obj) {
            this.MediaBrowserCompatSearchResultReceiver = obj;
        }
    }

    public enum IconCompatParcelizer {
        DOUBLE(RemoteActionCompatParcelizer.DOUBLE, 1),
        FLOAT(RemoteActionCompatParcelizer.FLOAT, 5),
        INT64(RemoteActionCompatParcelizer.LONG, 0),
        UINT64(RemoteActionCompatParcelizer.LONG, 0),
        INT32(RemoteActionCompatParcelizer.INT, 0),
        FIXED64(RemoteActionCompatParcelizer.LONG, 1),
        FIXED32(RemoteActionCompatParcelizer.INT, 5),
        BOOL(RemoteActionCompatParcelizer.BOOLEAN, 0),
        STRING { // from class: o.isRight.IconCompatParcelizer.4
            @Override // o.isRight.IconCompatParcelizer
            public final boolean read() {
                return false;
            }
        },
        GROUP { // from class: o.isRight.IconCompatParcelizer.3
            @Override // o.isRight.IconCompatParcelizer
            public final boolean read() {
                return false;
            }
        },
        MESSAGE { // from class: o.isRight.IconCompatParcelizer.2
            @Override // o.isRight.IconCompatParcelizer
            public final boolean read() {
                return false;
            }
        },
        BYTES { // from class: o.isRight.IconCompatParcelizer.5
            @Override // o.isRight.IconCompatParcelizer
            public final boolean read() {
                return false;
            }
        },
        UINT32(RemoteActionCompatParcelizer.INT, 0),
        ENUM(RemoteActionCompatParcelizer.ENUM, 0),
        SFIXED32(RemoteActionCompatParcelizer.INT, 5),
        SFIXED64(RemoteActionCompatParcelizer.LONG, 1),
        SINT32(RemoteActionCompatParcelizer.INT, 0),
        SINT64(RemoteActionCompatParcelizer.LONG, 0);

        private final RemoteActionCompatParcelizer handleMediaPlayPauseIfPendingOnHandler;
        private final int onPlayFromMediaId;

        public boolean read() {
            return true;
        }

        /* synthetic */ IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i, byte b) {
            this(remoteActionCompatParcelizer, i);
        }

        IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i) {
            this.handleMediaPlayPauseIfPendingOnHandler = remoteActionCompatParcelizer;
            this.onPlayFromMediaId = i;
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer() {
            return this.handleMediaPlayPauseIfPendingOnHandler;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.onPlayFromMediaId;
        }
    }
}
