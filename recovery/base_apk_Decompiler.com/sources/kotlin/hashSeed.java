package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0004\u0010\u000bJ\u001a\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010\u0088\u0001\u0013\u0092\u0001\u00020\u0002"}, d2 = {"Lo/hashSeed;", "", "", "p0", "IconCompatParcelizer", "(I)I", "", "AudioAttributesCompatParcelizer", "(I)Ljava/lang/String;", "Lo/getLongMask;", "", "(ILo/getLongMask;)Z", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "RemoteActionCompatParcelizer", "write", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class hashSeed {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int RemoteActionCompatParcelizer = IconCompatParcelizer(1);
    private static final int read = IconCompatParcelizer(0);
    private static final int IconCompatParcelizer = IconCompatParcelizer(2);

    private static int IconCompatParcelizer(int i) {
        return i;
    }

    public static final boolean write(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: o.hashSeed$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\b"}, d2 = {"Lo/hashSeed$write;", "", "<init>", "()V", "Lo/hashSeed;", "RemoteActionCompatParcelizer", "I", "read", "()I", "IconCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int read() {
            return hashSeed.RemoteActionCompatParcelizer;
        }

        public final int RemoteActionCompatParcelizer() {
            return hashSeed.read;
        }

        public final int IconCompatParcelizer() {
            return hashSeed.IconCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final String toString() {
        return AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    public static String AudioAttributesCompatParcelizer(int i) {
        if (write(i, RemoteActionCompatParcelizer)) {
            return "Always";
        }
        if (write(i, read)) {
            return "SystemDefined";
        }
        if (write(i, IconCompatParcelizer)) {
            return "Never";
        }
        throw new IllegalStateException("Unknown Focusability".toString());
    }

    public static final boolean IconCompatParcelizer(int i, getLongMask getlongmask) {
        if (write(i, RemoteActionCompatParcelizer)) {
            return true;
        }
        if (write(i, read)) {
            return !BeanPropertyStd.read(((getMember) MappingJsonFactory.write(getlongmask, getDefaultNullValueSerializer.MediaBrowserCompatSearchResultReceiver())).AudioAttributesCompatParcelizer(), BeanPropertyStd.INSTANCE.AudioAttributesCompatParcelizer());
        }
        if (write(i, IconCompatParcelizer)) {
            return false;
        }
        throw new IllegalStateException("Unknown Focusability".toString());
    }

    public static boolean IconCompatParcelizer(int i, Object obj) {
        return (obj instanceof hashSeed) && i == ((hashSeed) obj).getRemoteActionCompatParcelizer();
    }

    public static int RemoteActionCompatParcelizer(int i) {
        return Integer.hashCode(i);
    }

    public final boolean equals(Object p0) {
        return IconCompatParcelizer(this.RemoteActionCompatParcelizer, p0);
    }

    public final int hashCode() {
        return RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final /* synthetic */ int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }
}
