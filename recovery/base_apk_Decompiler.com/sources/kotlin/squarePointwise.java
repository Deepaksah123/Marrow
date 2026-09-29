package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001aa\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00022\u001a\u0010\u0007\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Original", "Saveable", "Lkotlin/Function2;", "Lo/JavaDoubleBitsFromCharSequence;", "", "p0", "Lkotlin/Function1;", "p1", "Lo/parseManyDecDigits;", "", "IconCompatParcelizer", "(Lo/MagicModuleSubmissionRequestBody;Lo/getAnswerMap;)Lo/parseManyDecDigits;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class squarePointwise {
    public static final <Original, Saveable> parseManyDecDigits<Original, Object> IconCompatParcelizer(final MagicModuleSubmissionRequestBody<? super JavaDoubleBitsFromCharSequence, ? super Original, ? extends List<? extends Saveable>> magicModuleSubmissionRequestBody, getAnswerMap<? super List<? extends Saveable>, ? extends Original> getanswermap) {
        MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2 = new MagicModuleSubmissionRequestBody() { // from class: o.set
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return squarePointwise.RemoteActionCompatParcelizer(magicModuleSubmissionRequestBody, (JavaDoubleBitsFromCharSequence) obj, obj2);
            }
        };
        toMagicModuleMetaRepoModel.read(getanswermap, "");
        return JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(magicModuleSubmissionRequestBody2, (getAnswerMap) toMagicModuleStatsLSModel.RemoteActionCompatParcelizer(getanswermap, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object RemoteActionCompatParcelizer(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, Object obj) {
        List list = (List) magicModuleSubmissionRequestBody.invoke(javaDoubleBitsFromCharSequence, obj);
        List list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            if (obj2 != null && !javaDoubleBitsFromCharSequence.AudioAttributesCompatParcelizer(obj2)) {
                StringBuilder sb = new StringBuilder("item at index ");
                sb.append(i);
                sb.append(" can't be saved: ");
                sb.append(obj2);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
        if (list2.isEmpty()) {
            return null;
        }
        return new ArrayList(list2);
    }
}
