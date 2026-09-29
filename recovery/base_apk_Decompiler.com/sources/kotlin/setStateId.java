package kotlin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public class setStateId extends setStateSolved {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean read(Object obj) {
        return obj == null;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class IconCompatParcelizer<T> implements Iterable<T>, getCurrentAnsweredMcqProgress {
        private /* synthetic */ getTopRankers RemoteActionCompatParcelizer;

        public IconCompatParcelizer(getTopRankers gettoprankers) {
            this.RemoteActionCompatParcelizer = gettoprankers;
        }

        @Override // java.lang.Iterable
        public final Iterator<T> iterator() {
            return this.RemoteActionCompatParcelizer.write();
        }
    }

    public static final <T> T AudioAttributesCompatParcelizer(getTopRankers<? extends T> gettoprankers, int i) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        return (T) StateResult.IconCompatParcelizer(gettoprankers, i, new fromSyncData(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object IconCompatParcelizer(int i) {
        StringBuilder sb = new StringBuilder("Sequence doesn't contain element at index ");
        sb.append(i);
        sb.append('.');
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static final <T> T IconCompatParcelizer(getTopRankers<? extends T> gettoprankers, int i, getAnswerMap<? super Integer, ? extends T> getanswermap) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        if (i < 0) {
            return getanswermap.invoke(Integer.valueOf(i));
        }
        Iterator<? extends T> itWrite = gettoprankers.write();
        int i2 = 0;
        while (itWrite.hasNext()) {
            T next = itWrite.next();
            if (i == i2) {
                return next;
            }
            i2++;
        }
        return getanswermap.invoke(Integer.valueOf(i));
    }

    public static final <T> T AudioAttributesImplBaseParcelizer(getTopRankers<? extends T> gettoprankers) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        Iterator<? extends T> itWrite = gettoprankers.write();
        if (itWrite.hasNext()) {
            return itWrite.next();
        }
        return null;
    }

    public static final <T> T MediaBrowserCompatCustomActionResultReceiver(getTopRankers<? extends T> gettoprankers) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        Iterator<? extends T> itWrite = gettoprankers.write();
        if (!itWrite.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = itWrite.next();
        while (itWrite.hasNext()) {
            next = itWrite.next();
        }
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> getTopRankers<T> RemoteActionCompatParcelizer(getTopRankers<? extends T> gettoprankers, int i) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        if (i >= 0) {
            return i == 0 ? gettoprankers : gettoprankers instanceof isExpanded ? ((isExpanded) gettoprankers).read(i) : new MonthType(gettoprankers, i);
        }
        StringBuilder sb = new StringBuilder("Requested element count ");
        sb.append(i);
        sb.append(" is less than zero.");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static final <T> getTopRankers<T> IconCompatParcelizer(getTopRankers<? extends T> gettoprankers, getAnswerMap<? super T, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return new getTestList(gettoprankers, true, getanswermap);
    }

    public static final <T> getTopRankers<T> read(getTopRankers<? extends T> gettoprankers, getAnswerMap<? super T, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return new getTestList(gettoprankers, false, getanswermap);
    }

    public static final <T> getTopRankers<T> AudioAttributesImplApi26Parcelizer(getTopRankers<? extends T> gettoprankers) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        getTopRankers<T> gettoprankers2 = StateResult.read(gettoprankers, new getAnswerMap() { // from class: o.setTopperStat
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(setStateId.read(obj));
            }
        });
        toMagicModuleMetaRepoModel.read(gettoprankers2, "");
        return gettoprankers2;
    }

    public static final <T> getTopRankers<T> AudioAttributesImplApi21Parcelizer(getTopRankers<? extends T> gettoprankers) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        return gettoprankers instanceof isExpanded ? ((isExpanded) gettoprankers).IconCompatParcelizer(5) : new getIsRanked(gettoprankers, 5);
    }

    public static final <T> getTopRankers<T> AudioAttributesImplApi26Parcelizer(getTopRankers<? extends T> gettoprankers, getAnswerMap<? super T, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return new setNeetComparison(gettoprankers, getanswermap);
    }

    public static final <T, C extends Collection<? super T>> C write(getTopRankers<? extends T> gettoprankers, C c) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        toMagicModuleMetaRepoModel.write(c, "");
        Iterator<? extends T> itWrite = gettoprankers.write();
        while (itWrite.hasNext()) {
            c.add(itWrite.next());
        }
        return c;
    }

    public static final <T> List<T> MediaBrowserCompatItemReceiver(getTopRankers<? extends T> gettoprankers) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        Iterator<? extends T> itWrite = gettoprankers.write();
        if (!itWrite.hasNext()) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        T next = itWrite.next();
        if (!itWrite.hasNext()) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (itWrite.hasNext()) {
            arrayList.add(itWrite.next());
        }
        return arrayList;
    }

    public static final <T> List<T> RatingCompat(getTopRankers<? extends T> gettoprankers) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        return (List) StateResult.write(gettoprankers, new ArrayList());
    }

    public static final <T> Set<T> MediaBrowserCompatMediaItem(getTopRankers<? extends T> gettoprankers) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        Iterator<? extends T> itWrite = gettoprankers.write();
        if (!itWrite.hasNext()) {
            return getKycMessage.read();
        }
        T next = itWrite.next();
        if (!itWrite.hasNext()) {
            return getKycMessage.read(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (itWrite.hasNext()) {
            linkedHashSet.add(itWrite.next());
        }
        return linkedHashSet;
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class AudioAttributesCompatParcelizer<R> extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<getTopRankers<? extends R>, Iterator<? extends R>> {
        public static final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Iterator<R> invoke(getTopRankers<? extends R> gettoprankers) {
            toMagicModuleMetaRepoModel.write(gettoprankers, "");
            return gettoprankers.write();
        }

        AudioAttributesCompatParcelizer() {
            super(1, getTopRankers.class, "write", "write()Ljava/util/Iterator;", 0);
        }
    }

    public static final <T, R> getTopRankers<R> RemoteActionCompatParcelizer(getTopRankers<? extends T> gettoprankers, getAnswerMap<? super T, ? extends getTopRankers<? extends R>> getanswermap) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return new ShowHideItems(gettoprankers, getanswermap, AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
    }

    public static final <T, R> getTopRankers<R> write(getTopRankers<? extends T> gettoprankers, getAnswerMap<? super T, ? extends R> getanswermap) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return new getStatusTimestamp(gettoprankers, getanswermap);
    }

    public static final <T, R> getTopRankers<R> AudioAttributesCompatParcelizer(getTopRankers<? extends T> gettoprankers, getAnswerMap<? super T, ? extends R> getanswermap) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return StateResult.AudioAttributesImplApi26Parcelizer(new getStatusTimestamp(gettoprankers, getanswermap));
    }

    public static final <T> int AudioAttributesCompatParcelizer(getTopRankers<? extends T> gettoprankers) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        Iterator<? extends T> itWrite = gettoprankers.write();
        int i = 0;
        while (itWrite.hasNext()) {
            itWrite.next();
            i++;
            if (i < 0) {
                IntermediateLoginResponseBody.write();
            }
        }
        return i;
    }

    public static final <T> getTopRankers<T> IconCompatParcelizer(getTopRankers<? extends T> gettoprankers, T t) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        return StateResult.RemoteActionCompatParcelizer(StateResult.write((Object[]) new getTopRankers[]{gettoprankers, StateResult.AudioAttributesCompatParcelizer(t)}));
    }

    public static final <T> getTopRankers<T> read(getTopRankers<? extends T> gettoprankers, Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        toMagicModuleMetaRepoModel.write(iterable, "");
        return StateResult.RemoteActionCompatParcelizer(StateResult.write((Object[]) new getTopRankers[]{gettoprankers, IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer(iterable)}));
    }

    public static final <T, A extends Appendable> A AudioAttributesCompatParcelizer(getTopRankers<? extends T> gettoprankers, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, getAnswerMap<? super T, ? extends CharSequence> getanswermap) throws IOException {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        toMagicModuleMetaRepoModel.write(a, "");
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(charSequence2, "");
        toMagicModuleMetaRepoModel.write(charSequence3, "");
        toMagicModuleMetaRepoModel.write(charSequence4, "");
        a.append(charSequence2);
        Iterator<? extends T> itWrite = gettoprankers.write();
        int i2 = 0;
        while (itWrite.hasNext()) {
            T next = itWrite.next();
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            TestGroupLSModel.RemoteActionCompatParcelizer(a, next, getanswermap);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static final <T> String AudioAttributesCompatParcelizer(getTopRankers<? extends T> gettoprankers, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, getAnswerMap<? super T, ? extends CharSequence> getanswermap) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(charSequence2, "");
        toMagicModuleMetaRepoModel.write(charSequence3, "");
        toMagicModuleMetaRepoModel.write(charSequence4, "");
        return ((StringBuilder) StateResult.AudioAttributesCompatParcelizer(gettoprankers, new StringBuilder(), charSequence, charSequence2, charSequence3, -1, charSequence4, null)).toString();
    }

    public static final <T> Iterable<T> read(getTopRankers<? extends T> gettoprankers) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        return new IconCompatParcelizer(gettoprankers);
    }
}
