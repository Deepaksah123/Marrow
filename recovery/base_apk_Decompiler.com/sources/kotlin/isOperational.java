package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class isOperational extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ getAnswerMap write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isOperational(getAnswerMap getanswermap) {
        super(1);
        this.write = getanswermap;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        List list = (List) obj;
        getAnswerMap getanswermap = this.write;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(getanswermap.invoke(it.next()));
        }
        return arrayList;
    }
}
