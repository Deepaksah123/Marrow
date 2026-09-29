package kotlin;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class readEncryptionData {
    static int IconCompatParcelizer(ObjectInputStream objectInputStream) throws IOException {
        return objectInputStream.readInt();
    }

    static <K, V> void write(outputPendingMetadataSamples<K, V> outputpendingmetadatasamples, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(outputpendingmetadatasamples.RemoteActionCompatParcelizer().size());
        for (Map.Entry<K, Collection<V>> entry : outputpendingmetadatasamples.RemoteActionCompatParcelizer().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> void RemoteActionCompatParcelizer(outputPendingMetadataSamples<K, V> outputpendingmetadatasamples, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            Collection collectionRemoteActionCompatParcelizer = outputpendingmetadatasamples.RemoteActionCompatParcelizer(objectInputStream.readObject());
            int i3 = objectInputStream.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                collectionRemoteActionCompatParcelizer.add(objectInputStream.readObject());
            }
        }
    }

    static <T> IconCompatParcelizer<T> read(Class<T> cls, String str) {
        try {
            return new IconCompatParcelizer<>(cls.getDeclaredField(str), (byte) 0);
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    static final class IconCompatParcelizer<T> {
        private final Field IconCompatParcelizer;

        /* synthetic */ IconCompatParcelizer(Field field, byte b) {
            this(field);
        }

        private IconCompatParcelizer(Field field) {
            this.IconCompatParcelizer = field;
            field.setAccessible(true);
        }

        final void read(T t, Object obj) {
            try {
                this.IconCompatParcelizer.set(t, obj);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        final void read(T t, int i) {
            try {
                this.IconCompatParcelizer.set(t, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }
}
