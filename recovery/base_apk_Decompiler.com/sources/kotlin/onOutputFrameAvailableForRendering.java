package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class onOutputFrameAvailableForRendering {
    private final String RemoteActionCompatParcelizer;
    private final String read;

    public onOutputFrameAvailableForRendering(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.read = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    public final String IconCompatParcelizer() {
        return this.read;
    }

    public final String read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onOutputFrameAvailableForRendering)) {
            return false;
        }
        onOutputFrameAvailableForRendering onoutputframeavailableforrendering = (onOutputFrameAvailableForRendering) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) onoutputframeavailableforrendering.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) onoutputframeavailableforrendering.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (this.read.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.read;
        String str2 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("SearchLabelVMModel(hint=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
