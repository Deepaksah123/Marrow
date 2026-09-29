package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0083@\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0088\u0001\u0016\u0092\u0001\u00020\u0002"}, d2 = {"Lo/fullMultiplication;", "", "Lo/splitFloor16;", "p0", "AudioAttributesCompatParcelizer", "(Lo/splitFloor16;)Lo/splitFloor16;", "RemoteActionCompatParcelizer", "()Lo/splitFloor16;", "", "p1", "IconCompatParcelizer", "(Lo/splitFloor16;II)I", "", "read", "(Lo/splitFloor16;)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "write", "Lo/splitFloor16;", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
final class fullMultiplication {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final splitFloor16 IconCompatParcelizer;

    private static splitFloor16 AudioAttributesCompatParcelizer(splitFloor16 splitfloor16) {
        return splitfloor16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int IconCompatParcelizer(splitFloor16 splitfloor16, int i, int i2) {
        return ((i & 15) << 27) | (134217727 & i2);
    }

    public static splitFloor16 RemoteActionCompatParcelizer() {
        return AudioAttributesCompatParcelizer(new splitFloor16(0));
    }

    public final String toString() {
        return read(this.IconCompatParcelizer);
    }

    public static String read(splitFloor16 splitfloor16) {
        int i = splitfloor16.get();
        StringBuilder sb = new StringBuilder("AtomicAwaitersCount(version = ");
        sb.append((i >>> 27) & 15);
        sb.append(", count = ");
        sb.append(i & 134217727);
        sb.append(')');
        return sb.toString();
    }

    public static boolean IconCompatParcelizer(splitFloor16 splitfloor16, Object obj) {
        return (obj instanceof fullMultiplication) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(splitfloor16, ((fullMultiplication) obj).getIconCompatParcelizer());
    }

    public static int IconCompatParcelizer(splitFloor16 splitfloor16) {
        return splitfloor16.hashCode();
    }

    public final boolean equals(Object p0) {
        return IconCompatParcelizer(this.IconCompatParcelizer, p0);
    }

    public final int hashCode() {
        return IconCompatParcelizer(this.IconCompatParcelizer);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final /* synthetic */ splitFloor16 getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
