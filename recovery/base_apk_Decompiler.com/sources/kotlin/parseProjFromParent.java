package kotlin;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class parseProjFromParent {
    public static <K, V> parseMvhd<K, V> AudioAttributesCompatParcelizer(Map<K, ? extends V> map, V v) {
        return new RemoteActionCompatParcelizer(map, v);
    }

    static class RemoteActionCompatParcelizer<K, V> implements parseMvhd<K, V>, Serializable {
        private Map<K, ? extends V> RemoteActionCompatParcelizer;
        private V write;

        RemoteActionCompatParcelizer(Map<K, ? extends V> map, V v) {
            this.RemoteActionCompatParcelizer = (Map) parseStsd.IconCompatParcelizer(map);
            this.write = v;
        }

        @Override // kotlin.parseMvhd
        public final V apply(K k) {
            V v = this.RemoteActionCompatParcelizer.get(k);
            if (v != null || this.RemoteActionCompatParcelizer.containsKey(k)) {
                return (V) parseSampleEntryEncryptionData.IconCompatParcelizer(v);
            }
            return this.write;
        }

        @Override // kotlin.parseMvhd
        public final boolean equals(Object obj) {
            if (!(obj instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
            return this.RemoteActionCompatParcelizer.equals(remoteActionCompatParcelizer.RemoteActionCompatParcelizer) && parseSmta.AudioAttributesCompatParcelizer(this.write, remoteActionCompatParcelizer.write);
        }

        public final int hashCode() {
            return parseSmta.read(this.RemoteActionCompatParcelizer, this.write);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Functions.forMap(");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", defaultValue=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }
    }
}
