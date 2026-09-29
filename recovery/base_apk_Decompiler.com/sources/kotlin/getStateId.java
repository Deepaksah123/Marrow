package kotlin;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public class getStateId extends getHiddenList {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object RemoteActionCompatParcelizer(Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object read(Object obj) {
        return obj;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class IconCompatParcelizer<T> implements getTopRankers<T> {
        private /* synthetic */ Iterator IconCompatParcelizer;

        public IconCompatParcelizer(Iterator it) {
            this.IconCompatParcelizer = it;
        }

        @Override // kotlin.getTopRankers
        public final Iterator<T> write() {
            return this.IconCompatParcelizer;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class read<T> implements getTopRankers<T> {
        private /* synthetic */ Object AudioAttributesCompatParcelizer;

        public read(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
        }

        @Override // kotlin.getTopRankers
        public final Iterator<T> write() {
            return new write(this.AudioAttributesCompatParcelizer);
        }
    }

    public static final <T> getTopRankers<T> read(Iterator<? extends T> it) {
        toMagicModuleMetaRepoModel.write(it, "");
        return StateResult.IconCompatParcelizer((getTopRankers) new IconCompatParcelizer(it));
    }

    public static final <T> getTopRankers<T> write(T... tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        return getOrderDetails.MediaBrowserCompatItemReceiver(tArr);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class write<T> implements Iterator<T>, getCurrentAnsweredMcqProgress {
        private boolean RemoteActionCompatParcelizer = true;
        private /* synthetic */ T read;

        write(T t) {
            this.read = t;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.RemoteActionCompatParcelizer) {
                throw new NoSuchElementException();
            }
            this.RemoteActionCompatParcelizer = false;
            return this.read;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> getTopRankers<T> AudioAttributesCompatParcelizer(T t) {
        return new read(t);
    }

    public static final <T> getTopRankers<T> AudioAttributesCompatParcelizer() {
        return getMonthType.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator AudioAttributesCompatParcelizer(getTopRankers gettoprankers) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        return gettoprankers.write();
    }

    public static final <T> getTopRankers<T> RemoteActionCompatParcelizer(getTopRankers<? extends getTopRankers<? extends T>> gettoprankers) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        return AudioAttributesCompatParcelizer(gettoprankers, new getAnswerMap() { // from class: o.TestAnalytics
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getStateId.AudioAttributesCompatParcelizer((getTopRankers) obj);
            }
        });
    }

    private static final <T, R> getTopRankers<R> AudioAttributesCompatParcelizer(getTopRankers<? extends T> gettoprankers, getAnswerMap<? super T, ? extends Iterator<? extends R>> getanswermap) {
        if (gettoprankers instanceof getStatusTimestamp) {
            return ((getStatusTimestamp) gettoprankers).read(getanswermap);
        }
        return new ShowHideItems(gettoprankers, new getAnswerMap() { // from class: o.SubHeader
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getStateId.read(obj);
            }
        }, getanswermap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> getTopRankers<T> IconCompatParcelizer(getTopRankers<? extends T> gettoprankers) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        return gettoprankers instanceof RankPair ? gettoprankers : new RankPair(gettoprankers);
    }

    public static final <T> getTopRankers<T> IconCompatParcelizer(final getCreatedOnDateMs<? extends T> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        return StateResult.IconCompatParcelizer((getTopRankers) new getStateResult(getcreatedondatems, new getAnswerMap() { // from class: o.setTotalAttempt
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getStateId.write(getcreatedondatems, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object write(getCreatedOnDateMs getcreatedondatems, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return getcreatedondatems.invoke();
    }

    public static final <T> getTopRankers<T> RemoteActionCompatParcelizer(final T t, getAnswerMap<? super T, ? extends T> getanswermap) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        if (t == null) {
            return getMonthType.INSTANCE;
        }
        return new getStateResult(new getCreatedOnDateMs() { // from class: o.getStateSolved
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getStateId.RemoteActionCompatParcelizer(t);
            }
        }, getanswermap);
    }

    public static final <T> getTopRankers<T> AudioAttributesCompatParcelizer(getCreatedOnDateMs<? extends T> getcreatedondatems, getAnswerMap<? super T, ? extends T> getanswermap) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return new getStateResult(getcreatedondatems, getanswermap);
    }
}
