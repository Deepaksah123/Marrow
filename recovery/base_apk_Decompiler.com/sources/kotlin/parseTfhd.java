package kotlin;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class parseTfhd {
    public static <K, V> parseMoof<K, V> read(Map<K, Collection<V>> map, parseUdtaMeta<? extends List<V>> parseudtameta) {
        return new read(map, parseudtameta);
    }

    static class read<K, V> extends AtomParsersSampleSizeBox<K, V> {
        private transient parseUdtaMeta<? extends List<V>> IconCompatParcelizer;

        read(Map<K, Collection<V>> map, parseUdtaMeta<? extends List<V>> parseudtameta) {
            super(map);
            this.IconCompatParcelizer = (parseUdtaMeta) parseStsd.IconCompatParcelizer(parseudtameta);
        }

        @Override // kotlin.moveNext, kotlin.readNextSampleSize
        final Set<K> AudioAttributesImplApi26Parcelizer() {
            return MediaBrowserCompatCustomActionResultReceiver();
        }

        @Override // kotlin.moveNext, kotlin.readNextSampleSize
        final Map<K, Collection<V>> AudioAttributesImplApi21Parcelizer() {
            return AudioAttributesImplBaseParcelizer();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlin.AtomParsersSampleSizeBox, kotlin.moveNext
        /* JADX INFO: renamed from: IconCompatParcelizer */
        public final List<V> write() {
            return this.IconCompatParcelizer.get();
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.IconCompatParcelizer);
            objectOutputStream.writeObject(AudioAttributesCompatParcelizer());
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.IconCompatParcelizer = (parseUdtaMeta) Objects.requireNonNull(objectInputStream.readObject());
            RemoteActionCompatParcelizer((Map) Objects.requireNonNull(objectInputStream.readObject()));
        }
    }

    static abstract class RemoteActionCompatParcelizer<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        abstract outputPendingMetadataSamples<K, V> write();

        RemoteActionCompatParcelizer() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return write().RatingCompat();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return write().IconCompatParcelizer(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return write().write(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            write().read();
        }
    }

    static boolean read(outputPendingMetadataSamples<?, ?> outputpendingmetadatasamples, Object obj) {
        if (obj == outputpendingmetadatasamples) {
            return true;
        }
        if (obj instanceof outputPendingMetadataSamples) {
            return outputpendingmetadatasamples.RemoteActionCompatParcelizer().equals(((outputPendingMetadataSamples) obj).RemoteActionCompatParcelizer());
        }
        return false;
    }
}
