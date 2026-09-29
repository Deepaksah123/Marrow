package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class access4100 implements MediaItemClippingConfiguration<byte[]> {
    @Override // kotlin.MediaItemClippingConfiguration
    public final int RemoteActionCompatParcelizer() {
        return 1;
    }

    @Override // kotlin.MediaItemClippingConfiguration
    public final /* synthetic */ byte[] AudioAttributesCompatParcelizer(int i) {
        return read(i);
    }

    @Override // kotlin.MediaItemClippingConfiguration
    public final /* synthetic */ int IconCompatParcelizer(byte[] bArr) {
        return read(bArr);
    }

    @Override // kotlin.MediaItemClippingConfiguration
    public final String AudioAttributesCompatParcelizer() {
        return "ByteArrayPool";
    }

    private static int read(byte[] bArr) {
        return bArr.length;
    }

    private static byte[] read(int i) {
        return new byte[i];
    }
}
