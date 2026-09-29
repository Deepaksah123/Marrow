package kotlin;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
final class getDkycToken<T> extends UpgradePlanResponseV2<T> {
    private final List<T> RemoteActionCompatParcelizer;

    public getDkycToken(List<T> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.RemoteActionCompatParcelizer = list;
    }

    @Override // kotlin.UpgradePlanResponseV2
    /* JADX INFO: renamed from: write */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return this.RemoteActionCompatParcelizer.get(McqSearchBodyResponse.read((List<?>) this, i));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.RemoteActionCompatParcelizer.clear();
    }

    @Override // kotlin.UpgradePlanResponseV2
    public final T write(int i) {
        return this.RemoteActionCompatParcelizer.remove(McqSearchBodyResponse.read((List<?>) this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final T set(int i, T t) {
        return this.RemoteActionCompatParcelizer.set(McqSearchBodyResponse.read((List<?>) this, i), t);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, T t) {
        this.RemoteActionCompatParcelizer.add(McqSearchBodyResponse.AudioAttributesImplBaseParcelizer(this, i), t);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }

    public static final class RemoteActionCompatParcelizer implements ListIterator<T>, getOffline {
        private /* synthetic */ getDkycToken<T> AudioAttributesCompatParcelizer;
        private final ListIterator<T> IconCompatParcelizer;

        RemoteActionCompatParcelizer(getDkycToken<T> getdkyctoken, int i) {
            this.AudioAttributesCompatParcelizer = getdkyctoken;
            this.IconCompatParcelizer = ((getDkycToken) getdkyctoken).RemoteActionCompatParcelizer.listIterator(McqSearchBodyResponse.AudioAttributesImplBaseParcelizer(getdkyctoken, i));
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.IconCompatParcelizer.hasPrevious();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.IconCompatParcelizer.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            return this.IconCompatParcelizer.previous();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return McqSearchBodyResponse.AudioAttributesCompatParcelizer((List<?>) this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer.previousIndex());
        }

        @Override // java.util.ListIterator
        public final T previous() {
            return this.IconCompatParcelizer.next();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return McqSearchBodyResponse.AudioAttributesCompatParcelizer((List<?>) this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer.nextIndex());
        }

        @Override // java.util.ListIterator
        public final void add(T t) {
            this.IconCompatParcelizer.add(t);
            this.IconCompatParcelizer.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            this.IconCompatParcelizer.remove();
        }

        @Override // java.util.ListIterator
        public final void set(T t) {
            this.IconCompatParcelizer.set(t);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new RemoteActionCompatParcelizer(this, i);
    }
}
