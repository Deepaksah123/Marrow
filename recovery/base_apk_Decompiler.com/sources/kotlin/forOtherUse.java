package kotlin;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class forOtherUse extends BasicBeanDescription {
    private final constructPropertyCollector RemoteActionCompatParcelizer;

    public final constructPropertyCollector read() {
        return write(this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.BasicBeanDescription
    public final int hashCode() {
        return read().hashCode();
    }

    @Override // kotlin.BasicBeanDescription
    public final boolean equals(Object obj) {
        return read().equals(obj);
    }

    public final String toString() {
        return read().toString();
    }

    static class read<K> implements Map.Entry<K, Object> {
        private Map.Entry<K, forOtherUse> RemoteActionCompatParcelizer;

        /* synthetic */ read(Map.Entry entry, byte b) {
            this(entry);
        }

        private read(Map.Entry<K, forOtherUse> entry) {
            this.RemoteActionCompatParcelizer = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.RemoteActionCompatParcelizer.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            forOtherUse value = this.RemoteActionCompatParcelizer.getValue();
            if (value == null) {
                return null;
            }
            return value.read();
        }

        public final forOtherUse write() {
            return this.RemoteActionCompatParcelizer.getValue();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof constructPropertyCollector)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            return this.RemoteActionCompatParcelizer.getValue().AudioAttributesCompatParcelizer((constructPropertyCollector) obj);
        }
    }

    static class AudioAttributesCompatParcelizer<K> implements Iterator<Map.Entry<K, Object>> {
        private Iterator<Map.Entry<K, Object>> AudioAttributesCompatParcelizer;

        public AudioAttributesCompatParcelizer(Iterator<Map.Entry<K, Object>> it) {
            this.AudioAttributesCompatParcelizer = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.AudioAttributesCompatParcelizer.hasNext();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.AudioAttributesCompatParcelizer.next();
            return next.getValue() instanceof forOtherUse ? new read(next, (byte) 0) : next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.AudioAttributesCompatParcelizer.remove();
        }
    }
}
