package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class createFormatFromMediaFormat {
    private final String AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final List<String> RemoteActionCompatParcelizer;

    public createFormatFromMediaFormat(String str, String str2, List<String> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.IconCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = list;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final List<String> IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createFormatFromMediaFormat)) {
            return false;
        }
        createFormatFromMediaFormat createformatfrommediaformat = (createFormatFromMediaFormat) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) createformatfrommediaformat.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) createformatfrommediaformat.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, createformatfrommediaformat.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (((this.IconCompatParcelizer.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        String str2 = this.AudioAttributesCompatParcelizer;
        List<String> list = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("LearnMoreFeaturesUCModel(iconUrl=");
        sb.append(str);
        sb.append(", cardTitle=");
        sb.append(str2);
        sb.append(", points=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
