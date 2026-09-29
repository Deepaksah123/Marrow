package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/getTextOffset;", "", "Lo/switchToNext;", "p0", "Lo/setCurrentValue;", "p1", "<init>", "(JLo/setCurrentValue;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "J", "RemoteActionCompatParcelizer", "()J", "read", "Lo/setCurrentValue;", "AudioAttributesCompatParcelizer", "()Lo/setCurrentValue;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getTextOffset {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final long read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setCurrentValue AudioAttributesCompatParcelizer;

    private getTextOffset(long j, setCurrentValue setcurrentvalue) {
        this.read = j;
        this.AudioAttributesCompatParcelizer = setcurrentvalue;
    }

    public /* synthetic */ getTextOffset(long j, setCurrentValue setcurrentvalue, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer() : j, (i & 2) != 0 ? null : setcurrentvalue, null);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final long getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final setCurrentValue getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getTextOffset)) {
            return false;
        }
        getTextOffset gettextoffset = (getTextOffset) p0;
        return switchToNext.RemoteActionCompatParcelizer(this.read, gettextoffset.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, gettextoffset.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        int iMediaBrowserCompatItemReceiver = switchToNext.MediaBrowserCompatItemReceiver(this.read);
        setCurrentValue setcurrentvalue = this.AudioAttributesCompatParcelizer;
        return (iMediaBrowserCompatItemReceiver * 31) + (setcurrentvalue != null ? setcurrentvalue.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleConfiguration(color=");
        sb.append((Object) switchToNext.AudioAttributesImplApi26Parcelizer(this.read));
        sb.append(", rippleAlpha=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ getTextOffset(long j, setCurrentValue setcurrentvalue, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, setcurrentvalue);
    }
}
