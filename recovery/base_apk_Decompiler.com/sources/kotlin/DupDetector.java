package kotlin;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aq\u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0018\u00010\r0\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aI\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001aA\u0010\u0010\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0000¢\u0006\u0004\b\u0010\u0010\u0017\"\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/AbstractFloatValueParser;", "Lo/child;", "Lo/parseDigitsRecursive;", "p0", "", "p1", "Lkotlin/Function1;", "", "", "p2", "p3", "Lo/getSubscriptionExpiresOn;", "Lo/rootDetector;", "", "AudioAttributesCompatParcelizer", "(Lo/AbstractFloatValueParser;Lo/parseDigitsRecursive;ZLo/getAnswerMap;Lo/getAnswerMap;)Lo/getSubscriptionExpiresOn;", "RemoteActionCompatParcelizer", "(Lo/getAnswerMap;Lo/getAnswerMap;)Lo/getAnswerMap;", "(Lo/AbstractFloatValueParser;Lo/parseDigitsRecursive;Lo/parseDigitsRecursive;Ljava/util/Map;)V", "write", "(Lo/parseDigitsRecursive;)V", "Lo/setButtonDrawable;", "Lo/tryMatch;", "(Lo/parseDigitsRecursive;Lo/setButtonDrawable;)V", "read", "Lo/AbstractFloatValueParser;", "IconCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DupDetector {
    private static AbstractFloatValueParser<? extends child> read;

    public static final Pair<rootDetector, Map<child, rootDetector>> AudioAttributesCompatParcelizer(AbstractFloatValueParser<? extends child> abstractFloatValueParser, parseDigitsRecursive parsedigitsrecursive, boolean z, getAnswerMap<Object, getShowPopup> getanswermap, getAnswerMap<Object, getShowPopup> getanswermap2) {
        AbstractFloatValueParser<? extends child> abstractFloatValueParser2 = abstractFloatValueParser;
        int size = abstractFloatValueParser2.size();
        LinkedHashMap linkedHashMap = null;
        for (int i = 0; i < size; i++) {
            child childVar = abstractFloatValueParser2.get(i);
            rootDetector rootdetectorIconCompatParcelizer = childVar.IconCompatParcelizer(parsedigitsrecursive, z);
            if (rootdetectorIconCompatParcelizer != null) {
                getanswermap = RemoteActionCompatParcelizer(rootdetectorIconCompatParcelizer.write(), getanswermap);
                getanswermap2 = RemoteActionCompatParcelizer(rootdetectorIconCompatParcelizer.read(), getanswermap2);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(childVar, rootdetectorIconCompatParcelizer);
            }
        }
        return setAction.write(new rootDetector(getanswermap, getanswermap2), linkedHashMap);
    }

    private static final getAnswerMap<Object, getShowPopup> RemoteActionCompatParcelizer(final getAnswerMap<Object, getShowPopup> getanswermap, final getAnswerMap<Object, getShowPopup> getanswermap2) {
        if (getanswermap == null || getanswermap2 == null) {
            return getanswermap == null ? getanswermap2 : getanswermap;
        }
        return new getAnswerMap() { // from class: o.ensureLoaded
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return DupDetector.IconCompatParcelizer(getanswermap, getanswermap2, obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getAnswerMap getanswermap, getAnswerMap getanswermap2, Object obj) {
        getanswermap.invoke(obj);
        getanswermap2.invoke(obj);
        return getShowPopup.INSTANCE;
    }

    public static final void RemoteActionCompatParcelizer(AbstractFloatValueParser<? extends child> abstractFloatValueParser, parseDigitsRecursive parsedigitsrecursive, parseDigitsRecursive parsedigitsrecursive2, Map<child, rootDetector> map) {
        AbstractFloatValueParser<? extends child> abstractFloatValueParser2 = abstractFloatValueParser;
        int size = abstractFloatValueParser2.size();
        for (int i = 0; i < size; i++) {
            child childVar = abstractFloatValueParser2.get(i);
            childVar.RemoteActionCompatParcelizer(parsedigitsrecursive2, parsedigitsrecursive, map != null ? map.get(childVar) : null);
        }
    }

    public static final void write(parseDigitsRecursive parsedigitsrecursive) {
        AbstractFloatValueParser<? extends child> abstractFloatValueParser = read;
        if (abstractFloatValueParser != null) {
            AbstractFloatValueParser<? extends child> abstractFloatValueParser2 = abstractFloatValueParser;
            int size = abstractFloatValueParser2.size();
            for (int i = 0; i < size; i++) {
                abstractFloatValueParser2.get(i).IconCompatParcelizer(parsedigitsrecursive);
            }
        }
    }

    public static final void RemoteActionCompatParcelizer(parseDigitsRecursive parsedigitsrecursive, setButtonDrawable<tryMatch> setbuttondrawable) {
        Set<? extends Object> setWrite;
        AbstractFloatValueParser<? extends child> abstractFloatValueParser = read;
        AbstractFloatValueParser<? extends child> abstractFloatValueParser2 = abstractFloatValueParser;
        if (abstractFloatValueParser2 == null || abstractFloatValueParser2.isEmpty()) {
            return;
        }
        if (setbuttondrawable == null || (setWrite = freeBuffers.write(setbuttondrawable)) == null) {
            setWrite = getKycMessage.read();
        }
        AbstractFloatValueParser<? extends child> abstractFloatValueParser3 = abstractFloatValueParser;
        int size = abstractFloatValueParser3.size();
        for (int i = 0; i < size; i++) {
            abstractFloatValueParser3.get(i).write(parsedigitsrecursive, setWrite);
        }
    }
}
