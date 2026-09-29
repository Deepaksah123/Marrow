package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/isArray;", "", "Lo/isArray$read;", "p0", "", "write", "(Lo/isArray$read;)V", "p1", "", "read", "(Ljava/lang/Object;Ljava/lang/Object;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface isArray {
    boolean read(Object p0, Object p1);

    void write(read p0);

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\b\u0000\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u001d\u0010\u0014\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u000bJ\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u000e\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lo/isArray$read;", "", "", "Lo/setCustomSelectionActionModeCallback;", "p0", "<init>", "(Lo/setCustomSelectionActionModeCallback;)V", "", "isEmpty", "()Z", "containsAll", "(Ljava/util/Collection;)Z", "contains", "(Ljava/lang/Object;)Z", "read", "", "iterator", "()Ljava/util/Iterator;", "remove", "removeAll", "retainAll", "", "clear", "()V", "AudioAttributesCompatParcelizer", "Lo/setCustomSelectionActionModeCallback;", "()Lo/setCustomSelectionActionModeCallback;", "", "IconCompatParcelizer", "()I", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements Collection<Object>, getCurrentAnsweredMcqProgress {
        private final setCustomSelectionActionModeCallback<Object> AudioAttributesCompatParcelizer;

        public read(setCustomSelectionActionModeCallback<Object> setcustomselectionactionmodecallback) {
            this.AudioAttributesCompatParcelizer = setcustomselectionactionmodecallback;
        }

        @Override // java.util.Collection
        public final int size() {
            return IconCompatParcelizer();
        }

        public /* synthetic */ read(setCustomSelectionActionModeCallback setcustomselectionactionmodecallback, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? setAutoSizeTextTypeWithDefaults.write() : setcustomselectionactionmodecallback);
        }

        public final setCustomSelectionActionModeCallback<Object> read() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final int IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer();
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return this.AudioAttributesCompatParcelizer.write();
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> p0) {
            Iterator<T> it = p0.iterator();
            while (it.hasNext()) {
                if (!this.AudioAttributesCompatParcelizer.IconCompatParcelizer(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean contains(Object p0) {
            return this.AudioAttributesCompatParcelizer.IconCompatParcelizer(p0);
        }

        @Override // java.util.Collection
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final boolean add(Object p0) {
            return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0);
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<Object> iterator() {
            return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer().iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object p0) {
            return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> p0) {
            return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0);
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> p0) {
            return this.AudioAttributesCompatParcelizer.read((Collection<? extends Object>) p0);
        }

        @Override // java.util.Collection
        public final void clear() {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public read() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean removeIf(Predicate<? super Object> predicate) {
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
}
