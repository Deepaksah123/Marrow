package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0012\u0092\u0001\u00020\u0002"}, d2 = {"Lo/setSelected;", "", "", "p0", "write", "(I)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "I", "IconCompatParcelizer", "RemoteActionCompatParcelizer", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class setSelected {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int write = write(5);
    private static final int IconCompatParcelizer = write(4);
    private static final int read = write(0);

    public static int write(int i) {
        return i;
    }

    public static final boolean write(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: o.setSelected$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lo/setSelected$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/setSelected;", "write", "I", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "read", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int read() {
            return setSelected.read;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static boolean read(int i, Object obj) {
        return (obj instanceof setSelected) && i == ((setSelected) obj).getIconCompatParcelizer();
    }

    public static int IconCompatParcelizer(int i) {
        return Integer.hashCode(i);
    }

    public static String RemoteActionCompatParcelizer(int i) {
        StringBuilder sb = new StringBuilder("ArcMode(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return read(this.IconCompatParcelizer, p0);
    }

    public final int hashCode() {
        return IconCompatParcelizer(this.IconCompatParcelizer);
    }

    public final String toString() {
        return RemoteActionCompatParcelizer(this.IconCompatParcelizer);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final /* synthetic */ int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
