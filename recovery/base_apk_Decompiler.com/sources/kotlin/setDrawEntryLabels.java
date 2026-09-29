package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public interface setDrawEntryLabels extends AutoCloseable {
    String AudioAttributesCompatParcelizer(int i);

    void AudioAttributesCompatParcelizer();

    boolean AudioAttributesImplBaseParcelizer(int i);

    int IconCompatParcelizer();

    long IconCompatParcelizer(int i);

    void IconCompatParcelizer(int i, long j);

    void RemoteActionCompatParcelizer(int i, String str);

    byte[] RemoteActionCompatParcelizer(int i);

    @Override // java.lang.AutoCloseable
    void close();

    void read(int i);

    void read(int i, byte[] bArr);

    String write(int i);

    boolean write();

    default boolean MediaBrowserCompatItemReceiver(int i) {
        return IconCompatParcelizer(i) != 0;
    }
}
