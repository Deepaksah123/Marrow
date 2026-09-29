package kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.setRelativeToDefaultPosition;

/* JADX INFO: loaded from: classes2.dex */
final class access3800<K extends setRelativeToDefaultPosition, V> {
    private final read<K, V> RemoteActionCompatParcelizer = new read<>();
    private final Map<K, read<K, V>> AudioAttributesCompatParcelizer = new HashMap();

    access3800() {
    }

    public final void IconCompatParcelizer(K k, V v) {
        read<K, V> readVar = this.AudioAttributesCompatParcelizer.get(k);
        if (readVar == null) {
            readVar = new read<>(k);
            read(readVar);
            this.AudioAttributesCompatParcelizer.put(k, readVar);
        } else {
            k.RemoteActionCompatParcelizer();
        }
        readVar.write(v);
    }

    public final V read(K k) {
        read<K, V> readVar = this.AudioAttributesCompatParcelizer.get(k);
        if (readVar == null) {
            readVar = new read<>(k);
            this.AudioAttributesCompatParcelizer.put(k, readVar);
        } else {
            k.RemoteActionCompatParcelizer();
        }
        write(readVar);
        return readVar.IconCompatParcelizer();
    }

    public final V read() {
        for (read readVar = this.RemoteActionCompatParcelizer.write; !readVar.equals(this.RemoteActionCompatParcelizer); readVar = readVar.write) {
            V v = (V) readVar.IconCompatParcelizer();
            if (v != null) {
                return v;
            }
            IconCompatParcelizer(readVar);
            this.AudioAttributesCompatParcelizer.remove(readVar.IconCompatParcelizer);
            ((setRelativeToDefaultPosition) readVar.IconCompatParcelizer).RemoteActionCompatParcelizer();
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        read readVar = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        boolean z = false;
        while (!readVar.equals(this.RemoteActionCompatParcelizer)) {
            sb.append('{');
            sb.append(readVar.IconCompatParcelizer);
            sb.append(':');
            sb.append(readVar.read());
            sb.append("}, ");
            readVar = readVar.AudioAttributesCompatParcelizer;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    private void write(read<K, V> readVar) {
        IconCompatParcelizer(readVar);
        readVar.write = this.RemoteActionCompatParcelizer;
        readVar.AudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        AudioAttributesCompatParcelizer(readVar);
    }

    private void read(read<K, V> readVar) {
        IconCompatParcelizer(readVar);
        readVar.write = this.RemoteActionCompatParcelizer.write;
        readVar.AudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer;
        AudioAttributesCompatParcelizer(readVar);
    }

    private static <K, V> void AudioAttributesCompatParcelizer(read<K, V> readVar) {
        readVar.AudioAttributesCompatParcelizer.write = readVar;
        readVar.write.AudioAttributesCompatParcelizer = readVar;
    }

    private static <K, V> void IconCompatParcelizer(read<K, V> readVar) {
        readVar.write.AudioAttributesCompatParcelizer = readVar.AudioAttributesCompatParcelizer;
        readVar.AudioAttributesCompatParcelizer.write = readVar.write;
    }

    static class read<K, V> {
        read<K, V> AudioAttributesCompatParcelizer;
        final K IconCompatParcelizer;
        private List<V> RemoteActionCompatParcelizer;
        read<K, V> write;

        read() {
            this(null);
        }

        read(K k) {
            this.write = this;
            this.AudioAttributesCompatParcelizer = this;
            this.IconCompatParcelizer = k;
        }

        public final V IconCompatParcelizer() {
            int i = read();
            if (i > 0) {
                return this.RemoteActionCompatParcelizer.remove(i - 1);
            }
            return null;
        }

        public final int read() {
            List<V> list = this.RemoteActionCompatParcelizer;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public final void write(V v) {
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = new ArrayList();
            }
            this.RemoteActionCompatParcelizer.add(v);
        }
    }
}
