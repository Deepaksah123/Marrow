package kotlin;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class Tag<T> extends AbstractSet<T> {
    public static final write RemoteActionCompatParcelizer = new write(0);
    private int IconCompatParcelizer;
    private Object read;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return read();
    }

    public static final class write {
        private write() {
        }

        @getMagicModuleMeta
        public static <T> Tag<T> AudioAttributesCompatParcelizer() {
            return new Tag<>((byte) 0);
        }

        @getMagicModuleMeta
        public static <T> Tag<T> write(Collection<? extends T> collection) {
            toMagicModuleMetaRepoModel.write(collection, "");
            Tag<T> tag = new Tag<>((byte) 0);
            tag.addAll(collection);
            return tag;
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    private Tag() {
    }

    private int read() {
        return this.IconCompatParcelizer;
    }

    private void read(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new read(this.read);
        }
        if (size() < 5) {
            Object obj = this.read;
            toMagicModuleMetaRepoModel.read(obj, "");
            return new RemoteActionCompatParcelizer((Object[]) obj);
        }
        Object obj2 = this.read;
        toMagicModuleMetaRepoModel.read(obj2, "");
        return toMagicModuleStatsLSModel.MediaBrowserCompatCustomActionResultReceiver(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(T t) {
        Object obj;
        if (size() == 0) {
            this.read = t;
        } else if (size() == 1) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, t)) {
                return false;
            }
            this.read = new Object[]{this.read, t};
        } else if (size() < 5) {
            Object obj2 = this.read;
            toMagicModuleMetaRepoModel.read(obj2, "");
            Object[] objArr = (Object[]) obj2;
            if (getOrderDetails.AudioAttributesCompatParcelizer(objArr, t)) {
                return false;
            }
            if (size() == 4) {
                LinkedHashSet linkedHashSetRemoteActionCompatParcelizer = getKycMessage.RemoteActionCompatParcelizer(Arrays.copyOf(objArr, objArr.length));
                linkedHashSetRemoteActionCompatParcelizer.add(t);
                obj = linkedHashSetRemoteActionCompatParcelizer;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
                objArrCopyOf[objArrCopyOf.length - 1] = t;
                obj = objArrCopyOf;
            }
            this.read = obj;
        } else {
            Object obj3 = this.read;
            toMagicModuleMetaRepoModel.read(obj3, "");
            if (!toMagicModuleStatsLSModel.MediaBrowserCompatCustomActionResultReceiver(obj3).add(t)) {
                return false;
            }
        }
        read(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.read = null;
        read(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, obj);
        }
        if (size() < 5) {
            Object obj2 = this.read;
            toMagicModuleMetaRepoModel.read(obj2, "");
            return getOrderDetails.AudioAttributesCompatParcelizer((Object[]) obj2, obj);
        }
        Object obj3 = this.read;
        toMagicModuleMetaRepoModel.read(obj3, "");
        return ((Set) obj3).contains(obj);
    }

    static final class read<T> implements Iterator<T>, isModuleGeneratedVisible {
        private final T IconCompatParcelizer;
        private boolean read = true;

        public read(T t) {
            this.IconCompatParcelizer = t;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void remove() {
            write();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.read) {
                this.read = false;
                return this.IconCompatParcelizer;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.read;
        }

        private static Void write() {
            throw new UnsupportedOperationException();
        }
    }

    public /* synthetic */ Tag(byte b) {
        this();
    }

    @getMagicModuleMeta
    public static final <T> Tag<T> RemoteActionCompatParcelizer() {
        return write.AudioAttributesCompatParcelizer();
    }

    static final class RemoteActionCompatParcelizer<T> implements Iterator<T>, isModuleGeneratedVisible {
        private final Iterator<T> RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(T[] tArr) {
            toMagicModuleMetaRepoModel.write(tArr, "");
            this.RemoteActionCompatParcelizer = r8lambda_QgM1da7JykGH9FQp_oipiZItrY.AudioAttributesCompatParcelizer(tArr);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void remove() {
            AudioAttributesCompatParcelizer();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.RemoteActionCompatParcelizer.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            return this.RemoteActionCompatParcelizer.next();
        }

        private static Void AudioAttributesCompatParcelizer() {
            throw new UnsupportedOperationException();
        }
    }
}
