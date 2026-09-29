package kotlin;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class StringCollectionSerializer implements handleMissingId {
    public static final boolean read;
    public final byte[] IconCompatParcelizer;
    public final UUID RemoteActionCompatParcelizer;

    @Deprecated
    public final boolean write;

    static {
        read = "Amazon".equals(LaissezFaireSubTypeValidator.read) && ("AFTM".equals(LaissezFaireSubTypeValidator.MediaBrowserCompatItemReceiver) || "AFTB".equals(LaissezFaireSubTypeValidator.MediaBrowserCompatItemReceiver));
    }

    public StringCollectionSerializer(UUID uuid, byte[] bArr, boolean z) {
        this.RemoteActionCompatParcelizer = uuid;
        this.IconCompatParcelizer = bArr;
        this.write = z;
    }
}
