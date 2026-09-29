package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class setAllRendererStreamsFinal implements resolvePositionForPlaylistChange {
    private final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final boolean read;

    public enum RemoteActionCompatParcelizer {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static RemoteActionCompatParcelizer write(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i == 5) {
                return EXCLUDE_INTERSECTIONS;
            }
            return MERGE;
        }
    }

    public setAllRendererStreamsFinal(String str, RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z) {
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
        this.read = z;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean read() {
        return this.read;
    }

    @Override // kotlin.resolvePositionForPlaylistChange
    public final onVideoFrameProcessingOffset RemoteActionCompatParcelizer(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, setShuffleModeEnabledInternal setshufflemodeenabledinternal) {
        if (!exoPlayerImplExternalSyntheticLambda6.RemoteActionCompatParcelizer(onAudioDecoderReleased.MergePathsApi19)) {
            access3000.AudioAttributesCompatParcelizer("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new onVideoInputFormatChanged(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append('}');
        return sb.toString();
    }
}
