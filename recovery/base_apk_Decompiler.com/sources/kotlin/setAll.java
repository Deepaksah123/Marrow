package kotlin;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class setAll {
    private final String RemoteActionCompatParcelizer;
    private final isStartOfTsPacket write;

    public setAll(String str, isStartOfTsPacket isstartoftspacket) {
        this.RemoteActionCompatParcelizer = str;
        this.write = isstartoftspacket;
    }

    public final boolean write() {
        try {
            return RemoteActionCompatParcelizer().createNewFile();
        } catch (IOException unused) {
            DvbSubtitleReader.read().write();
            return false;
        }
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return RemoteActionCompatParcelizer().exists();
    }

    public final boolean read() {
        return RemoteActionCompatParcelizer().delete();
    }

    private File RemoteActionCompatParcelizer() {
        return this.write.read(this.RemoteActionCompatParcelizer);
    }
}
