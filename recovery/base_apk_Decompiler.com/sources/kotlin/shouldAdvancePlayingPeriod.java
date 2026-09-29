package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class shouldAdvancePlayingPeriod implements resolvePositionForPlaylistChange {
    private final boolean AudioAttributesCompatParcelizer;
    private final IconCompatParcelizer AudioAttributesImplApi21Parcelizer;
    private final mediaSourceListUpdateRequestedInternal IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final mediaSourceListUpdateRequestedInternal read;
    private final mediaSourceListUpdateRequestedInternal write;

    public enum IconCompatParcelizer {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static IconCompatParcelizer IconCompatParcelizer(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i)));
        }
    }

    public shouldAdvancePlayingPeriod(String str, IconCompatParcelizer iconCompatParcelizer, mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal, mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal2, mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal3, boolean z) {
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizer;
        this.write = mediasourcelistupdaterequestedinternal;
        this.read = mediasourcelistupdaterequestedinternal2;
        this.IconCompatParcelizer = mediasourcelistupdaterequestedinternal3;
        this.AudioAttributesCompatParcelizer = z;
    }

    public final String read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final IconCompatParcelizer IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final mediaSourceListUpdateRequestedInternal AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final mediaSourceListUpdateRequestedInternal write() {
        return this.write;
    }

    public final mediaSourceListUpdateRequestedInternal RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.resolvePositionForPlaylistChange
    public final onVideoFrameProcessingOffset RemoteActionCompatParcelizer(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, setShuffleModeEnabledInternal setshufflemodeenabledinternal) {
        return new ExoPlayerImplComponentListenerExternalSyntheticLambda6(setshufflemodeenabledinternal, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Trim Path: {start: ");
        sb.append(this.write);
        sb.append(", end: ");
        sb.append(this.read);
        sb.append(", offset: ");
        sb.append(this.IconCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }
}
