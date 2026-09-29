package kotlin;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class isGuessed extends AbstractList<String> implements RandomAccess, toJSONArray {
    private final toJSONArray RemoteActionCompatParcelizer;

    @Override // kotlin.toJSONArray
    public final toJSONArray IconCompatParcelizer() {
        return this;
    }

    public isGuessed(toJSONArray tojsonarray) {
        this.RemoteActionCompatParcelizer = tojsonarray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public String get(int i) {
        return (String) this.RemoteActionCompatParcelizer.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.RemoteActionCompatParcelizer.size();
    }

    @Override // kotlin.toJSONArray
    public final setVideoAspectRatio write(int i) {
        return this.RemoteActionCompatParcelizer.write(i);
    }

    @Override // kotlin.toJSONArray
    public final void write(setVideoAspectRatio setvideoaspectratio) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new ListIterator<String>(i) { // from class: o.isGuessed.2
            private ListIterator<String> read;
            private /* synthetic */ int write;

            {
                this.write = i;
                this.read = isGuessed.this.RemoteActionCompatParcelizer.listIterator(i);
            }

            @Override // java.util.ListIterator
            public final /* synthetic */ void add(String str) {
                IconCompatParcelizer();
            }

            @Override // java.util.ListIterator
            public final /* synthetic */ void set(String str) {
                read();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.read.hasNext();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.ListIterator, java.util.Iterator
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public String next() {
                return this.read.next();
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.read.hasPrevious();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.ListIterator
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public String previous() {
                return this.read.previous();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.read.nextIndex();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.read.previousIndex();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }

            private static void read() {
                throw new UnsupportedOperationException();
            }

            private static void IconCompatParcelizer() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new Iterator<String>() { // from class: o.isGuessed.3
            private Iterator<String> write;

            {
                this.write = isGuessed.this.RemoteActionCompatParcelizer.iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.write.hasNext();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Iterator
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public String next() {
                return this.write.next();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override // kotlin.toJSONArray
    public final List<?> RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }
}
