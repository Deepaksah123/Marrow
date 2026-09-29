package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.AbstractFloatValueParser;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0002\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000fJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u00112\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Lo/parseNaNOrInfinity;", "E", "Lo/AbstractFloatValueParser;", "Lo/setUrl;", "<init>", "()V", "", "p0", "p1", "Lo/reportInvalid;", "AudioAttributesCompatParcelizer", "(II)Lo/reportInvalid;", "", "IconCompatParcelizer", "(Ljava/util/Collection;)Lo/AbstractFloatValueParser;", "(Ljava/lang/Object;)Lo/AbstractFloatValueParser;", "write", "", "contains", "(Ljava/lang/Object;)Z", "containsAll", "(Ljava/util/Collection;)Z", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class parseNaNOrInfinity<E> extends setUrl<E> implements AbstractFloatValueParser<E> {
    @Override // kotlin.setUrl, java.util.List, kotlin.reportInvalid
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public reportInvalid<E> subList(int p0, int p1) {
        return super.subList(p0, p1);
    }

    @Override // kotlin.AbstractFloatValueParser
    public AbstractFloatValueParser<E> IconCompatParcelizer(Collection<? extends E> p0) {
        AbstractFloatValueParser.AudioAttributesCompatParcelizer<E> audioAttributesCompatParcelizerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        audioAttributesCompatParcelizerRemoteActionCompatParcelizer.addAll(p0);
        return audioAttributesCompatParcelizerRemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.AbstractFloatValueParser
    public AbstractFloatValueParser<E> IconCompatParcelizer(E p0) {
        int iIndexOf = indexOf(p0);
        if (iIndexOf != -1) {
            return IconCompatParcelizer(iIndexOf);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IconCompatParcelizer(Collection collection, Object obj) {
        return collection.contains(obj);
    }

    @Override // kotlin.AbstractFloatValueParser
    public AbstractFloatValueParser<E> write(final Collection<? extends E> p0) {
        return write((getAnswerMap) new getAnswerMap() { // from class: o.parseHexFloatLiteral
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(parseNaNOrInfinity.IconCompatParcelizer(p0, obj));
            }
        });
    }

    @Override // kotlin.setBigButtonText, java.util.Collection, java.util.List
    public boolean contains(Object p0) {
        return indexOf(p0) != -1;
    }

    @Override // kotlin.setBigButtonText, java.util.Collection, java.util.List
    public boolean containsAll(Collection<?> p0) {
        Collection<?> collection = p0;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.setUrl, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // kotlin.setUrl, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }
}
