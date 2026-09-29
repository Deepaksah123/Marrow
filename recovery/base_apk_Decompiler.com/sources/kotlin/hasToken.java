package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\n\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lo/hasToken;", "Lo/setParentLayoutDirection;", "", "p0", "Lo/assignParameter;", "p1", "Lo/MinimalPrettyPrinter;", "p2", "Lo/switchToNext;", "p3", "<init>", "(ZFLo/MinimalPrettyPrinter;J)V", "(ZFJLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/inset;", "Lo/Module;", "read", "(Lo/inset;)Lo/Module;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "RemoteActionCompatParcelizer", "Z", "AudioAttributesCompatParcelizer", "F", "IconCompatParcelizer", "Lo/MinimalPrettyPrinter;", "write", "J"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class hasToken implements setParentLayoutDirection {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final float IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final MinimalPrettyPrinter AudioAttributesCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final long read;

    private hasToken(boolean z, float f, MinimalPrettyPrinter minimalPrettyPrinter, long j) {
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = f;
        this.AudioAttributesCompatParcelizer = minimalPrettyPrinter;
        this.read = j;
    }

    private hasToken(boolean z, float f, long j) {
        this(z, f, (MinimalPrettyPrinter) null, j);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write implements MinimalPrettyPrinter {
        @Override // kotlin.MinimalPrettyPrinter
        public final long write() {
            return hasToken.this.read;
        }

        write() {
        }
    }

    @Override // kotlin.setParentLayoutDirection
    public final Module read(inset p0) {
        write writeVar = this.AudioAttributesCompatParcelizer;
        if (writeVar == null) {
            writeVar = new write();
        }
        return new sourceDescription(p0, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, writeVar, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof hasToken)) {
            return false;
        }
        hasToken hastoken = (hasToken) p0;
        if (this.RemoteActionCompatParcelizer == hastoken.RemoteActionCompatParcelizer && assignParameter.IconCompatParcelizer(this.IconCompatParcelizer, hastoken.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, hastoken.AudioAttributesCompatParcelizer)) {
            return switchToNext.RemoteActionCompatParcelizer(this.read, hastoken.read);
        }
        return false;
    }

    @Override // kotlin.setParentLayoutDirection
    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.RemoteActionCompatParcelizer);
        int iAudioAttributesCompatParcelizer = assignParameter.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
        MinimalPrettyPrinter minimalPrettyPrinter = this.AudioAttributesCompatParcelizer;
        return (((((iHashCode * 31) + iAudioAttributesCompatParcelizer) * 31) + (minimalPrettyPrinter != null ? minimalPrettyPrinter.hashCode() : 0)) * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.read);
    }

    public /* synthetic */ hasToken(boolean z, float f, long j, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(z, f, j);
    }
}
