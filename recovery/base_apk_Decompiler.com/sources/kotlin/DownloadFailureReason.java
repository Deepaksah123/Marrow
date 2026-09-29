package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public interface DownloadFailureReason {

    public enum read {
        ALLOW,
        INDECISIVE,
        BLOCK_INACCESSIBLE,
        BLOCK_ALL
    }

    read AudioAttributesCompatParcelizer(Class<?> cls);

    static {
        new DownloadFailureReason() { // from class: o.DownloadFailureReason.2
            @Override // kotlin.DownloadFailureReason
            public final read AudioAttributesCompatParcelizer(Class<?> cls) {
                if (forMediaItem.write(cls)) {
                    return read.BLOCK_INACCESSIBLE;
                }
                return read.INDECISIVE;
            }
        };
        new DownloadFailureReason() { // from class: o.DownloadFailureReason.4
            @Override // kotlin.DownloadFailureReason
            public final read AudioAttributesCompatParcelizer(Class<?> cls) {
                if (forMediaItem.write(cls)) {
                    return read.BLOCK_ALL;
                }
                return read.INDECISIVE;
            }
        };
        new DownloadFailureReason() { // from class: o.DownloadFailureReason.1
            @Override // kotlin.DownloadFailureReason
            public final read AudioAttributesCompatParcelizer(Class<?> cls) {
                if (forMediaItem.AudioAttributesCompatParcelizer(cls)) {
                    return read.BLOCK_ALL;
                }
                return read.INDECISIVE;
            }
        };
        new DownloadFailureReason() { // from class: o.DownloadFailureReason.3
            @Override // kotlin.DownloadFailureReason
            public final read AudioAttributesCompatParcelizer(Class<?> cls) {
                if (forMediaItem.read(cls)) {
                    return read.BLOCK_ALL;
                }
                return read.INDECISIVE;
            }
        };
    }
}
