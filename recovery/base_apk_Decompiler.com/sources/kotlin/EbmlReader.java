package kotlin;

import kotlin.readFlvHeader;

/* JADX INFO: loaded from: classes3.dex */
final class EbmlReader extends readFlvHeader.RemoteActionCompatParcelizer {
    private boolean IconCompatParcelizer;
    private byte RemoteActionCompatParcelizer;
    private int read;

    @Override // o.readFlvHeader.RemoteActionCompatParcelizer
    public final readFlvHeader read() {
        if (this.RemoteActionCompatParcelizer == 3) {
            return new isLevel1Element(this.read, this.IconCompatParcelizer);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.RemoteActionCompatParcelizer & 1) == 0) {
            sb.append(" appUpdateType");
        }
        if ((this.RemoteActionCompatParcelizer & 2) == 0) {
            sb.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    EbmlReader() {
    }

    @Override // o.readFlvHeader.RemoteActionCompatParcelizer
    public final readFlvHeader.RemoteActionCompatParcelizer write() {
        this.IconCompatParcelizer = false;
        this.RemoteActionCompatParcelizer = (byte) (this.RemoteActionCompatParcelizer | 2);
        return this;
    }

    public final readFlvHeader.RemoteActionCompatParcelizer IconCompatParcelizer(int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer = (byte) (this.RemoteActionCompatParcelizer | 1);
        return this;
    }
}
