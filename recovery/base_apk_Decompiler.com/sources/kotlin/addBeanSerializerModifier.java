package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0013\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0016\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017\u0088\u0001\u0018\u0092\u0001\u00020\u0002"}, d2 = {"Lo/addBeanSerializerModifier;", "", "", "p0", "RemoteActionCompatParcelizer", "(J)J", "", "(JJ)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "J", "", "write", "(J)F", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "(J)Z", "packedValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class addBeanSerializerModifier {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final long RemoteActionCompatParcelizer;

    public static final boolean AudioAttributesCompatParcelizer(long j) {
        return (j & 1) != 0;
    }

    public static final boolean IconCompatParcelizer(long j) {
        return (j & 2) != 0;
    }

    public static long RemoteActionCompatParcelizer(long j) {
        return j;
    }

    public static final int RemoteActionCompatParcelizer(long j, long j2) {
        boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(j);
        if (zAudioAttributesCompatParcelizer != AudioAttributesCompatParcelizer(j2)) {
            return zAudioAttributesCompatParcelizer ? -1 : 1;
        }
        return (Math.min(write(j), write(j2)) < BitmapDescriptorFactory.HUE_RED || IconCompatParcelizer(j) == IconCompatParcelizer(j2)) ? (int) Math.signum(write(j) - write(j2)) : IconCompatParcelizer(j) ? -1 : 1;
    }

    public static final float write(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static boolean IconCompatParcelizer(long j, Object obj) {
        return (obj instanceof addBeanSerializerModifier) && j == ((addBeanSerializerModifier) obj).getRemoteActionCompatParcelizer();
    }

    public static int read(long j) {
        return Long.hashCode(j);
    }

    public static String MediaBrowserCompatItemReceiver(long j) {
        StringBuilder sb = new StringBuilder("DistanceAndFlags(packedValue=");
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return IconCompatParcelizer(this.RemoteActionCompatParcelizer, p0);
    }

    public final int hashCode() {
        return read(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        return MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final /* synthetic */ long getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }
}
