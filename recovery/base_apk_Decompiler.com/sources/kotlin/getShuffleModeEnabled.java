package kotlin;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
class getShuffleModeEnabled extends ArrayList<getCurrentPeriodIndex<?>> {
    private boolean AudioAttributesCompatParcelizer;
    private write RemoteActionCompatParcelizer;

    interface write {
        void AudioAttributesCompatParcelizer();

        void read();
    }

    getShuffleModeEnabled(int i) {
        super(i);
    }

    public getShuffleModeEnabled() {
    }

    final void write() {
        if (this.AudioAttributesCompatParcelizer) {
            throw new IllegalStateException("Notifications already paused");
        }
        this.AudioAttributesCompatParcelizer = true;
    }

    final void IconCompatParcelizer() {
        if (!this.AudioAttributesCompatParcelizer) {
            throw new IllegalStateException("Notifications already resumed");
        }
        this.AudioAttributesCompatParcelizer = false;
    }

    final void IconCompatParcelizer(write writeVar) {
        this.RemoteActionCompatParcelizer = writeVar;
    }

    private void RemoteActionCompatParcelizer() {
        write writeVar;
        if (this.AudioAttributesCompatParcelizer || (writeVar = this.RemoteActionCompatParcelizer) == null) {
            return;
        }
        writeVar.AudioAttributesCompatParcelizer();
    }

    private void read() {
        write writeVar;
        if (this.AudioAttributesCompatParcelizer || (writeVar = this.RemoteActionCompatParcelizer) == null) {
            return;
        }
        writeVar.read();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final getCurrentPeriodIndex<?> set(int i, getCurrentPeriodIndex<?> getcurrentperiodindex) {
        getCurrentPeriodIndex<?> getcurrentperiodindex2 = (getCurrentPeriodIndex) super.set(i, getcurrentperiodindex);
        if (getcurrentperiodindex2.AudioAttributesCompatParcelizer() != getcurrentperiodindex.AudioAttributesCompatParcelizer()) {
            read();
            RemoteActionCompatParcelizer();
        }
        return getcurrentperiodindex2;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final boolean add(getCurrentPeriodIndex<?> getcurrentperiodindex) {
        size();
        RemoteActionCompatParcelizer();
        return super.add(getcurrentperiodindex);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void add(int i, getCurrentPeriodIndex<?> getcurrentperiodindex) {
        RemoteActionCompatParcelizer();
        super.add(i, getcurrentperiodindex);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends getCurrentPeriodIndex<?>> collection) {
        size();
        collection.size();
        RemoteActionCompatParcelizer();
        return super.addAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends getCurrentPeriodIndex<?>> collection) {
        collection.size();
        RemoteActionCompatParcelizer();
        return super.addAll(i, collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final getCurrentPeriodIndex<?> remove(int i) {
        read();
        return (getCurrentPeriodIndex) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        read();
        super.remove(iIndexOf);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (isEmpty()) {
            return;
        }
        size();
        read();
        super.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    protected void removeRange(int i, int i2) {
        if (i == i2) {
            return;
        }
        read();
        super.removeRange(i, i2);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        Iterator<getCurrentPeriodIndex<?>> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        Iterator<getCurrentPeriodIndex<?>> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<getCurrentPeriodIndex<?>> iterator() {
        return new IconCompatParcelizer(this, (byte) 0);
    }

    class IconCompatParcelizer implements Iterator<getCurrentPeriodIndex<?>> {
        int IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        int read;

        private IconCompatParcelizer() {
            this.read = -1;
            this.RemoteActionCompatParcelizer = ((AbstractList) getShuffleModeEnabled.this).modCount;
        }

        /* synthetic */ IconCompatParcelizer(getShuffleModeEnabled getshufflemodeenabled, byte b) {
            this();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.IconCompatParcelizer != getShuffleModeEnabled.this.size();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public getCurrentPeriodIndex<?> next() {
            read();
            int i = this.IconCompatParcelizer;
            this.IconCompatParcelizer = i + 1;
            this.read = i;
            return getShuffleModeEnabled.this.get(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.read < 0) {
                throw new IllegalStateException();
            }
            read();
            try {
                getShuffleModeEnabled.this.remove(this.read);
                this.IconCompatParcelizer = this.read;
                this.read = -1;
                this.RemoteActionCompatParcelizer = ((AbstractList) getShuffleModeEnabled.this).modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        final void read() {
            if (((AbstractList) getShuffleModeEnabled.this).modCount != this.RemoteActionCompatParcelizer) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public ListIterator<getCurrentPeriodIndex<?>> listIterator() {
        return new RemoteActionCompatParcelizer(0);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public ListIterator<getCurrentPeriodIndex<?>> listIterator(int i) {
        return new RemoteActionCompatParcelizer(i);
    }

    class RemoteActionCompatParcelizer extends IconCompatParcelizer implements ListIterator<getCurrentPeriodIndex<?>> {
        RemoteActionCompatParcelizer(int i) {
            super(getShuffleModeEnabled.this, (byte) 0);
            this.IconCompatParcelizer = i;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.IconCompatParcelizer != 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.IconCompatParcelizer;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.IconCompatParcelizer - 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public getCurrentPeriodIndex<?> previous() {
            read();
            int i = this.IconCompatParcelizer - 1;
            if (i < 0) {
                throw new NoSuchElementException();
            }
            this.IconCompatParcelizer = i;
            this.read = i;
            return getShuffleModeEnabled.this.get(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public void set(getCurrentPeriodIndex<?> getcurrentperiodindex) {
            if (this.read < 0) {
                throw new IllegalStateException();
            }
            read();
            try {
                getShuffleModeEnabled.this.set(this.read, getcurrentperiodindex);
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public void add(getCurrentPeriodIndex<?> getcurrentperiodindex) {
            read();
            try {
                int i = this.IconCompatParcelizer;
                getShuffleModeEnabled.this.add(i, getcurrentperiodindex);
                this.IconCompatParcelizer = i + 1;
                this.read = -1;
                this.RemoteActionCompatParcelizer = ((AbstractList) getShuffleModeEnabled.this).modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public List<getCurrentPeriodIndex<?>> subList(int i, int i2) {
        if (i < 0 || i2 > size()) {
            throw new IndexOutOfBoundsException();
        }
        if (i <= i2) {
            return new AudioAttributesCompatParcelizer(this, i, i2);
        }
        throw new IllegalArgumentException();
    }

    static class AudioAttributesCompatParcelizer extends AbstractList<getCurrentPeriodIndex<?>> {
        private int IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private final getShuffleModeEnabled write;

        /* JADX INFO: renamed from: o.getShuffleModeEnabled$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer, reason: collision with other inner class name */
        static final class C0105AudioAttributesCompatParcelizer implements ListIterator<getCurrentPeriodIndex<?>> {
            private int AudioAttributesCompatParcelizer;
            private int IconCompatParcelizer;
            private final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;
            private final ListIterator<getCurrentPeriodIndex<?>> read;

            C0105AudioAttributesCompatParcelizer(ListIterator<getCurrentPeriodIndex<?>> listIterator, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, int i, int i2) {
                this.read = listIterator;
                this.RemoteActionCompatParcelizer = audioAttributesCompatParcelizer;
                this.IconCompatParcelizer = i;
                this.AudioAttributesCompatParcelizer = i + i2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.ListIterator
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public void add(getCurrentPeriodIndex<?> getcurrentperiodindex) {
                this.read.add(getcurrentperiodindex);
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(true);
                this.AudioAttributesCompatParcelizer++;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.read.nextIndex() < this.AudioAttributesCompatParcelizer;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.read.previousIndex() >= this.IconCompatParcelizer;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.ListIterator, java.util.Iterator
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public getCurrentPeriodIndex<?> next() {
                if (this.read.nextIndex() < this.AudioAttributesCompatParcelizer) {
                    return this.read.next();
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.read.nextIndex() - this.IconCompatParcelizer;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.ListIterator
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public getCurrentPeriodIndex<?> previous() {
                if (this.read.previousIndex() >= this.IconCompatParcelizer) {
                    return this.read.previous();
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                int iPreviousIndex = this.read.previousIndex();
                int i = this.IconCompatParcelizer;
                if (iPreviousIndex >= i) {
                    return iPreviousIndex - i;
                }
                return -1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                this.read.remove();
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(false);
                this.AudioAttributesCompatParcelizer--;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.ListIterator
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public void set(getCurrentPeriodIndex<?> getcurrentperiodindex) {
                this.read.set(getcurrentperiodindex);
            }
        }

        AudioAttributesCompatParcelizer(getShuffleModeEnabled getshufflemodeenabled, int i, int i2) {
            this.write = getshufflemodeenabled;
            ((AbstractList) this).modCount = ((AbstractList) getshufflemodeenabled).modCount;
            this.IconCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = i2 - i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public void add(int i, getCurrentPeriodIndex<?> getcurrentperiodindex) {
            if (((AbstractList) this).modCount == ((AbstractList) this.write).modCount) {
                if (i >= 0 && i <= this.RemoteActionCompatParcelizer) {
                    this.write.add(i + this.IconCompatParcelizer, getcurrentperiodindex);
                    this.RemoteActionCompatParcelizer++;
                    ((AbstractList) this).modCount = ((AbstractList) this.write).modCount;
                    return;
                }
                throw new IndexOutOfBoundsException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i, Collection<? extends getCurrentPeriodIndex<?>> collection) {
            if (((AbstractList) this).modCount == ((AbstractList) this.write).modCount) {
                if (i >= 0 && i <= this.RemoteActionCompatParcelizer) {
                    boolean zAddAll = this.write.addAll(i + this.IconCompatParcelizer, collection);
                    if (zAddAll) {
                        this.RemoteActionCompatParcelizer += collection.size();
                        ((AbstractList) this).modCount = ((AbstractList) this.write).modCount;
                    }
                    return zAddAll;
                }
                throw new IndexOutOfBoundsException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(Collection<? extends getCurrentPeriodIndex<?>> collection) {
            if (((AbstractList) this).modCount == ((AbstractList) this.write).modCount) {
                boolean zAddAll = this.write.addAll(this.IconCompatParcelizer + this.RemoteActionCompatParcelizer, collection);
                if (zAddAll) {
                    this.RemoteActionCompatParcelizer += collection.size();
                    ((AbstractList) this).modCount = ((AbstractList) this.write).modCount;
                }
                return zAddAll;
            }
            throw new ConcurrentModificationException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public getCurrentPeriodIndex<?> get(int i) {
            if (((AbstractList) this).modCount == ((AbstractList) this.write).modCount) {
                if (i >= 0 && i < this.RemoteActionCompatParcelizer) {
                    return this.write.get(i + this.IconCompatParcelizer);
                }
                throw new IndexOutOfBoundsException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<getCurrentPeriodIndex<?>> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<getCurrentPeriodIndex<?>> listIterator(int i) {
            if (((AbstractList) this).modCount == ((AbstractList) this.write).modCount) {
                if (i >= 0 && i <= this.RemoteActionCompatParcelizer) {
                    return new C0105AudioAttributesCompatParcelizer(this.write.listIterator(i + this.IconCompatParcelizer), this, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer);
                }
                throw new IndexOutOfBoundsException();
            }
            throw new ConcurrentModificationException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public getCurrentPeriodIndex<?> remove(int i) {
            if (((AbstractList) this).modCount == ((AbstractList) this.write).modCount) {
                if (i >= 0 && i < this.RemoteActionCompatParcelizer) {
                    getCurrentPeriodIndex<?> getcurrentperiodindexRemove = this.write.remove(i + this.IconCompatParcelizer);
                    this.RemoteActionCompatParcelizer--;
                    ((AbstractList) this).modCount = ((AbstractList) this.write).modCount;
                    return getcurrentperiodindexRemove;
                }
                throw new IndexOutOfBoundsException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractList
        protected final void removeRange(int i, int i2) {
            if (i != i2) {
                if (((AbstractList) this).modCount == ((AbstractList) this.write).modCount) {
                    getShuffleModeEnabled getshufflemodeenabled = this.write;
                    int i3 = this.IconCompatParcelizer;
                    getshufflemodeenabled.removeRange(i + i3, i3 + i2);
                    this.RemoteActionCompatParcelizer -= i2 - i;
                    ((AbstractList) this).modCount = ((AbstractList) this.write).modCount;
                    return;
                }
                throw new ConcurrentModificationException();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public getCurrentPeriodIndex<?> set(int i, getCurrentPeriodIndex<?> getcurrentperiodindex) {
            if (((AbstractList) this).modCount == ((AbstractList) this.write).modCount) {
                if (i >= 0 && i < this.RemoteActionCompatParcelizer) {
                    return this.write.set(i + this.IconCompatParcelizer, getcurrentperiodindex);
                }
                throw new IndexOutOfBoundsException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            if (((AbstractList) this).modCount == ((AbstractList) this.write).modCount) {
                return this.RemoteActionCompatParcelizer;
            }
            throw new ConcurrentModificationException();
        }

        final void AudioAttributesCompatParcelizer(boolean z) {
            if (z) {
                this.RemoteActionCompatParcelizer++;
            } else {
                this.RemoteActionCompatParcelizer--;
            }
            ((AbstractList) this).modCount = ((AbstractList) this.write).modCount;
        }
    }
}
