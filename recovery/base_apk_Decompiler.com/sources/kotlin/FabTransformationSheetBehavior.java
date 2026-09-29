package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class FabTransformationSheetBehavior {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    public FabTransformationSheetBehavior(String str, String str2, String str3, String str4, String str5, String str6) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        this.AudioAttributesImplApi26Parcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.write = str3;
        this.read = str4;
        this.AudioAttributesCompatParcelizer = str5;
        this.IconCompatParcelizer = str6;
    }

    public final String AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String write() {
        return this.write;
    }

    public final String read() {
        return this.read;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FabTransformationSheetBehavior)) {
            return false;
        }
        FabTransformationSheetBehavior fabTransformationSheetBehavior = (FabTransformationSheetBehavior) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) fabTransformationSheetBehavior.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) fabTransformationSheetBehavior.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) fabTransformationSheetBehavior.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) fabTransformationSheetBehavior.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) fabTransformationSheetBehavior.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) fabTransformationSheetBehavior.IconCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = this.AudioAttributesImplApi26Parcelizer.hashCode();
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode3 = this.write.hashCode();
        String str = this.read;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.AudioAttributesCompatParcelizer;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.AudioAttributesImplApi26Parcelizer;
        String str2 = this.RemoteActionCompatParcelizer;
        String str3 = this.write;
        String str4 = this.read;
        String str5 = this.AudioAttributesCompatParcelizer;
        String str6 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("VideoDeckItem(title=");
        sb.append(str);
        sb.append(", badgeText=");
        sb.append(str2);
        sb.append(", subText=");
        sb.append(str3);
        sb.append(", targetContentType=");
        sb.append(str4);
        sb.append(", targetContentId=");
        sb.append(str5);
        sb.append(", id=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }
}
