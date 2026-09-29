package kotlin;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
final class syncStoppedDownload {
    private static final syncStoppedDownload RemoteActionCompatParcelizer = new syncStoppedDownload();
    private final ConcurrentMap<Class<?>, setNotMetRequirements<?>> IconCompatParcelizer = new ConcurrentHashMap();
    private final updateProgress read = new pauseDownloads();

    public static syncStoppedDownload write() {
        return RemoteActionCompatParcelizer;
    }

    public final <T> setNotMetRequirements<T> AudioAttributesCompatParcelizer(Class<T> cls) {
        getDownloadIndex.AudioAttributesCompatParcelizer(cls, "messageType");
        setNotMetRequirements<T> setnotmetrequirementsAudioAttributesCompatParcelizer = (setNotMetRequirements) this.IconCompatParcelizer.get(cls);
        if (setnotmetrequirementsAudioAttributesCompatParcelizer == null) {
            setnotmetrequirementsAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(cls);
            setNotMetRequirements<T> setnotmetrequirements = (setNotMetRequirements<T>) write(cls, setnotmetrequirementsAudioAttributesCompatParcelizer);
            if (setnotmetrequirements != null) {
                return setnotmetrequirements;
            }
        }
        return setnotmetrequirementsAudioAttributesCompatParcelizer;
    }

    public final <T> setNotMetRequirements<T> IconCompatParcelizer(T t) {
        return AudioAttributesCompatParcelizer(t.getClass());
    }

    private setNotMetRequirements<?> write(Class<?> cls, setNotMetRequirements<?> setnotmetrequirements) {
        getDownloadIndex.AudioAttributesCompatParcelizer(cls, "messageType");
        getDownloadIndex.AudioAttributesCompatParcelizer(setnotmetrequirements, "schema");
        return this.IconCompatParcelizer.putIfAbsent(cls, setnotmetrequirements);
    }

    private syncStoppedDownload() {
    }
}
