package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class bundleToStringImmutableMap {
    private final String AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final int read;
    private final boolean write;

    public bundleToStringImmutableMap(String str, String str2, boolean z, int i, int i2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.write = z;
        this.read = i;
        this.IconCompatParcelizer = i2;
    }

    public final String IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final int write() {
        return this.read;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bundleToStringImmutableMap)) {
            return false;
        }
        bundleToStringImmutableMap bundletostringimmutablemap = (bundleToStringImmutableMap) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) bundletostringimmutablemap.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) bundletostringimmutablemap.AudioAttributesCompatParcelizer) && this.write == bundletostringimmutablemap.write && this.read == bundletostringimmutablemap.read && this.IconCompatParcelizer == bundletostringimmutablemap.IconCompatParcelizer;
    }

    public final int hashCode() {
        return (((((((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.write)) * 31) + Integer.hashCode(this.read)) * 31) + Integer.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.AudioAttributesCompatParcelizer;
        boolean z = this.write;
        int i = this.read;
        int i2 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("SchemaQBankRepoModel(lessonId=");
        sb.append(str);
        sb.append(", lessonName=");
        sb.append(str2);
        sb.append(", isLessonSolved=");
        sb.append(z);
        sb.append(", mcqCount=");
        sb.append(i);
        sb.append(", status=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
