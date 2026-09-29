package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class setLogLevel {
    private final long AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final long read;
    private final String write;

    public setLogLevel(String str, long j, long j2, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.write = str;
        this.AudioAttributesCompatParcelizer = j;
        this.read = j2;
        this.IconCompatParcelizer = str2;
    }

    public final long write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final long RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setLogLevel)) {
            return false;
        }
        setLogLevel setloglevel = (setLogLevel) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) setloglevel.write) && this.AudioAttributesCompatParcelizer == setloglevel.AudioAttributesCompatParcelizer && this.read == setloglevel.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) setloglevel.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (((((this.write.hashCode() * 31) + Long.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Long.hashCode(this.read)) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.write;
        long j = this.AudioAttributesCompatParcelizer;
        long j2 = this.read;
        String str2 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("VideoResumeInfoRepoModel(videoId=");
        sb.append(str);
        sb.append(", resumeTimeMs=");
        sb.append(j);
        sb.append(", totalDurationMs=");
        sb.append(j2);
        sb.append(", referenceId=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
