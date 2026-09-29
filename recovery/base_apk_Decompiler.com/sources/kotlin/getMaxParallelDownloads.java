package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class getMaxParallelDownloads extends IOException {
    private DownloadManagerExternalSyntheticLambda0 write;

    public getMaxParallelDownloads(String str) {
        super(str);
        this.write = null;
    }

    static getMaxParallelDownloads RemoteActionCompatParcelizer() {
        return new getMaxParallelDownloads("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static getMaxParallelDownloads IconCompatParcelizer() {
        return new getMaxParallelDownloads("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static IconCompatParcelizer write() {
        return new IconCompatParcelizer("Protocol message tag had invalid wire type.");
    }

    public static class IconCompatParcelizer extends getMaxParallelDownloads {
        public IconCompatParcelizer(String str) {
            super(str);
        }
    }

    static getMaxParallelDownloads AudioAttributesCompatParcelizer() {
        return new getMaxParallelDownloads("Failed to parse the message.");
    }
}
