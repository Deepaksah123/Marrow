package kotlin;

import java.lang.reflect.Field;
import kotlin.forDeserialization;

/* JADX INFO: loaded from: classes4.dex */
final class AnnotationCollectorOneAnnotation implements Comparable<AnnotationCollectorOneAnnotation> {
    private final int AudioAttributesCompatParcelizer;
    private final Class<?> AudioAttributesImplApi21Parcelizer;
    private final Field AudioAttributesImplApi26Parcelizer;
    private final Class<?> AudioAttributesImplBaseParcelizer;
    private final forDeserialization.AudioAttributesCompatParcelizer IconCompatParcelizer;
    private final Object MediaBrowserCompatCustomActionResultReceiver;
    private final findReferenceName MediaBrowserCompatItemReceiver;
    private final int MediaBrowserCompatSearchResultReceiver;
    private final boolean MediaDescriptionCompat;
    private final AnnotationCollectorNCollector RatingCompat;
    private final Field RemoteActionCompatParcelizer;
    private final Field read;
    private final boolean write;

    public final int read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final Field RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final AnnotationCollectorNCollector AudioAttributesImplApi26Parcelizer() {
        return this.RatingCompat;
    }

    public final findReferenceName AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final forDeserialization.AudioAttributesCompatParcelizer write() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public int compareTo(AnnotationCollectorOneAnnotation annotationCollectorOneAnnotation) {
        return this.AudioAttributesCompatParcelizer - annotationCollectorOneAnnotation.AudioAttributesCompatParcelizer;
    }

    public final Field MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final Object IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return this.MediaDescriptionCompat;
    }

    public final boolean MediaDescriptionCompat() {
        return this.write;
    }

    public final Field AudioAttributesCompatParcelizer() {
        return this.read;
    }

    /* JADX INFO: renamed from: o.AnnotationCollectorOneAnnotation$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[AnnotationCollectorNCollector.values().length];
            AudioAttributesCompatParcelizer = iArr;
            try {
                iArr[AnnotationCollectorNCollector.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AudioAttributesCompatParcelizer[AnnotationCollectorNCollector.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AudioAttributesCompatParcelizer[AnnotationCollectorNCollector.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AudioAttributesCompatParcelizer[AnnotationCollectorNCollector.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public final Class<?> MediaBrowserCompatCustomActionResultReceiver() {
        int i = AnonymousClass1.AudioAttributesCompatParcelizer[this.RatingCompat.ordinal()];
        if (i == 1 || i == 2) {
            Field field = this.RemoteActionCompatParcelizer;
            return field != null ? field.getType() : this.AudioAttributesImplBaseParcelizer;
        }
        if (i == 3 || i == 4) {
            return this.AudioAttributesImplApi21Parcelizer;
        }
        return null;
    }
}
