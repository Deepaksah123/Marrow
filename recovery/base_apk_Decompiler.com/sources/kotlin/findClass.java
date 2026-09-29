package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0011\u0092\u0001\u00020\u0002"}, d2 = {"Lo/findClass;", "", "", "p0", "RemoteActionCompatParcelizer", "(J)J", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "J", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class findClass {
    private final long AudioAttributesCompatParcelizer;

    public static final boolean AudioAttributesCompatParcelizer(long j, long j2) {
        return j == j2;
    }

    public static long RemoteActionCompatParcelizer(long j) {
        return j;
    }

    public static boolean RemoteActionCompatParcelizer(long j, Object obj) {
        return (obj instanceof findClass) && j == ((findClass) obj).getAudioAttributesCompatParcelizer();
    }

    public static int AudioAttributesCompatParcelizer(long j) {
        return Long.hashCode(j);
    }

    public static String IconCompatParcelizer(long j) {
        StringBuilder sb = new StringBuilder("PointerId(value=");
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, p0);
    }

    public final int hashCode() {
        return AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        return IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final /* synthetic */ long getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}
