package kotlin;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class hasSetter extends AbstractList<String> implements isFactoryMethod, RandomAccess {
    private final isFactoryMethod AudioAttributesCompatParcelizer;

    @Override // kotlin.isFactoryMethod
    public final isFactoryMethod write() {
        return this;
    }

    public hasSetter(isFactoryMethod isfactorymethod) {
        this.AudioAttributesCompatParcelizer = isfactorymethod;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public String get(int i) {
        return (String) this.AudioAttributesCompatParcelizer.get(i);
    }

    @Override // kotlin.isFactoryMethod
    public final Object RemoteActionCompatParcelizer(int i) {
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.AudioAttributesCompatParcelizer.size();
    }

    @Override // kotlin.isFactoryMethod
    public final void IconCompatParcelizer(AnnotatedWithParams annotatedWithParams) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new ListIterator<String>(i) { // from class: o.hasSetter.2
            private ListIterator<String> IconCompatParcelizer;
            final /* synthetic */ int RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = i;
                this.IconCompatParcelizer = hasSetter.this.AudioAttributesCompatParcelizer.listIterator(i);
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
                return this.IconCompatParcelizer.hasNext();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.ListIterator, java.util.Iterator
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public String next() {
                return this.IconCompatParcelizer.next();
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.IconCompatParcelizer.hasPrevious();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.ListIterator
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
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
        return new Iterator<String>() { // from class: o.hasSetter.1
            private Iterator<String> read;

            {
                this.read = hasSetter.this.AudioAttributesCompatParcelizer.iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.read.hasNext();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Iterator
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public String next() {
                return this.read.next();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override // kotlin.isFactoryMethod
    public final List<?> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }
}
