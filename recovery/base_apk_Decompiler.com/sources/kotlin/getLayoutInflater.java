package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00038\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u001c"}, d2 = {"Lo/getLayoutInflater;", "Lo/writerFor;", "Lo/getId;", "Lkotlin/Function1;", "Lo/bufferMapProperty;", "Lo/hasReferringProperties;", "p0", "", "p1", "Lo/as;", "", "p2", "<init>", "(Lo/getAnswerMap;ZLo/getAnswerMap;)V", "RemoteActionCompatParcelizer", "()Lo/getId;", "IconCompatParcelizer", "(Lo/getId;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "write", "Lo/getAnswerMap;", "read", "Z", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getLayoutInflater extends writerFor<getId> {
    private final getAnswerMap<as, getShowPopup> IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getAnswerMap<bufferMapProperty, hasReferringProperties> RemoteActionCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public getLayoutInflater(getAnswerMap<? super bufferMapProperty, hasReferringProperties> getanswermap, boolean z, getAnswerMap<? super as, getShowPopup> getanswermap2) {
        this.RemoteActionCompatParcelizer = getanswermap;
        this.AudioAttributesCompatParcelizer = z;
        this.IconCompatParcelizer = getanswermap2;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final getId IconCompatParcelizer() {
        return new getId(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin.writerFor
    public final void IconCompatParcelizer(getId p0) {
        p0.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        getLayoutInflater getlayoutinflater = p0 instanceof getLayoutInflater ? (getLayoutInflater) p0 : null;
        return getlayoutinflater != null && this.RemoteActionCompatParcelizer == getlayoutinflater.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer == getlayoutinflater.AudioAttributesCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetPxModifier(offset=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", rtlAware=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (this.RemoteActionCompatParcelizer.hashCode() * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer);
    }
}
