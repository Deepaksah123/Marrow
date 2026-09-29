package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setErrorIconTintMode {
    private final boolean AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;

    public setErrorIconTintMode(String str, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = z;
    }

    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setErrorIconTintMode)) {
            return false;
        }
        setErrorIconTintMode seterroricontintmode = (setErrorIconTintMode) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) seterroricontintmode.RemoteActionCompatParcelizer) && this.AudioAttributesCompatParcelizer == seterroricontintmode.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (this.RemoteActionCompatParcelizer.hashCode() * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        boolean z = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("AnnouncementBannerUIModel(text=");
        sb.append(str);
        sb.append(", showInfoIcon=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
