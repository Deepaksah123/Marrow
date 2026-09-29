package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\u0006\n\u0004\b\t\u0010\u0014"}, d2 = {"Lo/_writeStringCustom;", "Lo/writerFor;", "Lo/_calcOffset;", "Lkotlin/Function1;", "Lo/CharsToNameCanonicalizer;", "", "p0", "<init>", "(Lo/getAnswerMap;)V", "read", "()Lo/_calcOffset;", "AudioAttributesCompatParcelizer", "(Lo/_calcOffset;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lo/getAnswerMap;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class _writeStringCustom extends writerFor<_calcOffset> {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getAnswerMap<CharsToNameCanonicalizer, getShowPopup> IconCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public _writeStringCustom(getAnswerMap<? super CharsToNameCanonicalizer, getShowPopup> getanswermap) {
        this.IconCompatParcelizer = getanswermap;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final _calcOffset IconCompatParcelizer() {
        return new _calcOffset(this.IconCompatParcelizer);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(_calcOffset p0) {
        p0.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof _writeStringCustom) && this.IconCompatParcelizer == ((_writeStringCustom) p0).IconCompatParcelizer;
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }
}
