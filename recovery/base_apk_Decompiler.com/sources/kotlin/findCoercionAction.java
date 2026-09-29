package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0011\u0092\u0001\u00020\u0002"}, d2 = {"Lo/findCoercionAction;", "", "", "p0", "IconCompatParcelizer", "(I)I", "", "AudioAttributesCompatParcelizer", "(I)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "AudioAttributesImplBaseParcelizer", "I", "read", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class findCoercionAction {
    private static final int AudioAttributesCompatParcelizer;
    private static final int AudioAttributesImplApi26Parcelizer;
    private static final int IconCompatParcelizer;
    private static final int MediaBrowserCompatItemReceiver;
    private static final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int write;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    public static int IconCompatParcelizer(int i) {
        return i;
    }

    public static final boolean IconCompatParcelizer(int i, int i2) {
        return i == i2;
    }

    public final String toString() {
        return AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    public static String AudioAttributesCompatParcelizer(int i) {
        return IconCompatParcelizer(i, MediaBrowserCompatItemReceiver) ? "UserInput" : IconCompatParcelizer(i, IconCompatParcelizer) ? "SideEffect" : IconCompatParcelizer(i, AudioAttributesCompatParcelizer) ? "Relocate" : "Invalid";
    }

    /* JADX INFO: renamed from: o.findCoercionAction$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006"}, d2 = {"Lo/findCoercionAction$read;", "", "<init>", "()V", "Lo/findCoercionAction;", "MediaBrowserCompatItemReceiver", "I", "AudioAttributesCompatParcelizer", "()I", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "write", "read", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplApi21Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int AudioAttributesCompatParcelizer() {
            return findCoercionAction.MediaBrowserCompatItemReceiver;
        }

        public final int write() {
            return findCoercionAction.IconCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        int iIconCompatParcelizer = IconCompatParcelizer(1);
        MediaBrowserCompatItemReceiver = iIconCompatParcelizer;
        int iIconCompatParcelizer2 = IconCompatParcelizer(2);
        IconCompatParcelizer = iIconCompatParcelizer2;
        write = iIconCompatParcelizer;
        RemoteActionCompatParcelizer = iIconCompatParcelizer2;
        AudioAttributesCompatParcelizer = IconCompatParcelizer(3);
        AudioAttributesImplApi26Parcelizer = iIconCompatParcelizer;
    }

    public static boolean RemoteActionCompatParcelizer(int i, Object obj) {
        return (obj instanceof findCoercionAction) && i == ((findCoercionAction) obj).getAudioAttributesCompatParcelizer();
    }

    public static int RemoteActionCompatParcelizer(int i) {
        return Integer.hashCode(i);
    }

    public final boolean equals(Object p0) {
        return RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, p0);
    }

    public final int hashCode() {
        return RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final /* synthetic */ int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}
