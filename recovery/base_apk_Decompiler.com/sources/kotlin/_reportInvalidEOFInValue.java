package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017"}, d2 = {"Lo/_reportInvalidEOFInValue;", "T", "Lo/_leading3;", "Lkotlin/Function1;", "Lo/reportInvalidBase64Char;", "p0", "<init>", "(Lo/getAnswerMap;)V", "Lo/hexToChar;", "AudioAttributesCompatParcelizer", "(Lo/hexToChar;)Ljava/lang/Object;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "Lo/getAnswerMap;", "()Lo/getAnswerMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class _reportInvalidEOFInValue<T> implements _leading3<T> {
    private final getAnswerMap<reportInvalidBase64Char, T> read;

    /* JADX WARN: Multi-variable type inference failed */
    public _reportInvalidEOFInValue(getAnswerMap<? super reportInvalidBase64Char, ? extends T> getanswermap) {
        this.read = getanswermap;
    }

    public final getAnswerMap<reportInvalidBase64Char, T> read() {
        return this.read;
    }

    @Override // kotlin._leading3
    public final T AudioAttributesCompatParcelizer(hexToChar p0) {
        return this.read.invoke(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof _reportInvalidEOFInValue) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, ((_reportInvalidEOFInValue) p0).read);
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("_reportInvalidEOFInValue(read=");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }
}
