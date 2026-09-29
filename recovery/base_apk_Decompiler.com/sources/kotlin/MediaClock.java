package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaClock {
    private final String AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;

    public MediaClock(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = str2;
    }

    public final String read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaClock)) {
            return false;
        }
        MediaClock mediaClock = (MediaClock) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) mediaClock.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) mediaClock.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (this.RemoteActionCompatParcelizer.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("LearnMoreSpecialsUCModel(title=");
        sb.append(str);
        sb.append(", desc=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
