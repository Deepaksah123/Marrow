package kotlin;

/* JADX INFO: loaded from: classes2.dex */
final class onEvents {
    private final _handleOddName AudioAttributesCompatParcelizer;
    private final onPlaybackStateChanged IconCompatParcelizer;

    public onEvents(onPlaybackStateChanged onplaybackstatechanged, _handleOddName _handleoddname) {
        toMagicModuleMetaRepoModel.write(onplaybackstatechanged, "");
        toMagicModuleMetaRepoModel.write(_handleoddname, "");
        this.IconCompatParcelizer = onplaybackstatechanged;
        this.AudioAttributesCompatParcelizer = _handleoddname;
    }

    public final onPlaybackStateChanged read() {
        return this.IconCompatParcelizer;
    }

    public final _handleOddName write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onEvents)) {
            return false;
        }
        onEvents onevents = (onEvents) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, onevents.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, onevents.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (this.IconCompatParcelizer.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SizeAndModifier(size=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", modifier=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
