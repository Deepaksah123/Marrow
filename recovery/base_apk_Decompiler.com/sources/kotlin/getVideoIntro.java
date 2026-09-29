package kotlin;

import java.util.Iterator;
import java.util.List;
import kotlin.getQuote;

/* JADX INFO: loaded from: classes4.dex */
public final class getVideoIntro implements getQuote {
    private final List<dummyEditor> read;

    /* JADX WARN: Multi-variable type inference failed */
    public getVideoIntro(List<? extends dummyEditor> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.read = list;
    }

    @Override // kotlin.getQuote
    public final boolean AudioAttributesCompatParcelizer(getNotesCount getnotescount) {
        return getQuote.read.write(this, getnotescount);
    }

    @Override // kotlin.getQuote
    public final dummyEditor IconCompatParcelizer(getNotesCount getnotescount) {
        return getQuote.read.RemoteActionCompatParcelizer(this, getnotescount);
    }

    @Override // kotlin.getQuote
    public final boolean RemoteActionCompatParcelizer() {
        return this.read.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<dummyEditor> iterator() {
        return this.read.iterator();
    }

    public final String toString() {
        return this.read.toString();
    }
}
