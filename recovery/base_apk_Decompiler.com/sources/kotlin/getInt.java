package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getInt {
    private final long AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final long RemoteActionCompatParcelizer;

    public getInt(long j, long j2, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.RemoteActionCompatParcelizer = j;
        this.AudioAttributesCompatParcelizer = j2;
        this.IconCompatParcelizer = str;
    }

    public final long write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final long read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getInt)) {
            return false;
        }
        getInt getint = (getInt) obj;
        return this.RemoteActionCompatParcelizer == getint.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer == getint.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) getint.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (((Long.hashCode(this.RemoteActionCompatParcelizer) * 31) + Long.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        long j = this.RemoteActionCompatParcelizer;
        long j2 = this.AudioAttributesCompatParcelizer;
        String str = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("AcademicYearUCModel(startTime=");
        sb.append(j);
        sb.append(", endTime=");
        sb.append(j2);
        sb.append(", yearLabel=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
