package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0088\u0001\u000f\u0092\u0001\u00020\u0002"}, d2 = {"Lo/_deserializeIfNatural;", "", "", "p0", "AudioAttributesCompatParcelizer", "(I)I", "", "read", "(I)Ljava/lang/String;", "", "IconCompatParcelizer", "(ILjava/lang/Object;)Z", "write", "RemoteActionCompatParcelizer", "I", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class _deserializeIfNatural {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(0);
    private static final int write = AudioAttributesCompatParcelizer(1);
    private static final int read = AudioAttributesCompatParcelizer(2);

    public static int AudioAttributesCompatParcelizer(int i) {
        return i;
    }

    public static final boolean read(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ _deserializeIfNatural(int i) {
        this.write = i;
    }

    public final String toString() {
        return read(this.write);
    }

    public static String read(int i) {
        if (i == AudioAttributesCompatParcelizer) {
            return "EmojiSupportMatch.Default";
        }
        if (i == write) {
            return "EmojiSupportMatch.None";
        }
        if (i == read) {
            return "EmojiSupportMatch.All";
        }
        StringBuilder sb = new StringBuilder("Invalid(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: o._deserializeIfNatural$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\b"}, d2 = {"Lo/_deserializeIfNatural$IconCompatParcelizer;", "", "<init>", "()V", "Lo/_deserializeIfNatural;", "AudioAttributesCompatParcelizer", "I", "write", "()I", "RemoteActionCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int write() {
            return _deserializeIfNatural.AudioAttributesCompatParcelizer;
        }

        public final int read() {
            return _deserializeIfNatural.write;
        }

        public final int AudioAttributesCompatParcelizer() {
            return _deserializeIfNatural.read;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final /* synthetic */ _deserializeIfNatural IconCompatParcelizer(int i) {
        return new _deserializeIfNatural(i);
    }

    public static boolean IconCompatParcelizer(int i, Object obj) {
        return (obj instanceof _deserializeIfNatural) && i == ((_deserializeIfNatural) obj).getWrite();
    }

    public static int write(int i) {
        return Integer.hashCode(i);
    }

    public final boolean equals(Object obj) {
        return IconCompatParcelizer(this.write, obj);
    }

    public final int hashCode() {
        return write(this.write);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final /* synthetic */ int getWrite() {
        return this.write;
    }
}
