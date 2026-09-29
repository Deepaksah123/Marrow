package kotlin;

/* JADX INFO: loaded from: classes2.dex */
final class getSeekBackIncrement extends getPlaybackState {
    static final getSeekBackIncrement read = new getSeekBackIncrement(false);
    static final getSeekBackIncrement write = new getSeekBackIncrement(true);

    private getSeekBackIncrement(boolean z) {
        super(z ? getBufferedPosition.AudioAttributesCompatParcelizer : getBufferedPosition.RemoteActionCompatParcelizer);
    }
}
