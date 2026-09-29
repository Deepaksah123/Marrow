package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0010\u0092\u0001\u00020\u0002"}, d2 = {"Lo/_checkNeedForRehash;", "", "", "p0", "AudioAttributesCompatParcelizer", "(I)I", "", "RemoteActionCompatParcelizer", "(I)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "AudioAttributesImplApi26Parcelizer", "I", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class _checkNeedForRehash {

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int MediaBrowserCompatCustomActionResultReceiver = AudioAttributesCompatParcelizer(1);
    private static final int MediaBrowserCompatItemReceiver = AudioAttributesCompatParcelizer(2);
    private static final int RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer(3);
    private static final int AudioAttributesImplBaseParcelizer = AudioAttributesCompatParcelizer(4);
    private static final int AudioAttributesImplApi21Parcelizer = AudioAttributesCompatParcelizer(5);
    private static final int write = AudioAttributesCompatParcelizer(6);
    private static final int IconCompatParcelizer = AudioAttributesCompatParcelizer(7);
    private static final int read = AudioAttributesCompatParcelizer(8);

    public static int AudioAttributesCompatParcelizer(int i) {
        return i;
    }

    public static final boolean IconCompatParcelizer(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ _checkNeedForRehash(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    public final String toString() {
        return RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    public static String RemoteActionCompatParcelizer(int i) {
        return IconCompatParcelizer(i, MediaBrowserCompatCustomActionResultReceiver) ? "Next" : IconCompatParcelizer(i, MediaBrowserCompatItemReceiver) ? "Previous" : IconCompatParcelizer(i, RemoteActionCompatParcelizer) ? "Left" : IconCompatParcelizer(i, AudioAttributesImplBaseParcelizer) ? "Right" : IconCompatParcelizer(i, AudioAttributesImplApi21Parcelizer) ? "Up" : IconCompatParcelizer(i, write) ? "Down" : IconCompatParcelizer(i, IconCompatParcelizer) ? "Enter" : IconCompatParcelizer(i, read) ? "Exit" : "Invalid FocusDirection";
    }

    /* JADX INFO: renamed from: o._checkNeedForRehash$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000f\u0010\bR\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\bR\u001a\u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\r\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Lo/_checkNeedForRehash$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/_checkNeedForRehash;", "MediaBrowserCompatCustomActionResultReceiver", "I", "write", "()I", "IconCompatParcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer", "read", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int write() {
            return _checkNeedForRehash.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final int AudioAttributesImplBaseParcelizer() {
            return _checkNeedForRehash.MediaBrowserCompatItemReceiver;
        }

        public final int read() {
            return _checkNeedForRehash.RemoteActionCompatParcelizer;
        }

        public final int MediaBrowserCompatItemReceiver() {
            return _checkNeedForRehash.AudioAttributesImplBaseParcelizer;
        }

        public final int AudioAttributesImplApi21Parcelizer() {
            return _checkNeedForRehash.AudioAttributesImplApi21Parcelizer;
        }

        public final int IconCompatParcelizer() {
            return _checkNeedForRehash.write;
        }

        public final int RemoteActionCompatParcelizer() {
            return _checkNeedForRehash.IconCompatParcelizer;
        }

        public final int AudioAttributesCompatParcelizer() {
            return _checkNeedForRehash.read;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final /* synthetic */ _checkNeedForRehash read(int i) {
        return new _checkNeedForRehash(i);
    }

    public static boolean write(int i, Object obj) {
        return (obj instanceof _checkNeedForRehash) && i == ((_checkNeedForRehash) obj).getAudioAttributesCompatParcelizer();
    }

    public static int IconCompatParcelizer(int i) {
        return Integer.hashCode(i);
    }

    public final boolean equals(Object p0) {
        return write(this.AudioAttributesCompatParcelizer, p0);
    }

    public final int hashCode() {
        return IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final /* synthetic */ int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}
