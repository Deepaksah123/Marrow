package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class setTextAppearanceResource {
    private final List<String> AudioAttributesCompatParcelizer;
    private final Integer AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final getRealClientPackageName RemoteActionCompatParcelizer;
    private final boolean read;
    private final getCachedBytesLength write;

    public setTextAppearanceResource(String str, boolean z, String str2, List<String> list, getCachedBytesLength getcachedbyteslength, Integer num, getRealClientPackageName getrealclientpackagename) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getcachedbyteslength, "");
        toMagicModuleMetaRepoModel.write(getrealclientpackagename, "");
        this.IconCompatParcelizer = str;
        this.read = z;
        this.AudioAttributesImplBaseParcelizer = str2;
        this.AudioAttributesCompatParcelizer = list;
        this.write = getcachedbyteslength;
        this.AudioAttributesImplApi26Parcelizer = num;
        this.RemoteActionCompatParcelizer = getrealclientpackagename;
    }

    public final String read() {
        return this.IconCompatParcelizer;
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.read;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final List<String> IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final Integer write() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final getRealClientPackageName AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static /* synthetic */ setTextAppearanceResource AudioAttributesCompatParcelizer(setTextAppearanceResource settextappearanceresource, String str, boolean z, String str2, List list, getCachedBytesLength getcachedbyteslength, Integer num, getRealClientPackageName getrealclientpackagename, int i) {
        if ((i & 1) != 0) {
            str = settextappearanceresource.IconCompatParcelizer;
        }
        if ((i & 2) != 0) {
            z = settextappearanceresource.read;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str2 = settextappearanceresource.AudioAttributesImplBaseParcelizer;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            list = settextappearanceresource.AudioAttributesCompatParcelizer;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            getcachedbyteslength = settextappearanceresource.write;
        }
        getCachedBytesLength getcachedbyteslength2 = getcachedbyteslength;
        if ((i & 32) != 0) {
            num = settextappearanceresource.AudioAttributesImplApi26Parcelizer;
        }
        Integer num2 = num;
        if ((i & 64) != 0) {
            getrealclientpackagename = settextappearanceresource.RemoteActionCompatParcelizer;
        }
        return write(str, z2, str3, list2, getcachedbyteslength2, num2, getrealclientpackagename);
    }

    private static setTextAppearanceResource write(String str, boolean z, String str2, List<String> list, getCachedBytesLength getcachedbyteslength, Integer num, getRealClientPackageName getrealclientpackagename) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getcachedbyteslength, "");
        toMagicModuleMetaRepoModel.write(getrealclientpackagename, "");
        return new setTextAppearanceResource(str, z, str2, list, getcachedbyteslength, num, getrealclientpackagename);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setTextAppearanceResource)) {
            return false;
        }
        setTextAppearanceResource settextappearanceresource = (setTextAppearanceResource) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) settextappearanceresource.IconCompatParcelizer) && this.read == settextappearanceresource.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) settextappearanceresource.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, settextappearanceresource.AudioAttributesCompatParcelizer) && this.write == settextappearanceresource.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, settextappearanceresource.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, settextappearanceresource.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iHashCode2 = Boolean.hashCode(this.read);
        int iHashCode3 = this.AudioAttributesImplBaseParcelizer.hashCode();
        int iHashCode4 = this.AudioAttributesCompatParcelizer.hashCode();
        int iHashCode5 = this.write.hashCode();
        Integer num = this.AudioAttributesImplApi26Parcelizer;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        boolean z = this.read;
        String str2 = this.AudioAttributesImplBaseParcelizer;
        List<String> list = this.AudioAttributesCompatParcelizer;
        getCachedBytesLength getcachedbyteslength = this.write;
        Integer num = this.AudioAttributesImplApi26Parcelizer;
        getRealClientPackageName getrealclientpackagename = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("TestMcqUiState(question=");
        sb.append(str);
        sb.append(", isGuessed=");
        sb.append(z);
        sb.append(", questionDescriptionHtml=");
        sb.append(str2);
        sb.append(", options=");
        sb.append(list);
        sb.append(", mcqStatus=");
        sb.append(getcachedbyteslength);
        sb.append(", selectedAnswer=");
        sb.append(num);
        sb.append(", media=");
        sb.append(getrealclientpackagename);
        sb.append(")");
        return sb.toString();
    }
}
