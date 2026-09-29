package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/slowParseName;", "Lo/writerFor;", "Lo/_reportInvalidInitial;", "Lkotlin/Function1;", "Lo/_reportInvalidChar;", "Lo/parseMediumName;", "p0", "<init>", "(Lo/getAnswerMap;)V", "AudioAttributesCompatParcelizer", "()Lo/_reportInvalidInitial;", "", "read", "(Lo/_reportInvalidInitial;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "IconCompatParcelizer", "Lo/getAnswerMap;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class slowParseName extends writerFor<_reportInvalidInitial> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<_reportInvalidChar, parseMediumName> RemoteActionCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public slowParseName(getAnswerMap<? super _reportInvalidChar, parseMediumName> getanswermap) {
        this.RemoteActionCompatParcelizer = getanswermap;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final _reportInvalidInitial IconCompatParcelizer() {
        return new _reportInvalidInitial(new _reportInvalidChar(), this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(_reportInvalidInitial p0) {
        p0.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof slowParseName) && this.RemoteActionCompatParcelizer == ((slowParseName) p0).RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }
}
