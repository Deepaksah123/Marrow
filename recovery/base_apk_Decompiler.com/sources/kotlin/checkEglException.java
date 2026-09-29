package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class checkEglException {
    private final String AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    private final double RemoteActionCompatParcelizer;
    private final int read;
    private final int write;

    public checkEglException(int i, String str, double d, int i2, int i3) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.write = i;
        this.AudioAttributesCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = d;
        this.IconCompatParcelizer = i2;
        this.read = i3;
    }

    public final int read() {
        return this.write;
    }

    public final double RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final int write() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof checkEglException)) {
            return false;
        }
        checkEglException checkeglexception = (checkEglException) obj;
        return this.write == checkeglexception.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) checkeglexception.AudioAttributesCompatParcelizer) && Double.compare(this.RemoteActionCompatParcelizer, checkeglexception.RemoteActionCompatParcelizer) == 0 && this.IconCompatParcelizer == checkeglexception.IconCompatParcelizer && this.read == checkeglexception.read;
    }

    public final int hashCode() {
        return (((((((Integer.hashCode(this.write) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Double.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Integer.hashCode(this.read);
    }

    public final String toString() {
        int i = this.write;
        String str = this.AudioAttributesCompatParcelizer;
        double d = this.RemoteActionCompatParcelizer;
        int i2 = this.IconCompatParcelizer;
        int i3 = this.read;
        StringBuilder sb = new StringBuilder("StateResultRepoModel(rank=");
        sb.append(i);
        sb.append(", stateId=");
        sb.append(str);
        sb.append(", percentile=");
        sb.append(d);
        sb.append(", totalAttempt=");
        sb.append(i2);
        sb.append(", stateSolved=");
        sb.append(i3);
        sb.append(")");
        return sb.toString();
    }
}
