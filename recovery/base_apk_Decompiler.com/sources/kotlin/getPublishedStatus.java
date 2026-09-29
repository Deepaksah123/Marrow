package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getPublishedStatus implements getQuote {
    private final List<getQuote> write;

    /* JADX WARN: Multi-variable type inference failed */
    public getPublishedStatus(List<? extends getQuote> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.write = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getPublishedStatus(getQuote... getquoteArr) {
        this((List<? extends getQuote>) getOrderDetails.onCommand(getquoteArr));
        toMagicModuleMetaRepoModel.write(getquoteArr, "");
    }

    @Override // kotlin.getQuote
    public final boolean RemoteActionCompatParcelizer() {
        List<getQuote> list = this.write;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((getQuote) it.next()).RemoteActionCompatParcelizer()) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.getQuote
    public final boolean AudioAttributesCompatParcelizer(getNotesCount getnotescount) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        Iterator itWrite = IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer((Iterable) this.write).write();
        while (itWrite.hasNext()) {
            if (((getQuote) itWrite.next()).AudioAttributesCompatParcelizer(getnotescount)) {
                return true;
            }
        }
        return false;
    }

    static final class IconCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<getQuote, dummyEditor> {
        private /* synthetic */ getNotesCount write;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public dummyEditor invoke(getQuote getquote) {
            toMagicModuleMetaRepoModel.write(getquote, "");
            return getquote.IconCompatParcelizer(this.write);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(getNotesCount getnotescount) {
            super(1);
            this.write = getnotescount;
        }
    }

    @Override // kotlin.getQuote
    public final dummyEditor IconCompatParcelizer(getNotesCount getnotescount) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        return (dummyEditor) StateResult.AudioAttributesImplBaseParcelizer(StateResult.AudioAttributesCompatParcelizer(IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer((Iterable) this.write), new IconCompatParcelizer(getnotescount)));
    }

    static final class read extends MagicModuleUseCase implements getAnswerMap<getQuote, getTopRankers<? extends dummyEditor>> {
        public static final read write = new read();

        private static getTopRankers<dummyEditor> write(getQuote getquote) {
            toMagicModuleMetaRepoModel.write(getquote, "");
            return IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer(getquote);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getTopRankers<? extends dummyEditor> invoke(getQuote getquote) {
            return write(getquote);
        }

        read() {
            super(1);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<dummyEditor> iterator() {
        return StateResult.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer((Iterable) this.write), (getAnswerMap) read.write).write();
    }
}
