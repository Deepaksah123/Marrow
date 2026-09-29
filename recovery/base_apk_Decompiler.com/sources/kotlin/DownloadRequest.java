package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadRequest {
    public static int AudioAttributesCompatParcelizer(int i) {
        return i >>> 3;
    }

    public static int RemoteActionCompatParcelizer(int i) {
        return i & 7;
    }

    static int read(int i, int i2) {
        return (i << 3) | i2;
    }

    public enum IconCompatParcelizer {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(DownloadIndex.RemoteActionCompatParcelizer),
        ENUM(null),
        MESSAGE(null);

        private final Object MediaBrowserCompatMediaItem;

        IconCompatParcelizer(Object obj) {
            this.MediaBrowserCompatMediaItem = obj;
        }
    }

    public enum read {
        DOUBLE(IconCompatParcelizer.DOUBLE, 1),
        FLOAT(IconCompatParcelizer.FLOAT, 5),
        INT64(IconCompatParcelizer.LONG, 0),
        UINT64(IconCompatParcelizer.LONG, 0),
        INT32(IconCompatParcelizer.INT, 0),
        FIXED64(IconCompatParcelizer.LONG, 1),
        FIXED32(IconCompatParcelizer.INT, 5),
        BOOL(IconCompatParcelizer.BOOLEAN, 0),
        STRING { // from class: o.DownloadRequest.read.4
        },
        GROUP { // from class: o.DownloadRequest.read.5
        },
        MESSAGE { // from class: o.DownloadRequest.read.1
        },
        BYTES { // from class: o.DownloadRequest.read.2
        },
        UINT32(IconCompatParcelizer.INT, 0),
        ENUM(IconCompatParcelizer.ENUM, 0),
        SFIXED32(IconCompatParcelizer.INT, 5),
        SFIXED64(IconCompatParcelizer.LONG, 1),
        SINT32(IconCompatParcelizer.INT, 0),
        SINT64(IconCompatParcelizer.LONG, 0);

        private final IconCompatParcelizer onCommand;
        private final int onPlay;

        /* synthetic */ read(IconCompatParcelizer iconCompatParcelizer, int i, byte b) {
            this(iconCompatParcelizer, i);
        }

        read(IconCompatParcelizer iconCompatParcelizer, int i) {
            this.onCommand = iconCompatParcelizer;
            this.onPlay = i;
        }

        public final IconCompatParcelizer write() {
            return this.onCommand;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.onPlay;
        }
    }
}
