package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f\u0088\u0001\u0011\u0092\u0001\u0004\u0018\u00010\u0002"}, d2 = {"Lo/_decodeCharForError;", "", "Lo/findAndAddVirtualProperties;", "p0", "write", "(Lo/findAndAddVirtualProperties;)Lo/findAndAddVirtualProperties;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lo/findAndAddVirtualProperties;", "AudioAttributesCompatParcelizer", "shape"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class _decodeCharForError {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final findAndAddVirtualProperties RemoteActionCompatParcelizer = write(parseVersion.read());
    private static final findAndAddVirtualProperties read = write(null);
    private final findAndAddVirtualProperties write;

    public static findAndAddVirtualProperties write(findAndAddVirtualProperties findandaddvirtualproperties) {
        return findandaddvirtualproperties;
    }

    private /* synthetic */ _decodeCharForError(findAndAddVirtualProperties findandaddvirtualproperties) {
        this.write = findandaddvirtualproperties;
    }

    /* JADX INFO: renamed from: o._decodeCharForError$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"Lo/_decodeCharForError$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/_decodeCharForError;", "RemoteActionCompatParcelizer", "Lo/findAndAddVirtualProperties;", "()Lo/findAndAddVirtualProperties;", "AudioAttributesCompatParcelizer", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final findAndAddVirtualProperties RemoteActionCompatParcelizer() {
            return _decodeCharForError.RemoteActionCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final /* synthetic */ _decodeCharForError RemoteActionCompatParcelizer(findAndAddVirtualProperties findandaddvirtualproperties) {
        return new _decodeCharForError(findandaddvirtualproperties);
    }

    public static boolean RemoteActionCompatParcelizer(findAndAddVirtualProperties findandaddvirtualproperties, Object obj) {
        return (obj instanceof _decodeCharForError) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(findandaddvirtualproperties, ((_decodeCharForError) obj).getWrite());
    }

    public static int IconCompatParcelizer(findAndAddVirtualProperties findandaddvirtualproperties) {
        if (findandaddvirtualproperties == null) {
            return 0;
        }
        return findandaddvirtualproperties.hashCode();
    }

    public static String read(findAndAddVirtualProperties findandaddvirtualproperties) {
        StringBuilder sb = new StringBuilder("BlurredEdgeTreatment(shape=");
        sb.append(findandaddvirtualproperties);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return RemoteActionCompatParcelizer(this.write, p0);
    }

    public final int hashCode() {
        return IconCompatParcelizer(this.write);
    }

    public final String toString() {
        return read(this.write);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final /* synthetic */ findAndAddVirtualProperties getWrite() {
        return this.write;
    }
}
