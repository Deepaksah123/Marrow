package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0011\u0092\u0001\u00020\u0002"}, d2 = {"Lo/_handleByNameInclusion;", "Lo/AbstractDeserializer$RemoteActionCompatParcelizer;", "", "p0", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "read", "Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class _handleByNameInclusion implements AbstractDeserializer.RemoteActionCompatParcelizer {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    public static String RemoteActionCompatParcelizer(String str) {
        return str;
    }

    private /* synthetic */ _handleByNameInclusion(String str) {
        this.RemoteActionCompatParcelizer = str;
    }

    public static final /* synthetic */ _handleByNameInclusion read(String str) {
        return new _handleByNameInclusion(str);
    }

    public static boolean write(String str, Object obj) {
        return (obj instanceof _handleByNameInclusion) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) ((_handleByNameInclusion) obj).getRemoteActionCompatParcelizer());
    }

    public static int write(String str) {
        return str.hashCode();
    }

    public static String AudioAttributesCompatParcelizer(String str) {
        StringBuilder sb = new StringBuilder("StringAnnotation(value=");
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return write(this.RemoteActionCompatParcelizer, p0);
    }

    public final int hashCode() {
        return write(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        return AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final /* synthetic */ String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }
}
