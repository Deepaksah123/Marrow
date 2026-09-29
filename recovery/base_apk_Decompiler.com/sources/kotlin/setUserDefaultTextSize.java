package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0081@\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0014\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0088\u0001\u001c\u0092\u0001\u00020\u0002"}, d2 = {"Lo/setUserDefaultTextSize;", "", "", "p0", "AudioAttributesImplApi26Parcelizer", "(I)I", "", "p1", "p2", "p3", "p4", "RemoteActionCompatParcelizer", "(ZZZZZ)I", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "I", "AudioAttributesCompatParcelizer", "(I)Z", "write", "IconCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class setUserDefaultTextSize {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int IconCompatParcelizer = AudioAttributesImplApi26Parcelizer(0);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    public static final boolean AudioAttributesCompatParcelizer(int i) {
        return (i & 16) == 16;
    }

    private static int AudioAttributesImplApi26Parcelizer(int i) {
        return i;
    }

    public static final boolean IconCompatParcelizer(int i) {
        return (i & 4) == 4;
    }

    public static final boolean MediaBrowserCompatCustomActionResultReceiver(int i) {
        return (i & 8) == 8;
    }

    public static final boolean RemoteActionCompatParcelizer(int i) {
        return (i & 2) == 2;
    }

    public static final boolean read(int i) {
        return (i & 1) == 1;
    }

    private /* synthetic */ setUserDefaultTextSize(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    public static int RemoteActionCompatParcelizer(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        int i = z2 ? 2 : 0;
        int i2 = z3 ? 4 : 0;
        return AudioAttributesImplApi26Parcelizer((z ? 1 : 0) | i | i2 | (z4 ? 8 : 0) | (z5 ? 16 : 0));
    }

    /* JADX INFO: renamed from: o.setUserDefaultTextSize$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setUserDefaultTextSize$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/setUserDefaultTextSize;", "IconCompatParcelizer", "I", "AudioAttributesCompatParcelizer", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int AudioAttributesCompatParcelizer() {
            return setUserDefaultTextSize.IconCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final /* synthetic */ setUserDefaultTextSize write(int i) {
        return new setUserDefaultTextSize(i);
    }

    public static boolean write(int i, Object obj) {
        return (obj instanceof setUserDefaultTextSize) && i == ((setUserDefaultTextSize) obj).getAudioAttributesCompatParcelizer();
    }

    public static int AudioAttributesImplBaseParcelizer(int i) {
        return Integer.hashCode(i);
    }

    public static String AudioAttributesImplApi21Parcelizer(int i) {
        StringBuilder sb = new StringBuilder("MenuItemsAvailability(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return write(this.AudioAttributesCompatParcelizer, p0);
    }

    public final int hashCode() {
        return AudioAttributesImplBaseParcelizer(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        return AudioAttributesImplApi21Parcelizer(this.AudioAttributesCompatParcelizer);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final /* synthetic */ int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}
