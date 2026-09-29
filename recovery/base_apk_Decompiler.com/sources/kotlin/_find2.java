package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0013\u001a\u00020\u00188WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0019"}, d2 = {"Lo/_find2;", "Lo/replace;", "Lo/switchToNext;", "p0", "<init>", "(JLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "J", "IconCompatParcelizer", "read", "()J", "Lo/Instantiatable;", "RemoteActionCompatParcelizer", "()Lo/Instantiatable;", "", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class _find2 implements replace {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final long IconCompatParcelizer;

    @Override // kotlin.replace
    public final Instantiatable RemoteActionCompatParcelizer() {
        return null;
    }

    private _find2(long j) {
        this.IconCompatParcelizer = j;
        if (j != 16) {
            return;
        }
        withStackTrace.read("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // kotlin.replace
    /* JADX INFO: renamed from: read, reason: from getter */
    public final long getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.replace
    public final float AudioAttributesCompatParcelizer() {
        return switchToNext.RemoteActionCompatParcelizer(getIconCompatParcelizer());
    }

    public /* synthetic */ _find2(long j, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof _find2) && switchToNext.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ((_find2) p0).IconCompatParcelizer);
    }

    public final int hashCode() {
        return switchToNext.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("_find2(IconCompatParcelizer=");
        sb.append((Object) switchToNext.AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer));
        sb.append(')');
        return sb.toString();
    }
}
