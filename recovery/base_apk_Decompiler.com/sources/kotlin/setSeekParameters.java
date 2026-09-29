package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0083@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00028\u00008\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0012\u0092\u0001\u00028\u0000"}, d2 = {"Lo/setSeekParameters;", "T", "", "p0", "read", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Ljava/lang/Object;", "IconCompatParcelizer", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
final class setSeekParameters<T> {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final T IconCompatParcelizer;

    public static <T> Object read(T t) {
        return t;
    }

    public static boolean write(Object obj, Object obj2) {
        return (obj2 instanceof setSeekParameters) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj, ((setSeekParameters) obj2).getIconCompatParcelizer());
    }

    public static int RemoteActionCompatParcelizer(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static String AudioAttributesCompatParcelizer(Object obj) {
        StringBuilder sb = new StringBuilder("StableValue(value=");
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return write(this.IconCompatParcelizer, p0);
    }

    public final int hashCode() {
        return RemoteActionCompatParcelizer(this.IconCompatParcelizer);
    }

    public final String toString() {
        return AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final /* synthetic */ Object getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
