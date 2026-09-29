package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class SimpleBasePlayerState {
    private final String IconCompatParcelizer;
    private final String write;

    public SimpleBasePlayerState(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.IconCompatParcelizer = str;
        this.write = str2;
    }

    public final String write() {
        return this.IconCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleBasePlayerState)) {
            return false;
        }
        SimpleBasePlayerState simpleBasePlayerState = (SimpleBasePlayerState) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) simpleBasePlayerState.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) simpleBasePlayerState.write);
    }

    public final int hashCode() {
        return (this.IconCompatParcelizer.hashCode() * 31) + this.write.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CTInboxImageData(url=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", contentDescription=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
