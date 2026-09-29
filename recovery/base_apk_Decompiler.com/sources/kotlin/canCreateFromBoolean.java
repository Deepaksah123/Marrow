package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u001d\u0010\f\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001d\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010\u0017"}, d2 = {"Lo/canCreateFromBoolean;", "", "Lo/canCreateFromInt;", "", "p0", "<init>", "(Ljava/util/List;)V", "", "read", "(I)Lo/canCreateFromInt;", "", "(Lo/canCreateFromInt;)Z", "containsAll", "(Ljava/util/Collection;)Z", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Ljava/util/List;", "write", "()Ljava/util/List;", "I", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class canCreateFromBoolean implements Collection<canCreateFromInt>, getCurrentAnsweredMcqProgress {
    private final List<canCreateFromInt> AudioAttributesCompatParcelizer;
    private final int write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final canCreateFromBoolean RemoteActionCompatParcelizer = new canCreateFromBoolean(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());

    public canCreateFromBoolean(List<canCreateFromInt> list) {
        this.AudioAttributesCompatParcelizer = list;
        this.write = list.size();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof canCreateFromInt) {
            return read((canCreateFromInt) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int size() {
        return getWrite();
    }

    /* JADX INFO: renamed from: o.canCreateFromBoolean$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\n\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Lo/canCreateFromBoolean$read;", "", "<init>", "()V", "Lo/canCreateFromBoolean;", "RemoteActionCompatParcelizer", "Lo/canCreateFromBoolean;", "write", "()Lo/canCreateFromBoolean;", "IconCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final canCreateFromBoolean write() {
            return canCreateFromBoolean.RemoteActionCompatParcelizer;
        }

        public final canCreateFromBoolean read() {
            return canCreateFromBigInteger.RemoteActionCompatParcelizer().write();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final List<canCreateFromInt> write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final canCreateFromInt read(int p0) {
        return this.AudioAttributesCompatParcelizer.get(p0);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    public final boolean read(canCreateFromInt p0) {
        return this.AudioAttributesCompatParcelizer.contains(p0);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> p0) {
        return this.AudioAttributesCompatParcelizer.containsAll(p0);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.AudioAttributesCompatParcelizer.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<canCreateFromInt> iterator() {
        return this.AudioAttributesCompatParcelizer.iterator();
    }

    @Override // java.util.Collection
    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof canCreateFromBoolean) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, ((canCreateFromBoolean) p0).AudioAttributesCompatParcelizer);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocaleList(localeList=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean add(canCreateFromInt cancreatefromint) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends canCreateFromInt> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate<? super canCreateFromInt> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return markCompletelambda1.read(this);
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) markCompletelambda1.RemoteActionCompatParcelizer(this, tArr);
    }
}
