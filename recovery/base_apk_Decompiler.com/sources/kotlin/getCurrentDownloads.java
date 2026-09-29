package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
public enum getCurrentDownloads {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(DownloadIndex.class, DownloadIndex.class, DownloadIndex.RemoteActionCompatParcelizer),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);

    private final Class<?> MediaBrowserCompatSearchResultReceiver;
    private final Class<?> MediaMetadataCompat;
    private final Object RatingCompat;

    getCurrentDownloads(Class cls, Class cls2, Object obj) {
        this.MediaBrowserCompatSearchResultReceiver = cls;
        this.MediaMetadataCompat = cls2;
        this.RatingCompat = obj;
    }

    public final Class<?> RemoteActionCompatParcelizer() {
        return this.MediaMetadataCompat;
    }
}
