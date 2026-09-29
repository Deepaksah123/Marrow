package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\u0006\n\u0004\b\t\u0010\u0014"}, d2 = {"Lo/getDelegatee;", "Lo/writerFor;", "Lo/getEmptyAccessPattern;", "Lkotlin/Function1;", "Lo/isAbstract;", "", "p0", "<init>", "(Lo/getAnswerMap;)V", "read", "()Lo/getEmptyAccessPattern;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "IconCompatParcelizer", "(Lo/getEmptyAccessPattern;)V", "Lo/getAnswerMap;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getDelegatee extends writerFor<getEmptyAccessPattern> {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getAnswerMap<isAbstract, getShowPopup> write;

    /* JADX WARN: Multi-variable type inference failed */
    public getDelegatee(getAnswerMap<? super isAbstract, getShowPopup> getanswermap) {
        this.write = getanswermap;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final getEmptyAccessPattern IconCompatParcelizer() {
        return new getEmptyAccessPattern(this.write);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof getDelegatee) && this.write == ((getDelegatee) p0).write;
    }

    public final int hashCode() {
        return this.write.hashCode();
    }

    @Override // kotlin.writerFor
    public final void IconCompatParcelizer(getEmptyAccessPattern p0) {
        p0.RemoteActionCompatParcelizer(this.write);
    }
}
