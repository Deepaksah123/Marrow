package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class codecNeedsDiscardChannelsWorkaround extends DefaultAudioSinkApi31 {
    public final Object IconCompatParcelizer;

    public codecNeedsDiscardChannelsWorkaround(Object obj) {
        this.IconCompatParcelizer = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && codecNeedsDiscardChannelsWorkaround.class == obj.getClass() && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ((codecNeedsDiscardChannelsWorkaround) obj).IconCompatParcelizer);
    }

    public final int hashCode() {
        Object obj = this.IconCompatParcelizer;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Err(");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
