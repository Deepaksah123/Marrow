package kotlin;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class ensureMediaCodecInfosInitialized {
    private final URL RemoteActionCompatParcelizer;

    public ensureMediaCodecInfosInitialized(URL url) {
        this.RemoteActionCompatParcelizer = url;
    }

    public final URLConnection RemoteActionCompatParcelizer() throws IOException {
        return this.RemoteActionCompatParcelizer.openConnection();
    }

    public final String toString() {
        return this.RemoteActionCompatParcelizer.toString();
    }
}
