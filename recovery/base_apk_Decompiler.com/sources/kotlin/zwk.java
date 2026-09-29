package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class zwk {
    private final String AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;

    public zwk(String str, String str2, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.IconCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = z;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwk)) {
            return false;
        }
        zwk zwkVar = (zwk) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) zwkVar.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) zwkVar.AudioAttributesCompatParcelizer) && this.RemoteActionCompatParcelizer == zwkVar.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (((this.IconCompatParcelizer.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        String str2 = this.AudioAttributesCompatParcelizer;
        boolean z = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("VideoNoteViewInfoUIModel(userId=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", shouldShowWatermark=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
