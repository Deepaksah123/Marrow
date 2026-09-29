package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class access5700 {
    private final List<String> AudioAttributesCompatParcelizer;
    private final getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;

    public final List<String> read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final getCreatedOnDateMs<getShowPopup> RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof access5700)) {
            return false;
        }
        access5700 access5700Var = (access5700) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, access5700Var.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, access5700Var.IconCompatParcelizer);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadTriggerForUrls(urls=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", callback=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
