package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaonLoadCanceled2comgoogleandroidexoplayer2MediaSourceListForwardingEventListener {
    private lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener IconCompatParcelizer;
    private byte[] RemoteActionCompatParcelizer;
    private int read;
    private byte[] write;

    public lambdaonLoadCanceled2comgoogleandroidexoplayer2MediaSourceListForwardingEventListener(lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener lambdaonloadstarted0comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener, int i, byte[] bArr, byte[] bArr2) {
        if (i != bArr2.length) {
            throw new IllegalArgumentException("length != bytes.length");
        }
        this.IconCompatParcelizer = lambdaonloadstarted0comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener;
        this.write = bArr;
        this.RemoteActionCompatParcelizer = bArr2;
        this.read = i;
    }

    public final lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener write() {
        return this.IconCompatParcelizer;
    }

    public final byte[] AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }
}
