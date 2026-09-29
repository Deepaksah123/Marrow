package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00028\u00008\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lo/parseFloat;", "T", "Lo/_leading3;", "p0", "<init>", "(Ljava/lang/Object;)V", "Lo/hexToChar;", "AudioAttributesCompatParcelizer", "(Lo/hexToChar;)Ljava/lang/Object;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "IconCompatParcelizer", "()Ljava/lang/Object;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class parseFloat<T> implements _leading3<T> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final T write;

    public parseFloat(T t) {
        this.write = t;
    }

    public final T IconCompatParcelizer() {
        return this.write;
    }

    @Override // kotlin._leading3
    public final T AudioAttributesCompatParcelizer(hexToChar p0) {
        return this.write;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof parseFloat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, ((parseFloat) p0).write);
    }

    public final int hashCode() {
        T t = this.write;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("parseFloat(write=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
