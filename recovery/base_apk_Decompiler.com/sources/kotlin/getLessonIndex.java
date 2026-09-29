package kotlin;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class getLessonIndex extends newLessonSuggestionInstance {
    private final BookReference write;

    public final BookReference IconCompatParcelizer() {
        return AudioAttributesCompatParcelizer(this.write);
    }

    public final int hashCode() {
        return IconCompatParcelizer().hashCode();
    }

    public final boolean equals(Object obj) {
        return IconCompatParcelizer().equals(obj);
    }

    public final String toString() {
        return IconCompatParcelizer().toString();
    }

    static class write<K> implements Map.Entry<K, Object> {
        private Map.Entry<K, getLessonIndex> read;

        /* synthetic */ write(Map.Entry entry, byte b) {
            this(entry);
        }

        private write(Map.Entry<K, getLessonIndex> entry) {
            this.read = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.read.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            getLessonIndex value = this.read.getValue();
            if (value == null) {
                return null;
            }
            return value.IconCompatParcelizer();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof BookReference)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            return this.read.getValue().RemoteActionCompatParcelizer((BookReference) obj);
        }
    }

    static class IconCompatParcelizer<K> implements Iterator<Map.Entry<K, Object>> {
        private Iterator<Map.Entry<K, Object>> IconCompatParcelizer;

        public IconCompatParcelizer(Iterator<Map.Entry<K, Object>> it) {
            this.IconCompatParcelizer = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.IconCompatParcelizer.hasNext();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.IconCompatParcelizer.next();
            return next.getValue() instanceof getLessonIndex ? new write(next, (byte) 0) : next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.IconCompatParcelizer.remove();
        }
    }
}
