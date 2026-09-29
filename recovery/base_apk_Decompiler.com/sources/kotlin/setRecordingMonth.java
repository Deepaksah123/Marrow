package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class setRecordingMonth implements setMimeType<byte[]> {
    private final byte[] read;

    @Override // kotlin.setMimeType
    public final void MediaBrowserCompatCustomActionResultReceiver() {
    }

    public setRecordingMonth(byte[] bArr) {
        this.read = (byte[]) moveMediaSource.AudioAttributesCompatParcelizer(bArr);
    }

    @Override // kotlin.setMimeType
    public final Class<byte[]> read() {
        return byte[].class;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setMimeType
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public byte[] RemoteActionCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.setMimeType
    public final int write() {
        return this.read.length;
    }
}
