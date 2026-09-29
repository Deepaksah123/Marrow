package kotlin;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer<K, V> implements Iterable<Map.Entry<K, V>> {
    private final WeakHashMap<AudioAttributesImplApi21Parcelizer<K, V>, Boolean> AudioAttributesCompatParcelizer = new WeakHashMap<>();
    private int IconCompatParcelizer = 0;
    private IconCompatParcelizer<K, V> RemoteActionCompatParcelizer;
    IconCompatParcelizer<K, V> write;

    public static abstract class AudioAttributesImplApi21Parcelizer<K, V> {
        abstract void a_(IconCompatParcelizer<K, V> iconCompatParcelizer);
    }

    protected IconCompatParcelizer<K, V> RemoteActionCompatParcelizer(K k) {
        IconCompatParcelizer<K, V> iconCompatParcelizer = this.write;
        while (iconCompatParcelizer != null && !iconCompatParcelizer.IconCompatParcelizer.equals(k)) {
            iconCompatParcelizer = iconCompatParcelizer.read;
        }
        return iconCompatParcelizer;
    }

    public V read(K k, V v) {
        IconCompatParcelizer<K, V> iconCompatParcelizerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(k);
        if (iconCompatParcelizerRemoteActionCompatParcelizer != null) {
            return iconCompatParcelizerRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        }
        write(k, v);
        return null;
    }

    final IconCompatParcelizer<K, V> write(K k, V v) {
        IconCompatParcelizer<K, V> iconCompatParcelizer = new IconCompatParcelizer<>(k, v);
        this.IconCompatParcelizer++;
        IconCompatParcelizer<K, V> iconCompatParcelizer2 = this.RemoteActionCompatParcelizer;
        if (iconCompatParcelizer2 == null) {
            this.write = iconCompatParcelizer;
            this.RemoteActionCompatParcelizer = iconCompatParcelizer;
            return iconCompatParcelizer;
        }
        iconCompatParcelizer2.read = iconCompatParcelizer;
        iconCompatParcelizer.write = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = iconCompatParcelizer;
        return iconCompatParcelizer;
    }

    public V AudioAttributesCompatParcelizer(K k) {
        IconCompatParcelizer<K, V> iconCompatParcelizerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(k);
        if (iconCompatParcelizerRemoteActionCompatParcelizer == null) {
            return null;
        }
        this.IconCompatParcelizer--;
        if (!this.AudioAttributesCompatParcelizer.isEmpty()) {
            Iterator<AudioAttributesImplApi21Parcelizer<K, V>> it = this.AudioAttributesCompatParcelizer.keySet().iterator();
            while (it.hasNext()) {
                it.next().a_(iconCompatParcelizerRemoteActionCompatParcelizer);
            }
        }
        if (iconCompatParcelizerRemoteActionCompatParcelizer.write != null) {
            iconCompatParcelizerRemoteActionCompatParcelizer.write.read = iconCompatParcelizerRemoteActionCompatParcelizer.read;
        } else {
            this.write = iconCompatParcelizerRemoteActionCompatParcelizer.read;
        }
        if (iconCompatParcelizerRemoteActionCompatParcelizer.read != null) {
            iconCompatParcelizerRemoteActionCompatParcelizer.read.write = iconCompatParcelizerRemoteActionCompatParcelizer.write;
        } else {
            this.RemoteActionCompatParcelizer = iconCompatParcelizerRemoteActionCompatParcelizer.write;
        }
        iconCompatParcelizerRemoteActionCompatParcelizer.read = null;
        iconCompatParcelizerRemoteActionCompatParcelizer.write = null;
        return iconCompatParcelizerRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
    }

    public final int read() {
        return this.IconCompatParcelizer;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        read readVar = new read(this.write, this.RemoteActionCompatParcelizer);
        this.AudioAttributesCompatParcelizer.put(readVar, Boolean.FALSE);
        return readVar;
    }

    public final Iterator<Map.Entry<K, V>> IconCompatParcelizer() {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.write);
        this.AudioAttributesCompatParcelizer.put(audioAttributesCompatParcelizer, Boolean.FALSE);
        return audioAttributesCompatParcelizer;
    }

    public final ActionBarContainer<K, V>.write write() {
        ActionBarContainer<K, V>.write writeVar = new write();
        this.AudioAttributesCompatParcelizer.put(writeVar, Boolean.FALSE);
        return writeVar;
    }

    public final Map.Entry<K, V> RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final Map.Entry<K, V> AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActionBarContainer)) {
            return false;
        }
        ActionBarContainer actionBarContainer = (ActionBarContainer) obj;
        if (read() != actionBarContainer.read()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = actionBarContainer.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    static abstract class RemoteActionCompatParcelizer<K, V> extends AudioAttributesImplApi21Parcelizer<K, V> implements Iterator<Map.Entry<K, V>> {
        private IconCompatParcelizer<K, V> read;
        private IconCompatParcelizer<K, V> write;

        abstract IconCompatParcelizer<K, V> AudioAttributesCompatParcelizer(IconCompatParcelizer<K, V> iconCompatParcelizer);

        abstract IconCompatParcelizer<K, V> read(IconCompatParcelizer<K, V> iconCompatParcelizer);

        RemoteActionCompatParcelizer(IconCompatParcelizer<K, V> iconCompatParcelizer, IconCompatParcelizer<K, V> iconCompatParcelizer2) {
            this.read = iconCompatParcelizer2;
            this.write = iconCompatParcelizer;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.write != null;
        }

        @Override // o.ActionBarContainer.AudioAttributesImplApi21Parcelizer
        public final void a_(IconCompatParcelizer<K, V> iconCompatParcelizer) {
            if (this.read == iconCompatParcelizer && iconCompatParcelizer == this.write) {
                this.write = null;
                this.read = null;
            }
            IconCompatParcelizer<K, V> iconCompatParcelizer2 = this.read;
            if (iconCompatParcelizer2 == iconCompatParcelizer) {
                this.read = AudioAttributesCompatParcelizer(iconCompatParcelizer2);
            }
            if (this.write == iconCompatParcelizer) {
                this.write = AudioAttributesCompatParcelizer();
            }
        }

        private IconCompatParcelizer<K, V> AudioAttributesCompatParcelizer() {
            IconCompatParcelizer<K, V> iconCompatParcelizer = this.write;
            IconCompatParcelizer<K, V> iconCompatParcelizer2 = this.read;
            if (iconCompatParcelizer == iconCompatParcelizer2 || iconCompatParcelizer2 == null) {
                return null;
            }
            return read(iconCompatParcelizer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            IconCompatParcelizer<K, V> iconCompatParcelizer = this.write;
            this.write = AudioAttributesCompatParcelizer();
            return iconCompatParcelizer;
        }
    }

    static class read<K, V> extends RemoteActionCompatParcelizer<K, V> {
        read(IconCompatParcelizer<K, V> iconCompatParcelizer, IconCompatParcelizer<K, V> iconCompatParcelizer2) {
            super(iconCompatParcelizer, iconCompatParcelizer2);
        }

        @Override // o.ActionBarContainer.RemoteActionCompatParcelizer
        final IconCompatParcelizer<K, V> read(IconCompatParcelizer<K, V> iconCompatParcelizer) {
            return iconCompatParcelizer.read;
        }

        @Override // o.ActionBarContainer.RemoteActionCompatParcelizer
        final IconCompatParcelizer<K, V> AudioAttributesCompatParcelizer(IconCompatParcelizer<K, V> iconCompatParcelizer) {
            return iconCompatParcelizer.write;
        }
    }

    static class AudioAttributesCompatParcelizer<K, V> extends RemoteActionCompatParcelizer<K, V> {
        AudioAttributesCompatParcelizer(IconCompatParcelizer<K, V> iconCompatParcelizer, IconCompatParcelizer<K, V> iconCompatParcelizer2) {
            super(iconCompatParcelizer, iconCompatParcelizer2);
        }

        @Override // o.ActionBarContainer.RemoteActionCompatParcelizer
        final IconCompatParcelizer<K, V> read(IconCompatParcelizer<K, V> iconCompatParcelizer) {
            return iconCompatParcelizer.write;
        }

        @Override // o.ActionBarContainer.RemoteActionCompatParcelizer
        final IconCompatParcelizer<K, V> AudioAttributesCompatParcelizer(IconCompatParcelizer<K, V> iconCompatParcelizer) {
            return iconCompatParcelizer.read;
        }
    }

    public class write extends AudioAttributesImplApi21Parcelizer<K, V> implements Iterator<Map.Entry<K, V>> {
        private boolean AudioAttributesCompatParcelizer = true;
        private IconCompatParcelizer<K, V> write;

        write() {
        }

        @Override // o.ActionBarContainer.AudioAttributesImplApi21Parcelizer
        final void a_(IconCompatParcelizer<K, V> iconCompatParcelizer) {
            IconCompatParcelizer<K, V> iconCompatParcelizer2 = this.write;
            if (iconCompatParcelizer == iconCompatParcelizer2) {
                IconCompatParcelizer<K, V> iconCompatParcelizer3 = iconCompatParcelizer2.write;
                this.write = iconCompatParcelizer3;
                this.AudioAttributesCompatParcelizer = iconCompatParcelizer3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.AudioAttributesCompatParcelizer) {
                return ActionBarContainer.this.write != null;
            }
            IconCompatParcelizer<K, V> iconCompatParcelizer = this.write;
            return (iconCompatParcelizer == null || iconCompatParcelizer.read == null) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.AudioAttributesCompatParcelizer) {
                this.AudioAttributesCompatParcelizer = false;
                this.write = ActionBarContainer.this.write;
            } else {
                IconCompatParcelizer<K, V> iconCompatParcelizer = this.write;
                this.write = iconCompatParcelizer != null ? iconCompatParcelizer.read : null;
            }
            return this.write;
        }
    }

    static class IconCompatParcelizer<K, V> implements Map.Entry<K, V> {
        final K IconCompatParcelizer;
        final V RemoteActionCompatParcelizer;
        IconCompatParcelizer<K, V> read;
        IconCompatParcelizer<K, V> write;

        IconCompatParcelizer(K k, V v) {
            this.IconCompatParcelizer = k;
            this.RemoteActionCompatParcelizer = v;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.IconCompatParcelizer;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.IconCompatParcelizer);
            sb.append("=");
            sb.append(this.RemoteActionCompatParcelizer);
            return sb.toString();
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return this.IconCompatParcelizer.equals(iconCompatParcelizer.IconCompatParcelizer) && this.RemoteActionCompatParcelizer.equals(iconCompatParcelizer.RemoteActionCompatParcelizer);
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.RemoteActionCompatParcelizer.hashCode() ^ this.IconCompatParcelizer.hashCode();
        }
    }
}
