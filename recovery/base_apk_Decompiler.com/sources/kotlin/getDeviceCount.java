package kotlin;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
final class getDeviceCount<T> extends setUrl<T> {
    private final List<T> read;

    /* JADX WARN: Multi-variable type inference failed */
    public getDeviceCount(List<? extends T> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.read = list;
    }

    @Override // kotlin.setBigButtonText
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public final int getIconCompatParcelizer() {
        return this.read.size();
    }

    @Override // kotlin.setUrl, java.util.List
    public final T get(int i) {
        return this.read.get(McqSearchBodyResponse.read((List<?>) this, i));
    }

    @Override // kotlin.setUrl, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // kotlin.setUrl, java.util.List
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }

    public static final class read implements ListIterator<T>, getCurrentAnsweredMcqProgress {
        private /* synthetic */ getDeviceCount<T> IconCompatParcelizer;
        private final ListIterator<T> RemoteActionCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        read(getDeviceCount<? extends T> getdevicecount, int i) {
            this.IconCompatParcelizer = getdevicecount;
            this.RemoteActionCompatParcelizer = ((getDeviceCount) getdevicecount).read.listIterator(McqSearchBodyResponse.AudioAttributesImplBaseParcelizer(getdevicecount, i));
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.RemoteActionCompatParcelizer.hasPrevious();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.RemoteActionCompatParcelizer.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            return this.RemoteActionCompatParcelizer.previous();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return McqSearchBodyResponse.AudioAttributesCompatParcelizer((List<?>) this.IconCompatParcelizer, this.RemoteActionCompatParcelizer.previousIndex());
        }

        @Override // java.util.ListIterator
        public final T previous() {
            return this.RemoteActionCompatParcelizer.next();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return McqSearchBodyResponse.AudioAttributesCompatParcelizer((List<?>) this.IconCompatParcelizer, this.RemoteActionCompatParcelizer.nextIndex());
        }

        @Override // java.util.ListIterator
        public final void add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final void set(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // kotlin.setUrl, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new read(this, i);
    }
}
