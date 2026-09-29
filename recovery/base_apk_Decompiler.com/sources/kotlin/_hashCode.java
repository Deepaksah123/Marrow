package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001cR\u0014\u0010\u0016\u001a\u00020\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001e"}, d2 = {"Lo/_hashCode;", "Lo/replace;", "Lo/throwInternal;", "p0", "", "p1", "<init>", "(Lo/throwInternal;F)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Lo/throwInternal;", "()Lo/throwInternal;", "RemoteActionCompatParcelizer", "read", "F", "AudioAttributesCompatParcelizer", "()F", "write", "Lo/switchToNext;", "()J", "Lo/Instantiatable;", "()Lo/Instantiatable;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class _hashCode implements replace {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final throwInternal RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final float write;

    public _hashCode(throwInternal throwinternal, float f) {
        this.RemoteActionCompatParcelizer = throwinternal;
        this.write = f;
    }

    @Override // kotlin.replace
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final float getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final throwInternal getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.replace
    /* JADX INFO: renamed from: read */
    public final long getIconCompatParcelizer() {
        return switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.replace
    public final Instantiatable RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof _hashCode)) {
            return false;
        }
        _hashCode _hashcode = (_hashCode) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, _hashcode.RemoteActionCompatParcelizer) && Float.compare(this.write, _hashcode.write) == 0;
    }

    public final int hashCode() {
        return (this.RemoteActionCompatParcelizer.hashCode() * 31) + Float.hashCode(this.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("_hashCode(RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", write=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
