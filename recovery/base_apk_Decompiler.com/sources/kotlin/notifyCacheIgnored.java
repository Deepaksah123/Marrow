package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class notifyCacheIgnored {
    private final long AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    public notifyCacheIgnored(String str, String str2, int i, int i2, long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.write = str;
        this.read = str2;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
        this.AudioAttributesCompatParcelizer = j;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final int read() {
        return this.IconCompatParcelizer;
    }

    public final int write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final long IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof notifyCacheIgnored)) {
            return false;
        }
        notifyCacheIgnored notifycacheignored = (notifyCacheIgnored) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) notifycacheignored.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) notifycacheignored.read) && this.IconCompatParcelizer == notifycacheignored.IconCompatParcelizer && this.RemoteActionCompatParcelizer == notifycacheignored.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer == notifycacheignored.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (((((((this.write.hashCode() * 31) + this.read.hashCode()) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Long.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        String str = this.write;
        String str2 = this.read;
        int i = this.IconCompatParcelizer;
        int i2 = this.RemoteActionCompatParcelizer;
        long j = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("MagicModuleTimeline(id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", correctCount=");
        sb.append(i);
        sb.append(", mcqCount=");
        sb.append(i2);
        sb.append(", submittedOn=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }
}
