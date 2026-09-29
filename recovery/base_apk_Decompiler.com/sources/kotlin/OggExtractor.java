package kotlin;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface OggExtractor {
    <T> onFlushCompleted<T> RemoteActionCompatParcelizer(packetFinished<T> packetfinished);

    <T> onInputBufferAvailable<Set<T>> read(packetFinished<T> packetfinished);

    <T> onInputBufferAvailable<T> write(packetFinished<T> packetfinished);

    default <T> T read(Class<T> cls) {
        return (T) AudioAttributesCompatParcelizer(packetFinished.read(cls));
    }

    default <T> onInputBufferAvailable<T> write(Class<T> cls) {
        return write(packetFinished.read(cls));
    }

    default <T> onFlushCompleted<T> IconCompatParcelizer(Class<T> cls) {
        return RemoteActionCompatParcelizer(packetFinished.read(cls));
    }

    default <T> Set<T> AudioAttributesCompatParcelizer(Class<T> cls) {
        return IconCompatParcelizer(packetFinished.read(cls));
    }

    default <T> T AudioAttributesCompatParcelizer(packetFinished<T> packetfinished) {
        onInputBufferAvailable<T> oninputbufferavailableWrite = write(packetfinished);
        if (oninputbufferavailableWrite == null) {
            return null;
        }
        return oninputbufferavailableWrite.write();
    }

    default <T> Set<T> IconCompatParcelizer(packetFinished<T> packetfinished) {
        return read(packetfinished).write();
    }
}
