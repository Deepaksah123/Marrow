package kotlin;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.initExtraTracks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getNextTrackBundle<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] read = new Object[0];

    Object[] AudioAttributesCompatParcelizer() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: merged with bridge method [inline-methods] */
    public abstract getCurrentSampleFlags<E> iterator();

    abstract boolean IconCompatParcelizer();

    getNextTrackBundle() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(read);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            Object[] objArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            if (objArrAudioAttributesCompatParcelizer != null) {
                return (T[]) parseTrex.RemoteActionCompatParcelizer(objArrAudioAttributesCompatParcelizer, write(), RemoteActionCompatParcelizer(), tArr);
            }
            tArr = (T[]) parseUuid.write((Object[]) tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        IconCompatParcelizer(tArr, 0);
        return tArr;
    }

    int write() {
        throw new UnsupportedOperationException();
    }

    int RemoteActionCompatParcelizer() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public initExtraTracks<E> read() {
        return isEmpty() ? initExtraTracks.AudioAttributesImplApi26Parcelizer() : initExtraTracks.AudioAttributesCompatParcelizer(toArray());
    }

    int IconCompatParcelizer(Object[] objArr, int i) {
        getCurrentSampleFlags<E> it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    Object writeReplace() {
        return new initExtraTracks.RemoteActionCompatParcelizer(toArray());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static abstract class read<E> {
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
        public abstract read<E> read(E e);

        static int write(int i, int i2) {
            if (i2 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i + (i >> 1) + 1;
            if (iHighestOneBit < i2) {
                iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        read() {
        }

        public read<E> read(E... eArr) {
            for (E e : eArr) {
                read(e);
            }
            return this;
        }

        public read<E> RemoteActionCompatParcelizer(Iterable<? extends E> iterable) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                read(it.next());
            }
            return this;
        }
    }

    static abstract class AudioAttributesCompatParcelizer<E> extends read<E> {
        boolean AudioAttributesCompatParcelizer;
        Object[] IconCompatParcelizer;
        int write;

        AudioAttributesCompatParcelizer(int i) {
            FixedSampleSizeRechunker.IconCompatParcelizer(i, "initialCapacity");
            this.IconCompatParcelizer = new Object[i];
            this.write = 0;
        }

        private void read(int i) {
            Object[] objArr = this.IconCompatParcelizer;
            if (objArr.length < i) {
                this.IconCompatParcelizer = Arrays.copyOf(objArr, write(objArr.length, i));
                this.AudioAttributesCompatParcelizer = false;
            } else if (this.AudioAttributesCompatParcelizer) {
                this.IconCompatParcelizer = (Object[]) objArr.clone();
                this.AudioAttributesCompatParcelizer = false;
            }
        }

        @Override // o.getNextTrackBundle.read
        public AudioAttributesCompatParcelizer<E> read(E e) {
            read(this.write + 1);
            Object[] objArr = this.IconCompatParcelizer;
            int i = this.write;
            this.write = i + 1;
            objArr[i] = e;
            return this;
        }

        @Override // o.getNextTrackBundle.read
        public read<E> read(E... eArr) {
            IconCompatParcelizer(eArr, eArr.length);
            return this;
        }

        private void IconCompatParcelizer(Object[] objArr, int i) {
            parseUuid.RemoteActionCompatParcelizer(objArr, i);
            read(this.write + i);
            System.arraycopy(objArr, 0, this.IconCompatParcelizer, this.write, i);
            this.write += i;
        }

        @Override // o.getNextTrackBundle.read
        public read<E> RemoteActionCompatParcelizer(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                read(this.write + collection.size());
                if (collection instanceof getNextTrackBundle) {
                    this.write = ((getNextTrackBundle) collection).IconCompatParcelizer(this.IconCompatParcelizer, this.write);
                    return this;
                }
            }
            super.RemoteActionCompatParcelizer((Iterable) iterable);
            return this;
        }
    }
}
