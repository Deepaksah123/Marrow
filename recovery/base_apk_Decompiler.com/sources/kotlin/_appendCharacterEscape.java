package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lo/_appendCharacterEscape;", "Lo/writerFor;", "Lo/_prependOrWriteCharacterEscape;", "Lkotlin/Function1;", "Lo/findSerializer;", "", "p0", "<init>", "(Lo/getAnswerMap;)V", "write", "()Lo/_prependOrWriteCharacterEscape;", "read", "(Lo/_prependOrWriteCharacterEscape;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "IconCompatParcelizer", "Lo/getAnswerMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class _appendCharacterEscape extends writerFor<_prependOrWriteCharacterEscape> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<findSerializer, getShowPopup> read;

    /* JADX WARN: Multi-variable type inference failed */
    public _appendCharacterEscape(getAnswerMap<? super findSerializer, getShowPopup> getanswermap) {
        this.read = getanswermap;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final _prependOrWriteCharacterEscape IconCompatParcelizer() {
        return new _prependOrWriteCharacterEscape(this.read);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(_prependOrWriteCharacterEscape p0) {
        p0.RemoteActionCompatParcelizer(this.read);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof _appendCharacterEscape) && this.read == ((_appendCharacterEscape) p0).read;
    }

    public final int hashCode() {
        return this.read.hashCode();
    }
}
