package kotlin;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
final class rechunk<F, T> extends parseTruns<F> implements Serializable {
    private parseTruns<T> AudioAttributesCompatParcelizer;
    private parseMvhd<F, ? extends T> RemoteActionCompatParcelizer;

    rechunk(parseMvhd<F, ? extends T> parsemvhd, parseTruns<T> parsetruns) {
        this.RemoteActionCompatParcelizer = (parseMvhd) parseStsd.IconCompatParcelizer(parsemvhd);
        this.AudioAttributesCompatParcelizer = (parseTruns) parseStsd.IconCompatParcelizer(parsetruns);
    }

    @Override // kotlin.parseTruns, java.util.Comparator
    public final int compare(F f, F f2) {
        return this.AudioAttributesCompatParcelizer.compare(this.RemoteActionCompatParcelizer.apply(f), this.RemoteActionCompatParcelizer.apply(f2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rechunk)) {
            return false;
        }
        rechunk rechunkVar = (rechunk) obj;
        return this.RemoteActionCompatParcelizer.equals(rechunkVar.RemoteActionCompatParcelizer) && this.AudioAttributesCompatParcelizer.equals(rechunkVar.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return parseSmta.read(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(".onResultOf(");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
