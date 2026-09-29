package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014"}, d2 = {"Lo/beforeArrayValues;", "Lo/writerFor;", "Lo/isStructEnd;", "Lkotlin/Function1;", "Lo/getConfigOverride;", "", "p0", "<init>", "(Lo/getAnswerMap;)V", "read", "()Lo/isStructEnd;", "write", "(Lo/isStructEnd;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lo/getAnswerMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class beforeArrayValues extends writerFor<isStructEnd> {
    private final getAnswerMap<getConfigOverride, getShowPopup> write;

    /* JADX WARN: Multi-variable type inference failed */
    public beforeArrayValues(getAnswerMap<? super getConfigOverride, getShowPopup> getanswermap) {
        this.write = getanswermap;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final isStructEnd IconCompatParcelizer() {
        return new isStructEnd(this.write);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(isStructEnd p0) {
        p0.read(this.write);
        getValueNulls.write(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof beforeArrayValues) && this.write == ((beforeArrayValues) p0).write;
    }

    public final int hashCode() {
        return this.write.hashCode();
    }
}
