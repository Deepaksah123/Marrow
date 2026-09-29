package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.marrow.data.models.mcq.bookmark.FilterItemRecord;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\t8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\t8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010\u0088\u0001\u0013\u0092\u0001\u00020\u0002"}, d2 = {"Lo/_findFormat;", "", "", "p0", "IconCompatParcelizer", "(I)I", "", "AudioAttributesImplApi26Parcelizer", "(I)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "read", "(I)Z", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class _findFormat {

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int read;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int read = IconCompatParcelizer(0);
    private static final int IconCompatParcelizer = IconCompatParcelizer(1);
    private static final int RemoteActionCompatParcelizer = IconCompatParcelizer(2);
    private static final int write = IconCompatParcelizer(65535);

    public static final boolean AudioAttributesCompatParcelizer(int i, int i2) {
        return i == i2;
    }

    public static int IconCompatParcelizer(int i) {
        return i;
    }

    public static final boolean RemoteActionCompatParcelizer(int i) {
        return (i & 2) != 0;
    }

    public static final boolean read(int i) {
        return (i & 1) != 0;
    }

    private /* synthetic */ _findFormat(int i) {
        this.read = i;
    }

    public final String toString() {
        return AudioAttributesImplApi26Parcelizer(this.read);
    }

    public static String AudioAttributesImplApi26Parcelizer(int i) {
        return AudioAttributesCompatParcelizer(i, read) ? "None" : AudioAttributesCompatParcelizer(i, IconCompatParcelizer) ? "Weight" : AudioAttributesCompatParcelizer(i, RemoteActionCompatParcelizer) ? "Style" : AudioAttributesCompatParcelizer(i, write) ? FilterItemRecord.filter_all_title : "Invalid";
    }

    /* JADX INFO: renamed from: o._findFormat$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b"}, d2 = {"Lo/_findFormat$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/_findFormat;", "read", "I", "IconCompatParcelizer", "()I", "AudioAttributesCompatParcelizer", "write", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int IconCompatParcelizer() {
            return _findFormat.read;
        }

        public final int AudioAttributesCompatParcelizer() {
            return _findFormat.IconCompatParcelizer;
        }

        public final int write() {
            return _findFormat.RemoteActionCompatParcelizer;
        }

        public final int RemoteActionCompatParcelizer() {
            return _findFormat.write;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final /* synthetic */ _findFormat write(int i) {
        return new _findFormat(i);
    }

    public static boolean AudioAttributesCompatParcelizer(int i, Object obj) {
        return (obj instanceof _findFormat) && i == ((_findFormat) obj).getRead();
    }

    public static int AudioAttributesCompatParcelizer(int i) {
        return Integer.hashCode(i);
    }

    public final boolean equals(Object p0) {
        return AudioAttributesCompatParcelizer(this.read, p0);
    }

    public final int hashCode() {
        return AudioAttributesCompatParcelizer(this.read);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final /* synthetic */ int getRead() {
        return this.read;
    }
}
