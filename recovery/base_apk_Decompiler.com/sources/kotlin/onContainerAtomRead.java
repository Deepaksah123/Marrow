package kotlin;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import kotlin.initExtraTracks;
import kotlin.onLeafAtomRead;
import kotlin.onMoovContainerAtomRead;

/* JADX INFO: loaded from: classes3.dex */
public class onContainerAtomRead<K, V> extends onLeafAtomRead<K, V> implements parseMoof<K, V> {
    public static <K, V> onContainerAtomRead<K, V> IconCompatParcelizer() {
        return FixedSampleSizeRechunker1.IconCompatParcelizer;
    }

    public static final class write<K, V> extends onLeafAtomRead.IconCompatParcelizer<K, V> {
        @Override // o.onLeafAtomRead.IconCompatParcelizer
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final write<K, V> AudioAttributesCompatParcelizer(K k, V v) {
            super.AudioAttributesCompatParcelizer(k, v);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.onLeafAtomRead.IconCompatParcelizer
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public write<K, V> write(K k, Iterable<? extends V> iterable) {
            super.write(k, iterable);
            return this;
        }

        @Override // o.onLeafAtomRead.IconCompatParcelizer
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final write<K, V> AudioAttributesCompatParcelizer(outputPendingMetadataSamples<? extends K, ? extends V> outputpendingmetadatasamples) {
            super.AudioAttributesCompatParcelizer(outputpendingmetadatasamples);
            return this;
        }

        @Override // o.onLeafAtomRead.IconCompatParcelizer
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final onContainerAtomRead<K, V> AudioAttributesCompatParcelizer() {
            return (onContainerAtomRead) super.AudioAttributesCompatParcelizer();
        }
    }

    static <K, V> onContainerAtomRead<K, V> IconCompatParcelizer(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        initExtraTracks initextratracksWrite;
        if (collection.isEmpty()) {
            return IconCompatParcelizer();
        }
        onMoovContainerAtomRead.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new onMoovContainerAtomRead.AudioAttributesCompatParcelizer(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            if (comparator == null) {
                initextratracksWrite = initExtraTracks.write(value);
            } else {
                initextratracksWrite = initExtraTracks.write(comparator, value);
            }
            if (!initextratracksWrite.isEmpty()) {
                audioAttributesCompatParcelizer.read(key, initextratracksWrite);
                size += initextratracksWrite.size();
            }
        }
        return new onContainerAtomRead<>(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(), size);
    }

    onContainerAtomRead(onMoovContainerAtomRead<K, initExtraTracks<V>> onmoovcontaineratomread, int i) {
        super(onmoovcontaineratomread, i);
    }

    @Override // kotlin.onLeafAtomRead
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final initExtraTracks<V> write(K k) {
        initExtraTracks<V> initextratracks = (initExtraTracks) ((onLeafAtomRead) this).write.get(k);
        return initextratracks == null ? initExtraTracks.AudioAttributesImplApi26Parcelizer() : initextratracks;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        readEncryptionData.write(this, objectOutputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException("Invalid key count ".concat(String.valueOf(i)));
        }
        onMoovContainerAtomRead.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = onMoovContainerAtomRead.read();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object objRequireNonNull = Objects.requireNonNull(objectInputStream.readObject());
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                throw new InvalidObjectException("Invalid value count ".concat(String.valueOf(i4)));
            }
            initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
            for (int i5 = 0; i5 < i4; i5++) {
                iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.read(Objects.requireNonNull(objectInputStream.readObject()));
            }
            audioAttributesCompatParcelizer.read(objRequireNonNull, iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer());
            i2 += i4;
        }
        try {
            onLeafAtomRead.write.AudioAttributesCompatParcelizer.read(this, audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer());
            onLeafAtomRead.write.IconCompatParcelizer.read(this, i2);
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }
}
