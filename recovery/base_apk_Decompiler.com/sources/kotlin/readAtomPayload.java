package kotlin;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
final class readAtomPayload<T> extends parseTruns<T> implements Serializable {
    private parseTruns<? super T> RemoteActionCompatParcelizer;

    readAtomPayload(parseTruns<? super T> parsetruns) {
        this.RemoteActionCompatParcelizer = (parseTruns) parseStsd.IconCompatParcelizer(parsetruns);
    }

    @Override // kotlin.parseTruns, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.RemoteActionCompatParcelizer.compare(t2, t);
    }

    @Override // kotlin.parseTruns
    public final <S extends T> parseTruns<S> AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return -this.RemoteActionCompatParcelizer.hashCode();
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof readAtomPayload) {
            return this.RemoteActionCompatParcelizer.equals(((readAtomPayload) obj).RemoteActionCompatParcelizer);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(".reverse()");
        return sb.toString();
    }
}
