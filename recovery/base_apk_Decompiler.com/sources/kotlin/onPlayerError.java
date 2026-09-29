package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class onPlayerError extends onPlaybackStateChanged {
    private final onSeekForwardIncrementChanged write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onPlayerError(onSeekForwardIncrementChanged onseekforwardincrementchanged) {
        super(null);
        toMagicModuleMetaRepoModel.write(onseekforwardincrementchanged, "");
        this.write = onseekforwardincrementchanged;
    }

    public final onSeekForwardIncrementChanged AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onPlayerError) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, ((onPlayerError) obj).write);
    }

    public final int hashCode() {
        return this.write.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmediateGlideSize(size=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
