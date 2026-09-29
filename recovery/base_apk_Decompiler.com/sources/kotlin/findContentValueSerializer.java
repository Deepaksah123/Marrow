package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\u0005J\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0002"}, d2 = {"Lo/findContentValueSerializer;", "", "", "p0", "read", "(I)I", "", "write", "(ILjava/lang/Object;)Z", "", "IconCompatParcelizer", "(I)Ljava/lang/String;", "AudioAttributesCompatParcelizer", "I", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class findContentValueSerializer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int read = read(0);
    private static final int RemoteActionCompatParcelizer = read(1);

    private static int read(int i) {
        return i;
    }

    /* JADX INFO: renamed from: o.findContentValueSerializer$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\t"}, d2 = {"Lo/findContentValueSerializer$IconCompatParcelizer;", "", "<init>", "()V", "Lo/findContentValueSerializer;", "read", "I", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "()I", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int IconCompatParcelizer() {
            return findContentValueSerializer.RemoteActionCompatParcelizer;
        }

        public final int AudioAttributesCompatParcelizer() {
            return IconCompatParcelizer();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private /* synthetic */ findContentValueSerializer(int i) {
        this.read = i;
    }

    public static final /* synthetic */ findContentValueSerializer RemoteActionCompatParcelizer(int i) {
        return new findContentValueSerializer(i);
    }

    public static boolean write(int i, Object obj) {
        return (obj instanceof findContentValueSerializer) && i == ((findContentValueSerializer) obj).getRead();
    }

    public static int write(int i) {
        return Integer.hashCode(i);
    }

    public static String IconCompatParcelizer(int i) {
        StringBuilder sb = new StringBuilder("AutoClearFocusBehavior(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        return write(this.read, obj);
    }

    public final int hashCode() {
        return write(this.read);
    }

    public final String toString() {
        return IconCompatParcelizer(this.read);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final /* synthetic */ int getRead() {
        return this.read;
    }
}
