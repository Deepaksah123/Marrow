package kotlin;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getDownloadsPaused extends isWaitingForRequirements {
    private final DownloadManagerExternalSyntheticLambda0 write;

    public final DownloadManagerExternalSyntheticLambda0 write() {
        return IconCompatParcelizer(this.write);
    }

    @Override // kotlin.isWaitingForRequirements
    public final int hashCode() {
        return write().hashCode();
    }

    @Override // kotlin.isWaitingForRequirements
    public final boolean equals(Object obj) {
        return write().equals(obj);
    }

    public final String toString() {
        return write().toString();
    }

    static class write<K> implements Map.Entry<K, Object> {
        private Map.Entry<K, getDownloadsPaused> IconCompatParcelizer;

        /* synthetic */ write(Map.Entry entry, byte b) {
            this(entry);
        }

        private write(Map.Entry<K, getDownloadsPaused> entry) {
            this.IconCompatParcelizer = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.IconCompatParcelizer.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            getDownloadsPaused value = this.IconCompatParcelizer.getValue();
            if (value == null) {
                return null;
            }
            return value.write();
        }

        public final getDownloadsPaused read() {
            return this.IconCompatParcelizer.getValue();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof DownloadManagerExternalSyntheticLambda0)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            return this.IconCompatParcelizer.getValue().AudioAttributesCompatParcelizer((DownloadManagerExternalSyntheticLambda0) obj);
        }
    }

    static class RemoteActionCompatParcelizer<K> implements Iterator<Map.Entry<K, Object>> {
        private Iterator<Map.Entry<K, Object>> RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(Iterator<Map.Entry<K, Object>> it) {
            this.RemoteActionCompatParcelizer = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.RemoteActionCompatParcelizer.hasNext();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.RemoteActionCompatParcelizer.next();
            return next.getValue() instanceof getDownloadsPaused ? new write(next, (byte) 0) : next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.RemoteActionCompatParcelizer.remove();
        }
    }
}
