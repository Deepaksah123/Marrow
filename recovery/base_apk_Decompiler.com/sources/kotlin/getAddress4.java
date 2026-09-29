package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getAddress4 {
    private final getRealClientPackageName AudioAttributesCompatParcelizer;
    private final Integer AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final List<String> AudioAttributesImplBaseParcelizer;
    private final int IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private final int RemoteActionCompatParcelizer;
    private final onDisplayInfoChanged read;
    private final getCachedBytesLength write;

    public getAddress4(String str, String str2, List<String> list, int i, getCachedBytesLength getcachedbyteslength, Integer num, getRealClientPackageName getrealclientpackagename, onDisplayInfoChanged ondisplayinfochanged, int i2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getcachedbyteslength, "");
        toMagicModuleMetaRepoModel.write(getrealclientpackagename, "");
        toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
        this.MediaBrowserCompatCustomActionResultReceiver = str;
        this.AudioAttributesImplApi26Parcelizer = str2;
        this.AudioAttributesImplBaseParcelizer = list;
        this.RemoteActionCompatParcelizer = i;
        this.write = getcachedbyteslength;
        this.AudioAttributesImplApi21Parcelizer = num;
        this.AudioAttributesCompatParcelizer = getrealclientpackagename;
        this.read = ondisplayinfochanged;
        this.IconCompatParcelizer = i2;
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final String AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final List<String> RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final int write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final getCachedBytesLength read() {
        return this.write;
    }

    public final Integer MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final getRealClientPackageName AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static getAddress4 read(String str, String str2, List<String> list, int i, getCachedBytesLength getcachedbyteslength, Integer num, getRealClientPackageName getrealclientpackagename, onDisplayInfoChanged ondisplayinfochanged, int i2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getcachedbyteslength, "");
        toMagicModuleMetaRepoModel.write(getrealclientpackagename, "");
        toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
        return new getAddress4(str, str2, list, i, getcachedbyteslength, num, getrealclientpackagename, ondisplayinfochanged, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAddress4)) {
            return false;
        }
        getAddress4 getaddress4 = (getAddress4) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) getaddress4.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) getaddress4.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, getaddress4.AudioAttributesImplBaseParcelizer) && this.RemoteActionCompatParcelizer == getaddress4.RemoteActionCompatParcelizer && this.write == getaddress4.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, getaddress4.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, getaddress4.AudioAttributesCompatParcelizer) && this.read == getaddress4.read && this.IconCompatParcelizer == getaddress4.IconCompatParcelizer;
    }

    public final int hashCode() {
        int iHashCode = this.MediaBrowserCompatCustomActionResultReceiver.hashCode();
        int iHashCode2 = this.AudioAttributesImplApi26Parcelizer.hashCode();
        int iHashCode3 = this.AudioAttributesImplBaseParcelizer.hashCode();
        int iHashCode4 = Integer.hashCode(this.RemoteActionCompatParcelizer);
        int iHashCode5 = this.write.hashCode();
        Integer num = this.AudioAttributesImplApi21Parcelizer;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + Integer.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        String str = this.MediaBrowserCompatCustomActionResultReceiver;
        String str2 = this.AudioAttributesImplApi26Parcelizer;
        List<String> list = this.AudioAttributesImplBaseParcelizer;
        int i = this.RemoteActionCompatParcelizer;
        getCachedBytesLength getcachedbyteslength = this.write;
        Integer num = this.AudioAttributesImplApi21Parcelizer;
        getRealClientPackageName getrealclientpackagename = this.AudioAttributesCompatParcelizer;
        onDisplayInfoChanged ondisplayinfochanged = this.read;
        int i2 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("QBankMcqUIState(question=");
        sb.append(str);
        sb.append(", questionDescriptionHtml=");
        sb.append(str2);
        sb.append(", options=");
        sb.append(list);
        sb.append(", correctAnswerPosition=");
        sb.append(i);
        sb.append(", mcqStatus=");
        sb.append(getcachedbyteslength);
        sb.append(", selectedAnswer=");
        sb.append(num);
        sb.append(", media=");
        sb.append(getrealclientpackagename);
        sb.append(", bookmarkType=");
        sb.append(ondisplayinfochanged);
        sb.append(", answeredPosition=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
