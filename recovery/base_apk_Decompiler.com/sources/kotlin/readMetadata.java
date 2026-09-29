package kotlin;

/* JADX INFO: loaded from: classes3.dex */
abstract class readMetadata {
    public abstract String IconCompatParcelizer();

    public abstract String read();

    readMetadata() {
    }

    static readMetadata RemoteActionCompatParcelizer(String str, String str2) {
        return new MetadataRenderer(str, str2);
    }
}
