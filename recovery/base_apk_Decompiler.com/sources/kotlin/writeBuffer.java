package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class writeBuffer {
    private Long RemoteActionCompatParcelizer;

    public writeBuffer(Long l) {
        this.RemoteActionCompatParcelizer = l;
    }

    public final Long IconCompatParcelizer() {
        Long l = this.RemoteActionCompatParcelizer;
        if (l == null) {
            return null;
        }
        long jLongValue = l.longValue();
        Long lRemoteActionCompatParcelizer = buildAudioTrackWithRetry.RemoteActionCompatParcelizer();
        if (lRemoteActionCompatParcelizer != null) {
            return Long.valueOf(jLongValue - lRemoteActionCompatParcelizer.longValue());
        }
        return null;
    }

    public final boolean write() {
        Long lIconCompatParcelizer = IconCompatParcelizer();
        return lIconCompatParcelizer != null && lIconCompatParcelizer.longValue() < 0;
    }
}
