package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0017B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0012\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/findOnlyParamWithoutInjection;", "", "Lo/findOnlyParamWithoutInjection$AudioAttributesCompatParcelizer;", "p0", "", "p1", "<init>", "(IZLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "write", "I", "read", "IconCompatParcelizer", "Z", "RemoteActionCompatParcelizer", "()Z", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class findOnlyParamWithoutInjection {
    private static final findOnlyParamWithoutInjection AudioAttributesCompatParcelizer;
    private static final findOnlyParamWithoutInjection RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean read;
    private final int write;

    private findOnlyParamWithoutInjection(int i, boolean z) {
        this.write = i;
        this.read = z;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: o.findOnlyParamWithoutInjection$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lo/findOnlyParamWithoutInjection$read;", "", "<init>", "()V", "Lo/findOnlyParamWithoutInjection;", "AudioAttributesCompatParcelizer", "Lo/findOnlyParamWithoutInjection;", "RemoteActionCompatParcelizer", "()Lo/findOnlyParamWithoutInjection;", "read", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final findOnlyParamWithoutInjection RemoteActionCompatParcelizer() {
            return findOnlyParamWithoutInjection.AudioAttributesCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
        INSTANCE = new Companion(magicModuleRepositoryImplExternalSyntheticLambda0);
        AudioAttributesCompatParcelizer = new findOnlyParamWithoutInjection(AudioAttributesCompatParcelizer.INSTANCE.read(), false, magicModuleRepositoryImplExternalSyntheticLambda0);
        RemoteActionCompatParcelizer = new findOnlyParamWithoutInjection(AudioAttributesCompatParcelizer.INSTANCE.AudioAttributesCompatParcelizer(), true, magicModuleRepositoryImplExternalSyntheticLambda0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof findOnlyParamWithoutInjection)) {
            return false;
        }
        findOnlyParamWithoutInjection findonlyparamwithoutinjection = (findOnlyParamWithoutInjection) p0;
        return AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.write, findonlyparamwithoutinjection.write) && this.read == findonlyparamwithoutinjection.read;
    }

    public final int hashCode() {
        return (AudioAttributesCompatParcelizer.IconCompatParcelizer(this.write) * 31) + Boolean.hashCode(this.read);
    }

    public final String toString() {
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this, AudioAttributesCompatParcelizer) ? "TextMotion.Static" : toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this, RemoteActionCompatParcelizer) ? "TextMotion.Animated" : "Invalid";
    }

    public /* synthetic */ findOnlyParamWithoutInjection(int i, boolean z, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i, z);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081@\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0088\u0001\u000f\u0092\u0001\u00020\u0002"}, d2 = {"Lo/findOnlyParamWithoutInjection$AudioAttributesCompatParcelizer;", "", "", "p0", "RemoteActionCompatParcelizer", "(I)I", "", "read", "(I)Ljava/lang/String;", "", "write", "(ILjava/lang/Object;)Z", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "I", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
    @submitMagicModule
    public static final class AudioAttributesCompatParcelizer {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final int write;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final int read = RemoteActionCompatParcelizer(1);
        private static final int RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(2);
        private static final int write = RemoteActionCompatParcelizer(3);

        public static final boolean AudioAttributesCompatParcelizer(int i, int i2) {
            return i == i2;
        }

        public static int RemoteActionCompatParcelizer(int i) {
            return i;
        }

        /* JADX INFO: renamed from: o.findOnlyParamWithoutInjection$AudioAttributesCompatParcelizer$IconCompatParcelizer, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\b"}, d2 = {"Lo/findOnlyParamWithoutInjection$AudioAttributesCompatParcelizer$IconCompatParcelizer;", "", "<init>", "()V", "Lo/findOnlyParamWithoutInjection$AudioAttributesCompatParcelizer;", "read", "I", "AudioAttributesCompatParcelizer", "()I", "RemoteActionCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final int AudioAttributesCompatParcelizer() {
                return AudioAttributesCompatParcelizer.read;
            }

            public final int read() {
                return AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
            }

            public final int RemoteActionCompatParcelizer() {
                return AudioAttributesCompatParcelizer.write;
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        private /* synthetic */ AudioAttributesCompatParcelizer(int i) {
            this.write = i;
        }

        public final String toString() {
            return read(this.write);
        }

        public static String read(int i) {
            return AudioAttributesCompatParcelizer(i, read) ? "Linearity.Linear" : AudioAttributesCompatParcelizer(i, RemoteActionCompatParcelizer) ? "Linearity.FontHinting" : AudioAttributesCompatParcelizer(i, write) ? "Linearity.None" : "Invalid";
        }

        public static final /* synthetic */ AudioAttributesCompatParcelizer write(int i) {
            return new AudioAttributesCompatParcelizer(i);
        }

        public static boolean write(int i, Object obj) {
            return (obj instanceof AudioAttributesCompatParcelizer) && i == ((AudioAttributesCompatParcelizer) obj).getWrite();
        }

        public static int IconCompatParcelizer(int i) {
            return Integer.hashCode(i);
        }

        public final boolean equals(Object obj) {
            return write(this.write, obj);
        }

        public final int hashCode() {
            return IconCompatParcelizer(this.write);
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final /* synthetic */ int getWrite() {
            return this.write;
        }
    }
}
