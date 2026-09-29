package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class onUtcTimestampLoadError {
    private final String AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final int read;

    public onUtcTimestampLoadError(String str, int i, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str3, "");
        this.RemoteActionCompatParcelizer = str;
        this.read = i;
        this.AudioAttributesCompatParcelizer = str2;
        this.IconCompatParcelizer = str3;
    }

    public final String IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String read() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onUtcTimestampLoadError)) {
            return false;
        }
        onUtcTimestampLoadError onutctimestamploaderror = (onUtcTimestampLoadError) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) onutctimestamploaderror.RemoteActionCompatParcelizer) && this.read == onutctimestamploaderror.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) onutctimestamploaderror.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) onutctimestamploaderror.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = Integer.hashCode(this.read);
        String str2 = this.AudioAttributesCompatParcelizer;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        int i = this.read;
        String str2 = this.AudioAttributesCompatParcelizer;
        String str3 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("StubBody(deeplink=");
        sb.append(str);
        sb.append(", sno=");
        sb.append(i);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", lessonId=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
