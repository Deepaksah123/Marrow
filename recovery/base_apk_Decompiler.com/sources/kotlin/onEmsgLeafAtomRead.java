package kotlin;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import kotlin.getNextTrackBundle;

/* JADX INFO: loaded from: classes3.dex */
public abstract class onEmsgLeafAtomRead<E> extends getNextTrackBundle<E> implements Set<E> {
    private transient initExtraTracks<E> AudioAttributesCompatParcelizer;

    private static boolean IconCompatParcelizer(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    boolean AudioAttributesImplApi26Parcelizer() {
        return false;
    }

    @Override // kotlin.getNextTrackBundle, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public static <E> onEmsgLeafAtomRead<E> MediaBrowserCompatCustomActionResultReceiver() {
        return shouldParseContainerAtom.IconCompatParcelizer;
    }

    public static <E> onEmsgLeafAtomRead<E> RemoteActionCompatParcelizer(E e) {
        return new FragmentedMp4ExtractorExternalSyntheticLambda0(e);
    }

    public static <E> onEmsgLeafAtomRead<E> IconCompatParcelizer(E e, E e2) {
        return AudioAttributesCompatParcelizer(2, e, e2);
    }

    public static <E> onEmsgLeafAtomRead<E> write(E e, E e2, E e3) {
        return AudioAttributesCompatParcelizer(3, e, e2, e3);
    }

    public static <E> onEmsgLeafAtomRead<E> write(E e, E e2, E e3, E e4, E e5) {
        return AudioAttributesCompatParcelizer(5, e, e2, e3, e4, e5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> onEmsgLeafAtomRead<E> AudioAttributesCompatParcelizer(int i, Object... objArr) {
        if (i == 0) {
            return MediaBrowserCompatCustomActionResultReceiver();
        }
        if (i == 1) {
            return RemoteActionCompatParcelizer(Objects.requireNonNull(objArr[0]));
        }
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i);
        Object[] objArr2 = new Object[iAudioAttributesCompatParcelizer];
        int i2 = iAudioAttributesCompatParcelizer - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object objWrite = parseUuid.write(objArr[i5], i5);
            int iHashCode = objWrite.hashCode();
            int i6 = getDefaultSampleValues.read(iHashCode);
            while (true) {
                int i7 = i6 & i2;
                Object obj = objArr2[i7];
                if (obj == null) {
                    objArr[i4] = objWrite;
                    objArr2[i7] = objWrite;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj.equals(objWrite)) {
                    break;
                }
                i6++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            return new FragmentedMp4ExtractorExternalSyntheticLambda0(Objects.requireNonNull(objArr[0]));
        }
        if (AudioAttributesCompatParcelizer(i4) < iAudioAttributesCompatParcelizer / 2) {
            return AudioAttributesCompatParcelizer(i4, objArr);
        }
        if (IconCompatParcelizer(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new shouldParseContainerAtom(objArr, i3, objArr2, i2, i4);
    }

    static int AudioAttributesCompatParcelizer(int i) {
        int iMax = Math.max(i, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (((double) iHighestOneBit) * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
            return iHighestOneBit;
        }
        parseStsd.write(iMax < 1073741824, "collection too large");
        return 1073741824;
    }

    public static <E> onEmsgLeafAtomRead<E> RemoteActionCompatParcelizer(Collection<? extends E> collection) {
        if ((collection instanceof onEmsgLeafAtomRead) && !(collection instanceof SortedSet)) {
            onEmsgLeafAtomRead<E> onemsgleafatomread = (onEmsgLeafAtomRead) collection;
            if (!onemsgleafatomread.IconCompatParcelizer()) {
                return onemsgleafatomread;
            }
        }
        Object[] array = collection.toArray();
        return AudioAttributesCompatParcelizer(array.length, array);
    }

    public static <E> onEmsgLeafAtomRead<E> RemoteActionCompatParcelizer(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return MediaBrowserCompatCustomActionResultReceiver();
        }
        if (length == 1) {
            return RemoteActionCompatParcelizer(eArr[0]);
        }
        return AudioAttributesCompatParcelizer(eArr.length, (Object[]) eArr.clone());
    }

    onEmsgLeafAtomRead() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof onEmsgLeafAtomRead) && AudioAttributesImplApi26Parcelizer() && ((onEmsgLeafAtomRead) obj).AudioAttributesImplApi26Parcelizer() && hashCode() != obj.hashCode()) {
            return false;
        }
        return modifyTrack.RemoteActionCompatParcelizer(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return modifyTrack.AudioAttributesCompatParcelizer(this);
    }

    @Override // kotlin.getNextTrackBundle
    public initExtraTracks<E> read() {
        initExtraTracks<E> initextratracks = this.AudioAttributesCompatParcelizer;
        if (initextratracks != null) {
            return initextratracks;
        }
        initExtraTracks<E> initextratracksAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        this.AudioAttributesCompatParcelizer = initextratracksAudioAttributesImplBaseParcelizer;
        return initextratracksAudioAttributesImplBaseParcelizer;
    }

    initExtraTracks<E> AudioAttributesImplBaseParcelizer() {
        return initExtraTracks.AudioAttributesCompatParcelizer(toArray());
    }

    /* JADX INFO: loaded from: classes5.dex */
    static class write implements Serializable {
        private Object[] read;

        write(Object[] objArr) {
            this.read = objArr;
        }

        final Object readResolve() {
            return onEmsgLeafAtomRead.RemoteActionCompatParcelizer(this.read);
        }
    }

    @Override // kotlin.getNextTrackBundle
    Object writeReplace() {
        return new write(toArray());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E> IconCompatParcelizer<E> MediaBrowserCompatItemReceiver() {
        return new IconCompatParcelizer<>();
    }

    public static class IconCompatParcelizer<E> extends getNextTrackBundle.AudioAttributesCompatParcelizer<E> {
        private Object[] read;

        public IconCompatParcelizer() {
            super(4);
        }

        @Override // o.getNextTrackBundle.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final IconCompatParcelizer<E> read(E e) {
            this.read = null;
            super.read(e);
            return this;
        }

        @Override // o.getNextTrackBundle.AudioAttributesCompatParcelizer, o.getNextTrackBundle.read
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
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

        public final IconCompatParcelizer<E> IconCompatParcelizer(Iterator<? extends E> it) {
            while (it.hasNext()) {
                RemoteActionCompatParcelizer(it.next());
            }
            return this;
        }

        public final onEmsgLeafAtomRead<E> write() {
            int i = this.write;
            if (i == 0) {
                return onEmsgLeafAtomRead.MediaBrowserCompatCustomActionResultReceiver();
            }
            if (i != 1) {
                onEmsgLeafAtomRead<E> onemsgleafatomreadAudioAttributesCompatParcelizer = onEmsgLeafAtomRead.AudioAttributesCompatParcelizer(this.write, this.IconCompatParcelizer);
                this.write = onemsgleafatomreadAudioAttributesCompatParcelizer.size();
                this.AudioAttributesCompatParcelizer = true;
                this.read = null;
                return onemsgleafatomreadAudioAttributesCompatParcelizer;
            }
            return onEmsgLeafAtomRead.RemoteActionCompatParcelizer(Objects.requireNonNull(this.IconCompatParcelizer[0]));
        }
    }
}
