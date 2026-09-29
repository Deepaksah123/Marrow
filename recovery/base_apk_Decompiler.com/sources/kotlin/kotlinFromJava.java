package kotlin;

/* JADX INFO: loaded from: classes4.dex */
enum kotlinFromJava {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long MediaBrowserCompatItemReceiver;

    kotlinFromJava(long j) {
        this.MediaBrowserCompatItemReceiver = j;
    }

    public final long write() {
        return this.MediaBrowserCompatItemReceiver;
    }
}
