package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\r\u0010\u0010R$\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010"}, d2 = {"Lo/findTypeDeserializer;", "", "", "p0", "Lo/getReferencedType;", "p1", "<init>", "(JJLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "p2", "(JJJLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "toString", "()Ljava/lang/String;", "write", "J", "read", "()J", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class findTypeDeserializer {
    private final long RemoteActionCompatParcelizer;
    private long read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final long AudioAttributesCompatParcelizer;

    private findTypeDeserializer(long j, long j2) {
        this.AudioAttributesCompatParcelizer = j;
        this.RemoteActionCompatParcelizer = j2;
        this.read = getReferencedType.INSTANCE.write();
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final long getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final long getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final long getRead() {
        return this.read;
    }

    private findTypeDeserializer(long j, long j2, long j3) {
        this(j, j2, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
        this.read = j3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HistoricalChange(uptimeMillis=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", position=");
        sb.append((Object) getReferencedType.AudioAttributesImplBaseParcelizer(this.RemoteActionCompatParcelizer));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ findTypeDeserializer(long j, long j2, long j3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, j2, j3);
    }

    public /* synthetic */ findTypeDeserializer(long j, long j2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, j2);
    }
}
