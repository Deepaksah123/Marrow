package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0088\u0001\u0015\u0092\u0001\u00020\u0002"}, d2 = {"Lo/setSubtitleTextAppearance;", "", "", "p0", "RemoteActionCompatParcelizer", "(J)J", "", "Lo/setTitleMargin;", "p1", "IconCompatParcelizer", "(II)J", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "J", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class setSubtitleTextAppearance {
    private final long AudioAttributesCompatParcelizer;

    public static final boolean IconCompatParcelizer(long j, long j2) {
        return j == j2;
    }

    private static long RemoteActionCompatParcelizer(long j) {
        return j;
    }

    public static /* synthetic */ long read(int i, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        if ((i3 & 2) != 0) {
            i2 = setTitleMargin.INSTANCE.AudioAttributesCompatParcelizer();
        }
        return IconCompatParcelizer(i, i2);
    }

    public static long IconCompatParcelizer(int i, int i2) {
        return RemoteActionCompatParcelizer(i * i2);
    }

    public static boolean AudioAttributesCompatParcelizer(long j, Object obj) {
        return (obj instanceof setSubtitleTextAppearance) && j == ((setSubtitleTextAppearance) obj).getAudioAttributesCompatParcelizer();
    }

    public static int read(long j) {
        return Long.hashCode(j);
    }

    public static String write(long j) {
        StringBuilder sb = new StringBuilder("StartOffset(value=");
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, p0);
    }

    public final int hashCode() {
        return read(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        return write(this.AudioAttributesCompatParcelizer);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final /* synthetic */ long getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}
