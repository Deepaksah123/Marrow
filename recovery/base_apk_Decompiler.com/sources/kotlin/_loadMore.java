package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0012\u0092\u0001\u00020\u0002"}, d2 = {"Lo/_loadMore;", "", "", "p0", "AudioAttributesCompatParcelizer", "(F)F", "", "RemoteActionCompatParcelizer", "(F)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "write", "F", "read", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class _loadMore {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer(Float.NaN);
    private static final float AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(-3.0f);
    private static final float IconCompatParcelizer = AudioAttributesCompatParcelizer(-4.0f);

    private static float AudioAttributesCompatParcelizer(float f) {
        return f;
    }

    /* JADX INFO: renamed from: o._loadMore$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0007\u0010\n"}, d2 = {"Lo/_loadMore$read;", "", "<init>", "()V", "Lo/_loadMore;", "RemoteActionCompatParcelizer", "F", "write", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final float write() {
            return _loadMore.IconCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final String toString() {
        return RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    public static String RemoteActionCompatParcelizer(float f) {
        if (f == -3.0f) {
            return "Normal";
        }
        if (f == -4.0f) {
            return "High";
        }
        return "Default";
    }

    public static boolean write(float f, Object obj) {
        return (obj instanceof _loadMore) && Float.compare(f, ((_loadMore) obj).getAudioAttributesCompatParcelizer()) == 0;
    }

    public static int IconCompatParcelizer(float f) {
        return Float.hashCode(f);
    }

    public final boolean equals(Object p0) {
        return write(this.AudioAttributesCompatParcelizer, p0);
    }

    public final int hashCode() {
        return IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final /* synthetic */ float getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}
