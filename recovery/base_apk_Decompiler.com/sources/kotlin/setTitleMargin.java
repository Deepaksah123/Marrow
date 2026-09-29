package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0011\u0092\u0001\u00020\u0002"}, d2 = {"Lo/setTitleMargin;", "", "", "p0", "RemoteActionCompatParcelizer", "(I)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "I", "write", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class setTitleMargin {
    private final int read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(-1);
    private static final int IconCompatParcelizer = RemoteActionCompatParcelizer(1);

    private static int RemoteActionCompatParcelizer(int i) {
        return i;
    }

    /* JADX INFO: renamed from: o.setTitleMargin$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lo/setTitleMargin$write;", "", "<init>", "()V", "Lo/setTitleMargin;", "RemoteActionCompatParcelizer", "I", "AudioAttributesCompatParcelizer", "()I", "write", "IconCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int AudioAttributesCompatParcelizer() {
            return setTitleMargin.RemoteActionCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static boolean IconCompatParcelizer(int i, Object obj) {
        return (obj instanceof setTitleMargin) && i == ((setTitleMargin) obj).getRead();
    }

    public static int IconCompatParcelizer(int i) {
        return Integer.hashCode(i);
    }

    public static String read(int i) {
        StringBuilder sb = new StringBuilder("StartOffsetType(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return IconCompatParcelizer(this.read, p0);
    }

    public final int hashCode() {
        return IconCompatParcelizer(this.read);
    }

    public final String toString() {
        return read(this.read);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final /* synthetic */ int getRead() {
        return this.read;
    }
}
