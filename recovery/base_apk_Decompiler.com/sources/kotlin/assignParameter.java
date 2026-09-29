package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012\u0088\u0001\u0013\u0092\u0001\u00020\u0002"}, d2 = {"Lo/assignParameter;", "", "", "p0", "IconCompatParcelizer", "(F)F", "", "write", "(FF)I", "", "RemoteActionCompatParcelizer", "(F)Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "F", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class assignParameter implements Comparable<assignParameter> {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final float RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float AudioAttributesCompatParcelizer = IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
    private static final float read = IconCompatParcelizer(Float.POSITIVE_INFINITY);
    private static final float RemoteActionCompatParcelizer = IconCompatParcelizer(Float.NaN);

    public static float IconCompatParcelizer(float f) {
        return f;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(assignParameter assignparameter) {
        return write(assignparameter.getRemoteActionCompatParcelizer());
    }

    private /* synthetic */ assignParameter(float f) {
        this.RemoteActionCompatParcelizer = f;
    }

    public final int write(float f) {
        return write(this.RemoteActionCompatParcelizer, f);
    }

    public static int write(float f, float f2) {
        if (PropertyValueRegular.AudioAttributesCompatParcelizer) {
            if (Float.isNaN(f) || Float.isNaN(f2)) {
                return 0;
            }
            return Float.compare(f, f2);
        }
        return Float.compare(f, f2);
    }

    public final String toString() {
        return RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    /* JADX INFO: renamed from: o.assignParameter$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Lo/assignParameter$IconCompatParcelizer;", "", "<init>", "()V", "Lo/assignParameter;", "AudioAttributesCompatParcelizer", "F", "IconCompatParcelizer", "()F", "read", "RemoteActionCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final float IconCompatParcelizer() {
            return assignParameter.AudioAttributesCompatParcelizer;
        }

        public final float read() {
            return assignParameter.read;
        }

        public final float RemoteActionCompatParcelizer() {
            return assignParameter.RemoteActionCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static String RemoteActionCompatParcelizer(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f);
        sb.append(".dp");
        return sb.toString();
    }

    public static final /* synthetic */ assignParameter read(float f) {
        return new assignParameter(f);
    }

    public static boolean AudioAttributesCompatParcelizer(float f, Object obj) {
        return (obj instanceof assignParameter) && Float.compare(f, ((assignParameter) obj).getRemoteActionCompatParcelizer()) == 0;
    }

    public static final boolean IconCompatParcelizer(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static int AudioAttributesCompatParcelizer(float f) {
        return Float.hashCode(f);
    }

    public final boolean equals(Object p0) {
        return AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, p0);
    }

    public final int hashCode() {
        return AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final /* synthetic */ float getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }
}
