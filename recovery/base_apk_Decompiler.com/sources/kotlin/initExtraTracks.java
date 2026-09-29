package kotlin;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.getNextTrackBundle;

/* JADX INFO: loaded from: classes3.dex */
public abstract class initExtraTracks<E> extends getNextTrackBundle<E> implements List<E>, RandomAccess {
    private static final FragmentedMp4ExtractorTrackBundle<Object> write = new read(parseTraf.write, 0);

    @Override // kotlin.getNextTrackBundle
    @Deprecated
    public final initExtraTracks<E> read() {
        return this;
    }

    @Override // kotlin.getNextTrackBundle, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public static <E> initExtraTracks<E> AudioAttributesImplApi26Parcelizer() {
        return (initExtraTracks<E>) parseTraf.write;
    }

    public static <E> initExtraTracks<E> read(E e) {
        return RemoteActionCompatParcelizer(e);
    }

    public static <E> initExtraTracks<E> AudioAttributesCompatParcelizer(E e, E e2) {
        return RemoteActionCompatParcelizer(e, e2);
    }

    public static <E> initExtraTracks<E> write(E e, E e2, E e3) {
        return RemoteActionCompatParcelizer(e, e2, e3);
    }

    public static <E> initExtraTracks<E> read(E e, E e2, E e3, E e4, E e5) {
        return RemoteActionCompatParcelizer(e, e2, e3, e4, e5);
    }

    @SafeVarargs
    public static <E> initExtraTracks<E> RemoteActionCompatParcelizer(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E... eArr) {
        int length = eArr.length;
        parseStsd.write(true, (Object) "the total number of elements must fit in an int");
        int length2 = eArr.length;
        Object[] objArr = new Object[PsExtractor.AUDIO_STREAM];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        objArr[6] = e7;
        objArr[7] = e8;
        objArr[8] = e9;
        objArr[9] = e10;
        objArr[10] = e11;
        objArr[11] = e12;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        return RemoteActionCompatParcelizer(objArr);
    }

    public static <E> initExtraTracks<E> write(Collection<? extends E> collection) {
        if (collection instanceof getNextTrackBundle) {
            initExtraTracks<E> initextratracks = ((getNextTrackBundle) collection).read();
            return initextratracks.IconCompatParcelizer() ? AudioAttributesCompatParcelizer(initextratracks.toArray()) : initextratracks;
        }
        return RemoteActionCompatParcelizer(collection.toArray());
    }

    public static <E> initExtraTracks<E> write(E[] eArr) {
        if (eArr.length == 0) {
            return AudioAttributesImplApi26Parcelizer();
        }
        return RemoteActionCompatParcelizer((Object[]) eArr.clone());
    }

    public static <E> initExtraTracks<E> write(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Object[] objArrIconCompatParcelizer = onMoofContainerAtomRead.IconCompatParcelizer(iterable);
        parseUuid.write(objArrIconCompatParcelizer);
        Arrays.sort(objArrIconCompatParcelizer, comparator);
        return AudioAttributesCompatParcelizer(objArrIconCompatParcelizer);
    }

    private static <E> initExtraTracks<E> RemoteActionCompatParcelizer(Object... objArr) {
        return AudioAttributesCompatParcelizer(parseUuid.write(objArr));
    }

    static <E> initExtraTracks<E> AudioAttributesCompatParcelizer(Object[] objArr) {
        return read(objArr, objArr.length);
    }

    static <E> initExtraTracks<E> read(Object[] objArr, int i) {
        if (i == 0) {
            return AudioAttributesImplApi26Parcelizer();
        }
        return new parseTraf(objArr, i);
    }

    initExtraTracks() {
    }

    @Override // kotlin.getNextTrackBundle
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
    public final getCurrentSampleFlags<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: merged with bridge method [inline-methods] */
    public final FragmentedMp4ExtractorTrackBundle<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final FragmentedMp4ExtractorTrackBundle<E> listIterator(int i) {
        parseStsd.read(i, size());
        if (isEmpty()) {
            return (FragmentedMp4ExtractorTrackBundle<E>) write;
        }
        return new read(this, i);
    }

    static class read<E> extends AtomParsersMvhdInfo<E> {
        private final initExtraTracks<E> read;

        read(initExtraTracks<E> initextratracks, int i) {
            super(initextratracks.size(), i);
            this.read = initextratracks;
        }

        @Override // kotlin.AtomParsersMvhdInfo
        protected final E RemoteActionCompatParcelizer(int i) {
            return this.read.get(i);
        }
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return parseMehd.RemoteActionCompatParcelizer(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return parseMehd.IconCompatParcelizer(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public initExtraTracks<E> subList(int i, int i2) {
        parseStsd.read(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return AudioAttributesImplApi26Parcelizer();
        }
        return RemoteActionCompatParcelizer(i, i2);
    }

    private initExtraTracks<E> RemoteActionCompatParcelizer(int i, int i2) {
        return new write(i, i2 - i);
    }

    class write extends initExtraTracks<E> {
        private transient int RemoteActionCompatParcelizer;
        private transient int write;

        @Override // kotlin.getNextTrackBundle
        final boolean IconCompatParcelizer() {
            return true;
        }

        @Override // kotlin.initExtraTracks, kotlin.getNextTrackBundle, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // kotlin.initExtraTracks, java.util.List
        public final /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // kotlin.initExtraTracks, java.util.List
        public final /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }

        @Override // kotlin.initExtraTracks, java.util.List
        public final /* synthetic */ List subList(int i, int i2) {
            return subList(i, i2);
        }

        write(int i, int i2) {
            this.RemoteActionCompatParcelizer = i;
            this.write = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.write;
        }

        @Override // kotlin.getNextTrackBundle
        final Object[] AudioAttributesCompatParcelizer() {
            return initExtraTracks.this.AudioAttributesCompatParcelizer();
        }

        @Override // kotlin.getNextTrackBundle
        final int write() {
            return initExtraTracks.this.write() + this.RemoteActionCompatParcelizer;
        }

        @Override // kotlin.getNextTrackBundle
        final int RemoteActionCompatParcelizer() {
            return initExtraTracks.this.write() + this.RemoteActionCompatParcelizer + this.write;
        }

        @Override // java.util.List
        public final E get(int i) {
            parseStsd.write(i, this.write);
            return initExtraTracks.this.get(i + this.RemoteActionCompatParcelizer);
        }

        @Override // kotlin.initExtraTracks
        /* JADX INFO: renamed from: write */
        public final initExtraTracks<E> subList(int i, int i2) {
            parseStsd.read(i, i2, this.write);
            initExtraTracks initextratracks = initExtraTracks.this;
            int i3 = this.RemoteActionCompatParcelizer;
            return initextratracks.subList(i + i3, i2 + i3);
        }

        @Override // kotlin.initExtraTracks, kotlin.getNextTrackBundle
        final Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.getNextTrackBundle
    int IconCompatParcelizer(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return parseMehd.read(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    /* JADX INFO: loaded from: classes5.dex */
    static class RemoteActionCompatParcelizer implements Serializable {
        private Object[] AudioAttributesCompatParcelizer;

        RemoteActionCompatParcelizer(Object[] objArr) {
            this.AudioAttributesCompatParcelizer = objArr;
        }

        final Object readResolve() {
            return initExtraTracks.write(this.AudioAttributesCompatParcelizer);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // kotlin.getNextTrackBundle
    Object writeReplace() {
        return new RemoteActionCompatParcelizer(toArray());
    }

    public static <E> IconCompatParcelizer<E> MediaBrowserCompatCustomActionResultReceiver() {
        return new IconCompatParcelizer<>();
    }

    public static <E> IconCompatParcelizer<E> write(int i) {
        FixedSampleSizeRechunker.IconCompatParcelizer(i, "expectedSize");
        return new IconCompatParcelizer<>(i);
    }

    public static final class IconCompatParcelizer<E> extends getNextTrackBundle.AudioAttributesCompatParcelizer<E> {
        public IconCompatParcelizer() {
            this(4);
        }

        IconCompatParcelizer(int i) {
            super(i);
        }

        @Override // o.getNextTrackBundle.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final IconCompatParcelizer<E> read(E e) {
            super.read(e);
            return this;
        }

        @Override // o.getNextTrackBundle.AudioAttributesCompatParcelizer, o.getNextTrackBundle.read
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final IconCompatParcelizer<E> read(E... eArr) {
            super.read((Object[]) eArr);
            return this;
        }

        @Override // o.getNextTrackBundle.AudioAttributesCompatParcelizer, o.getNextTrackBundle.read
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final IconCompatParcelizer<E> RemoteActionCompatParcelizer(Iterable<? extends E> iterable) {
            super.RemoteActionCompatParcelizer((Iterable) iterable);
            return this;
        }

        public final initExtraTracks<E> IconCompatParcelizer() {
            this.AudioAttributesCompatParcelizer = true;
            return initExtraTracks.read(this.IconCompatParcelizer, this.write);
        }
    }
}
