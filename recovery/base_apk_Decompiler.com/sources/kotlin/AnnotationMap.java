package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
public enum AnnotationMap {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(AnnotatedWithParams.class, AnnotatedWithParams.class, AnnotatedWithParams.AudioAttributesCompatParcelizer),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);

    private final Class<?> MediaBrowserCompatSearchResultReceiver;
    private final Class<?> MediaDescriptionCompat;
    private final Object RatingCompat;

    AnnotationMap(Class cls, Class cls2, Object obj) {
        this.MediaBrowserCompatSearchResultReceiver = cls;
        this.MediaDescriptionCompat = cls2;
        this.RatingCompat = obj;
    }

    public final Class<?> IconCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }
}
