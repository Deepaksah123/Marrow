package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0012\u0092\u0001\u00020\u0002"}, d2 = {"Lo/_find2ViaAlias;", "", "", "p0", "RemoteActionCompatParcelizer", "(F)F", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "MediaBrowserCompatItemReceiver", "F", "AudioAttributesCompatParcelizer", "multiplier"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class _find2ViaAlias {

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float read = RemoteActionCompatParcelizer(0.5f);
    private static final float write = RemoteActionCompatParcelizer(-0.5f);
    private static final float RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
    private static final float IconCompatParcelizer = RemoteActionCompatParcelizer(Float.NaN);

    public static float RemoteActionCompatParcelizer(float f) {
        return f;
    }

    /* JADX INFO: renamed from: o._find2ViaAlias$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\nR\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lo/_find2ViaAlias$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/_find2ViaAlias;", "read", "F", "IconCompatParcelizer", "write", "RemoteActionCompatParcelizer", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final float read() {
            return _find2ViaAlias.RemoteActionCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private /* synthetic */ _find2ViaAlias(float f) {
        this.AudioAttributesCompatParcelizer = f;
    }

    public static final /* synthetic */ _find2ViaAlias read(float f) {
        return new _find2ViaAlias(f);
    }

    public static boolean IconCompatParcelizer(float f, Object obj) {
        return (obj instanceof _find2ViaAlias) && Float.compare(f, ((_find2ViaAlias) obj).getAudioAttributesCompatParcelizer()) == 0;
    }

    public static final boolean read(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static int IconCompatParcelizer(float f) {
        return Float.hashCode(f);
    }

    public static String write(float f) {
        StringBuilder sb = new StringBuilder("BaselineShift(multiplier=");
        sb.append(f);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return IconCompatParcelizer(this.AudioAttributesCompatParcelizer, p0);
    }

    public final int hashCode() {
        return IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        return write(this.AudioAttributesCompatParcelizer);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final /* synthetic */ float getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}
