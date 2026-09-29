package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class normalizeLanguageCode {
    private final String RemoteActionCompatParcelizer;
    private final int read;

    public normalizeLanguageCode(String str, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.RemoteActionCompatParcelizer = str;
        this.read = i;
    }

    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof normalizeLanguageCode)) {
            return false;
        }
        normalizeLanguageCode normalizelanguagecode = (normalizeLanguageCode) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) normalizelanguagecode.RemoteActionCompatParcelizer) && this.read == normalizelanguagecode.read;
    }

    public final int hashCode() {
        return (this.RemoteActionCompatParcelizer.hashCode() * 31) + Integer.hashCode(this.read);
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        int i = this.read;
        StringBuilder sb = new StringBuilder("LessonUCModel(id=");
        sb.append(str);
        sb.append(", rating=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
