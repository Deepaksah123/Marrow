package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaonDrmSessionReleased11comgoogleandroidexoplayer2MediaSourceListForwardingEventListener {
    private lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener RemoteActionCompatParcelizer;
    private int write;

    public lambdaonDrmSessionReleased11comgoogleandroidexoplayer2MediaSourceListForwardingEventListener(lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener lambdaonloadstarted0comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener, int i) {
        this.RemoteActionCompatParcelizer = lambdaonloadstarted0comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener;
        this.write = i;
    }

    public final lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int write() {
        return this.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.RemoteActionCompatParcelizer.toString());
        sb.append(" length: ");
        sb.append(this.write);
        return sb.toString();
    }
}
