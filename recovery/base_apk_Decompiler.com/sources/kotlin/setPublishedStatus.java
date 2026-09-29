package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class setPublishedStatus implements getQuote {
    private final getAnswerMap<getNotesCount, Boolean> AudioAttributesCompatParcelizer;
    private final boolean read;
    private final getQuote write;

    /* JADX WARN: Multi-variable type inference failed */
    private setPublishedStatus(getQuote getquote, getAnswerMap<? super getNotesCount, Boolean> getanswermap, byte b) {
        toMagicModuleMetaRepoModel.write(getquote, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.write = getquote;
        this.read = false;
        this.AudioAttributesCompatParcelizer = getanswermap;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setPublishedStatus(getQuote getquote, getAnswerMap<? super getNotesCount, Boolean> getanswermap) {
        this(getquote, getanswermap, (byte) 0);
        toMagicModuleMetaRepoModel.write(getquote, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
    }

    @Override // kotlin.getQuote
    public final boolean AudioAttributesCompatParcelizer(getNotesCount getnotescount) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        if (this.AudioAttributesCompatParcelizer.invoke(getnotescount).booleanValue()) {
            return this.write.AudioAttributesCompatParcelizer(getnotescount);
        }
        return false;
    }

    @Override // kotlin.getQuote
    public final dummyEditor IconCompatParcelizer(getNotesCount getnotescount) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        if (this.AudioAttributesCompatParcelizer.invoke(getnotescount).booleanValue()) {
            return this.write.IconCompatParcelizer(getnotescount);
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<dummyEditor> iterator() {
        getQuote getquote = this.write;
        ArrayList arrayList = new ArrayList();
        for (dummyEditor dummyeditor : getquote) {
            if (write(dummyeditor)) {
                arrayList.add(dummyeditor);
            }
        }
        return arrayList.iterator();
    }

    @Override // kotlin.getQuote
    public final boolean RemoteActionCompatParcelizer() {
        getQuote getquote = this.write;
        if (!(getquote instanceof Collection) || !((Collection) getquote).isEmpty()) {
            Iterator<dummyEditor> it = getquote.iterator();
            while (it.hasNext()) {
                if (write(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean write(dummyEditor dummyeditor) {
        getNotesCount getnotescountWrite = dummyeditor.write();
        return getnotescountWrite != null && this.AudioAttributesCompatParcelizer.invoke(getnotescountWrite).booleanValue();
    }
}
