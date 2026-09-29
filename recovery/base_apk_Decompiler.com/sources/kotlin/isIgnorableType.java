package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0014¢\u0006\u0004\b\b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u001a\u0010\b\u001a\u00020\u001e8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\b\u0010 "}, d2 = {"Lo/isIgnorableType;", "Lo/isAnnotationBundle;", "Lo/switchToNext;", "p0", "<init>", "(JLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/findSetterInfo;", "", "read", "(Lo/findSetterInfo;)V", "", "", "(F)Z", "Lo/switchAndReturnNext;", "write", "(Lo/switchAndReturnNext;)Z", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "J", "AudioAttributesCompatParcelizer", "F", "Lo/switchAndReturnNext;", "Lo/calloc;", "RemoteActionCompatParcelizer", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class isIgnorableType extends isAnnotationBundle {
    private float AudioAttributesCompatParcelizer;
    private final long IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final long read;
    private switchAndReturnNext write;

    private isIgnorableType(long j) {
        this.IconCompatParcelizer = j;
        this.AudioAttributesCompatParcelizer = 1.0f;
        this.read = calloc.INSTANCE.IconCompatParcelizer();
    }

    @Override // kotlin.isAnnotationBundle
    protected final void read(findSetterInfo findsetterinfo) {
        findSetterInfo.read$default(findsetterinfo, this.IconCompatParcelizer, 0L, 0L, this.AudioAttributesCompatParcelizer, null, this.write, 0, 86, null);
    }

    @Override // kotlin.isAnnotationBundle
    protected final boolean read(float p0) {
        this.AudioAttributesCompatParcelizer = p0;
        return true;
    }

    @Override // kotlin.isAnnotationBundle
    protected final boolean write(switchAndReturnNext p0) {
        this.write = p0;
        return true;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof isIgnorableType) && switchToNext.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ((isIgnorableType) p0).IconCompatParcelizer);
    }

    public final int hashCode() {
        return switchToNext.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorPainter(color=");
        sb.append((Object) switchToNext.AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer));
        sb.append(')');
        return sb.toString();
    }

    @Override // kotlin.isAnnotationBundle
    /* JADX INFO: renamed from: read, reason: from getter */
    public final long getRead() {
        return this.read;
    }

    public /* synthetic */ isIgnorableType(long j, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j);
    }
}
