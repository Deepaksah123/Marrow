package kotlin;

import java.io.IOException;
import kotlin.DownloadRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class setMinRetryCount<K, V> {
    private final K AudioAttributesCompatParcelizer;
    private final read<K, V> RemoteActionCompatParcelizer;
    private final V write;

    static class read<K, V> {
        private K IconCompatParcelizer;
        public final DownloadRequest.read RemoteActionCompatParcelizer;
        public final DownloadRequest.read read;
        private V write;

        public read(DownloadRequest.read readVar, K k, DownloadRequest.read readVar2, V v) {
            this.read = readVar;
            this.IconCompatParcelizer = k;
            this.RemoteActionCompatParcelizer = readVar2;
            this.write = v;
        }
    }

    private setMinRetryCount(DownloadRequest.read readVar, K k, DownloadRequest.read readVar2, V v) {
        this.RemoteActionCompatParcelizer = new read<>(readVar, k, readVar2, v);
        this.AudioAttributesCompatParcelizer = k;
        this.write = v;
    }

    public static <K, V> setMinRetryCount<K, V> RemoteActionCompatParcelizer(DownloadRequest.read readVar, K k, DownloadRequest.read readVar2, V v) {
        return new setMinRetryCount<>(readVar, k, readVar2, v);
    }

    static <K, V> void read(DownloadManager downloadManager, read<K, V> readVar, K k, V v) throws IOException {
        onRequirementsStateChanged.read(downloadManager, readVar.read, 1, k);
        onRequirementsStateChanged.read(downloadManager, readVar.RemoteActionCompatParcelizer, 2, v);
    }

    static <K, V> int RemoteActionCompatParcelizer(read<K, V> readVar, K k, V v) {
        return onRequirementsStateChanged.AudioAttributesCompatParcelizer(readVar.read, 1, k) + onRequirementsStateChanged.AudioAttributesCompatParcelizer(readVar.RemoteActionCompatParcelizer, 2, v);
    }

    public final int write(int i, K k, V v) {
        return DownloadManager.MediaBrowserCompatSearchResultReceiver(i) + DownloadManager.MediaBrowserCompatCustomActionResultReceiver(RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, k, v));
    }

    final read<K, V> AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }
}
