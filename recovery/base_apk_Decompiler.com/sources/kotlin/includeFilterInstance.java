package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f"}, d2 = {"Lo/includeFilterInstance;", "", "Lo/getKey;", "p0", "Lo/handleIdValue;", "p1", "<init>", "(JJLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "AudioAttributesCompatParcelizer", "J", "IconCompatParcelizer", "write", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class includeFilterInstance {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final long IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final long AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final includeFilterInstance IconCompatParcelizer = new includeFilterInstance(getKey.INSTANCE.RemoteActionCompatParcelizer(), handleIdValue.INSTANCE.AudioAttributesCompatParcelizer(), null);

    /* JADX INFO: renamed from: o.includeFilterInstance$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\b8\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lo/includeFilterInstance$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/getKey;", "p0", "Lo/bufferMapProperty;", "p1", "Lo/includeFilterInstance;", "AudioAttributesCompatParcelizer", "(JLo/bufferMapProperty;)Lo/includeFilterInstance;", "Lo/handleIdValue;", "read", "IconCompatParcelizer", "Lo/includeFilterInstance;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final includeFilterInstance AudioAttributesCompatParcelizer(long p0, bufferMapProperty p1) {
            return new includeFilterInstance(p0, p1.b_(SetterlessProperty.AudioAttributesCompatParcelizer(p0)), null);
        }

        public final includeFilterInstance read(long p0, bufferMapProperty p1) {
            return new includeFilterInstance(SetterlessProperty.IconCompatParcelizer(p1.d_(p0)), p0, null);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private includeFilterInstance(long j, long j2) {
        this.IconCompatParcelizer = j;
        this.AudioAttributesCompatParcelizer = j2;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof includeFilterInstance)) {
            return false;
        }
        includeFilterInstance includefilterinstance = (includeFilterInstance) p0;
        return getKey.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, includefilterinstance.IconCompatParcelizer) && handleIdValue.write(this.AudioAttributesCompatParcelizer, includefilterinstance.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (getKey.IconCompatParcelizer(this.IconCompatParcelizer) * 31) + handleIdValue.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    public /* synthetic */ includeFilterInstance(long j, long j2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, j2);
    }
}
