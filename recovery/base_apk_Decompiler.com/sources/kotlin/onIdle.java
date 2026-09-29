package kotlin;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class onIdle extends AbstractList<String> implements isInitialized, RandomAccess {
    private final isInitialized RemoteActionCompatParcelizer;

    @Override // kotlin.isInitialized
    public final isInitialized IconCompatParcelizer() {
        return this;
    }

    public onIdle(isInitialized isinitialized) {
        this.RemoteActionCompatParcelizer = isinitialized;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public String get(int i) {
        return (String) this.RemoteActionCompatParcelizer.get(i);
    }

    @Override // kotlin.isInitialized
    public final Object IconCompatParcelizer(int i) {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.RemoteActionCompatParcelizer.size();
    }

    @Override // kotlin.isInitialized
    public final void AudioAttributesCompatParcelizer(DownloadIndex downloadIndex) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new ListIterator<String>(i) { // from class: o.onIdle.1
            private /* synthetic */ int AudioAttributesCompatParcelizer;
            private ListIterator<String> IconCompatParcelizer;

            {
                this.AudioAttributesCompatParcelizer = i;
                this.IconCompatParcelizer = onIdle.this.RemoteActionCompatParcelizer.listIterator(i);
            }

            @Override // java.util.ListIterator
            public final /* synthetic */ void add(String str) {
                AudioAttributesCompatParcelizer();
            }

            @Override // java.util.ListIterator
            public final /* synthetic */ void set(String str) {
                RemoteActionCompatParcelizer();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.IconCompatParcelizer.hasNext();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.ListIterator, java.util.Iterator
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public String next() {
                return this.IconCompatParcelizer.next();
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.IconCompatParcelizer.hasPrevious();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.ListIterator
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public String previous() {
                return this.IconCompatParcelizer.previous();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.IconCompatParcelizer.nextIndex();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.IconCompatParcelizer.previousIndex();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }

            private static void RemoteActionCompatParcelizer() {
                throw new UnsupportedOperationException();
            }

            private static void AudioAttributesCompatParcelizer() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new Iterator<String>() { // from class: o.onIdle.3
            private Iterator<String> write;

            {
                this.write = onIdle.this.RemoteActionCompatParcelizer.iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.write.hasNext();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Iterator
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public String next() {
                return this.write.next();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override // kotlin.isInitialized
    public final List<?> write() {
        return this.RemoteActionCompatParcelizer.write();
    }
}
