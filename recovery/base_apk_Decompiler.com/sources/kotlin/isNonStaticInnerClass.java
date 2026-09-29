package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e\u0088\u0001\u0010\u0092\u0001\u00020\u0002"}, d2 = {"Lo/isNonStaticInnerClass;", "", "", "p0", "RemoteActionCompatParcelizer", "(I)I", "", "read", "(I)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "AudioAttributesCompatParcelizer", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class isNonStaticInnerClass {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    public static final boolean IconCompatParcelizer(int i, int i2) {
        return i == i2;
    }

    public static int RemoteActionCompatParcelizer(int i) {
        return i;
    }

    public final String toString() {
        return read(this.AudioAttributesCompatParcelizer);
    }

    public static String read(int i) {
        Companion companion = INSTANCE;
        return IconCompatParcelizer(i, companion.IconCompatParcelizer()) ? "Confirm" : IconCompatParcelizer(i, companion.write()) ? "ContextClick" : IconCompatParcelizer(i, companion.AudioAttributesCompatParcelizer()) ? "GestureEnd" : IconCompatParcelizer(i, companion.read()) ? "GestureThresholdActivate" : IconCompatParcelizer(i, companion.RemoteActionCompatParcelizer()) ? "KeyboardTap" : IconCompatParcelizer(i, companion.AudioAttributesImplApi26Parcelizer()) ? "LongPress" : IconCompatParcelizer(i, companion.AudioAttributesImplBaseParcelizer()) ? "Reject" : IconCompatParcelizer(i, companion.MediaBrowserCompatItemReceiver()) ? "SegmentFrequentTick" : IconCompatParcelizer(i, companion.MediaBrowserCompatCustomActionResultReceiver()) ? "SegmentTick" : IconCompatParcelizer(i, companion.AudioAttributesImplApi21Parcelizer()) ? "TextHandleMove" : IconCompatParcelizer(i, companion.RatingCompat()) ? "ToggleOff" : IconCompatParcelizer(i, companion.MediaMetadataCompat()) ? "ToggleOn" : IconCompatParcelizer(i, companion.MediaDescriptionCompat()) ? "VirtualKey" : "Invalid";
    }

    /* JADX INFO: renamed from: o.isNonStaticInnerClass$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u0011\u0010\r\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000e\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\r\u0010\u0006R\u0011\u0010\f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0010\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006"}, d2 = {"Lo/isNonStaticInnerClass$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/isNonStaticInnerClass;", "IconCompatParcelizer", "()I", "read", "write", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer", "RatingCompat", "MediaMetadataCompat", "MediaDescriptionCompat", "MediaBrowserCompatMediaItem"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int IconCompatParcelizer() {
            return BeanProperty.INSTANCE.AudioAttributesCompatParcelizer();
        }

        public final int write() {
            return BeanProperty.INSTANCE.RemoteActionCompatParcelizer();
        }

        public final int AudioAttributesCompatParcelizer() {
            return BeanProperty.INSTANCE.write();
        }

        public final int read() {
            return BeanProperty.INSTANCE.read();
        }

        public final int RemoteActionCompatParcelizer() {
            return BeanProperty.INSTANCE.IconCompatParcelizer();
        }

        public final int AudioAttributesImplApi26Parcelizer() {
            return BeanProperty.INSTANCE.MediaBrowserCompatCustomActionResultReceiver();
        }

        public final int AudioAttributesImplBaseParcelizer() {
            return BeanProperty.INSTANCE.MediaBrowserCompatItemReceiver();
        }

        public final int MediaBrowserCompatItemReceiver() {
            return BeanProperty.INSTANCE.AudioAttributesImplApi21Parcelizer();
        }

        public final int MediaBrowserCompatCustomActionResultReceiver() {
            return BeanProperty.INSTANCE.AudioAttributesImplApi26Parcelizer();
        }

        public final int AudioAttributesImplApi21Parcelizer() {
            return BeanProperty.INSTANCE.AudioAttributesImplBaseParcelizer();
        }

        public final int RatingCompat() {
            return BeanProperty.INSTANCE.MediaDescriptionCompat();
        }

        public final int MediaMetadataCompat() {
            return BeanProperty.INSTANCE.MediaMetadataCompat();
        }

        public final int MediaDescriptionCompat() {
            return BeanProperty.INSTANCE.MediaBrowserCompatMediaItem();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static boolean RemoteActionCompatParcelizer(int i, Object obj) {
        return (obj instanceof isNonStaticInnerClass) && i == ((isNonStaticInnerClass) obj).getAudioAttributesCompatParcelizer();
    }

    public static int IconCompatParcelizer(int i) {
        return Integer.hashCode(i);
    }

    public final boolean equals(Object p0) {
        return RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, p0);
    }

    public final int hashCode() {
        return IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final /* synthetic */ int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}
