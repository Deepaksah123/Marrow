package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class onMaxSeekToPreviousPositionChanged extends onPlaybackStateChanged {
    private final getAnswerMap<SampleVideos<? super onSeekForwardIncrementChanged>, Object> AudioAttributesCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public onMaxSeekToPreviousPositionChanged(getAnswerMap<? super SampleVideos<? super onSeekForwardIncrementChanged>, ? extends Object> getanswermap) {
        super(null);
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.AudioAttributesCompatParcelizer = getanswermap;
    }

    public final getAnswerMap<SampleVideos<? super onSeekForwardIncrementChanged>, Object> write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onMaxSeekToPreviousPositionChanged) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, ((onMaxSeekToPreviousPositionChanged) obj).AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AsyncGlideSize(asyncSize=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
