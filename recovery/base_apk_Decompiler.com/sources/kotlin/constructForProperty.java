package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081@\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e\u0088\u0001\u000f\u0092\u0001\u00020\u0002"}, d2 = {"Lo/constructForProperty;", "Lo/ObjectIdReader;", "", "p0", "write", "(Ljava/lang/String;)Ljava/lang/String;", "RemoteActionCompatParcelizer", "", "", "read", "(Ljava/lang/String;Ljava/lang/Object;)Z", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)I", "Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class constructForProperty implements ObjectIdReader {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String write = write("Enter");
    private static final String IconCompatParcelizer = write("Exit");

    public static String RemoteActionCompatParcelizer(String str) {
        return str;
    }

    private static String write(String str) {
        return str;
    }

    private /* synthetic */ constructForProperty(String str) {
        this.write = str;
    }

    public final String toString() {
        return RemoteActionCompatParcelizer(this.write);
    }

    /* JADX INFO: renamed from: o.constructForProperty$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Lo/constructForProperty$read;", "", "<init>", "()V", "Lo/constructForProperty;", "write", "Ljava/lang/String;", "read", "()Ljava/lang/String;", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final String read() {
            return constructForProperty.write;
        }

        public final String RemoteActionCompatParcelizer() {
            return constructForProperty.IconCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final /* synthetic */ constructForProperty read(String str) {
        return new constructForProperty(str);
    }

    public static boolean read(String str, Object obj) {
        return (obj instanceof constructForProperty) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) ((constructForProperty) obj).getWrite());
    }

    public static final boolean write(String str, String str2) {
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) str2);
    }

    public static int AudioAttributesCompatParcelizer(String str) {
        return str.hashCode();
    }

    public final boolean equals(Object obj) {
        return read(this.write, obj);
    }

    public final int hashCode() {
        return AudioAttributesCompatParcelizer(this.write);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final /* synthetic */ String getWrite() {
        return this.write;
    }
}
